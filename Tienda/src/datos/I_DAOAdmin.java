package datos;

import beans.Admin;

public interface I_DAOAdmin {
	
	public Boolean ComprobarLoginAdmin(String usuario, String contraseña);
	public Admin getClienteUserName(String cod);
}
