package juegos;

import java.util.Arrays;
import java.util.Iterator;

public class CuentaAtras {

	private int[] valores;

	public CuentaAtras(int numInicial, int numFinal) {
		valores = new int[numInicial - numFinal +1];
		for (int i = 0; i < valores.length; i++) {
			valores[i] = numInicial--;
		}
		
		
		//si inicial 5 y finL 2
		//GUARDA ARRAY 5,4,3,2
		
/*
	for (int i = 0; i < valores.length; i++) {
		if (numFinal > numInicial) {
			int [] nuevoArrayValores = new int [valores.length + numFinal];
					//numInicial--;
			valores = nuevoArrayValores;
		} else {
			int [] nuevoArrayValores = new int [valores.length + numInicial];
				//numInicial++;
			valores = nuevoArrayValores;
		}
		
		
		
	}
	*/	
		
		
	}

	@Override
	public String toString() {
		// si el array 5, 4, 3, 2
		// devuelve 5 ... 4 ... 3 ... 2
		String resultado = "";
		for (int valor : valores) {
			resultado = resultado + valor + "...";
		} 
		return resultado;
	}
	
	public void quitaUno() {
		// si en el array 5,4 3, 2
		//debe deja 5,4,3
		
		int[] arrayViejo = valores;
		int[] arrayNuevo = new int[arrayViejo.length-1];
		for (int i = 0; i < arrayNuevo.length; i++) {
			arrayNuevo[i]= arrayViejo[i];
		}
		
		valores = arrayNuevo;
		
		
	}
	
	public static void main(String[] args) {
		CuentaAtras c1 = new CuentaAtras(9, 7);
		System.out.println(c1);
		c1.quitaUno();
		System.out.println(c1);
	}
	
	
}
