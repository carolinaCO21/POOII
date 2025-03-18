package juegos;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class AdivinanzaY {
//static lo que hace que su valor persista a lo largo de todas las llamadas a métodos

	    private static ArrayList<Integer> historicoIntentos = new ArrayList<>();
	    private static int num;  // El número aleatorio a adivinar
	    private static int contador = 0;  // Contador de intentos

	    // Método que genera un número aleatorio entre 1 y 100
	    public static int generarNumeroAleatorio() {
	        Random r = new Random();
	        return r.nextInt(1, 100);
	    }

	    // Método para manejar un intento de adivinanza
	    public static boolean intento() {
	        Scanner scanner = new Scanner(System.in);
	        contador++;

	        System.out.print("Introduce tu intento:  ");
	        int intento = scanner.nextInt();
	        //System.out.printf("Introducido: %d%n", intento);

	        // Verificar el intento
	        if (intento == num) {
	            System.out.println("¡Has acertado!");
	            historicoIntentos.add(intento);
	            System.out.printf("Total de intentos: %d%n", contador);
	            System.out.println(historicoIntentos);
	            return true;
	        } else if (intento < num) {
	            System.out.println("El número ingresado es menor que el número aleatorio");
	        } else {
	            System.out.println("El número ingresado es mayor que el número aleatorio");
	        }
	        historicoIntentos.add(-intento);
	        System.out.println(historicoIntentos);
	        System.out.printf("Total de intentos: %d%n", contador);
	        return false;
	    }
	

	public static void main(String[] args) {
	    // Generar el número aleatorio una sola vez
	    num = generarNumeroAleatorio();
	    System.out.printf("NUM A ADIVINAR: %d%n", num);
	    System.out.println("ADIVINAR======");
	
	    // Realizar los intentos hasta que se adivine el número
	    while (!intento()) {
	        // Esperar al siguiente intento
	    }
	
	    // Mensaje final
	    System.out.println("MUCHAS GRACIAS");
	}
/*
 Ventajas de métodos estáticos:
Acceso directo: Puedes llamar a estos métodos directamente desde main() sin tener que instanciar un objeto.
Menos sobrecarga: Al no crear instancias de la clase, simplificas la llamada a los métodos y el código en general.
 */
	
	
}
