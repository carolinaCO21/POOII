package juegos;

import java.util.ArrayList;
import java.util.Random;

public class TestArrayList1 {
	private  static void muestraSubraya(String texto) {
		System.out.println(texto);
		for (int i = 0; i < texto.length(); i++) {
			
			System.out.print("-");
			
		}
		System.out.println();
	}
	public static void main(String[] args) {
		
		ArrayList<String> a1 = new ArrayList<>();
		System.out.println(a1);
		a1.add("one");
		a1.add("two");
		a1.add("tree"); //Lo pone al final
		System.out.println(a1);
		a1.remove("one");
		a1.remove(0);
		System.out.println(a1);
		a1.add(0, "9"); // add desplaza hacia la derecha
		System.out.println(a1);
		System.out.println(a1.get(1));
		
		a1.clear();
		System.out.println(a1);
		System.out.println("==================================");
		System.out.println(a1.indexOf(""));
		System.out.println("==================================");
		System.out.println(a1.isEmpty()); //isEmpty(): Devuelve true si la lista está vacía y false en caso de tener algún elemento.
		a1.add("one");
		System.out.println(a1.isEmpty());
		a1.remove(0);
		
		// REMOVE DEJA DE APUNTAR NO LO ELIMINA LITERALMENTE -->> tE DEVUELVE LO ANTERIOR
		// EL SET SOBREESCRIBE -->> tE DEVUELVE LO ANTERIOR
		System.out.println(a1);
		System.out.println(a1.size());
		a1.toArray();
		System.out.println(a1);
		// Convierte el ArrayList en un array de objetos (Object[])
		System.out.println(a1.toArray()); // sale mal el s
		a1.add("blabla");
		a1.toArray();
		System.out.println(a1);
		
		/*
		 indexOf y remove --> (elemento) PRIMERA OCURRENCIA
		 
		 set(indice, elemento)
		 */
		ArrayList<String> libros = new ArrayList<>();
		libros.add("Cien años de soledad");
		libros.add("1984");
		libros.add("El Principito");
		libros.add("El retrato de Dorian Grey");
		
		ArrayList<Integer> al2 = new ArrayList<>();
		al2.add(1);
		al2.add(1);
		al2.add(1);
		System.out.println(al2);
		//al2.add(4, 9); // add desplaza hacia la derecha //java. lang.IndexOutOfBoundsException:
		System.out.println(al2);
		
		System.out.println("========================");
		libros.toArray();
		for (String string : libros) {
			System.out.println(string);
		}
		System.out.println("======================");
		for (int i = 0; i < libros.size(); i++) {
			System.out.println(libros.get(i));
		}
		/*
		Cien años de soledad
		1984
		El Alquimista
		El Principito
		El retrato de Dorian Grey
		 */
		System.out.println("========================");
/*
	
➡️ Crear un `ArrayList` que con  tenga 20 números aleatorios entre 1 y 100.

1. Muestra por pantalla la lista.
2. Calcula y muestra por pantalla la cantidad, la suma, la media, el máximo y el mínimo de los valores.
3. Elimina de la lista todos los que son menores que 50
4. Vuelve a mostrar la lista
5. Calcula y r pmuestra poantalla la cantidad, la suma, la media, el máximo y el mínimo de los valores.

A continuación, información de ayuda para la generación de un número aleatorio entre 3 y 10
		int min = 3;
		int max = 10;
		int aleatorio = (int)(Math.random() * (max -min + 1) + min);
		// 
		ArrayList<Integer> a = new ArrayList<>();
		int min = 1;
	 	int max = 100;
		int aleatorio = (int)(Math.random() * (max -min + 1) + min);
*/
		//la cantidad, la suma, la media, el máximo y el mínimo de los valores
	
			int min = 1;
		 	int max = 100;
		 	int cantidadNumAleatorios = 20;		//(100)
		 	ArrayList<Integer> a = new ArrayList<>();
			for (int i = 0; i < cantidadNumAleatorios; i++) {
				int aleatorio = (int)(Math.random() * (max -min + 1) + min);
				a.add(aleatorio);
			}
			int suma = 0;
			for (Integer i : a) {
				suma += i;
			}
			//
			
			
			int media = suma/ cantidadNumAleatorios;
			System.out.println(media);
			System.out.println(suma);
			System.out.println(a);
			System.out.println("===========================================");
			ArrayList <Integer> al = new ArrayList <>();
			Random random = new Random();
			
			for (int i = 0; i < 20; i++) {
				al.add(random.nextInt(1, 101));
				// al.add(random.nextInt(100)+1);
				
			}
			
			System.out.println(al);
			System.out.println(al.size());
			muestraSubraya("HOLA");
			Integer maximo = al.get(0);
			Integer minimo = al.get(0);
			int sumaa = 0;
			for (Integer num : al) {
				sumaa += num;
				maximo = num > maximo? num : maximo;
				minimo = num < minimo ? num : minimo; // comparación con minimo
			}
			muestraSubraya("Suma");
			System.out.println(suma);
			muestraSubraya("Media");
			System.out.println((double)suma/al.size());
			muestraSubraya("Máximo");
			System.out.println(maximo);
			muestraSubraya("Mínimo");
			System.out.println(minimo);
			muestraSubraya("Eliminar los menores de 50");
			muestraSubraya("NO LO ELIMINA SI LO RECORRES NORMAL SOLO SI LO RECORRES AL REVES");
			for (int i = al.size()-1; i >= 0; i--) {
				if (al.get(i) < 50) {
					al.remove(i);
				}
			}
			System.out.println(al);
						//PARA CADA ELEMENTO DEL ARRAY  -> BORRA SI ES MENOR 50 
			al.removeIf(n -> (n < 50));
			System.out.println(al);
		
				
	}
	
}
