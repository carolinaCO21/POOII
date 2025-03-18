package _animal;

import _animal.Animal.Clasificacion;

public class Gato extends Animal implements EmisorSonido{
	private boolean cascabel;
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
	public Gato(float peso, String raza, boolean casacabel) {
		super(peso);
		this.raza = raza;
		this.cascabel= casacabel;
	}
	@Override
	public void show() {
		//super.show();
		System.out.printf("Soy un gato de raza %s de cascabel%n", raza, cascabel);
	}
	@Override
	public void emitirSonido() {
		System.out.println("miau");
		
	}
	

	/*
	 * LO ELIMINAMOS Y SE USA MEJOR EN PADRE 
	public static void show(Gato g) {
		g.show();
		//System.out.printf("Soy un perro de raza %s", g.raza);
		
	}
	*/
}
