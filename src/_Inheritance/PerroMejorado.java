
package _Inheritance;

public class PerroMejorado extends AnimalMejorado{
    
 
    
    public PerroMejorado(double peso) {
        super(peso);   //Como los contructores no se heredan tiras del contructor animal 
    }
    
    
    public void identificar (){
        
        System.out.print("Soy un PERRO MEJORADO");
    }
     
    @Override
    public void emitirSonido(){
         super.emitirSonido();
         System.out.println("Guaau!!");
        
     
    }
 
}
