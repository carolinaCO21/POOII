
package paquete1;

public class TestVehiculo {
     public static void main(String[] args) {
        Vehiculo v1 = new Vehiculo("ABC1234", "barco", (short)2001, 10);
        v1.mostrar();
         System.out.println(v1.calcularAntiguedad());
    }
}
