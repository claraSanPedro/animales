package animalitos;

public class Pececito extends Mascota{

	private String color="";

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public Pececito(String nombre,String color) {
		super(nombre);
		this.color = color;
	}

	public void MandarMensaje() {
		System.out.println("Soy un Pececito llamado "+this.getNombre()+ " de color " + this.getColor() + " y hago glub glub ");
	}
}
