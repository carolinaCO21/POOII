
package misfiguras;

public class Rectangulo extends Figura{
    private int base;
    private int altura;

    public Rectangulo() {
    
        base = 2;
        altura = 1;
    }
    
     public Rectangulo(int base, int altura) {
     
        this.base = base;
        this.altura = altura;
    }
     public Rectangulo(String color, int base, int altura) {
        super(color);
        this.base = base;
        this.altura = altura;
    }
     //si ponemos en el parámetro un double no lo confunde con el otro constructor que es un int
      public Rectangulo (double superficie) {
        //ojo color por defecto?
        //ponemos int para convertir el double del método .sqrt
        altura = (int)Math.sqrt(superficie/2);
        base = 2* altura;
    }
      
      
     //Métodos
      
     //Calcular el perímetro
    @Override
    public double perimetro (){
        return 2*(base + altura);
    }
    
    //Area
    @Override
    public double area (){
        return base * altura;
    }
     /* ESTO ESTABA EN EL VÍDEO --> SE USA MEJOR UNO ÚNICO EN EL PADRE
    @Override
    public boolean comparaArea (Figura f){
        if(f instanceof Rsctangulo){
            return this.area() == f.area ();
            return false;
        }
    }
    

   /* @Override
    public String toString() {
        return "Cuadrado{" + "color=" + color + ", lado=" + lado + '}';
    }*/
    
    
    //A partir de ahora se utiliza esto en vez de show, asistimos al entierro de show
    @Override
    public String toString() {
        return String.format("Rectangulo de base %d, altura %d, superficie %.2f y perimetro %.2f%n", 
                base, altura, area(), perimetro());
    }
    
    
    
    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo ();
        Rectangulo r2= r1;
        System.out.println(r1);
        System.out.println(r2);
    }
    
}