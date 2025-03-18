package mybooks;

public class Libro extends Publicacion{

	private static String mensajeCabecera = "\nDATOS LIBRO\n===========\n";
	private String autor;
	
	public Libro(String titulo,  String autor, int numPags, int pagInicial, boolean formatoDigital, double precio) {
		 super(titulo, numPags, pagInicial, formatoDigital, precio);
		 this.autor = autor;
		 
		
				 
	}

	public void show() {
		System.out.printf("%sAutor: %s%n", mensajeCabecera, autor);
		super.show();
	}
	
	/*
	public static void showStatic(Libro libro) {
		libro.show();  
		
	}
	*/
	/*
	public static void leePaginaStatic(Libro libro, boolean silenciosamente) {
			libro.leePagina(silenciosamente);
	}
	*/
	public void mensajeLeePaginaEstaLeido() {
			System.out.printf("Libro titulado %s del autor %s ya ha sido leído%n", getTitulo(), autor);
	}

	public void mensajeLeePaginaEstaEnUltimaPagina() {
			System.out.printf("Última página (%d) leída del libro titulado %s del autor %s%n", getPagActual(), getTitulo(),
					autor);
	}

	public void mensajeLeePagina() {
		System.out.printf("Página %d leída del libro titulado %s del autor %s%n", getPagActual(), getTitulo(), autor);
	}
	
	
}
