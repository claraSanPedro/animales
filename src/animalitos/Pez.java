package animalitos;

public class Pez extends Mascota{

	private String colorEscama;

	public Pez(String nombre, String colorEscama) {
		super(nombre);
		this.colorEscama = colorEscama;
	}

	public String getColorEscama() {
		return colorEscama;
	}

	public void setColorEscama(String colorEscama) {
		this.colorEscama = colorEscama;
	}
	
	public void mandarMensaje() {
		System.out.println("Glu Glu Glu me ahogo :'(");
	}
	
}
