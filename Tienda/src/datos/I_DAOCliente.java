package datos;

import beans.Cliente;

public interface I_DAOCliente {

	public void Alta(Cliente c);
	public void Baja(String cod);
	public Boolean ComprobarLogin(String usuario, String contraseņa);
	public Cliente getClienteUserName(String cod);
	
	
}