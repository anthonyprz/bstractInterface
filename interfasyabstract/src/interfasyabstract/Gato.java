package interfasyabstract;

public class Gato extends Mascota implements Dueño {
	String nombre = "misifu";
	public String getNombre(){
		return this.nombre;
	}
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
		
	@Override
	public void pasear() {
		// TODO Auto-generated method stub
		System.out.println("a misifu no le gusta pasear");
	}

	@Override
	public void alimentar() {
		// TODO Auto-generated method stub
		System.out.println("le enctanta el pescado");
	}

	@Override
	public void limpiar() {
		// TODO Auto-generated method stub
		System.out.println("se limpia solo");
	}

	@Override
	public void acariciar() {
		// TODO Auto-generated method stub
		System.out.println("le gusta acariciar al dueño");
	}

	@Override
	void jugar() {
		// TODO Auto-generated method stub
		System.out.println("persigue al ratón");
	}

	@Override
	void lamer() {
		// TODO Auto-generated method stub

	}
	@Override
	public void comunicarse(){
		super.comunicarse();
		System.out.println("maullido");
	}

}
