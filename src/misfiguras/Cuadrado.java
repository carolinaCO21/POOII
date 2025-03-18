
package misfiguras;


public class Cuadrado extends Figura{
       //Propiedades
    
    private int lado;

    public Cuadrado() {
        //super(); tienes que llamar a super(); porque desde el object se construye la figura y sobre la figura se construye el cuadrado 
        //ojo color por defecto?
        
        lado = 1;
    }
    
     public Cuadrado(int lado) {
        //ojo color por defecto?s
        this.lado = 1;
    }
    public Cuadrado(String color, int lado) {
        super(color); //constructor de superclass 
        this.lado = 1;
    }
     
     //si ponemos en el parámetro un double no lo confunde con el otro constructor que es un int
      public Cuadrado (double superficie) {
        //ojo color por defecto?
        //ponemos int para convertir el double del método .sqrt
        this.lado = (int)Math.sqrt(superficie);
    }
      
      
     //Métodos
      
     //Calcular el perímetro
    @Override
    public double perimetro (){
        return 4*lado;
    }
    
    //Area
    @Override
    public double area (){
        return lado*lado;
    }
    /*
    //Comparar areas
    public boolean comparaArea (Cuadrado c){
        return this.area() == c.area ();
    }
    */
    /* ESTO ESTABA EN EL VÍDEO --> SE USA MEJOR UNO ÚNICO EN EL PADRE
    @Override
    public boolean comparaArea (Figura f){
        if(f instanceof Cuadrado){
            return this.area() == f.area ();
            return false;
        }
    }
    
    
    
    */

   /* @Override
    public String toString() {
        return "Cuadrado{" + "color=" + color + ", lado=" + lado + '}';
    }*/
    
    
    //A partir de ahora se utiliza esto en vez de show, asistimos al entierro de show
    @Override
    public String toString() {
        return String.format("Cuadrado de lado %d, superficie %.2f y perimetro %.2f%n", 
                lado, area(), perimetro());
    }
    
    
    
    public static void main(String[] args) {
        Cuadrado c1 = new Cuadrado ();
        Cuadrado c2= c1;
        System.out.println(c1);
        System.out.println(c2);
    }
    
}
    

    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

