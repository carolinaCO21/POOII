package generics;

public class A <T>{
	private T t;
	public A(T t) {this.t = t;}
	public T getT() {return t;}
	public void setT(T t) {this.t = t;}
	
	/*
	 class B<T, U> {
	private T t;
	private U u;
	public B(T t, U u) {
		this.t = t; this.u = u;
	}
}

// Para usarla 
colecciones colecciones = new colecciones();
Y y = new Y();
A<colecciones, Y> item = new A<colecciones, Y>(colecciones, y);

🔹 Mucho cuidado
generics ayudan en tiempo de compilación, pero no en tiempo de ejecución.

🔹 Legacy code - raw generics
Collecciones escritas sin usar generics. El compilador da warning.

	 
	 
	 */
	
	
/*

🔵 Ejercicio: Box

1. Crea un paquete llamado `generics`
2. Crea una clase llamada `Box` que tan solo contenga un campo que se llamará contenido y que pueda ser de cualquier tipo utilizando generics.
3. Dótala de los siguientes métodos:
    1. No se debe permitir la construcción 
    2. “Constructor estático” `public static <T> Box of(T contenido)`: devolverá un Box con un elemento de tipo T dentro, y en caso de que sea null, pues apuntando a null.
    3. `public static Box<T> empty()`: devolverá un Box con un elemento de tipo T dentro, pero nul.
    4. `public boolean isPresent()` → para saber si hay algo dentro de la caja. En caso de null false y en caso contrario true.
    
    
    package test;

import generics.Box;

public class Test {
	public static void main(String[] args) {
		Box<String> b1 = Box.of("Hola"); 
		Box<String> b2 = Box.of(null); 
		Box<String> b3 = Box.empty(); 
		System.out.println(b1.isPresent());
		System.out.println(b2.isPresent());
		System.out.println(b3.isPresent());
	}
}



package generics;

public class Box<T> {
	private T contenido;

	private Box(T contenido) {
		this.contenido = contenido;
	}
	
	public static <T> Box<T> of(T contenido) {
		return new Box<>(contenido);
	}
	
	public static <T> Box<T> empty() {
		return new Box<>(null);
	}
	
	public boolean isPresent() {
		return this.contenido != null;
	}
	
}


<aside>
🔵 Ejercicio: Pareja

---

1. Utiliza un paquete llamado `generics`
2. Crea una clase llamada `Pareja` que contenga dos campos que se llamará `p1` y `p2` y que pueda ser de cualquier tipo utilizando generics.
3. Dótala de los siguientes métodos:
    1. Constructor
    2. Getters
    3. Setter
    4. Utiliza la clase y los métodos 
</aside>


package generics;

public class Pareja<T, S> {
	T p1;
	S p2;

	public T getP1() {
		return p1;
	}

	public void setP1(T p1) {
		this.p1 = p1;
	}

	public S getP2() {
		return p2;
	}

	public void setP2(S p2) {
		this.p2 = p2;
	}

	public Pareja(T p1, S p2) {
		this.p1 = p1;
		this.p2 = p2;
	}

}



package generics;

public class TestPareja {
	public static void main(String[] args) {
		Pareja<Box<String>, String> p1 = 
				new Pareja<>(Box.of("hola"), "adios" );
		
		System.out.println(p1.getP1().getContenido()+ " - " +
		p1.getP2().toUpperCase());
	}
}

 */
}
