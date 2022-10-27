
public abstract class Animal {

	private String nombre;
	private String color;
	private int edad;
	private int cantPatas;
	
	
	@Override
	public String toString() {
		return "Animal [nombre=" + nombre + ", color=" + color + ", edad=" + edad + ", cantPatas=" + cantPatas + "]";
	}
	
	

	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}



	public int getEdad() {
		return edad;
	}



	public void setEdad(int edad) {
		this.edad = edad;
	}



	public int getCantPatas() {
		return cantPatas;
	}



	public void setCantPatas(int cantPatas) {
		this.cantPatas = cantPatas;
	}



	public Animal(String nombre, String color, int edad, int cantPatas) {
		super();
		this.nombre = nombre;
		this.color = color;
		this.edad = edad;
		this.cantPatas = cantPatas;
	}

	public void hacerSonido() {
		System.out.println(" nada ");
	}
	
	public void Moverse() {
		System.out.println("Estoy caminando ");
	}
	
}
