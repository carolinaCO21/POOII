package juegos;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class AdivinanzaJavi2 {
	
	private int numeroMaximo;
	private int numeroIntentos;
	
	ArrayList <String> historico = new ArrayList <>();
	
	public AdivinanzaJavi2(int numeroMaximo, int numeroIntentos) {
		this.numeroMaximo = numeroMaximo;
		this.numeroIntentos = numeroIntentos;
	}

	public void jugar() {
		//RESET para jugar al mismo juego
		int numeroOculto = new Random().nextInt(1, numeroMaximo);
		int intento = 0;
		historico.clear();
		//=============================================================
		System.out.println("EMPEZAMO UN NUEVO JUEGO");
		System.out.println("========================");
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


