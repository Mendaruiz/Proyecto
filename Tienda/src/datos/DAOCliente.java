package datos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import beans.Cliente;

public class DAOCliente implements I_DAOCliente{
	
	
	public void Alta(Cliente c){
		
	}
	
	public void Baja(String nombre_usuario){
		Statement st = null;
        try {
            System.out.println("--- Dando de baja el cliente " + nombre_usuario);
            ConexionDB con = new ConexionDB();
            st = con.getConnection().createStatement();
            String q = "delete from cliente where nombre_usuario ='" + nombre_usuario + "'";

            int i = st.executeUpdate(q);
            System.out.println(q + i);
            con.getConnection().close();

        } catch (SQLException ex) {
            Logger.getLogger(DAOCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
	}
}
