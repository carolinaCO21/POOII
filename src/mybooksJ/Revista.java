package mybooksJ;

public class Revista extends Publicacion{
	
		private static String mensajeCabecera = "\nDATOS REVISTA\n=============\n";
		public Revista(String titulo, int numPags, int pagInicial, 
				boolean formatoDigital, double precio){
			super(titulo, numPags, pagInicial, formatoDigital, precio);
		}
		
		public void show() {
			System.out.print(mensajeCabecera);
			super.show();
		}
		public static void showStatic(Revista revista) {
			revista.show();
		}
		
		public void mensajeLeePaginaEstaLeido() {
			System.out.printf(
					"Revista titulada %s ya ha sido leída%n",
					getTitulo());
		}
		public void mensajeLeePaginaEstaEnUltimaPagina() {
			System.out.printf(
					"Última página (%d) leída de la revista titulada %s%n",
					getPagActual(), getTitulo());
		}
		public void mensajeLeePagina() {
			System.out.printf("Página %d leída de la revista titulada %s%n",
					getPagActual(), getTitulo());		
		}

}


