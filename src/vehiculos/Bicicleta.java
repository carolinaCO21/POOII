package vehiculos;

public class Bicicleta extends Vehiculo {
	

	public Bicicleta(int velocidadMaxima, double peso) {
		super(velocidadMaxima, velocidadMaxima, peso);
	}


	public void cambiarMarcha() {
		System.out.println("Cambiando de marcha");
		
	}




	
	@Override
	public String toString() {
		return "Bicicleta:"+ super.toString();
	}
	
	
	
	
	
	
}
