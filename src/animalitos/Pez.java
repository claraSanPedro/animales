package animalitos;

public class Pez extends Mascota {

	
	private String especie;

	public Pez(String nombre, String especie) {
		super(nombre);
		this.especie = especie;
	}
	
	public void MandarMensaje() {
		System.out.println("Soy " + this.getNombre() + " y respiro bajo el agua");
	}
	
}
