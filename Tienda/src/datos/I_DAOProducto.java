package datos;

import java.util.ArrayList;

import beans.Producto;

public interface I_DAOProducto {

	public void Alta(Producto p);
	public ArrayList<Producto> Listado();
	public ArrayList<Producto> ListadoNuevos();
	public ArrayList<Producto> buscarProdcuto(String nombre); 
}
