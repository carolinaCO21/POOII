package colecciones;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;

public class W_AB {
	public static void main(String[] args) {
		int contador = 0;
		
		System.out.println("do while");
		do {
			contador++;
			System.out.printf("%d ", contador);
		} while(contador < 10);
		contador = 0;
		System.out.printf("%nwhile%n");
		while(contador < 10) {
			contador++;
			System.out.printf("%d ", contador);
		}
		System.out.printf("%nFor%n");
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d ", i);
		}
		System.out.printf("%nARRAYS BIDIMENSIONALES");
		int[][] array2D1 = new int[4][3];
		for (int i = 0; i < array2D1.length; i++) {
				System.out.println();
				for (int j = 0; j < array2D1[i].length; j++) {
					//array2D[i][j] = 1;
					System.out.print(j);
				}
				System.out.print(i);
		}
		System.out.println();
		
		int[][] array2D = new int[4][3];
		int [][] array2D_2 = {{3,2,5}, {1,7}};

		// array2d.length es el numero de filas
		// array2D [i].length hace referencia a las columnas de cada fila
		int indice = 1;
		for (int i = 0; i < array2D.length; i++) {
			for (int j = 0; j < array2D[i].length; j++) {
				array2D[i][j] = indice++;
				System.out.printf("%d ", array2D[i][j]);

			}
			System.out.println();
		}
		System.out.printf("%nArray 2D_2");
		System.out.printf("%n-----------%n");
		for (int i = 0; i < array2D_2.length; i++) {
			for (int j = 0; j < array2D_2[i].length; j++) {
				System.out.printf("%d ", array2D_2[i][j]);

			}
			System.out.println();
		}

	

				
		
		
		
		
		
	}
}
