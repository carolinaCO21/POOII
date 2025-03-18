package _interfaces;

public abstract class Animal {
	private double peso;
	
	
	public Animal(double peso) {
		this.peso = peso;
	}


	// lo tienen los hijos porque se hereda
	public double getPeso() {
		return peso;
	}

	
	
	
	
}
