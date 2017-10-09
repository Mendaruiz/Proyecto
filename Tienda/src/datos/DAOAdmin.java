package datos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import beans.Admin;
import beans.Cliente;

public class DAOAdmin implements I_DAOAdmin {


	@Override
	public Admin getClienteUserName(String cod) {
		Admin a = new Admin();
        Statement st = null;
        ResultSet rs = null;
        try {
            ConexionDB con = new ConexionDB();
            st = con.getConnection().createStatement();
            rs = st.executeQuery("select * from admin where admin ='" + cod + "'");

            while (rs.next()) {
            	a.setAdmin(cod);
            }
            System.out.println(cod);
            con.getConnection().close();

        } catch (SQLException ex) {
            Logger.getLogger(DAOCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return a;
	}
	
	public Boolean ComprobarLoginAdmin(String usuario, String contraseña) {
		
        Statement st = null;
        ResultSet rs = null;
        boolean devuelta = false;
        
        try {
            ConexionDB con = new ConexionDB();
            st = con.getConnection().createStatement();
            rs = st.executeQuery("select * from admin where admin ='" + usuario + "' and contraseña ='" + contraseña + "'");
            
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

}
