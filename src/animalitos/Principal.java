package animalitos;

public class Principal {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Perro miPerro=new Perro("Lemmy","Braco");
		Gato miGato=new Gato("Lily","Siamés");
		Tortuga miTortuga=new Tortuga("Steven","Plana");
		Pez miPez=new Pez("Jacinto", "amarillo/azulado", 20);
		
		miPerro.MandarMensaje();
		miGato.MandarMensaje();
		miTortuga.MandarMensaje();
		miPez.mandarMensaje();

	

	}

}
