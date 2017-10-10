package beans;

public class Producto implements java.io.Serializable {
//Los atributos cuando se ponen en mayúscula es porque son constantes
	 private String p_nombre;
	 private String p_marca;
	 private String p_descripcion;
	 private double p_preciounit;
	 private int p_existencia;
	 
	 public Producto(){ 
	 }
	 
	 public Producto(String P_NOMBRE,String P_MARCA,String P_DESCRIPCION,double P_PRECIOUNIT,int P_EXISTENCIA){
		 this.p_nombre=p_nombre;
		 this.p_marca=p_marca;
		 this.p_descripcion=p_descripcion;
		 this.p_preciounit=p_preciounit;
		 this.p_existencia=p_existencia;
	 }

	public String getP_nombre() {
		return p_nombre;
	}

	public void setP_nombre(String p_nombre) {
		this.p_nombre = p_nombre;
	}

	public String getP_marca() {
		return p_marca;
	}

	public void setP_marca(String p_marca) {
		this.p_marca = p_marca;
	}

	public String getP_descripcion() {
		return p_descripcion;
	}

	public void setP_descripcion(String p_descripcion) {
		this.p_descripcion = p_descripcion;
	}

	public double getP_preciounit() {
		return p_preciounit;
	}

	public void setP_preciounit(double p_preciounit) {
		this.p_preciounit = p_preciounit;
	}

	public int getP_existencia() {
		return p_existencia;
	}

	public void setP_existencia(int p_existencia) {
		this.p_existencia = p_existencia;
	}

	@Override
	public String toString() {
		return "Productos [p_nombre=" + p_nombre + ", p_marca=" + p_marca + ", p_descripcion=" + p_descripcion
				+ ", p_preciounit=" + p_preciounit + ", p_existencia=" + p_existencia + "]";
	}
}
