package paquete1;

public class Reloj1 {

    private int horas; //Horas actuales del reloj, valor por defecto 0. Solo puede tener valores entre 0 y 23.
    private int minutos; //Minutos actuales del reloj, valor por defecto 0. Solo puede tener valores entre 0 y 59.
    private String modelo; //Modelo del reloj, valor por defecto "BASIC-WATCH".
    private boolean en24Horas; //: Indica si el reloj usa el formato de 24 horas. Valor por defecto true.
    
    //1.Sin parámetros: Establece los valores predeterminados.
    //CONSTRUCTORES
    public Reloj1() {
        this.horas = 0;
        this.minutos = 0;
        this.modelo = "BASIC-WATCH";
        this.en24Horas = true;
    }

    //2.Dados horas y minutos.
    public Reloj1(int horas, int minutos) {
        this();
        this.horas = horas >= 0 && horas <= 23 ? horas : 0;
        this.minutos = minutos >= 0 && minutos <= 59 ? minutos : 0;

    }

    //3.Dados horas, minutos, y modelo.
    public Reloj1(int horas, int minutos, String modelo) {
        this(horas, minutos);
        this.modelo = modelo != null && !modelo.isEmpty() ? modelo : "BASIC-WATCH";
    }

    //Constructor copia.
    public Reloj1(Reloj1 r) {
        this.horas = r.horas;
        this.minutos = r.minutos;
        this.modelo = r.modelo;
        this.en24Horas = r.en24Horas;
    }

    //MÉTODOS
    // Muestra la hora en un formato adecuado dependiendo de si el reloj está en formato de 24 horas o 12 horas:
    public void mostrarHora() {
        String horaMostrar;

        if (en24Horas) {
            //Ejemplo para formato 24 horas: Reloj (BASIC-WATCH): 14:30.
            horaMostrar = String.format("%02d:%02d ", horas, minutos);
        } else {
            int hora12 = horas == 0 || horas == 12 ? 12 : horas % 12;
            String periodo = horas < 12 ? "AM" : "PM";
            //Ejemplo para formato 12 horas: Reloj (BASIC-WATCH): 2:30 PM.
            horaMostrar = String.format("%02d:%02d", hora12, minutos, periodo);

        }

        System.out.println("Reloj (" + modelo + "): " + horaMostrar + ".");

    }

    //boolean incrementarMinuto(): Incrementa los minutos en 1. Si llega a 60, reinicia los minutos y aumenta la hora. Devuelve true si se pudo incrementar.
    public boolean incrementarMinuto() {
        // Incrementa los minutos en 1. Si llega a 60, reinicia los minutos y aumenta la hora. Devuelve true si se pudo incrementar.
        minutos++;
        if (minutos == 60) {
            minutos = 0;
            incrementarHora();
        }
        return true;
    }

    //boolean incrementarHora(): Incrementa las horas en 1. Si llega a 24 (o 12 en el formato de 12 horas), reinicia la hora. Devuelve true si se pudo incrementar.
    public boolean incrementarHora() {
        //Incrementa las horas en 1. Si llega a 24 (o 12 en el formato de 12 horas), reinicia la hora. Devuelve true si se pudo incrementar.
        horas++;
        return true;
    }
   // boolean cambiarFormato(): Cambia entre formato de 24 horas y 12 horas.
    public boolean cambiarFormato(){
    
        en24Horas = !en24Horas;
        return true;
    }
    // Reiniciar el reloj
    public boolean reiniciar() {
           horas = 0;
           minutos = 0;
        return true;
    }
    
    // Ajustar la hora manualmente
    public boolean setHora(int horas, int minutos) {
        if (horas >= 0 && horas <= 23 && minutos >= 0 && minutos <= 59) {
            this.horas = horas;
            this.minutos = minutos;
            return true;
        }
        return false;
    }
  

    public static void main(String[] args) {
        
        Reloj1 r2 =  new Reloj1(24, 16);
        r2.mostrarHora();
        r2.cambiarFormato();
        r2.mostrarHora();
        

    }

}
