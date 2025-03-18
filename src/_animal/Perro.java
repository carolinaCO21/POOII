package _animal;

import _animal.Animal.Clasificacion;

public class Perro extends Animal implements EmisorSonido{
	
	private String raza;
	private final static Clasificacion clasificacion = Clasificacion.VE;// en el proceso de crearse la clase ya tendra valor
	/*
	//bloque estatico
	static {
		 clasificacion = null;
		 //Animal.clasificacion = Clasificacion.VE; 
		
	} 
	*/
	// Bloque no estatico se ejecuta dentro del proceso de new --> creacion de la instancia
	//{}
	public Perro(float peso, String raza) {
		super(peso);
		this.raza = raza;
	}
	@Override
	public void show() {
		//super.show();
		System.out.printf("Soy un perro de raza %s%n" , raza);
	}
	@Override
	public void emitirSonido() {
		System.out.println("guau");
		
	}
	
	/*
	public static void show(Perro p) {
		p.show();
		//System.out.printf("Soy un perro de raza %s", p.raza);
		
	}
	*/
	
	
	

	
}
