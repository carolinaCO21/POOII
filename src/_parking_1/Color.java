package _parking_1;

import java.util.Random;

public enum Color {

	RO("rojo"),NA("naranja"),AM("amarillo"),VE("Verde"), AZ("azul"), IN("índigo"), VI("violeta");
	
	private String color;
	private static Random r =  new Random();
	private Color(String nombre) {
		this.color = nombre;
	}

	public static Color colorAleatorio() {
		Color [] colores = Color.values();
		int indiceAleatorio = r.nextInt(0, colores.length);
		return colores[indiceAleatorio];
	}

	public String getColor() {
		return color;
	}
	
	
}
