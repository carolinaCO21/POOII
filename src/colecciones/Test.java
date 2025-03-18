package colecciones;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class Test {
	
	public static String[] devuelvePalabras(String cuento) {
		cuento = cuento.replaceAll("[.,\n]", "");
		String [] palabras = cuento.split(" ");
		return palabras;
	}
	

	public static void arrayPalabras(String [] arrayX) {
		System.out.printf("Lista original tiene %d palabras.%n", arrayX.length);
		for (String contenido : arrayX) {
			System.out.printf("[%s]", contenido);
		}
	}
	
	public static void  arrayListPalabras(String [] arrayX) {
		ArrayList<String> a1 = new ArrayList<>();
		for (String contenido : arrayX) {
			a1.add(contenido);
		}
		System.out.printf("Lista original tiene %d palabras.%n", a1.size());
		for (String contenido: a1) {
			System.out.printf("[%s]", contenido );
		}
		
	}
	
	
	public static void hashSetPalabras(String [] arrayX) {
		//HashSet<String> h1 = new HashSet<String>(Arrays.asList(arrayX));
		HashSet<String> h1 = new HashSet<String>();
		for (String contenido : arrayX) {
			h1.add(contenido);
		}
		System.out.printf("Lista original tiene %d palabras%n", h1.size());
		for (String contenido : h1) {
			System.out.printf("[%s]", contenido);
		}
		
	}
	

	public static void  treeSetPalabras (String [] arrayX) {
		//HashSet<String> h1 = new HashSet<String>(Arrays.asList(arrayX));
		TreeSet<String> t1 = new TreeSet<>();
		for (String contenido : arrayX) {
			t1.add(contenido);
		}
		System.out.printf("Lista original tiene %d palabras%n", t1.size());
		for (String contenido : t1) {
			System.out.printf("[%s]", contenido);
		}
		
	}
	/*
	   // Recorrer el mapa con entrySet() para obtener tanto la clave como el valor
        for (Map.Entry<String, Integer> entrada : mapa.entrySet()) {
            String clave = entrada.getKey();   // Obtener la clave
            Integer valor = entrada.getValue(); // Obtener el valor

	 */
	public static void mapConteoPalabras(String [] arrayX) {
		HashMap<String,Integer> hm1 = new HashMap<>();
		for (String contenido : arrayX) {
			contenido = contenido.toLowerCase();
			if (hm1.containsKey(contenido)) {
				hm1.put(contenido, hm1.get(contenido)+1);
			} else {
				hm1.put(contenido, 1);
				
			}
		}
		System.out.printf("Lista original tiene %d palabras%n", hm1.size());
		for (Map.Entry<String, Integer> contenido : hm1.entrySet()) {
			System.out.printf("[%s(%d)]", contenido.getKey(), contenido.getValue());
		}

	}
	
	public static void mapConteoPalabrasOrdenadas (String [] arrayX) {
		TreeMap<String,Integer> tm1 = new TreeMap<>();
		for (String contenido : arrayX) {
			contenido = contenido.toLowerCase();
			if (tm1.containsKey(contenido)) {
				tm1.put(contenido, tm1.get(contenido)+1);
			} else {
				tm1.put(contenido, 1);
				
			}
		}
		System.out.printf("Lista original tiene %d palabras%n", tm1.size());
		for (Map.Entry<String, Integer> contenido : tm1.entrySet()) {
			System.out.printf("[%s(%d)]", contenido.getKey(), contenido.getValue());
		}

	}
	
	public static void treeSetPalabrasOrdenadasInversas(String[] arrayX) {
		TreeSet<String> t1 = new TreeSet<>();
		for (String contenido : arrayX) {
			t1.add(contenido);
		}
		System.out.printf("Lista original tiene %d palabras%n", t1.size());
		for (String contenido : t1.descendingSet()) {
	            System.out.printf("[%s] ", contenido);
	     }

	}
		public static void treeSetPalabrasOrdenadasLongitud(String[] arrayX) {
			TreeSet<String> t1 = new TreeSet<>();
			for (String contenido : arrayX) {
				t1.add(contenido);
			}
			System.out.printf("Lista original tiene %d palabras%n", t1.size());
			for (String contenido : t1.descendingSet()) { 
			
				System.out.printf("[%s] ", contenido);
		     }
		
	}
	
	public static void main(String[] args) {
		/*CuentaCuentos c1 = new CuentaCuentos();
		System.out.println(c1.cuentoLechera());*/
		String cuentoLechera = CuentaCuentos.cuentoLechera();
		System.out.println("DEVUELVE PALABRAS");
		System.out.println(Arrays.toString((devuelvePalabras(cuentoLechera))));
		System.out.println();
		System.out.println("Array PALABRAS");
		arrayPalabras(devuelvePalabras(cuentoLechera));
		System.out.println();
		System.out.println();
		System.out.println("ARRAYList Palabras");
		arrayListPalabras(devuelvePalabras(cuentoLechera));
		System.out.println();
		System.out.println();
		System.out.println("HashSet Palabras");
		hashSetPalabras(devuelvePalabras(cuentoLechera));
		System.out.println();
		System.out.println();
		System.out.println("TreeSet Palabras");
		treeSetPalabras(devuelvePalabras(cuentoLechera));
		System.out.println();
		System.out.println();
		System.out.println("HashMap Palabras");
		mapConteoPalabras(devuelvePalabras(cuentoLechera));
		System.out.println();
		System.out.println();
		System.out.println("TreeMap Palabras ORDE");
		mapConteoPalabrasOrdenadas(devuelvePalabras(cuentoLechera));
		System.out.println();
		System.out.println();
		System.out.println("TreeSet inv");
		treeSetPalabrasOrdenadasInversas(devuelvePalabras(cuentoLechera));
	}
}
	

/*
Genera un método estático llamado mapConteoPalabras donde:
Se impriman las palabras en un formato como el que puedes ver a continuación, donde para cada palabra hay un conteo del número de veces que se repite.
Conteo de repeticiones de palabras
==================================
[creciera(1)][de(6)][venderla(1)][lo(4)][con(5)]
.....
​
Genera un método estático llamado mapConteoPalabrasOrdenadas donde:
Se impriman las palabras en un formato como el que puedes ver a continuación, donde para cada palabra hay un conteo del número de veces que se repite (y salgan ordenadas alfabéticamente).
Conteo de repeticiones de palabras
==================================
[con(5)]
[creciera(1)]
[de(6)]
[lo(4)]
[venderla(1)]
.....
​
Genera un método estático llamado treeSetPalabrasOrdenadasInversas donde:
Se impriman las palabras en un formato como el que puedes ver a continuación, donde para cada palabra hay un conteo del número de veces que se repite (y salgan ordenadas en orden alfabético inverso).
Listado de palabras únicas en orden inverso
===========================================
[y] [vez] [venta] [venderlos] [venderla] [una] ......
Lista en TreeSet tiene 6 palabras.
​
Genera un método estático llamado treeSetPalabrasOrdenadasLongitud donde:
Se impriman las palabras en un formato como el que puedes ver a continuación, donde para cada palabra hay un conteo del número de veces que se repite (y salgan ordenadas en orden alfabético inverso).
Listado de palabras únicas en orden longitud de cadena
======================================================
[y] [El] [una] [cubo] ...
Lista en TreeSet tiene 4 palabras.
*/
