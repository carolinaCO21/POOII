package generics;

public class Box<T>{

		private T contenido;
		
		
		
		private Box(T contenido) {
			this.contenido = contenido;
		}


		//constructor estatico
		public static <T> Box <T> of (T contenido) {
			return new Box<>(contenido);
		}
		
		public static <T> Box <T> empty (){
			return new Box <> (null);
		}
		
		public boolean isPresent(){
			return contenido != null;
		}
		
		
		
		@Override
		public String toString() {
			return "Box [contenido=" + contenido + "]";
		}


		public static void main(String[] args) {
			Box <String> b1 = Box.of("Hola");
			Box <Articulo> b2 = Box.of(new Articulo("Articulo 1"));
			Box<String> b3 = Box.empty();
			Box<String> b4 = Box.empty();
			
			System.out.println(b1);
			System.out.println(b2);
			System.out.println(b3);
		}
		
	}
	
	
	
	/*
	 1. Crea un paquete llamado `generics`
	2. Crea una clase llamada `Box` que tan solo contenga un campo que se llamará contenido y que pueda ser de cualquier tipo utilizando generics.
	3. Dótala de los siguientes métodos:
    1. No se debe permitir la construcción 
    2. “Constructor estático” `public static <T> Box of(T contenido)`: devolverá un Box con un elemento de tipo T dentro, y en caso de que sea null, pues apuntando a null.
    3. `public static Box<T> empty()`: devolverá un Box con un elemento de tipo T dentro, pero nul.
    4. `public boolean isPresent()` → para saber si hay algo dentro de la caja. En caso de null false y en caso contrario true.
	 */

	
	





