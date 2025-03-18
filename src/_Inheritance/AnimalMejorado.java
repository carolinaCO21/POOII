
package _Inheritance;

public abstract class AnimalMejorado {
    
    private double peso;
    private String nombre;
    
    public AnimalMejorado(double peso) {
        this.peso = peso;
    }
    
    
    public void identificar (){
        System.out.printf("Soy un ANIMAL MEJORADO");
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public void emitirSonido(){
        
         System.out.print(" ahi va el sonidito: ");
        
     
    }
    
    
}
    
    

