package animalitos;

public class Pez extends Mascota{

	private String nombre;
	
	public Pez(String nombre, String raza) {
		super(nombre);
		
	}
	public void MandarMensaje() {
		System.out.println("Soy " + this.nombre + " glu glu glu");
	}
	
}
