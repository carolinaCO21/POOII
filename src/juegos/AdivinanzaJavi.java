package juegos;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class AdivinanzaJavi {

	public static void main(String[] args) {
		int numeroMaximo = 10;
		int numeroOculto = new Random().nextInt(1, numeroMaximo);
		ArrayList <String> historico = new ArrayList <>();
		int intento = 0; //1
		int numeroIntentos = 5;
		System.out.println(numeroOculto);
		
		//para meter los datos por la consola
		Scanner scanner = new Scanner(System.in);
		
		
		
		
		
			//intentos++
		while(++intento <= numeroIntentos) {
		System.out.printf("[%d de %d] Introduce un número del 1 al %d: ", intento, numeroIntentos, numeroMaximo);
		int numeroPropuesto = scanner.nextInt();
		
		
		if(numeroPropuesto == numeroOculto ) {
			System.out.printf("Acertaste!!%n");
			historico.add("😍" + numeroPropuesto);
			System.out.println(historico);
			break;
		}else if(numeroPropuesto > numeroOculto) {
			System.out.printf("%d es mayor que el número oculto%n", numeroPropuesto);
			historico.add("🙄" + numeroPropuesto);
		}else {
			System.out.printf("%d es menor que el número oculto%n", numeroPropuesto);
			historico.add("🙄" + numeroPropuesto);
		}
		//genero el historico
		System.out.println(historico);
		}
		System.out.println("GRACIAS POR JUGAR");
		
	}
		
}


