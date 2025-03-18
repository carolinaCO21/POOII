
package _Inheritance;

public class OsoMejorado extends AnimalMejorado{
     public OsoMejorado(double peso) {
        super(peso);   //Como los contructores no se heredan tiras del contructor animal 
    }
    
    
    public void identificar (){
        System.out.print("Soy un OSO MEJORADO");
    }
     @Override
    public void emitirSonido(){
        
         System.out.println("Rff!!");
        
     
    }
  
}
