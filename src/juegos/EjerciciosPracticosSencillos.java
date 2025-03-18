package juegos;

import java.nio.file.spi.FileSystemProvider;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class EjerciciosPracticosSencillos {
	private static ArrayList<Integer> historicoIntentos = new ArrayList<>();

	//Crea un ArrayList de Strings de 4 letras aleatorias del alfabeto inglés en minúsculas, con `1000` palabras. 
			//Luego recórrelo y crea otro nuevo ArrayList, donde estén las palabras que terminan por `a` o `c`. 
			//Muestra este último e indica cuántas palabras tiene.
	   
	public static void respuesta(ArrayList<String> a) {
	  
			// Crear 1000 palabras aleatorias de 4 letras
	        for (int i = 0; i < 1000; i++) {
	         String palabra = "";  // Usamos una cadena vacía para empezar la palabra
	            // Generar una palabra de 4 letras
	            for (int j = 0; j < 4; j++) {
	            	Random random = new Random ();
	                char charAleatorio = (char) random.nextInt('a', 'z'); // Genera una letra aleatoria
	                palabra += charAleatorio;  // Concatenar la letra a la palabra
	            }
	            
	            a.add(palabra);  // Agregar la palabra generada al ArrayList
	        }		
}
	
//- Crea un ArrayList que contenga los primeros `n` números múltiplos de `m` a partir de un número dado `p`.
	public static void anadirNMultiplosM(ArrayList<Integer> a, int numInicial ,int multiploDe,int cantMultiplos) {
		/*
		int num = numInicial;
		int contador = 0;
		while(contador < cantMultiplos) {
			if (num % multiploDe == 0) {
				contador++;
				a.add(num);
			}	
			num++;
		}
		*/
		
        int num = numInicial;
        while (a.size() < cantMultiplos) { 
        	if(num % multiploDe == 0) {
        		a.add(num);
        	}
        	num++;
        }
	}
	
	//- Crea un ArrayList que contenga los primeros `n` números pa- Crea un ArrayList que contenga los primeros `n` números pares.
	public static void anadirNNumerosPares(ArrayList<Integer> a, int cantPares) {
		int contador = 0;
		for (int num = 0;  contador < cantPares; num++) {
			if (num %2 == 0) {
				contador++;
				a.add(num);	
			}
			
		}
		
		
	}
	
	
	public static boolean intento() {
		Random r = new Random();
		int num = r.nextInt(1, 100);
		System.out.printf("%nLanzamiento random: %d%n", num);
		 //==============================================
		int intento;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduce tu intento: ");
		intento = scanner.nextInt();
		System.out.printf("Introducido: %d%n", intento);
		//===============================================
		if (intento == num) {
			System.out.println("Ha acertado");
			historicoIntentos.add(intento);
			return true;
			
		} else if (intento < num) {
			System.out.println("El número ingresado es menor que el número aleatorio");
			historicoIntentos.add(-intento);
		} else {
			System.out.println("El número ingresado es mayor que el número aleatorio");
			historicoIntentos.add(-intento);
		}
		 int contador = 0;
		 contador++;
		 System.out.printf("Total de intentos: %d%n", contador);
		 System.out.println(historicoIntentos);
		 return false;
	}
	 
	
	

	public static void main(String[] args) {
		//ArrayList<Integer> al2 = new ArrayList<>();
		ArrayList <Integer> a1  = new ArrayList<>();
		anadirNNumerosPares(a1, 5);
		ArrayList <Integer> a2 = new ArrayList<>();
		anadirNMultiplosM(a2, 9, 4, 3);
		System.out.println(a1);
		System.out.println(a2);
		ArrayList <String> a3 = new ArrayList<>();
		respuesta(a3);
		System.out.println(a3);
		System.out.println(a3.size());
		
		ArrayList<String> palabraTerminaEnAoC = new ArrayList<>();
		 for (String palabra : a3) {
	            if (palabra.endsWith("a") || palabra.endsWith("c")) {
	                palabraTerminaEnAoC.add(palabra);
	            }
	        }
		 System.out.println(palabraTerminaEnAoC);
		 System.out.println(palabraTerminaEnAoC.size());
		System.out.print("ADIVINAR======");
		while (!intento()) {			
		}
		System.out.println("MUCHAS GRACIAS");

//guaradar en negativo
		/*
		 1. El programa generará un número aleatorio entre 1 y 100.
		2. El usuario tendrá que adivinar el número.
		3. El programa le dirá si el número que el usuario ha ingresado es mayor    o menor que el número aleatorio, o ha acertado.
		4. El historial de intentos se guardará y se imprimirá después de cada intento, mostrando todos los números que el usuario ha intentado adivinar.
		5. El juego terminará cuando el usuario adivine correctamente el número, y se mostrará el número total de intentos y el historial.
			 */
		 // Mostrar las palabras que terminan en 'a' o 'c'
	    /* System.out.println("Palabras que terminan en 'a' o 'c':");
	     for (String palabra : palabraTerminaEnAoC) {
	            System.out.println(palabra);
	     }
	     */
		/*
		Random r = new Random();
		int num = r.nextInt(1, 100);
		System.out.println("===================");
		System.out.println(num);
		 //==============================================
		int intento;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduce tu intento: ");
		intento = scanner.nextInt();
		System.out.printf("Introducido: %d%n", intento);
		//======================================== =======
		if (intento == num) {
			System.out.println("Ha acertado");
		} else if (intento < num) {
			System.out.println("El número ingresado es menor que el número aleatorio");
		} else {
			System.out.println("El número ingresado es mayor que el número aleatorio");
		}
		*/
	}
}


