package animalitos;

public class Pez extends Mascota {

	private String tipoAgua;


	public Pez(String nombre, String tipoAgua) {
		super(nombre);
		this.tipoAgua = tipoAgua;
	}
	
	public void MandarMensaje() {
		System.out.println("Soy " + this.getNombre() + " y hago burbujas");
	}
	
	
}
