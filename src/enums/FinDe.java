package enums;

public enum FinDe {
	// Clase.Instancia.getter
		//Literales(identificador, nombre de constante), mayus
		// si solo pones los literales no necesita ; al final si quieres constructores, etc. si los necesitas
		//son los nombres que utilizo para apuntar a los objetos que he creado
	
		VI(5,"viernes","friday"),SA(6,"sabado","saturday"), DO(7,"domingo","sunday"); //Literales
		private int numeroDia;
		private String nombreEn; 
		private String nombreEs;
		
		private FinDe(int numeroDia, String nombreEn, String nombreEs) {
			this.numeroDia = numeroDia;
			this.nombreEn = nombreEn;
			this.nombreEs = nombreEs;
		}
		//a los literales puedo accexer pero a () solo con un getter
		public int getNumeroDia() {
			return numeroDia;
		}
		public String getNombreEn() {
			return nombreEn;
		}
		public String getNombreEs() {
			return nombreEs;
		}
		
		public String presentación() {
			return String.format("El día %d de finde es el %s (%s)",  numeroDia ,nombreEs, nombreEn);	
		}
		// un coche es un enum , un enum de marca, un enum de colores
		
		//_collections una clase  ArrayList, Mapa, Set(lista de coches unicos)
		
		
		
		
	
	
	
	
}
