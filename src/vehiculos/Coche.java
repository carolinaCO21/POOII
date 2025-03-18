package vehiculos;

public class Coche extends Vehiculo {
	private boolean puetasAbiertas;
	private boolean motorEncendido;

	
	
	public Coche(int velocidadMaxima, double peso, String matricula) {
		super(velocidadMaxima, 4, peso, matricula);
	}
	
	
	public boolean abrirPuertas() {
		if (puetasAbiertas) return false;
    	puetasAbiertas = true;
		return true;
	}
	public boolean cerrarPuertas() {
		if (!puetasAbiertas) return false;
    	puetasAbiertas = false;
		return true;
	}


    // Método para arrancar el motor (encender)
    public boolean arrancarMotor() { 
    	if (motorEncendido) return false;
    	motorEncendido = true;
		return true;
    }

    // Método para apagar el motor
    public boolean pararMotor() {
    	if (!motorEncendido) return false;
    	motorEncendido = false;
		return true;
		
    }
		

	
	
	
	
	@Override
	public String toString() {
		return "Coche: "+ super.toString() + String.format("%n--motor encendido[%b]%n--puertas abiertas[%b] ",
			motorEncendido, puetasAbiertas);
	}
	
	 
	
	
	
	
	
}
