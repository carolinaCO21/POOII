package generics;

public class CajaParaTodo <Object>{

	private Object contenido;

	public CajaParaTodo(Object contenido) {
		this.contenido = contenido;
	}

	public Object getContenido() {
		return contenido;
	}
	

	@Override
	public String toString() {
		return "CajaParaTodo [contenido=" + contenido + "]";
	}

	
		
	
	
	
}
