package animalitos;

public class Pez extends Mascota{

	private String tipo;

	public Pez(String nombre, String tipo) {
		super(nombre);
		this.tipo = tipo;
	}

	public void MandarMensaje() {
		System.out.println("Glu Glu soy " + this.getNombre() + " y nado.");
	}

	
	
	
	
}
