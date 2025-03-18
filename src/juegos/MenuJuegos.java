package juegos;

import java.util.Scanner;

public class MenuJuegos {
		/*AdivinanzaJavi2 j1 = new AdivinanzaJavi2(10,3);
		j1.jugar();
		AdivinanzaJavi2 j2 = new AdivinanzaJavi2(5,2);
		j2.jugar();*/

		public static void main(String[] args) {
			do {
				boolean salir = false;
				System.out.println("1: Juego adivina número");
				System.out.println("0: Salir");	
				Scanner scanner = new Scanner(System.in);
				System.out.print("Inserta el indice: ");
				int opcion = scanner.nextInt();
				switch(opcion) {
					case 0:
						salir = true;
						break;
					case 1:
						
						new AdivinanzaJavi2(10, 3).jugar();
						break;
					default:
						break;
				}
				if(salir) {
					break;
				}
			} while(true);
		}
}
	

