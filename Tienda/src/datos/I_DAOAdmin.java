package datos;

import beans.Admin;

public interface I_DAOAdmin {
	
	public Boolean ComprobarLoginAdmin(String usuario, String contrase�a);
	public Admin getClienteUserName(String cod);
}
