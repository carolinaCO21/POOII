
package misfiguras;

public class Color {
    //String es un OBJETO
    //static que solo haya un array de colores --> SOLO ESTA UNA VEZ POR CLASE
    //private static String[] colores = new String[11];
    private static String[] colores = {"negro","azul", "marrón", "gris", "verde", "naranja","rosa","púrpura", "rojo", "blanco", "amarillo"};
    
    public static String[] ListaColores(){
        return colores;
    }
    public static String dameColor(String colorTentativo){
       
        for (String color : colores) {
           
            //comparar lo que sabes con lo que no color.equals(color) evitas el error nul pointer exception
            
            if (color.equalsIgnoreCase(colorTentativo)) {
                return color;
            }
        }
        return colores[0];

        //return this.colores[0]; INCORRECTO PORQUE NO TENGO THIS EN UN MÉTODO STATIC PORQUE HACE REFERENCIA A LA CLASE --> return Color.colores[0];
        }
     
    
    
    
    
    }

  
    
    
    
  
        

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

