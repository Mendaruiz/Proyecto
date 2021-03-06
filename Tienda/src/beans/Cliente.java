package beans;

public class Cliente implements java.io.Serializable{
	
	private int id_cliente;
	private String nombre_usuario;
	private String nombre;
	private String apellidos;
	private String correo;
	private String direccion;
	private String contraseña;
	
	public Cliente(){
		
	}
	
	public Cliente(String nombre_usuario, String nombre, String apellidos, String correo, String direccion, String contraseña) {
		this.nombre = nombre;
		this.nombre_usuario = nombre_usuario;
		this.apellidos = apellidos;
		this.correo = correo;
		this.direccion = direccion;
		this.contraseña = contraseña;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getId_cliente() {
		return id_cliente;
	}
	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}
	public String getNombre_usuario() {
		return nombre_usuario;
	}
	public void setNombre_usuario(String nombre_usuario) {
		this.nombre_usuario = nombre_usuario;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	
	@Override
	public String toString() {
		return "Cliente [id_cliente=" + id_cliente + ", nombre_usuario=" + nombre_usuario + ", nombre=" + nombre
				+ ", apellidos=" + apellidos + ", correo=" + correo + ", direccion=" + direccion + "]";
	}

	
	
	
	
	
	

}
