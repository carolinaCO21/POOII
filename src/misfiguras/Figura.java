
package misfiguras;

public abstract class Figura {
    private String color;//Ojo que no es un String

    public Figura(String color) {
        this.color = Color.dameColor(color);
    }
   
/*
¿Por qué es necesario llamar a super() O super(color)?
Inicialización correcta de los atributos heredados.
Cuando una clase hereda de una clase padre, el constructor de la clase padre se llama primero 
(antes de que se ejecute el constructor de la clase hija
DE MANERA PREDETERMINADA
¿Por qué es importante?
Jerarquía de inicialización: La inicialización de los objetos en Java sigue un orden: primero se inicializan los miembros de la clase padre antes de los de la clase hija. Esto se maneja automáticamente cuando usas super().
Llamar a super(color) es necesario para asegurarse de que los atributos heredados de la clase padre (como color) se inicialicen correctamente, especialmente cuando el constructor de la clase padre requiere parámetros. Sin esa llamada, no se puede inicializar adecuadamente el objeto de la clase padre, lo que puede generar problemas en la ejecución de tu código.
*/
    public Figura (){
        color = Color.dameColor(null); //Color por defecto
    }
    
    //MÉTODOS
    public abstract double perimetro ();
    public abstract double area ();
    //Comparar areas la hemos puesto aquí porque se repite en todas las clases, por ello no es un método abstarct
    public boolean comparaArea (Figura f){
        
        if(f instanceof Circulo && this instanceof Circulo
            || f instanceof Cuadrado && this instanceof Cuadrado
            || f instanceof Rectangulo && this instanceof Rectangulo){
                return this.area() == f.area ();
        }
            return false;
    }

    @Override
    public String toString() {
        return "Figura de color=" + color ;
    }
    
    
    
}

