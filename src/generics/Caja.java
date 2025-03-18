package generics;

public class Caja <T>{

	private T contenido;

	public Caja(T contenido) {
		this.contenido = contenido;
	}

	public T getContenido() {
		return contenido;
	}

	@Override
	public String toString() {
		return "Caja [contenido=" + contenido + "]";
	}

	
	
	
	
	
}
