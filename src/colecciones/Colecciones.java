package colecciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;

public class Colecciones {
	public static void main(String[] args) {
		String frase = "La casa de la pradera es de todos";
		String [] palabras = frase.split(" ");
		ArrayList<String> a = new ArrayList<String>();
		HashSet<String> palabrasSet = new HashSet<>();
		TreeSet<String> palabrasTreeSet = new TreeSet<>();
		for (String palabra : palabras) {
			a.add(palabra);
			palabrasSet.add(palabra.toLowerCase());
			palabrasTreeSet.add(palabra.toLowerCase());
		}		
		System.out.println(a);
		for (String palabra: a) {
			System.out.print(palabra +" ");
		}
		System.out.println();
		System.out.println(palabrasSet);
		for (String palabra: palabrasSet) {
			System.out.print(palabra +" ");
		}
		System.out.println();
		System.out.println(palabrasTreeSet);
		for (String palabra: palabrasTreeSet) {
			System.out.print(palabra +" ");
		}
		System.out.println();
		HashMap<String, Integer> contadorPalabras = new HashMap<>();
		TreeMap<String, Integer> contadorPalabrasOrdenadas = new TreeMap<>();
		
		contadorPalabras.put("la", 1);
		contadorPalabras.put("casa", 1); // se guarda
		contadorPalabras.put("de", 1);
		contadorPalabras.put("la", 2);
		contadorPalabras.put("pradera", 1);
		contadorPalabras.put("es", 1);
		contadorPalabras.put("de", 2);
		contadorPalabras.put("todos", 1);
		System.out.println(contadorPalabras);
	

		for (String palabra : a) {
			palabra = palabra.toLowerCase();
			if(contadorPalabras.get(palabra)==null) {
				contadorPalabras.put(palabra, 1);
			} else {
				contadorPalabras.put(palabra, contadorPalabras.get(palabra) + 1);
			}
			if(contadorPalabrasOrdenadas.get(palabra)==null) {
				contadorPalabrasOrdenadas.put(palabra, 1);
			} else {
				contadorPalabrasOrdenadas.put(palabra, contadorPalabrasOrdenadas.get(palabra) + 1);
			}
		}		
		System.out.println(contadorPalabras);
		System.out.println(contadorPalabrasOrdenadas);	
			
	}
		
}
	

