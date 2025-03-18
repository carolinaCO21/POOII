package juegos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Frase2 {

	private ArrayList<String> palabras;

	public Frase2(String frase) {
	
		//this.palabras = new String[0];
		palabras = new ArrayList<String>();
		String[] arrayPalabras = frase.split(" ");
		for (String palabra : arrayPalabras) {
			palabras.add(palabra);
			
		}
		
		
	}
	
	/*
	 
	 */
	public void addPalabra(String palabra) {
		palabras.add(palabra);
	}

	@Override
	public String toString() {
		//SPLIT 
		//AQUI PONGO LO EL FORMATO JUNTO EL ARRAY
		String resultado = " ";
		for (String palabra : palabras) {
			resultado += palabra + " ";
		}
		return resultado;

				//Arrays.toString(palabras);
	}
	
	public static void main(String[] args) {
		
		Frase2 f1 = new Frase2("HOLA mi nombre es carolina");
		System.out.println(f1);
		f1.addPalabra("hola");
		System.out.println(f1);
	}
	
	
	
	
	
	
	
}
