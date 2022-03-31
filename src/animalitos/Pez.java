package animalitos;

public class Pez extends Mascota {
	
	private String tamaño;
	
	public Pez(String nombre) {
		super(nombre);
	}
	
	public Pez(String nombre, String tamaño) {
		super(nombre);
		this.tamaño = tamaño;
	}
	
	public void mandarMensaje() {
		System.out.println("Soy " + this.getNombre()+ "y hago gluglu");
	}
	
	

}
