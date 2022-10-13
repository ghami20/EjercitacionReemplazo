
public class Libro {

	private String nombre, año; 
	private int cantidad, costo; 
	private Editorial editorial;
	private Autor autor;
	
	public Libro(String nombre, String año, int cantidad, int costo, Editorial editorial, Autor autor) {
		super();
		this.nombre = nombre;
		this.año = año;
		this.cantidad = cantidad;
		this.costo = costo;
		this.editorial = editorial;
		this.autor = autor;
	}

	@Override
	public String toString() {
		return "Libro [nombre=" + nombre + ", año=" + año + ", cantidad=" + cantidad + ", costo=" + costo
				+ ", \neditorial=" + editorial.getNombre() + ", \nautor=" + autor.getNombre() + " " + autor.getApellido() + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAño() {
		return año;
	}

	public void setAño(String año) {
		this.año = año;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public int getCosto() {
		return costo;
	}

	public void setCosto(int costo) {
		this.costo = costo;
	}

	public Editorial getEditorial() {
		return editorial;
	}

	public void setEditorial(Editorial editorial) {
		this.editorial = editorial;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	

	
	
}
