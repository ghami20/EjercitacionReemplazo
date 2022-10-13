
public class Autor {
	
	
	private String nombre, apellido, fecha, sexo, email;
	
	public Autor(String nombre, String apellido, String fecha, String sexo, String email) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.fecha = fecha;
		this.sexo = sexo;
		this.email = email;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Autor [nombre=" + nombre + ", apellido=" + apellido + ", fecha=" + fecha + ", sexo=" + sexo + ", email="
				+ email + "]";
	}
	
	

	
	
}
