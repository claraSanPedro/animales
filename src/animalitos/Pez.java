package animalitos;

public class Pez extends Mascota{
	
	private String color;

	public Pez(String nombre, String color) {
		super(nombre);
		this.color = color;
	}
	
	public void MandarMensaje() {
		System.out.println("Soy el pez " + this.getNombre() +" de color "+this.color+" y hago glupglup");
	}

}
