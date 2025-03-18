package paquete1;

public class Vehiculo {
    //PROPIEDADES
    private String matricula; //Obligatoria, máximo 10 caracteres, solo letras mayúsculas y números (formato "ABC1234"). Si no cumple el formato, se asigna "DESCONOCIDA".
    private String tipo; //Valores posibles: `"coche"`, `"moto"`, `"camion"`, `"bicicleta"`. Si no se especifica o el valor es incorrecto, se asigna `"coche"`.
    private short anioFabricacion; // Obligatorio, debe ser entre 1990 y el año actual.
    private int kilometraje; // Obligatorio, no puede ser negativo.
    private boolean requiereMantenimiento; // Indica si el vehículo necesita mantenimiento, false por defecto.
    //CONSTRUCTORES
    public Vehiculo(String matricula, String tipo, short anioFabricacion, int kilometraje) {
        //Valores Validos  
        String tipoValido = ("moto".equalsIgnoreCase(tipo) || "camion".equalsIgnoreCase(tipo) 
                                  || "bicicleta".equalsIgnoreCase(tipo)) ? tipo.toLowerCase() : "coche";
       
        short anioFabricacionValido = anioFabricacion < 1990? 
                                        1990 : 
                                        anioFabricacion > 2024? 2024 : anioFabricacion; //BUENA PRACTICA DECLARAR UNA VARIABLE PQ AYUDA A LA COMPRENSIÓN DEL CÓDIGO
        //Construccióm con valores válidos
        this.matricula = matriculaValida(matricula)? matricula : "DESCONOCIDA";
        int kilometrajeValido = kilometraje < 0? 0 : kilometraje;
        this.tipo = tipoValido;
        this.anioFabricacion = anioFabricacionValido;
        this.kilometraje = kilometrajeValido;
        requiereMantenimiento = false; //por defecto boolean es false asi que no es necesario
        
    }
    //minimo ABC1234          --->  5 O 10  012 LETRAS 3  -> numeros
   
     public Vehiculo(Vehiculo c){
    
        matricula = c.matricula;
        tipo = c.tipo;
        anioFabricacion = c.anioFabricacion;
        kilometraje = c.kilometraje;
        requiereMantenimiento = c.requiereMantenimiento;
    }
    //MÉTODOS PRIVADOS
    private static boolean matriculaValida(String matricula) {
        if (matricula.length() > 10 || matricula.length() <= 4) {
            return false;
        }
        for (int i = 0; i < 3; i++) {
            if (!(matricula.charAt(i) >= 'A' && matricula.charAt(i) <= 'Z')) {
                return false;
            }
        }
        for (int i = 3; i < matricula.length(); i++) {
            if (!(matricula.charAt(i) >= '0' && matricula.charAt(i) <= '9')) {
                return false;
            }
        }
        return true;
    }
    //MÉTODOS PUBLICOS
    public void mostrar() {
        System.out.printf("Vehiculo [%s] [%s] del año [%d] con %d km. Requiere mantenimiento: %s %n",
                matricula, tipo, anioFabricacion, kilometraje, requiereMantenimiento? "Sí": "No");
    }
    
    public boolean marcarParaMantenimiento(){
        if(requiereMantenimiento){
            return false;
        }else {
            requiereMantenimiento = true;
            return true;
        }   
    }
    
    public int calcularAntiguedad(){
        return 2024 - anioFabricacion + 1;

    }
        
    public boolean mismaAntiguedad(Vehiculo v){
        //return anioFabricacion == v.anioFabricacion;
        return this.calcularAntiguedad() == v.calcularAntiguedad();
    }
     
    public boolean esIgual(Vehiculo v){
        return matricula.equals(v.matricula) && tipo.equals(v.tipo);
    }
    
    

}
