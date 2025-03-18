  package juegos;
import java.util.ArrayList;

import java.util.Random;
public class TestArrayListJ {

		private static void muestraYSubraya(String texto) {
			System.out.println();
			System.out.println(texto);
			for (int i = 0; i < texto.length(); i++) {
				System.out.print("-");			
			}
			System.out.println();
			
		}
		
		private static void muestraTodosLosDatos(ArrayList<Integer> lista) {
			System.out.println(lista);
			
			Integer suma = 0;
			Integer maximo = lista.get(0);
			Integer minimo = lista.get(0);
			for (Integer num : lista) {
				suma += num;
				maximo = num > maximo ? num: maximo;
				minimo = num < minimo ? num: minimo;	
			}
			muestraYSubraya("Suma");
			System.out.println(suma);
			muestraYSubraya("Media");
			System.out.println(suma/lista.size());
			muestraYSubraya("Máximo");
			System.out.println(maximo);
			muestraYSubraya("Mínimo");
			System.out.println(minimo);
		}
		
		
		public static void main(String[] args) {
			ArrayList<Integer> al = new ArrayList<>();
			Random random = new Random();
			muestraYSubraya("Mostrar lista de números aleatorios");
			for (int i = 0; i < 20; i++) {			
				al.add(random.nextInt(100) + 1);		
			}				
			muestraTodosLosDatos(al);		
			muestraYSubraya("Eliminar los menores de 50");
			for (int i = al.size() -1; i >= 0; i--) {
				if(al.get(i) < 50) {
					al.remove(i);
				}
				System.out.println(al);
			}				
			muestraYSubraya("Mostrar lista de números aleatorios");	
			muestraTodosLosDatos(al);
		
	}
	
	
}
	


