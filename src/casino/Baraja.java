
package casino;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Baraja { 
    private String nombre;
    private Carta[] cartas;


    private int cantidadPalos;
    private int cantidadCartasPorPalo;
    public Baraja() { }

    //10 de cada palo, que son: 1 (as), 2, 3, 4, 5, 6, 7, sota, caballo y rey. 
    // BASTOS, OROS ,COPAS Y  ESPADAS 
    public Baraja(String nombre, int cantidadPalos, int cantidadCartasPorPalo) {
 // se pondrán tener entre 4 y 8 palos marcados con un char y un número de carta, entre 5 y 20.
        this.cantidadPalos = cantidadPalos < 4? 4 : cantidadPalos > 8? 8 : cantidadPalos;
        this.cantidadCartasPorPalo = cantidadCartasPorPalo < 5? cantidadCartasPorPalo = 0 : cantidadCartasPorPalo >20? cantidadCartasPorPalo = 0: cantidadCartasPorPalo;
        this.nombre = nombre;
// bucle 1 recorre los palos de la baraja Y El 2 bucle recorre las cartas de cada palo.
//Cada vez que pasamos por estos bucles, creamos una carta y la agregamos al arreglo cartas.
//las letras representando los palos serán 'A', 'B', 'C' y 'D'.
        int i = 0;            
        this.cartas = new Carta[cantidadCartasPorPalo*cantidadPalos];
        for (char palo = 'A'; palo < cantidadPalos + 'A'; palo++) {
               for (int numero = 1; numero <= cantidadCartasPorPalo; numero++) {
                   cartas[i] = new Carta(palo, numero);
                   i++;
            }
        }
        //toString() de carta y un toString() Baraja
    
        
        
    }

    @Override
    public String toString() {
        String salida = String.format("Baraja %s con cantidad de palos [%d] y cantidad de cartas por palo [%d] %s%n", nombre, cantidadPalos, cantidadCartasPorPalo, 
                cantidadCartasPorPalo == 0? " --> Error, mínimo 5 cartas y máximo 20 cartas por Baraja": "confomada por:");
        for(int i = 0; i < cartas.length; i++){
            salida += cartas[i] + String.format("%n");
         
        }
        return salida;
    }

    public Carta[] getCartas() {
        return cartas;
    }
    /*
    public Carta obtenerCartaAleatoria() {
        Random random = new Random();
        int indiceAleatorio = random.nextInt(cartas.length); // Genera un índice aleatorio
        return cartas[indiceAleatorio]; // Devuelve la carta en el índice aleatorio
    }
    */
     public /*Carta */void obtenerCartaAleatoria() {
        int indiceAleatorio = (int) (Math.random()* cartas.length-1)+1;// índice aleatorio
        Carta a =  cartas[indiceAleatorio];  // Devuelve la carta en el índice aleatorio
        //Devuelve la carta en el índice aleatorio
        System.out.println(a);
       
     }
     // 0.1 por faltas ortográficas y nombre de métodos  hasta -0.6 

     // recoorer el array abtracto
    
    
     public static void main(String[] args) {
        Baraja b1 = new Baraja("Carolina", 4, 5);
        //System.out.println(b1);
        System.out.println(b1);
        System.out.printf("CARTA RANDOM%n");
        System.out.printf("========================%n");
        b1.obtenerCartaAleatoria();
        
     
    }
}
/*
Diseña una clase que modele una baraja de cartas, teniendo en cuenta que:

- La baraja estará formada por cartas. LISTO
- La carta será una clase que tendrá valor y palo. Donde se pondrán tener entre 4 y 8 palos marcados con un char y un número de carta, entre 5 y 20. LISTO
- Debe poder sacarse una carta y sacarse varias cartas.
- Se debe poder crear un histórico de todas las cartas que se vayan extrayendo de la baraja.
- Deben poder volver a ponerse juntas las cartas. Sería como hacer un reset de la baraja.

Presta atención en el diseño a:

1. Propiedades necesarias.
2. Constructores necesarios, incluido el constructor copia.
3. Encapsulamiento.
4. Métodos.
5. Probar exhaustivamente que todo funciona.
*/