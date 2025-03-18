package juegos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ForkJoinPool;

public class ArrayEjemplo1 {
	
	
	public static void frase(ArrayList<String> a, String fraseColores){
		String[] arrayColores = fraseColores.split(" ");
		for (String color : arrayColores) {
			a.add(color);
		}
	}
	
	public static void main(String[] args) {
		
		//ojo, amarillo, verde, rojo, amarillo, azul, naranja, marrón, verde.
		ArrayList colores = new ArrayList<String>();
		
		frase(colores, "ojo amarillo verde rojo amarillo azul naranja marrón verde");
		System.out.println(colores);
		
		/* 
		4. Imprimir los colores del array, de 2 formas distintas:
	    1. Utilizando un bucle `for`.
	    2. Utilizando un bucle `for-each`.
		 */
		
		for (int i = 0; i < colores.size(); i++) {
				System.out.println(colores.get(i));
		}
		for (Object object : colores) {
			
		}
		
		
		
		
		
		
		
		
		
	}
	
}