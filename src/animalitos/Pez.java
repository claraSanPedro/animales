package animalitos;

public class Pez extends Mascota {

	private String onomatopella;

	public Pez(String nombre, String onomatopella) {
		super(nombre); 
		// TODO Auto-generated constructor stub
	}


	public String getOnomatopella() {
		return onomatopella;
	}

	public void setOnomatopella(String onomatopella) {
		this.onomatopella = onomatopella;
	}
	
	public void MandarMensaje() {
		System.out.println("Soy " + this.getNombre() + " y hago "+ getOnomatopella());
	}

}
