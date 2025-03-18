package casino;

public class CartaJavi {
	
		private String palo;
		private int numero;
		
		
		public CartaJavi(String palo, int numero) {
		//super(); Esto hace referencia al object que es el padre 
			this.palo = palo;
			this.numero = numero;
		}


		@Override
		public String toString() {
			return String.format("[%d %c]", numero, palo);
		}



}