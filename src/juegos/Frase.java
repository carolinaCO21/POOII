package juegos;

import java.util.Arrays;
import java.util.Iterator;

public class Frase {

	private String[] palabras;

	public Frase(String frase) {
	
		//this.palabras = new String[0];
		
		this.palabras = frase.split(" ");
	}
	
	/*
	 
	 */
	public void añadirPalabra(String palabra) {
		/*
		String [] nuevoArrayPalabras = new String [palabras.length+1];
		for (int i = 0; i > palabras.length ; i++) {
			nuevoArrayPalabras[i]= palabras[i];
		}
		
		nuevoArrayPalabras[nuevoArrayPalabras.length-1]= palabra;
		palabras = nuevoArrayPalabras;
		*/
		
		String [] arrayNuevo = new String[palabras.length+1];
		String [] arrayViejo = palabras;
		for (int i = 0; i < arrayViejo.length ; i++) {
			arrayNuevo[i] = arrayViejo[i];
		}
		arrayNuevo[arrayNuevo.length-1]= palabra;
		palabras = arrayNuevo;
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
		
		Frase f1 = new Frase("HOLA mi nombre es carolina");
		System.out.println(f1);
		f1.añadirPalabra("hola");
		System.out.println(f1);
	}
	
	
	
	
	
	
	
}
