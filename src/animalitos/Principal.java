package animalitos;

public class Principal {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Perro miPerro=new Perro("Lemmy","Braco");
		Gato miGato=new Gato("Lily","Siamés");
		Tortuga miTortuga=new Tortuga("Steven","Plana");
		
		miPerro.MandarMensaje();
		miGato.MandarMensaje();
		miTortuga.MandarMensaje();
		
		Pez pez1=new Pez("Nemo", "Rojo");
		pez1.MandarMensaje();

	

	}

}
