package beans;

public class Admin {

	private int id_admin;
	private String admin;
	private String contrase�a;
	
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
	public String getContrase�a() {
		return contrase�a;
	}
	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}
	
	public Admin(String admin, String contrase�a) {
		this.admin = admin;
		this.contrase�a = contrase�a;
	}
	
	public Admin() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Admin [id_admin=" + id_admin + ", admin=" + admin + ", contrase�a=" + contrase�a + "]";
	}
	
	
	
	
	
}
