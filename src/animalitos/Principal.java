package animalitos;

public class Principal {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Perro miPerro=new Perro("Lemmy","Braco");
		Gato miGato=new Gato("Lily","Siam�s");
		Tortuga miTortuga=new Tortuga("Steven","Plana");
		Pez darwin= new Pez("Darwin");
		
		miPerro.MandarMensaje();
		miGato.MandarMensaje();
		miTortuga.MandarMensaje();
		darwin.MandarMensaje();

	

	}

}
