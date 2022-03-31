package animalitos;

public class Pez extends Mascota{

	public Pez(String nombre) {
		super(nombre);
	}
	
	public void mandarMensaje(){
		System.out.println("Soy " + this.getNombre() + " y hago gluglu");
	}

}
