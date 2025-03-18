
package casino;

import java.util.Locale;

public class Carta  {
    private String valor;
    private char palo;
    private int numero;
   
    public Carta(char palo, int numero) {
        this.palo = palo;
        this.numero = numero < 1? 1 : numero >20? 20 : numero;
    }
    
    @Override
    public String toString() {
        return String.format("Una carta de palo %s y número %d", palo ,numero );
    }
    
   

    
   
  
    
    
}