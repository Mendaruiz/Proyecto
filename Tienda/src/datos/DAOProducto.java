package datos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import beans.Producto;

public class DAOProducto implements I_DAOProducto {

	@Override
	public void Alta(Producto p) {
		Statement st = null;
        try {
            ConexionDB con = new ConexionDB();
            st = con.getConnection().createStatement();
            String q = "INSERT INTO `productos`(p_nombre,p_marca,p_descripcion,p_preciounit,p_existencia,imagen) VALUES ('" + p.getNombre()+ "','" + p.getMarca() + "','" + p.getDescripcion() + "','" + p.getPrecio() + "','" + p.getExistencia() + "','" + p.getImagen() + "')";
            System.out.println(q);
            int i = st.executeUpdate(q);
            con.getConnection().close();

        } catch (SQLException ex) {
            Logger.getLogger(DAOCliente.class.getName()).log(Level.SEVERE, null, ex);
        }

	}
	
	public ArrayList<Producto> Listado() {
		
		ArrayList<Producto> lista = new ArrayList<Producto>();
		Statement st = null;
        ResultSet rs = null;
		
		try {
            ConexionDB con = new ConexionDB();
            st = con.getConnection().createStatement();
            rs = st.executeQuery("select * from productos");
            
            while(rs.next()){
            	System.out.println("Entra");
            	Producto p = new Producto();
            	p.setNombre(rs.getString("p_nombre"));
                p.setMarca(rs.getString("p_marca"));
                p.setDescripcion(rs.getString("p_descripcion"));
                p.setPrecio(rs.getDouble("p_preciounit"));
                p.setExistencia(rs.getInt("p_existencia"));
                p.setImagen(rs.getString("imagen"));
                System.out.println(p.toString());
                lista.add(p);
            }
            con.getConnection().close();
            
         }catch (SQLException ex) {
        	 Logger.getLogger(DAOProducto.class.getName()).log(Level.SEVERE, null, ex);
         }
		 return lista;
	}

	@Override
	public ArrayList<Producto> ListadoNuevos() {
		ArrayList<Producto> lista = new ArrayList<Producto>();
		Statement st = null;
        ResultSet rs = null;
		
		try {
            ConexionDB con = new ConexionDB();
            st = con.getConnection().createStatement();
            rs = st.executeQuery("select*from productos order by PRODUCTOID DESC limit 5;");
            
            while(rs.next()){
            	
            	Producto p = new Producto();
            	p.setNombre(rs.getString("p_nombre"));
                p.setMarca(rs.getString("p_marca"));
                p.setDescripcion(rs.getString("p_descripcion"));
                p.setPrecio(rs.getDouble("p_preciounit"));
                p.setExistencia(rs.getInt("p_existencia"));
                p.setImagen(rs.getString("imagen"));
                lista.add(p);
            }
            con.getConnection().close();
            
         }catch (SQLException ex) {
        	 Logger.getLogger(DAOProducto.class.getName()).log(Level.SEVERE, null, ex);
         }
		 return lista;
	}

}
