package vehiculos;

public class Motocicleta extends Vehiculo {
	private boolean motorEncendido;
	
	
	
	public Motocicleta(int velocidadMaxima, double peso, String matricula) {
		super(velocidadMaxima, 2, peso, matricula);
	}


	public void hacerCaballito() {
		
		
		System.out.println("Hacer caballito");
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
		return "Motocicleta: " + super.toString() + String.format("%n--motor encendido [%s]", motorEncendido);
	}
	
	
	
	
}
