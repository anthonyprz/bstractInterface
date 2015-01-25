package interfasyabstract;

public class Perro extends Mascota implements Dueño {

		String nombre = "doge";
		int codigoMascota = 57;
		
		
		public String getNombre (){
			return this.nombre;
		}
		public void setNombre (String nombre){
			this.nombre = nombre;
		}
		public void setCodigoMascota(int codigoMascota){
			this.codigoMascota = codigoMascota;
		}
		
		public int getCodigoMascota(){
			return this.codigoMascota;
		}
//dueño	
	@Override
	public void pasear() {
		// TODO Auto-generated method stub
		System.out.println("le gusta pasear");
	}

	@Override
	public void alimentar() {
		// TODO Auto-generated method stub
		System.out.println("come pienzo");
	}

	@Override
	public void limpiar() {
		// TODO Auto-generated method stub
		System.out.println("le encanta ser limpiado con agua");
	}

	@Override
	public void acariciar() {
		// TODO Auto-generated method stub
		System.out.println("le encanta que le acaricien la tripa");
	}
//mascota
	@Override
	public void comunicarse(){
		super.comunicarse();
		System.out.println("ladrido");
	}
	
	
	
	@Override
	void jugar() {
		// TODO Auto-generated method stub
		System.out.println("juega con la pelota");
	}

	@Override
	void lamer() {
		// TODO Auto-generated method stub
		System.out.println("el perro lame");
	}

}
