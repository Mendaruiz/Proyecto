package datos;

import beans.Cliente;

public interface I_DAOCliente {
	
	public void Alta(Cliente c);
	public void Baja(String cod);

}
