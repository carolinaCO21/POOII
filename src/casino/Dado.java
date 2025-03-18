 
package casino;
//baraja array de cartas 24  doble bucle for

import java.util.Arrays;

public class Dado {

    private int numCaras;
    private int[] memoria;  //= new int[10]; //valor por defecto 0 en un inicio cuando se declara el array

    public Dado(int numCaras) {

        this.numCaras = numCaras >= 2 && numCaras <= 100 ? numCaras : 2;
        this.memoria = new int[10];  // Inicializa el historial con 10 elementos en 0     
    }

    /*
    recorrer el array hacia atrás nos da en orden las tiradas realizadas
    Si el valor en una posición del array no es cero ( ha sido utilizado 
    en alguna tirada), ese valor se agrega a la cadena salida.
     */
    @Override
    public String toString() {
        String salida = String.format("Dado con %d caras%nHistórico de tiradas%n", numCaras);
        for (int i = memoria.length - 1; i >= 0; i--) {
            if (memoria[i] != 0) {
                salida += memoria[i] + " ";
            }

        }

        return salida;
    }

    public int lanzar() {
        int lanzamiento = (int) (numCaras * Math.random()) + 1; // multiplica entre el 0 y casi el 6 +1 se queda con los enteros 6
        for (int i = memoria.length - 2; i >= 0; i--) {
            memoria[i + 1] = memoria[i];  // Desplaza los valores en la memoria
        }
        memoria[0] = lanzamiento; // Coloca el nuevo lanzamiento en la primera posición de la memoria
        return lanzamiento;
    }

    //- Debe poder ponerse a reset el histórico de lanzamientos.
    public int[] reset() {
        return this.memoria = new int[10];
    }

    //- Debe poder lanzarse n veces y contar el número de veces que sale el valor de una cara
    public void lanzarN(int n) {
        for (int i = 1; i <= n; i++) {
            lanzar();
        }
        // Recorremos todo el array
        for (int i = 0; i < memoria.length; i++) {
            if (memoria[i] == 0) {
                continue;
            }
            int numVecesPorValor = 0;
            // Contamos cuántas veces aparece el valor memoria[i]
            for (int j = 0; j < memoria.length; j++) {
                if (memoria[i] == memoria[j]) {
                    numVecesPorValor++;
                }

            }
            // Recorremos las posiciones anteriores al valor actual para ver si ya lo contamos
            boolean yaContado = false;
            // si i es 3, entonces el bucle for (int j = 0; j < i; j++) recorre las posiciones 0, 1 y 2 del arreglo
            for (int j = 0; j < i; j++) {
                if (memoria[i] == memoria[j]) {
                    yaContado = true;  // Si encontramos el valor antes, marcamos como ya contado
                    break;  // No necesitamos seguir buscando
                }
            }
            if (!yaContado) {
                System.out.printf("El valor [%d] sale %d veces.%n", memoria[i], numVecesPorValor);
            }

        }

    }

    public int[] getMemoria() {
        return memoria;
    }

    public static void main(String[] args) {
        Dado d = new Dado(6);
        for (int i = 0; i < 15; i++) {
            System.out.println(d.lanzar());
        }
        System.out.println(d); //aplicar el toString
        System.out.printf("=======================%n RESET Y LANZAR%n");
        System.out.println(Arrays.toString(d.reset()));
        for (int i = 0; i < 5; i++) {
            System.out.println(d.lanzar());
        }
        System.out.println(Arrays.toString(d.getMemoria()));
        System.out.println(d);
        System.out.printf("=======================%n LANZARN + CONTADOR%n");
        d.reset();
        d.lanzarN(7);
        System.out.println(Arrays.toString(d.getMemoria()));
        System.out.println(d); //aplicar el toString
    }
}
/*
Diseña una clase que modele un dado, teniendo en cuenta que:

- El dado puede tener un número de caras, definido en el momento de la creación del objeto.
- Debe poder lanzarse.
- Debe poder guardarse el histórico de los últimos 10 lanzamientos.
- Debe poder ponerse a reset el histórico de lanzamientos.
- Debe poder lanzarse n veces y contar el número de veces que sale el valor de una cara.

Presta atención en el diseño a:

1. Propiedades necesarias.
2. Constructores necesarios, incluido el constructor copia.
3. Encapsulamiento.
4. Métodos.
5. Probar exhaustivamente que todo funciona.
*/