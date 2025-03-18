
package _Inheritance;

public class _1_OverviewAfter {

    public static void main(String[] args) {
        //AnimalMejorado a = new AnimalMejorado(250); YA NO PUEDE USARSE AL SER ABSTRACT
        
        PerroMejorado p = new PerroMejorado(40.5);
        p.identificar();
        p.emitirSonido();
        System.out.println();
        
        GatoMejorado g = new GatoMejorado(6);
        AnimalMejorado a1 = g;//apunta a la parte animal del gato    
        a1.identificar();
        a1.emitirSonido();
        System.out.println();
        
        AnimalMejorado a2 = new GatoMejorado(9);
        a2.identificar();
        a2.emitirSonido();
        System.out.println(); 
        //System.out.printf(" y peso %.2f kg. %n", a1.getPeso());
        //a1.emitirSonido();
        
        GatoMejorado[] gatitos = {
            new GatoMejorado(6),
            new GatoMejorado(9),
            new GatoMejorado(3.5)
        };
        System.out.printf("Array de gatitos%n");
        System.out.printf("================%n");
        for (GatoMejorado gatito : gatitos) {
            gatito.emitirSonido();
            
        }
        PerroMejorado[] perritos = {
            new PerroMejorado(14.5),
            new PerroMejorado(40.5),
            new PerroMejorado(12)
        };
        
        System.out.printf("Array de perritos%n");
        System.out.printf("================%n");
        for (PerroMejorado perrito : perritos) {
            perrito.emitirSonido();
        }
        
        System.out.printf("Array de animalitos%n");
        System.out.printf("================%n");
        AnimalMejorado [] animalitos = {
            new GatoMejorado(14.5),
            new PerroMejorado(40.5),
            new PerroMejorado(12)
        };
        for (AnimalMejorado animalito : animalitos) {
            animalito.emitirSonido();
            
        }

  

        
        
        
        
        
        
    }
    
    
}
