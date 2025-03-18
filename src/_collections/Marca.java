package _collections;

import java.util.Random;

public enum Marca {
	/*
	 Clase.Instancia.getter
	 Enum conjunto fijo de constantes cada constante es una intancia. Los Literales(identificador, nombre de constante (que es una instancia)), mayus
	 Acceder a los atributos getter --> encapsulamiento
	 */
	
	//Mayus
		DA("dacia"),TO("toyota"), RE("renault"), BM("bMW"), ME("mercedes"); //Literales
		
		private String nombre; 

		
		private Marca(String nombre) {
			this.nombre = nombre;
		
		}
		
		public static Marca marcaAleatoria() {
			Random r = new Random();
			Marca [] marcas = Marca.values();
			int aleatorio = r.nextInt(0, marcas.length);
			return marcas[aleatorio];	
		}
	
		public String getNombre() {
			return nombre;
		}
		
		public String presentación() {
			return String.format("marca(%s)", nombre);	
		}
		// un coche es un enum , un enum de marca, un enum de colores
		
		//_collections una clase  ArrayList, Mapa, Set(lista de coches unicos)
		/*
		public static void main(String[] args) {
			
			System.out.println(Marca.RE.presentación());
			System.out.println(Marca.RE.getNombre());
			System.out.println(Marca.marcaAleatoria());
			System.out.println(Marca.marcaAleatoria().getNombre());
		}
		*/
 		
		
	
	
	
	
}
