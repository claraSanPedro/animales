package animalitos;

public class Principal {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Perro miPerro=new Perro("Lemmy","Braco");
		Gato miGato=new Gato("Lily","Siam�s");
		Tortuga miTortuga=new Tortuga("Steven","Plana");
		Pez dorado = new Pez("Tiburonzin", "Dorado");
		
		miPerro.MandarMensaje();
		miGato.MandarMensaje();
		miTortuga.MandarMensaje();
		dorado.mandarMensaje();

	

	}

}
