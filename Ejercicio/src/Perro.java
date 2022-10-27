
public class Perro extends Animal{

	private String orejas;


	public Perro(String nombre, String color, int edad, int cantPatas, String orejas) {
	super(nombre, color, edad, cantPatas);
	this.orejas = orejas;
	}
	
	

	@Override
	public String toString() {
		return "Perro [orejas=" + orejas + "]";
	}



	@Override
	public void hacerSonido() {
		System.out.println(" Soy el perro "+ this.getNombre()+" wow ");
	}
	
	
}
