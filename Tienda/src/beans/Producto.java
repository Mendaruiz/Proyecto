package beans;

public class Producto {
	
	private String nombre;
	private String marca;
	private String descripcion;
	private double precio;
	private int existencia;
	private String imagen;
	
	public Producto(){
		
	}
	
	public Producto(String nombre, String marca, String descripcion, double precio, int existencia, String imagen) {
		this.nombre = nombre;
		this.marca = marca;
		this.descripcion = descripcion;
		this.precio = precio;
		this.existencia = existencia;
		this.imagen = imagen;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getExistencia() {
		return existencia;
	}
	public void setExistencia(int existencia) {
		this.existencia = existencia;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", marca=" + marca + ", descripcion=" + descripcion + ", precio=" + precio
				+ ", existencia=" + existencia + ", imagen=" + imagen + "]";
	}
	
	
	
	
	
}
