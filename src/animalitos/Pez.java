package animalitos;

public class Pez extends Mascota{

	private String color;
	private String especie;
	
	public Pez(String nombre, String color, String especie) {
		super(nombre);
		this.color = color;
		this.especie = especie;
	}
	
	
	public void mandarMensaje() {
		
		System.out.println("Soy " + this.getNombre() + " y hago glug glug");
		
	}
	
}
