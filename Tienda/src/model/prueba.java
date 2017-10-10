package model;

import datos.ConexionDB;
import datos.DAOCliente;

public class prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConexionDB con = new ConexionDB();
		DAOCliente cli = new DAOCliente();
		cli.Baja("mendaruiz");
	}

}
