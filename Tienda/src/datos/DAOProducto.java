package datos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import beans.Producto;

public class DAOProducto implements I_DAOProducto {
	
	public ArrayList<Producto> Listado() {
		
		ArrayList<Producto> lista = new ArrayList<Producto>();
		Statement st = null;
        ResultSet rs = null;
		
		try {
            ConexionDB con = new ConexionDB();
            st = con.getConnection().createStatement();
            rs = st.executeQuery("select*from productosproductos;");
            
            while(rs.next()){
            	
            	Producto p = new Producto();
            	p.setP_nombre(rs.getString("p_nombre"));
                p.setP_marca(rs.getString("p_marca"));
                p.setP_descripcion(rs.getString("p_descripcion"));
                p.setP_preciounit(rs.getDouble("p_preciounit"));
                p.setP_existencia(rs.getInt("p_existencia"));
                lista.add(p);
            }
            con.getConnection().close();
            
         }catch (SQLException ex) {
        	 Logger.getLogger(DAOProducto.class.getName()).log(Level.SEVERE, null, ex);
         }
		 return lista;
	}
	
	public ArrayList<Producto> ListadoNuevos() {
		
		ArrayList<Producto> lista = new ArrayList<Producto>();
		Statement st = null;
        ResultSet rs = null;
		
		try {
            ConexionDB con = new ConexionDB();
            st = con.getConnection().createStatement();
            rs = st.executeQuery("select*from productosproductos order by PRODUCTOID DESC limit 5;");
            
            while(rs.next()){
            	
            	Producto p = new Producto();
            	p.setP_nombre(rs.getString("p_nombre"));
                p.setP_marca(rs.getString("p_marca"));
                p.setP_descripcion(rs.getString("p_descripcion"));
                p.setP_preciounit(rs.getDouble("p_preciounit"));
                p.setP_existencia(rs.getInt("p_existencia"));
                lista.add(p);
            }
            con.getConnection().close();
            
         }catch (SQLException ex) {
        	 Logger.getLogger(DAOProducto.class.getName()).log(Level.SEVERE, null, ex);
         }
		 return lista;
	}
}