package casino2;

public class Carta {

	private String palo;
	private int numero;
	
	
	public Carta(String palo, int numero) {
	//super(); Esto hace referencia al object que es el padre 
		this.palo = palo;
		this.numero = numero;
	}


	@Override
	public String toString() {
		return String.format("[%d %s]", numero, palo);
	}
}
