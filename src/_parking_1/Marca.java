package _parking_1;

import java.security.PrivateKey;
import java.util.Random;

public enum Marca {
	BM("BMW"), ME("mercedes"),TO("toyota"),FO("Ford"), AU("Audi");
	
	private String marca;
	private static Random r = new Random();

	private Marca(String nombre) {
		this.marca = nombre;
	}
	
	public static Marca marcaAleatoria() {
		Marca [] colores = Marca.values();
		int indiceAleatorio = r.nextInt(0, colores.length);
		return colores[indiceAleatorio];
	}

	public String getMarca() {
		return marca;
	}
	
	
	
	
}
