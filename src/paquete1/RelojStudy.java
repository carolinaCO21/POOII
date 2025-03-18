
package paquete1;
        

public class RelojStudy {
    private int horas;//default 0, entre 0 y 23
    private int minutos; // default, 0 y 59
    private String modelo; // default BASIC-WATCH
    private boolean en24Horas;

    // Constructor sin parámetros
     public RelojStudy(int horas, int minutos, String modelo) {
        this.horas = horas < 0 ? 0 : horas > 23? 23 : horas;
        this.minutos = horas < 0 ? 0 : minutos > 59? 59 : minutos;
        this.modelo = modelo == null ? "BASIC-WATCH" : modelo;
        this.en24Horas = true;
    }
    
    public RelojStudy() { //POR DEFECTO YA SON 0 HORAS Y MINUTOS
       this(0,0);
    }

    // Constructor con horas y minutos
    public RelojStudy(int horas, int minutos) {
        this(horas, minutos, "BASIC-WATCH");
    }   

    // Constructor con horas, minutos y modelo
    // Constructor copia
    public RelojStudy(RelojStudy otro) {
	horas = otro.horas;
        minutos = otro.minutos;
        modelo = otro.modelo;
        en24Horas = otro.en24Horas;
    }
    
     public void mostrarHora() {
        if (en24Horas) {
            System.out.printf("Reloj (%s): %02d:%02d.%n", modelo, horas, minutos);
        } else {
            System.out.printf("Reloj (%s): %02d:%02d %s.%n",
                    modelo,
                    horas > 12 && horas != 0 ? horas - 12 : horas < 12 && horas != 0? horas : 12,
                    minutos,
                    horas >= 12 ? "PM" : "AM");
        }

    }

    // Incrementar un minuto
    public boolean incrementarMinuto() {
        minutos = minutos == 59? 0 : minutos+ 1;
        horas = minutos == 0?
                (horas == 23 ? 0 : horas + 1) 
                : horas;
        //minutos++;
       /*if (minutos == 60) {
            minutos = 0;
            incrementarHora();
        }
        */
       return true;
    }

    // Incrementar una hora
    public boolean incrementarHora() {
       if(horas == 23){
           horas = 0;
       } else {
        ++horas;
       }
        return true;
    }
    
    // Cambiar formato entre 24 horas y 12 horas
    public boolean cambiarFormato() {
        return en24Horas = !en24Horas;
    }

    // Reiniciar el reloj
    public boolean reiniciar() {
        //JAVI
     /*  
        boolean reseteable = horas == 12 && minutos == 0;
        horas = resetable? 0 : horas;
        return reseteable;
     */
        boolean reseteable;
        if(reseteable = horas == 12 && minutos == 0){
            horas = 0;
        }
        return reseteable;
        
    }

    // Ajustar la hora manualmente
    public boolean setHora(int horas, int minutos) {
        boolean horaCorrecta = horas >= 0 && horas <= 24 && minutos >= 0 && minutos <= 59;
        if(horaCorrecta){
            this.horas = horas;
            this.minutos = minutos;
        } 
        return horaCorrecta;
      
    }

    public static void main(String[] args) {
        // Prueba individual de un reloj
        System.out.println("\n--- RELOJ1 ---");
        RelojStudy reloj1 = new RelojStudy(); // Reloj por defecto
        reloj1.mostrarHora();
       
        System.out.println("\n--- RELOJ2 ---");
        RelojStudy reloj2 = new RelojStudy(23, 59); // Formato 24 horas por defecto
        reloj2.incrementarHora();
        reloj2.mostrarHora();
        reloj2.cambiarFormato();
        reloj2.mostrarHora();
        
      
        
        // Crear un array de relojes
        RelojStudy[] relojes = new RelojStudy[5];
        relojes[0] = new RelojStudy(); // Por defecto
        relojes[1] = new RelojStudy(22, 45); // Formato 24 horas
        relojes[2] = new RelojStudy(24, 06); // Formato 24 horas
        relojes[3] = new RelojStudy(11, 59, "ADVANCED-WATCH"); // Modelo personalizado
        relojes[4] = new RelojStudy(0, 0, "PRO-WATCH"); // Por defecto con modelo personalizado
       System.out.println("\n--- Prueba---");
       
      
        for (int j = relojes.length -1; j > 0; j--) {
            relojes[j].mostrarHora();
        }

       
        System.out.println("\n--- Array de relojes: Horas iniciales ---");
        for (RelojStudy reloj : relojes) {
             reloj.mostrarHora();
        }

        System.out.println("\n--- Incrementar un minuto en cada reloj ---");
        for (RelojStudy reloj : relojes) {
            reloj.incrementarMinuto();
            reloj.mostrarHora();
        }

        System.out.println("\n--- Cambiar formato de todos los relojes ---");
        for (RelojStudy reloj : relojes) {
            reloj.cambiarFormato();
            reloj.mostrarHora();
        }

        System.out.println("\n--- Reiniciar todos los relojes ---");
        for (RelojStudy reloj : relojes) {
            reloj.reiniciar();
            reloj.mostrarHora();
        }
    
    }
}