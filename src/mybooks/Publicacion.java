package mybooks;

public abstract class Publicacion implements CanRead {
    private String titulo;
    private boolean formatoDigital;
    private double precio;
    private long id;
    private static long nextId = 0;
    private int numPags;
	private int pagInicial;
	private boolean leido;
	private int pagActual;

    protected Publicacion(String titulo, int numPags, int pagInicial, boolean formatoDigital, double precio) {
        this.titulo = titulo;
        this.formatoDigital = formatoDigital;
        this.precio = precio;
        this.id = nextId++;
        this.numPags = numPags;
        this.pagInicial = pagInicial = pagInicial < 1? 1 : pagInicial > numPags? numPags : pagInicial;
        this.pagActual = pagInicial;
        this.leido = false;
    }
    
    
    public static void showStatic(Publicacion p) {
    	p.show();
    }
    
    public void show() {
    	
	System.out.printf("Título: %s%nId: %d%nPáginas: %d%nPágina inicial: %d%nPáginaActual: %d%nPrecio: %.2f%nFormato digital: %b%nLeído: %b",
		 titulo, id, numPags, pagInicial,pagActual, precio, formatoDigital, leido);
    }
    
	
    public abstract void mensajeLeePagina();
    public abstract void mensajeLeePaginaEstaLeido();
	public abstract void mensajeLeePaginaEstaEnUltimaPagina();
    
	public void leePagina(boolean silenciosamente) {
		if(!(silenciosamente || leido)) {
			 pagActual = pagActual < numPags? pagActual+1 : pagActual;
		   	
			if (pagActual < numPags-1) {
	    		mensajeLeePagina();
			} else if (pagActual == numPags-1){
				mensajeLeePaginaEstaLeido();
			} else {
				mensajeLeePaginaEstaEnUltimaPagina();
				leido = true;
			}
		}
	}
	
	public static void leePaginaStatic(Publicacion p, boolean silenciosamente) {
		 p.leePagina(silenciosamente);
	}
	

                              
	public boolean isLeido() {
		return leido;
	}
	public int getPagInicial() {
		return pagInicial;
	}

	public int getNumPags() {
		return numPags;
	}

	public void setNumPags(int numPags) {
		this.numPags = numPags;
	}


	public int getPagActual() {
		return pagActual;
	}


	public String getTitulo() {
		return titulo;
	}
	
	public double getPrecio() {
		return precio;
	}

	public long getId() {
		return id;
	}


	@Override
	public String toString() {
		return String.format("Publicación \"%s\"con %d páginas y precio %.2f €%n", titulo, numPags, precio);
				
				
	}
	

	

	
	
	
	

	
	
	
	
	
	
	
	
	
	
}
