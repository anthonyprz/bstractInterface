package interfasyabstract;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("--------------------PERRO----------------------------");
		Perro perro = new Perro();
			System.out.println("el nombre del perro es: " + perro.getNombre() + " el codigo es: " + perro.getCodigoMascota());
			perro.comunicarse();
			perro.jugar();
			perro.pasear();
			perro.lamer();
			perro.alimentar();
		
			System.out.println("--------------------GATO----------------------------");
		//gato
		Gato gato = new Gato();
		System.out.println("el nombre del gato es: " + gato.getNombre());
		gato.comunicarse();
		gato.jugar();
		gato.pasear();
		gato.lamer();
		gato.alimentar();
	}

}
