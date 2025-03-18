package casino;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;

public class DadoJavi {
	private int lanzamiento;
	private int[] historico;
	private int caras;
	

	public DadoJavi (int caras,int elementoDeHistorico) {
		historico = new int[elementoDeHistorico];
		this.caras = caras;
		
	}
	public int lanzar() {
		Random random = new Random();
		lanzamiento = random.nextInt(1, caras + 1); //Desde el 1 hasta el 7 sin tocarlo.
		for (int i = 1; i< historico.length; i++) {
			historico[i-1]= historico[i];
		}
		historico[historico.length-1] = lanzamiento;
		return lanzamiento;
	/*

	 animal
	 
	 ^
	 |
	 */
	}
	//Debe poder lanzarse n veces y contar el número de veces que sale el valor de una cara.
    public int contarNumeroDeCaras (int lanzamientos, int numeroCara) {
    	int contador = 0;
    	boolean caraValida = numeroCara >= 1 && numeroCara <= caras;
    	//Si se cumplen las caras válidas que se meta en el bucle
    	if(caraValida) {
    		for (int i = 0; i < lanzamientos; i++) {
    			if(lanzar() == numeroCara) {
    				contador++;
    			}
    		}
    	}
    	//Sino se cumplen las caras válidas que retorne el contador a 0 y sino el contador
    	//modificado por el bucle.
    	return contador;
    }
	public void mostrarHistorico() {
		for (int tirada : historico) {
			if(tirada != 0) {
				System.out.printf("%d ", tirada);
			}
			
		}
	}
	
	

	public int[] getHistorico() {
		return historico;
	}
	
	public static void main(String[] args) {
		DadoJavi d1 = new DadoJavi(6, 10);
		d1.lanzar();
		for (int i = 0; i < 4; i++) {
			d1.lanzar();
		}
		d1.mostrarHistorico();
		System.out.println();
		System.out.print(Arrays.toString(d1.getHistorico()));
		System.out.println();
		System.out.println(d1.contarNumeroDeCaras(7, 4));
		
		
	}
	

}
