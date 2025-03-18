package juegos;

import java.util.Iterator;
import java.util.Random;

public class BatallaNaval {
	// ahora ya no puedo usar las posiciones que ya coloque

	private void cuadricula(int arrayBatalla[][]) {
		System.out.println();
		// mostrar
		System.out.println("  A B C D E F G H I J ");
		for (int i = 0; i < arrayBatalla.length; i++) {
			System.out.print(i + " ");
			for (int j = 0; j < arrayBatalla[i].length; j++) {
				// if(arrayBatalla[i][j] == 0 || arrayBatalla[i][j] == 1) {
				// System.out.print(". ");
				// }
				System.out.printf("%d ", arrayBatalla[i][j]);
			}
			System.out.println();
		}

	}

	private int posAleatoria(int a, int b) {
		Random r = new Random();
		int aleatorio = r.nextInt(a, b);
		return aleatorio;
	}

	
	private void naves(int arrayBatalla[][], int tamanio, int a, int b) {
		Random r = new Random();
		int posAleatoria1 = posAleatoria(a, b);
		int posAleatoria2 = posAleatoria(a, b);
		boolean aleatorio = r.nextBoolean();
		boolean aleatorio2 = r.nextBoolean();
		boolean barcoNaveEnX = aleatorio2;
		boolean opcionArriba = aleatorio;
		boolean opcionDerecha = aleatorio;
		boolean desocupado = false;
		int [][] arrayBatallaDesOcupado;
		
			if (tamanio == 1) {
				// barcos de 1
				arrayBatalla[posAleatoria(0, arrayBatalla.length)][posAleatoria(0, arrayBatalla.length)] = 1;
			} 
			int contador = 0;
			for (int i = 0; i < arrayBatalla.length; i++) {
				for (int  j= 0; j < arrayBatalla[i].length; j++) {
					 if (arrayBatalla[i][j] != 1) {
						 contador++;
					}
				}
			}
			System.out.println(contador);
			
			
			/*else {
					if (barcoNaveEnX) {
						// movimiento colecciones
						if (opcionArriba) {
							for (int i = 0; i < tamanio; i++) {
								arrayBatalla[posAleatoria1++][posAleatoria2] = 1;
							}
						} else {
							for (int i = 0; i < tamanio; i++) {
								arrayBatalla[posAleatoria1--][posAleatoria2] = 1;
							}
						}
					} else {
		
						// movimiento Y
						if (opcionDerecha) {
							for (int i = 0; i < tamanio; i++) {
								arrayBatalla[posAleatoria1][posAleatoria2++] = 1;
							}
						} else {
							for (int i = 0; i < tamanio; i++) {
								arrayBatalla[posAleatoria1][posAleatoria2--] = 1;
							}
						}
		
					}
					
					*/
			
		}
		
	
	
	
			
	

	public void jugar() {
		// TRADUCCIONES
		int[][] arrayBatalla = new int[10][10];
		for (int i = 0; i < arrayBatalla.length; i++) {
			for (int j = 0; j < arrayBatalla[i].length; j++) {
				arrayBatalla[i][j] = 0;
			}
		}
		/*
		// Naves

		naves(arrayBatalla, 4, 3, 7); // 1 colecciones 4
		// 2x3
		for (int i = 0; i < 2; i++) {
			naves(arrayBatalla, 3, 2, 8);
		}
		// 3x2
		for (int i = 0; i < 3; i++) {
			naves(arrayBatalla, 2, 1, 9);
		}
		*/
		// 4x1
		//for (int i = 0; i < 4; i++) {
			naves(arrayBatalla, 1, 0, arrayBatalla.length);
		//}
		cuadricula(arrayBatalla);
	}
	

	public static void main(String[] args) {
		BatallaNaval b1 = new BatallaNaval();
		b1.jugar();
	}

	/*
	 * el jugador ingresa coordenadas para intentar "hundir" esos barcos. -
	 * *Conceptos prácticos*: Arrays bidimensionales para representar la cuadrícula,
	 * validación de entradas, ciclos para gestionar turnos y lógica de comparación
	 * para determinar impactos. //array cuyo contenido es un array //arrayD []
	 * 
	 */

}
