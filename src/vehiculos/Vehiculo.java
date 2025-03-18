package vehiculos;

import java.util.Iterator;

public abstract class Vehiculo {
	private int velocidadMaxima;
	private int numRuedas;
	private double peso;
	private int velocidad;
	private String matricula;  
	
	

	public boolean acelerar() {
		if (velocidad + 10 > velocidadMaxima) {
			velocidad = velocidadMaxima;
			return false;
		} else {
			velocidad += 10;
			return true;
		}

	}
	public boolean frenar() {
		if (velocidad - 10 < 0) {
			velocidad = 0;
			return false;
		} else {
			velocidad -= 10;
			return true;
		}
	}
	
	
	public Vehiculo(int velocidadMaxima, int numRuedas, double peso, String matricula) {
		this.velocidadMaxima = velocidadMaxima;
		this.numRuedas = numRuedas;
		this.peso = peso;
		this.matricula = matriculaValida(matricula)? matricula : "matrícula inválida";
	

	}

	public Vehiculo(int velocidadMaxima, int numRuedas, double peso) {
		this.velocidadMaxima = velocidadMaxima;
		this.numRuedas = numRuedas;
		this.peso = peso;
	

	}
	
	private boolean matriculaValida(String matricula) {
		if (matricula == null) {
			return false;
		}
		
		if (!(matricula.length()==7)) {
			return false;
		}
		
		for (int i = 0; i < 3 ; i++) {
			if (!(matricula.charAt(i)>= 'A' && matricula.charAt(i)<= 'Z' ||
					matricula.charAt(i)>= 'a' && matricula.charAt(i)<= 'z')) {
				return false;
			}
		}
		for (int j = 3; j < 7; j++) {
			if (!(matricula.charAt(j)>= '1' && matricula.charAt(j)<= '9')) {
				return false;
			}
		}
		return true;
		
	}
	@Override
	public String toString() {
		if (matricula == null) {
			return String.format("%n--número de ruedas: %d%n--peso: %.2f%n--velocidad: %d%n--velocidad máxima %d", numRuedas, peso, velocidad, velocidadMaxima);
		} else {
			return String.format("%n--matricula: %s%n--número de ruedas: %d%n--peso: %.2f%n--velocidad: %d%n--velocidad máxima %d", matricula, numRuedas, peso, velocidad, velocidadMaxima);
		}                                                                       
	}
	
	
	
	

}
	
/* ### **Modela un sistema de vehículos**

---

- Diseña una jerarquía de clases para representar un sistema de vehículos. Comienza con una clase base abstracta `Vehiculo` y extiéndela a clases específicas como `Coche`, `Motocicleta`, y `Bicicleta`.
- Atributos comunes:
    - Velocidad máxima, número de ruedas, peso, matrícula (si aplica).
- Métodos comunes:
    - parar, frenar, acelerar.
- Métodos específicos:
    - `Coche` podría tener un método para abrir puertas.  Arrancar,
    - `Motocicleta` podría tener uno para realizar un caballito.  Arrancar,
    - `Bicicleta` podría incluir cambios de marcha.


No dudes en enriquecer el ejercicio como creas conveniente
  */
	

	
	


