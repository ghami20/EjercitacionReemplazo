import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		Editorial planeta = new Editorial("Planeta","1122345112","Avenida corrientes 2037","EditorialPlaneta@gmail.com","20-2001121-2");
		
		Autor cortazar = new Autor("Julio","Cortazar","1914","Masculino","Cortazar2008xd@gmail.com");
		
		Libro rayuela = new Libro("Rayuela","1940",10,100,planeta,cortazar);
		
		Libro bestiario = new Libro ("Bestiario", "1951", 30, 50,planeta,cortazar);
		
		JOptionPane.showMessageDialog(null, rayuela);
		JOptionPane.showMessageDialog(null, bestiario);

	}

}
