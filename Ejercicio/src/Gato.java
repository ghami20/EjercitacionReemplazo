
public class Gato extends Animal {
	
	private String bigotes;

		
	@Override
	public String toString() {
		return "Gato [bigotes=" + bigotes + ", toString()=" + super.toString() + "]";
	}


	public Gato(String nombre, String color, int edad, int cantPatas, String bigotes) {
		super(nombre, color, edad, cantPatas);
		this.bigotes = bigotes;
	}


	@Override
	public void hacerSonido() {
		
	
		System.out.println( "soy el gato "+this.getNombre()+" meow ");
	}

	
	

	
	
	
	
	
	
	
	

}
