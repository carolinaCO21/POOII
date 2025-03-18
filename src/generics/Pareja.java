package generics;

public class Pareja <T,S> {
	private T elemento1;
	private S elemento2;
	
	public Pareja(T elemento1, S elemento2) {
		this.elemento1 = elemento1;
		this.elemento2 = elemento2;
	}

	public T getElemento1() {
		return elemento1;
	}

	public S getElemento2() {
		return elemento2;
	}

	@Override
	public String toString() {
		return "Pareja [" + elemento1 + "," + elemento2 + "]";
	}
	
	
	
	
	

}
