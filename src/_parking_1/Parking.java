package _parking_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import _parking_1.Coche;


public class Parking {
	
	
	private String nombre;
	private int totalPlazas;
	private int plazasOcupadas;  
	private List<Coche> listaCoches;
	private Map<Color, Integer> contadorCochesPorColor;
	private Map<Marca, Integer> contadorCochesPorMarca;
	private Map<Coche, Integer> contadorCochesIguales;
	private Set<Coche> listaCochesPorTipo;
	private static Random r = new Random();
	 
	public Parking(String nombre, int totalPlazas) {
		this.nombre = nombre;
		this.totalPlazas = totalPlazas;
		plazasOcupadas = 0;
		listaCoches = new ArrayList<>();
		listaCochesPorTipo = new HashSet<>();
		contadorCochesPorColor = new HashMap<>();
		contadorCochesPorMarca = new HashMap<>();
		contadorCochesIguales = new HashMap<>();
		
	
	}
	
	
	private static <K> void aumentarContador(Map<K, Integer> mapa, K k) {		
			if (!(mapa.containsKey(k))) {
				mapa.put(k, 1);
			} else {
				mapa.put(k, mapa.get(k) +1);
			}	
	}
	
	private static <K> void disminuirContador(Map<K, Integer> mapa, K k) {		
		if (mapa.containsKey(k) && mapa.get(k)>0) {
			mapa.put(k, mapa.get(k)-1);
		} else {
			mapa.put(k, 0);
		}	
}
	
	private boolean cocheEnParking(Coche c) {
		for (Coche coche : listaCoches) {
			if(c == coche) {
				return true;
			}	
		} 
		return false;
	
	}
	
	private boolean parkingVacio() {
		return listaCoches.isEmpty();
	}
			
	//boolean entraCoche(Coche c) puede entrar cualquier coche mientras haya sitio y no esté ya dentro.
	public boolean entraCoche(Coche c){
		if (!cocheEnParking(c) && plazasOcupadas < totalPlazas) {
			plazasOcupadas++;
			listaCoches.add(c);
			listaCochesPorTipo.add(c);
			aumentarContador((Map<Marca,Integer>)contadorCochesPorMarca, (Marca) c.getMarca());
			aumentarContador((Map<Color,Integer>)contadorCochesPorColor, (Color) c.getColor());
			aumentarContador((Map<Coche,Integer>)contadorCochesIguales, c);
			return true;
		}
		return false;
	}

	//boolean saleCoche(Coche c) solo pueden salir coches que ya estén dentro. Si se le pasa un coche que no está dentro, devolverá false y si ya está vacío el parking también.
	public boolean saleCoche(Coche c) {
		if(parkingVacio()) {
			return false;
		}
		if (cocheEnParking(c)) {
			plazasOcupadas--;
			listaCoches.remove(c);
			listaCochesPorTipo.remove(c);
			disminuirContador((Map<Marca,Integer>) contadorCochesPorMarca, (Marca) c.getMarca());
			disminuirContador((Map<Color,Integer>) contadorCochesPorColor, (Color)c.getColor());
			disminuirContador((Map<Coche,Integer>)contadorCochesIguales, c);
		return true;	
		}
		return false;
		
	}
	
	
	public Coche saleCocheAleatrorio() {
		if (parkingVacio()) {
			return null;
		}
		int indiceAleatorio = r.nextInt(0, listaCoches.size());
		Coche cocheAleatorio = listaCoches.get(indiceAleatorio);
		saleCoche(cocheAleatorio);
		
		return cocheAleatorio;
	}

// - `boolean vaciaParking()`: debe sacar todos los coches del Parking uno a
// uno. Devuelve false si ya estaba vacío.
public boolean vaciarParking() {
	if (parkingVacio()) {
		return false;
	} 
	while(!parkingVacio()) {
		saleCocheAleatrorio();
	}
	return true;
}
	


	//REPORTS
	private static void encabezado(String texto) {
		System.out.println(texto);
		System.out.println("-".repeat(texto.length()));
	}
	
	
	//void reportParking(): muestra un listado de coches como el indicado en el ejemplo a continuación.
	public void reportParking() {
	encabezado("LISTADO COCHES");
	for (Coche coche : listaCoches) {
		System.out.println(coche);
	}
	System.out.printf("Total coches: %d, plazas libres: %d.%n", listaCoches.size(), plazasOcupadas);
		
	}
	
	public void reportSetCoches() {
		encabezado("REPORT SET DE COCHES");
		for (Coche coche : listaCochesPorTipo) {
			System.out.println(coche);
		}
		System.out.printf("Total items: %d.%n", listaCochesPorTipo.size());
			
		}
	
	//Crea un método llamado void reportMarcas()
	public void reportColores() {
		
		encabezado("REPORT DE COLORES");
		for (Map.Entry<Color, Integer> entry : contadorCochesPorColor.entrySet()) {
			Color  key = entry.getKey();
			Integer  val = entry.getValue();
			System.out.printf("El coche de color %s se repite %d veces.%n", key, val);
		}
		System.out.printf("Total coches: %d%n", listaCoches.size());	
	}
	
	public void reportMarca() {
		
		encabezado("REPORT DE MARCAS");
		for (Map.Entry<Marca, Integer> entry : contadorCochesPorMarca.entrySet()) {
			Marca  key = entry.getKey();
			Integer  val = entry.getValue();
			System.out.printf("El coche de marca %s se repite %d veces.%n", key, val);
		}
		System.out.printf("Total coches: %d%n", listaCoches.size());	
	}
	
	public  void reportCochesIguales() {
		encabezado("REPORT DE COCHES IGUALES");
		for (Map.Entry<Coche, Integer> entry : contadorCochesIguales.entrySet()) {
			Coche  key = entry.getKey();
			Integer  val = entry.getValue();
			System.out.printf("Coche: %s se repite %d veces.%n", key, val);
		}
		System.out.printf("Total coches: %d%n", listaCoches.size());	
	}
	

	
}

