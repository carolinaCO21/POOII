package _collections;

import java.util.Random;

public enum Color {
	
	/*
	 Clase.Instancia.getter
	 Enum conjunto fijo de constantes cada constante es una intancia. Los Literales(identificador, nombre de constante (que es una instancia)), mayus
	 Acceder a los atributos getter --> encapsulamiento
	 */
	
	//Mayus
		RO("rojo"),NA("naranja"), AM("amarillo"), VE("verde"), AZ("azul"), IN("índigo"), VI("violeta"); //Literales
		private static Random r = new Random();
		private String nombre; 

		
		private Color(String nombre) {
			this.nombre = nombre;
		
		}
		
		public static Color colorAleatorio() {
			Color [] color= Color.values();
			int aleatorio = r.nextInt(0, color.length);
			return color[aleatorio];	
		}
		
		
		public String getNombre() {
			return nombre;
		}
		
		public String presentación() {
			return String.format("color(%s)", nombre);	
		}
		// un coche es un enum , un enum de marca, un enum de colores
		
		//_collections una clase  ArrayList, Mapa, Set(lista de coches unicos)
		
		/*
		public static void main(String[] args) {

			System.out.println(Color.AM.getNombre());
			System.out.println(Color.AM.presentación());
		}
		*/
		
		
	
	
	
	
}
