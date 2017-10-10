package beans;

public class Admin {

	private int id_admin;
	private String admin;
	private String contraseña;
	
	public int getId_admin() {
		return id_admin;
	}
	public void setId_admin(int id_admin) {
		this.id_admin = id_admin;
	}
	public String getAdmin() {
		return admin;
	}
	public void setAdmin(String admin) {
		this.admin = admin;
	}
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	
	public Admin(String admin, String contraseña) {
		this.admin = admin;
		this.contraseña = contraseña;
	}
	
	public Admin() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Admin [id_admin=" + id_admin + ", admin=" + admin + ", contraseña=" + contraseña + "]";
	}
	
	
	
	
	
}
