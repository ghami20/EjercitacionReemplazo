
public class Serpiente extends Animal{
	
	private String veneno;

	

	public Serpiente(String nombre, String color, int edad, int cantPatas, String veneno) {
		super(nombre, color, edad, cantPatas);
		this.veneno = veneno;
	}
	
	



	public String getVeneno() {
		return veneno;
	}





	public void setVeneno(String veneno) {
		this.veneno = veneno;
	}





	@Override
	public String toString() {
		return "Serpiente [veneno=" + veneno + ", toString()=" + super.toString() + "]";
	}
	
	
	

	
	@Override
	public void hacerSonido() {
		System.out.println(" SSSSZZSSZZZSZS ");
	}
	@Override
	public void Moverse() {
		System.out.println("Estoy arrastrandome ");
	}
	
	public void VerificarPatas() {
		if(this.getCantPatas()<1) {
			this.Moverse();
		}
	}
	


	

}
