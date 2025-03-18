package _collections;

public class Test {
	
	public static void mostrar(Parking p) {
		//MOSTRAMOS
				p.reportParking();
				p.reportCochesIguales();
				p.reportSetCoches();
				p.reportColores();
				p.reportMarcas();
				p.reportSetCoches();
		
	}
	
	public static void main(String[] args) {
/*
		Parking p1 = new Parking("P1", 20);
		Coche c1 = new Coche();
		Coche c3 = new Coche();
		Coche c4 = new Coche();
		Coche c5 = new Coche();
		Coche c6 = new Coche();
		Coche c7 = new Coche();
		Coche c8 = new Coche();
		
		Coche[] coches = {c1, c3, c4, c5, c6, c7, c8, c8, c8, c8};
		for (Coche coche : coches) {
			System.out.println(coche);
		}
		System.out.printf("%n//ESTADO INICIAL y prueba método entra coche%n");
		for (Coche coche : coches) {
			p1.entraCoche(coche);
		}
		
		p1.reportParking();
		System.out.println();
		System.out.println();
		p1.reportSetCoches();
		p1.reportCochesIguales();
		System.out.println();
		p1.reportColores();
		System.out.println();
		p1.reportMarcas();
		
		
		System.out.println();
		System.out.printf("%n//Prueba sale coche%n");
		for (Coche coche : coches) {
			p1.saleCoche(coche);
		}
		p1.reportParking();
		System.out.println();
		
		
		System.out.printf("%n//ESTADO INICIAL%n");
		for (Coche coche : coches) {
			p1.entraCoche(coche);
		}
		p1.reportParking();
		System.out.println();
		
		
		System.out.printf("%n//Prueba vaciar _collections método%n");
		p1.vaciaParking(p1);
		p1.reportParking();
		System.out.println();
		p1.reportCochesIguales();
		System.out.println();
		p1.reportColores();
		System.out.println();
		p1.reportMarcas();
*/
		
		
		
		//c1 c2 c3  --> mismo color y marca
		Coche c1 = new Coche(Marca.BM, Color.RO);
		Coche c2 = new Coche(Marca.BM, Color.RO);
		Coche c3 = new Coche(Marca.BM, Color.RO);
		
		Coche [] coches = {c1,c2,c3};
		Parking p1 = new Parking("P1", 20);
		System.out.println("EJ. UNO");
		System.out.println("Meto coches ");
		for (Coche coche : coches) {
			p1.entraCoche(coche);
		}
		//MOSTRAMOS
		mostrar(p1);
		System.out.println();
		System.out.println("SALE COCHE");
		p1.saleCoche(c2);
		//MOSTRAMOS
		mostrar(p1);
		System.out.println();System.out.println();System.out.println();
		System.out.println("SALE COCHE OTRA VEZ");
		p1.saleCoche(c2);
		//MOSTRAMOS
		mostrar(p1);
		System.out.println();System.out.println();System.out.println();
		
		
		
		
		
		System.out.println("EJ. DOS");
		System.out.println("METEMOS TRES COCHES IGUALES p2");
		Parking p2 = new Parking("P2", 20);
		System.out.println("Meto coches ");
		for (Coche coche : coches) {
			p2.entraCoche(coche);
		}
		for (int i = 0; i <3; i++) {
			p2.saleCocheAleatrorio();
		}
		//MOSTRAMOS
		mostrar(p2);
		System.out.println();System.out.println();System.out.println();
		
		
		
		
		
		System.out.println("EJ. TRES");
		System.out.println("METEMOS TRES COCHES IGUALES p3");
		Parking p3 = new Parking("P3", 20);
		for (Coche coche : coches) {
			p3.entraCoche(coche);
		}
		//MOSTRAMOS
		mostrar(p3);
		System.out.println();System.out.println();System.out.println();
		System.out.println("SALE COCHE ALEATORIO");
		Coche cocheAleatorio = p3.saleCocheAleatrorio();
		//MOSTRAMOS
		mostrar(p3);
		System.out.println();System.out.println();System.out.println();
		System.out.println("Vuelve a entrar COCHE ALEATORIO");
		p3.entraCoche(cocheAleatorio);		
		//MOSTRAMOS
		mostrar(p3);
		System.out.println();System.out.println();System.out.println();
		
		
		
		
		
		
		System.out.println("EJ. CUATRO");
		System.out.println("p4");
		Parking p4 = new Parking("P4", 9);
		Coche coch = new Coche();
		p4.entraCoche(coch);
		mostrar(p4);
		System.out.println("SALE COCHE");
		p4.saleCoche(coch);
		mostrar(p4);
		p4.vaciaParking(p4);
		//MOSTRAMOS
		mostrar(p4);

		System.out.println();System.out.println();System.out.println();
		System.out.println("EJ. CINCO");
		System.out.println("COCHES EXTRA");
		Parking p5 = new Parking("P5", 2);		
		for (Coche coche : coches) {
			p5.entraCoche(coche);
		}
		//MOSTRAMOS
		mostrar(p5);
		

	}
}
