package datos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import beans.Cliente;

public class DAOCliente implements I_DAOCliente {

	@Override
	public void Alta(Cliente c) {
		Statement st = null;
        try {
            ConexionDB con = new ConexionDB();
            st = con.getConnection().createStatement();
            String q = "INSERT INTO `cliente`(nombre_usuario,contraseña,nombre,apellidos,correo,direccion) VALUES ('" + c.getNombre_usuario()+ "','" + c.getContraseña() + "','" + c.getNombre() + "','" + c.getApellidos() + "','" + c.getCorreo() + "','" + c.getDireccion() + "')";
            System.out.println(q);
            int i = st.executeUpdate(q);
            con.getConnection().close();

        } catch (SQLException ex) {
            Logger.getLogger(DAOCliente.class.getName()).log(Level.SEVERE, null, ex);
        }

	}

	@Override
	public void Baja(String cod) {
		// TODO Auto-generated method stub

	}

	@Override
	public Boolean ComprobarLogin(String usuario, String contraseña) {
		
		Cliente c = new Cliente();
        Statement st = null;
        ResultSet rs = null;
        boolean devuelta = false;
        
        try {
            ConexionDB con = new ConexionDB();
            st = con.getConnection().createStatement();
            rs = st.executeQuery("select * from cliente where nombre_usuario ='" + usuario + "' and contraseña ='" + contraseña + "'");
            
            if(rs.next()){
            	return true;
            } else{
            	devuelta = false;
            }
           
        } catch (SQLException ex) {
            Logger.getLogger(DAOCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
		return devuelta;
	}

	@Override
	public Cliente getClienteUserName(String cod) {
		
		Cliente c = new Cliente();
        Statement st = null;
        ResultSet rs = null;
        try {
            ConexionDB con = new ConexionDB();
            st = con.getConnection().createStatement();
            rs = st.executeQuery("select * from cliente where nombre_usuario ='" + cod + "'");

            while (rs.next()) {
            	
            	c.setNombre_usuario(rs.getString("nombre_usuario"));
            	c.setNombre(rs.getString("nombre"));
            	c.setApellidos(rs.getString("apellidos"));
            	c.setCorreo(rs.getString("correo"));
            	c.setDireccion(rs.getString("direccion"));
            }
            System.out.println(c);
            con.getConnection().close();

        } catch (SQLException ex) {
            Logger.getLogger(DAOCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return c;
		
	}

}
