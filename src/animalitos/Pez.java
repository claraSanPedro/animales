package animalitos;

public class Pez extends Mascota {

	private String especie;

	public Pez(String nombre, String especie) {
		super(nombre);
		this.especie = especie;
	}
	
	public void MandarMensaje() {
		System.out.println("Soy un " + this.getNombre() + " y no conozco a Nemo");
	}
	
}
