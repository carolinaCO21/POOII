
package _Inheritance;

public class _1_OverviewBefore {

    public static void main(String[] args) {
        Animal a = new Animal(250);
        Gato g = new Gato(6);
        Perro p = new Perro(40.5);
        
        a.identificar();
        System.out.printf("y peso %.2f kg. %n", a.getPeso());
        g.identificar();
        System.out.printf("y peso %.2f kg. %n", g.getPeso());
        p.identificar();
        System.out.printf("y peso %.2f kg. %n", p.getPeso());
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
    
}
