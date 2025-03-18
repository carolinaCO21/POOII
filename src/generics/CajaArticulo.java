package generics;

public class CajaArticulo {
	private Articulo contenido;

	public CajaArticulo(Articulo contenido) {
		this.contenido = contenido;
	}

		
	public Articulo getContenido() {
		return contenido;
	}


	@Override
	public String toString() {
		return "CajaArticulo [contenido=" + contenido + "]";
	}
	
	
	
}
