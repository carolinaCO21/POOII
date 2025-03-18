package casino2;

import java.util.Random;

public class Baraja {
private Carta [] cartas;
private Carta[] cartasSacadas;

	
	//El constructor tiene que crear cartas y ponerlas en los sitios del array
	
	public Baraja (int numCartasPalo, String [] losPalos) {
		cartas = new Carta [numCartasPalo * losPalos.length];
		cartasSacadas = new Carta[0];
		//La primera posición donde voy a poner el array de cartas
		int pos = 0;
		for (int numCarta = 1; numCarta <= numCartasPalo; numCarta++) {
			for (String palo : losPalos) {
				//con pos++ muevo la posición en el aray al 1 para poner la siguiente carta
				cartas [pos++] = new Carta(palo, numCarta);
				
			}
		}
	}
	
	  public int mostrarCartaAlAzar() {
		  
		  Random random = new Random();
		  int posicionAleatoria = random.nextInt(cartas.length);
		  Carta c1 = cartas[posicionAleatoria]; //carta random
		  System.out.println(c1);
		  return posicionAleatoria;
		  
	  }
	  //
	  public Carta sacarCartaAlAzar() {
		  //elijo la carta al azar
		  int posicionASacar = mostrarCartaAlAzar();
		  Carta cartaASacar = cartas[posicionASacar];
		  //Creo futuros arrys de cartas sacadas y de la baraja
		  Carta[] nuevasCartas = new Carta[cartas.length-1]; //Reducimo el tamaño de la Baraja
		  Carta[] nuevasCartasSacadas = new Carta[cartasSacadas.length +1];
		  
		  //La carta elegida la añado al nuevo array de cartas sacadas
		  for (int i = 0; i < cartasSacadas.length; i++) {
			nuevasCartasSacadas[i]= cartasSacadas[i];
		  }
		  nuevasCartasSacadas[nuevasCartasSacadas.length-1] = cartaASacar;
		  cartasSacadas = nuevasCartasSacadas;
		  //La carta elegida la saco del nuevo array de cartas
		  int indexNuevasCartas = 0;
		  for (int i = 0; i < cartas.length; i++) {
			if(i != posicionASacar) {
				nuevasCartas[indexNuevasCartas++]= cartas[i];
			}
		}
		  
		  cartas = nuevasCartas;
		  return cartaASacar;
	  }
	  
	  public void resetBaraja() {
		  
		  
		  
		  
		  
	  }
	
	  
	  
	
	public static void main(String[] args) {
		//Son dos barajas distintas aunque tengan los mismos números y palos, como en la vida real
		//una forma de hacerlo
		Baraja esp1 = new Baraja(10, new String [] {"Oros", "Copas", "Espadas", "Bastos"});
		//Otra forma de hacerlo
		String [] misPalos = {"Oros", "Copas", "Espadas", "Bastos"};
		Baraja esp2 = new Baraja(10, misPalos);
		for(int i = 0; i< 10; i++) {
			esp2.mostrarCartaAlAzar();
		}
		for(int i = 0; i< 10; i++) {
			esp1.sacarCartaAlAzar();
		}
		
		
		
		
	}
	
}
/*
Diseña una clase que modele una baraja de cartas, teniendo en cuenta que:

- La baraja estará formada por cartas. LISTO
- La carta será una clase que tendrá valor y palo. Donde se pondrán tener entre 4 y 8 palos marcados con un char y un número de carta, entre 5 y 20. LISTO
- Debe poder sacarse una carta y sacarse varias cartas.
- Se debe poder crear un histórico de todas las cartas que se vayan extrayendo de la baraja.
- Deben poder volver a ponerse juntas las cartas. Sería como hacer un reset de la baraja.
*/
