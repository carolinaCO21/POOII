
package paquete1;

public class Animal {

   private int id;
   private int peso;
   private String color;
   private static int cantAnimales;
   private static int nextId = 1;
   
   //constructores
    public Animal(int peso, String color) {
        this.peso = peso;
        this.color = color;
        id = nextId++;
        cantAnimales++;
    }
   
   // métodos
    public void show(){
        System.out.printf("El animal (ID)%d de color %s, peso de %d kg.%n", id, color, peso);
    
    }
    public static void describeClase(){
        System.out.printf("La Clase tiene %d número de animales%n y nextID %d.%n", cantAnimales, nextId);
    
    }
    
   
    
    public static void main(String[] args) {
        
        Animal a1 = new Animal(9, "café");
        Animal a2 = new Animal(10, "blanco");
        a1.describeClase();
        a1.show();
        a2.show();
        
       
    }
    
}
