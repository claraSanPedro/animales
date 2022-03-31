package animalitos;

public class Pez extends Mascota{
	
	private String color;
	private double tamanyo;
	
	public Pez(String nombre, String color, double tamanyo) {
		super(nombre);
		this.color = color;
		this.tamanyo = tamanyo;
	}
	
	public void mandarMensaje() {
		
		System.out.println("Soy " +this.getNombre()+" y hago glup glup glup");
	}
	

}
