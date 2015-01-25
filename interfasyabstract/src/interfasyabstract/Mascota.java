package interfasyabstract;

public abstract class Mascota {
	String tipoMascota;
	String raza;
	
	 void comunicarse(){
		System.out.println("se comunica mediante el: "); 
	 }
	 abstract void jugar();
	 abstract void lamer();
}
