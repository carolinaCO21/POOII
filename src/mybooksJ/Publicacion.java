package mybooksJ;

public abstract class Publicacion implements CanRead {
		// Propiedades
		private String titulo;
		private int numPags;
		private int pagInicial;
		private boolean formatoDigital;
		private double precio;
		private long id;
		private int pagActual;
		private boolean leido;
		
		private static long nextId = 0;

		// Constructor
		public Publicacion(String titulo, int numPags, int pagInicial, boolean formatoDigital, double precio) {
			this.titulo = titulo;
			this.numPags = numPags;
			this.pagInicial = pagInicial;
			this.formatoDigital = formatoDigital;
			this.precio = precio;
			this.id = nextId++;
			this.pagActual = pagInicial;
			this.leido = false;
		}
		
		@Override
		public String toString() {
			return String.format(
					"Publicación \"%s\" con %d páginas y precio %.2f €",
					titulo, numPags, precio);
		}	
		
		public void show() {

			System.out.printf("Título: %s%n", titulo);
			System.out.printf("Id: %s%n", id);
			System.out.printf("Páginas: %s%n", numPags);
			System.out.printf("Página inicial: %s%n", pagInicial);
			System.out.printf("Página actual: %s%n", pagActual);
			System.out.printf("Precio: %s%n", precio);
			System.out.printf("Formato: %s%n", formatoDigital);
			System.out.printf("Leído: %s%n", leido);
		}

		public int getPagActual() {
			return pagActual;
		}

		public void setPagActual(int pagActual) {
			this.pagActual = pagActual;
		}

		public String getTitulo() {
			return titulo;
		}

		public int getNumPags() {
			return numPags;
		}

		public boolean isLeido() {
			return leido;
		}
		
		public void setLeido(boolean leido) {
			this.leido = leido;
		}

		public long getId() {
			return id;
		}
		double getPrecio() {
			return precio;
		}
		
		public abstract void mensajeLeePaginaEstaLeido();
		public abstract void mensajeLeePaginaEstaEnUltimaPagina();
		public abstract void mensajeLeePagina();
		
		public void leePagina(boolean silenciosamente) {
			if (isLeido()) {
				if (!silenciosamente) {
					this.mensajeLeePaginaEstaLeido();
				}

			} else if (getNumPags() == getPagActual()) {
				setLeido(true);
				if (!silenciosamente) {
					this.mensajeLeePaginaEstaEnUltimaPagina();

				}
			} else {

				if (!silenciosamente) {
					this.mensajeLeePagina();
				}
			}
		}
}


