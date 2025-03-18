package _collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;

public class Parking {
	private String nombre;
	private int totalPlazas;
	private int plazasOcupadas; 
	private List<Coche> listaCoches; // Lista
	private Set<Coche> listaCochesPorTipo;
	private Map<Color, Integer> contadorCochesPorColor;
	private Map<Marca, Integer> contadorCochesPorMarca;
	private Map<Coche, Integer> contadorCochesIguales;
	

	public Parking(String nombre, int totalPlazas) {
		this.nombre = nombre;
		this.totalPlazas = totalPlazas;
		plazasOcupadas = 0;
		listaCoches = new ArrayList<>();
		contadorCochesPorColor = new HashMap<>();
		contadorCochesPorMarca = new HashMap<>();
		contadorCochesIguales = new HashMap<>();
		listaCochesPorTipo = new HashSet<>();
	}
	// Métodos:
	public boolean entraCoche(Coche c) {
		//Checar si un coche ya esta
		boolean cocheEnParking =  false;
		for (Coche coche : listaCoches) {
			if (coche == c) {
				cocheEnParking = true;
				break; // importante un break para que no siga buscando
			}
		}
		if (!cocheEnParking && plazasOcupadas < totalPlazas) {
			listaCoches.add(c);
			plazasOcupadas++;
			// color se repite colecciones veces
			// EQUALS y HashCode Listo
			if (!contadorCochesPorColor.containsKey(c.getColor())) {
				contadorCochesPorColor.put(c.getColor(), 1);
			}else {
				contadorCochesPorColor.put(c.getColor(), contadorCochesPorColor.get(c.getColor())+1);
			}
			//marca se repite colecciones veces
			if (!contadorCochesPorMarca.containsKey(c.getMarca())) {
				contadorCochesPorMarca.put(c.getMarca(), 1);
			}else {
				contadorCochesPorMarca.put(c.getMarca(), contadorCochesPorMarca.get(c.getMarca())+1);
			}
			//coche se repite colecciones veces
			if (!contadorCochesIguales.containsKey(c)) {
					contadorCochesIguales.put(c, 1);
			}else {
					contadorCochesIguales.put(c, contadorCochesIguales.get(c)+1);
			} 
			// (se controla solo el set no admite repetidos) 
			// COCHE SET SOBREESCRITO EQUALS y HashCode 
			listaCochesPorTipo.add(c);
			return true;
		}
		
		return false;

	}
	// - `boolean saleCoche(Coche c)`: solo pueden salir coches que ya estén dentro.
	// y si ya está vacío el _collections también.
	
	 public boolean saleCoche(Coche c) {
		
		if(listaCoches.isEmpty()) {return false;}	
		for (int i = 0; i < listaCoches.size(); i++) {
	        Coche coche = listaCoches.get(i);
	        if (c == coche) {  
	            listaCoches.remove(i);  
	            plazasOcupadas--;
	        	// color se repite colecciones veces
				if (contadorCochesPorColor.containsKey(c.getColor())) {
					contadorCochesPorColor.put(c.getColor(), contadorCochesPorColor.get(c.getColor())-1);
				}
				//marca se repite colecciones veces
				if (contadorCochesPorMarca.containsKey(c.getMarca())) {
					contadorCochesPorMarca.put(c.getMarca(), contadorCochesPorMarca.get(c.getMarca())-1);
				}
				//coche se repite colecciones veces
				if (contadorCochesIguales.containsKey(c)) {
						contadorCochesIguales.put(c, contadorCochesIguales.get(c)-1);
				} 
				listaCochesPorTipo.remove(c);
				return true;
			}
	     }
	    
	    return false;
	    }
	 
		public Coche saleCocheAleatrorio() {
			if (listaCoches.size() == 0) {
				return null;
			}
			Random r = new Random();
			int indiceAleatorio = r.nextInt(0, listaCoches.size());
			// OJITO remove(int index) Ò remove(Object o)
			Coche cocheAleatorio = listaCoches.get(indiceAleatorio);
			saleCoche(cocheAleatorio);
			return cocheAleatorio;
		}

	// - `boolean vaciaParking()`: debe sacar todos los coches del Parking uno a
	// uno. Devuelve false si ya estaba vacío.
	public boolean vaciaParking(Parking p) {
		//clear() NO
		if (listaCoches.size() == 0) {
			return false;
		} else {
			int tamanio = listaCoches.size();
			for (int i = 0; i < tamanio; i++) {
				p.saleCocheAleatrorio();
			}
		   return true;
		}
		
	}
	
	private void cabecera(String texto) {
		System.out.println(texto);
		System.out.println("-".repeat(texto.length()));
		
	}


	public void reportColores() {
		cabecera("REPORT DE COLORES");
		System.out.printf("Parking: %s%n", nombre);
 		for (Entry<Color, Integer> entry : contadorCochesPorColor.entrySet()) {
			System.out.printf("El coche de color %s se repite %d %s.%n",entry.getKey(), entry.getValue(), entry.getValue() > 1? "veces": "vez");
					
		}
 		System.out.printf("Total coches: %d", plazasOcupadas);
		

	}
	
	public void reportMarcas() {
		cabecera("REPORT DE MARCAS");
		System.out.printf("Parking: %s%n", nombre);
 		for (Map.Entry<Marca, Integer> entry : contadorCochesPorMarca.entrySet()) {
			System.out.printf("El coche de marca %s se repite %d %s.%n",entry.getKey(), entry.getValue(), entry.getValue() > 1? "veces": "vez");
					
		}
 		System.out.printf("Total coches: %d", plazasOcupadas);
		System.out.println();

	}

	public void reportCochesIguales() {
		cabecera("REPORT DE COCHES IGUALES");
		System.out.printf("Parking: %s%n", nombre);
 		for (Entry<Coche, Integer> entry : contadorCochesIguales.entrySet()) {
			System.out.printf("%s se repite %d %s.%n",entry.getKey(), entry.getValue(), entry.getValue() > 1? "veces": "vez");
					
		}
 		System.out.printf("Total coches: %d", plazasOcupadas);
		System.out.println();

	}

	public void reportParking() {
		cabecera("LISTADO COCHES");
		System.out.printf("Parking: %s%n", nombre); 
		for (Coche coche : listaCoches) {
			System.out.println(coche);
		}
		System.out.printf("Total coches: %d, plazas libres: %d", listaCoches.size(), totalPlazas-plazasOcupadas);
		System.out.println();
	}
	
	public void reportSetCoches() {
		cabecera("REPORT SET DE COCHES");
		System.out.printf("Parking: %s%n", nombre);
		for (Coche coche : listaCochesPorTipo) {
			System.out.println(coche);
		}
		System.out.println();
	}

	//					intefaz generica
	//public class Coche implements Comparable<Coche>{
	
	/*
	public boolean saleCoche(Coche c) {
	   
			if (listaCoches.contains(c)) {
				listaCoches.remove(c);
				plazasOcupadas--;
				// color se repite colecciones veces
				if (contadorCochesPorColor.containsKey(c.getColor())) {
					contadorCochesPorColor.put(c.getColor(), contadorCochesPorColor.get(c.getColor())-1);
				}
				//marca se repite colecciones veces
				if (numCochesPorMarca.containsKey(c.getMarca())) {
					numCochesPorMarca.put(c.getMarca(), numCochesPorMarca.get(c.getMarca())-1);
				}
				//coche se repite colecciones veces
				if (contadorCochesIguales.containsKey(c)) {
						contadorCochesIguales.put(c, contadorCochesIguales.get(c)-1);
				} 
				listaCochesPorTipo.remove(c);
				return true;
			}
			return false;

		}	*/
	// clear();
	 /*
	public boolean saleCocheAleatrorio() {
		if (listaCoches.size() == 0) {
			return false;
		}
		Random r = new Random();
		int indiceAleatorio = r.nextInt(0, listaCoches.size());
		// OJITO remove(int index) Ò remove(Object o)
		Coche cocheAleatorio = listaCoches.get(indiceAleatorio);
		saleCoche(cocheAleatorio);
		return true;
	}*/
}
