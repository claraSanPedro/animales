package animalitos;

public class Pez extends Mascota{
	
	// Atributos
	// =========
	private String color;

	// Constructor
	// ===========
	public Pez(String nombre, String color) {
		super(nombre);
		this.color = color;
	}
	
	// M�todos
	// =======
	public void mandarMensaje() {
		System.out.println("Glu,glu, glu");
	}
	

}
