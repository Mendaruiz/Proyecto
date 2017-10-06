package beans;

public class Cliente {
	
	private String id_cliente;
	private String nombre_usuario;
	private String nombre;
	private String apellidos;
	private String correo;
	private String direccion;
	
	public Cliente(){
		
	}
	
	public Cliente(String id_cliente, String nombre_usuario, String nombre, String apellidos, String correo,
			String direccion) {
		super();
		this.id_cliente = id_cliente;
		this.nombre_usuario = nombre_usuario;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.correo = correo;
		this.direccion = direccion;
	}

	public String getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(String id_cliente) {
		this.id_cliente = id_cliente;
	}

	public String getNombre_usuario() {
		return nombre_usuario;
	}

	public void setNombre_usuario(String nombre_usuario) {
		this.nombre_usuario = nombre_usuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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
	
	
	

}
