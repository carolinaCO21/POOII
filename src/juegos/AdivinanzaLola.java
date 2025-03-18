package juegos;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class AdivinanzaLola {

	public static int lanzamiento() {
		Random r = new Random();
		int lanzamiento = r.nextInt(1,101);
		System.out.print("Lanzamiento random: ");
		return lanzamiento;
	}
	
	public static void main(String[] args) {
		
		ArrayList<Integer> historial = new ArrayList<>();
		int numAleatorio = lanzamiento();
		System.out.println(numAleatorio);
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.println("Introduce tu intento:");
			int intento = s.nextInt();
			System.out.printf("Introducido: %d%n", intento);
			if (intento < numAleatorio) {
				System.out.println("El numero introducido es menor que el número aleatorio");
			} else if (intento > numAleatorio) {
				System.out.println("El numero introducido es mayor que el número aleatorio");
			} else {
				System.out.println("Has acertado");
				System.out.println("BYE");
				break;
			}
			historial.add(intento);	
			System.out.println(historial);
		
		}
		
		
		
		
		
		
		
	}
	
	
}
