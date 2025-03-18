package generics;

import java.util.Arrays;

public class Estanteria <T>{
	
	private T [] estantes;

	
	public Estanteria(T[] estantes) {
		this.estantes = estantes;
	}
	
	public T[] getArray() {
		return estantes;
	}

	@Override
	public String toString() {
		return "Estanteria [estantes=" + Arrays.toString(estantes) + "]";
	}
	
	

	
	
	
	
}