package datos;

import beans.Producto;
import java.util.ArrayList;

public interface I_DAOProducto{
	
	public ArrayList<Producto> Listado();
	
	public ArrayList<Producto> ListadoNuevos();
};