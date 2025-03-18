package _parking_1;

import _parking_1.Coche;
import _parking_1.Color;
import _parking_1.Marca;
import _parking_1.Parking;

public class Test {
	
	public static void mostrar(Parking p) {
		p.reportParking();
		p.reportSetCoches();
		p.reportColores();
		p.reportMarca();
		p.reportCochesIguales();
	}
	
	public static void main(String[] args) {
		Parking p1 = new Parking("P1", 10);
		Parking p2 = new Parking("P1", 10);
		p1.reportParking();
		System.out.println("¿¿¿¿¿¿¿¿¿?????????????????");
		Coche c = new Coche();
		Coche c1 = new Coche();
		Coche c2 = new Coche();
		Coche c3 = new Coche();
		Coche c4 = new Coche();
		p2.entraCoche(c);
		p2.reportParking();
		p2.vaciarParking();
		p2.reportParking();
		
		p1.entraCoche(c);
		p1.entraCoche(c);
		p1.entraCoche(c1);
		p1.entraCoche(c2);
		p1.entraCoche(c3);
		p1.entraCoche(c4);
	
		
		mostrar(p1);
		
	
		p1.saleCoche(c);
		p1.saleCoche(c1);
		Coche cocheAleatorio = p1.saleCocheAleatrorio();
		System.out.println(cocheAleatorio);
		p1.saleCoche(cocheAleatorio);

		mostrar(p1);
		
		p1.vaciarParking();
		
		mostrar(p1);
		
	}
	
}
