package datos;

import beans.Admin;

public interface I_DAOAdmin {
	
	public Boolean ComprobarLoginAdmin(String usuario, String contraseņa);
	public Admin getClienteUserName(String cod);
}
