
package casino;

import java.util.Random;

public class DadoRandom {
   private int numero;
    private String color;
    private int[] historicoDeCaras;

    public DadoRandom(int numero, String color) {
        this.numero = numero < 1 ? 1 : numero;
        this.color = color == null ? "E404" : color;
    }

    public DadoRandom() {
        this(0, "Blanco");
    }

    public void show() {
        System.out.printf("Dado con caras: %d, color: %s.%n",
                numero, color);
    }

    public void Draw() {
        Random random = new Random();
        this.numero = random.nextInt(6) + 1;
    }

public static void main(String[] args) {

        DadoRandom d1 = new DadoRandom();
        d1.show();
        d1.Draw();
        d1.show();
    }
}