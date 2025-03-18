
package _Inheritance;

public class GatoMejorado extends AnimalMejorado{
  
    //cuando decimos super. estamos accediendo a un método del padre ((recuerda antes lo haciamos con el this))
    
     public GatoMejorado(double peso) {
        super (peso);        //Como los contructores no se heredan tiras del contructor animal 
    }
    
    public void identificar (){
        System.out.print("Soy un GATO MEJORADO");
    }
     @Override
    public void emitirSonido(){
         super.emitirSonido();
         System.out.println("Miau!!");
        
     
    }
 
    
}
