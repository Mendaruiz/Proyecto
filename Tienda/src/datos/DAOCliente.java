package datos;

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
            String q = "INSERT INTO `cliente`(nombre_usuario,nombre,apellidos,correo,direccion) VALUES ('" + c.getNombre_usuario()+ "','" + c.getNombre() + "','" + c.getApellidos() + "','" + c.getCorreo() + "','" + c.getDireccion() + "')";
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

}
