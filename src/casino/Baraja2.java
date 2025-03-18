
package casino;

public class Baraja2 {

    private String nombre;
    private Carta[] cartas;

    public Baraja2(String nombre, int cantidadPalos, int cantidadCartasPorPalo) {
        this.nombre = nombre;
        this.cartas = new Carta[cantidadPalos * cantidadCartasPorPalo];
        int i = 0;
        for (char palo = 'A'; palo < cantidadPalos + 'A'; palo++) {
            for (int numero = 0; numero < cantidadCartasPorPalo; numero++) {
                cartas[i] = new Carta(palo, numero);
                i++;
            }
        }
    
    }

}