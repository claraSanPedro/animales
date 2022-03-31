package animalitos;

public class Pez extends Mascota{

	private String color;

	public Pez(String nombre, String color) {
		super(nombre);
		this.color = color;
	}
	
	public void MandarMensaje() {
		System.out.println("Glu glu" + this.getNombre() + " y nado");
	}
	
	
	
}
