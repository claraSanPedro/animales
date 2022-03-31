package animalitos;

public class Pez extends Mascota{

	private String nombre;
	public Pez(String nombre) {
		super(nombre);
		this.nombre=nombre;
	}
	public void MandarMensaje () {
		System.out.println(this.nombre+", SOLO ERES UN PEZ AL QUE LE SALIERON PATAS");
	}

}
