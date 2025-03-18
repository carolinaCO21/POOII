package baraja;
import java.util.Random;

public class BarajaJavi {

		private Carta[] cartas;
		private Carta[] cartasSacadas;
		
		public BarajaJavi(int numCartasPorPalo, String[] losPalos) {
			cartas = new Carta[numCartasPorPalo * losPalos.length];
			cartasSacadas = new Carta[0];
			int pos = 0;
			for (int numCarta = 1; numCarta <= numCartasPorPalo; numCarta++) {
				for (String palo : losPalos) {
					cartas[pos++] = new Carta(palo, numCarta);
				}			
			}
		}
		
		public int mostrarCartaAlAzar() {
			Random random = new Random();
			int posicionAleatoria = random.nextInt(cartas.length);
			System.out.println(cartas[posicionAleatoria]);
			return posicionAleatoria;
		}
		
		public Carta sacarCartaAlAzar() {
			// Elijo la carta al azar
			int posicionASacar = mostrarCartaAlAzar();
			Carta cartaASacar = cartas[posicionASacar];
			
			// Creo los futuros arrays de cartas sacadas y de la baraja
			Carta[] nuevaCartas = new Carta[cartas.length - 1];
			Carta[] nuevaCartasSacadas = new Carta[cartasSacadas.length + 1];
			
			// La carta elegida la añado al nuevo array de cartas sacadas

			for(int i = 0; i < cartasSacadas.length; i++) {
				nuevaCartasSacadas[i] = cartasSacadas[i];
			}
			nuevaCartasSacadas[nuevaCartasSacadas.length - 1] = cartaASacar;
			cartasSacadas = nuevaCartasSacadas;
			
			// La carta elegida la saco del nuevo array de cartas
			int indexNuevaCartas = 0;
			for(int i = 0; i < cartas.length; i++) {
				if(i != posicionASacar) {
					nuevaCartas[indexNuevaCartas++] = cartas[i];
				}
			}
			cartas = nuevaCartas;
			
			// devuelvo la carta que he sacado
			return cartaASacar;
			
		}
		
		public static void main(String[] args) {
			BarajaJavi esp1 = new BarajaJavi(10, 
					new String[] {"Oros", "Copas", "Espadas", "Bastos"});
			String[] misPalos = {"Oros", "Copas", "Espadas", "Bastos"};
			BarajaJavi esp2 = new BarajaJavi(10, misPalos);
			
			for (int i = 0; i < 100; i++) {
				esp1.sacarCartaAlAzar();
			}
			
		}
	}

	
	

	

