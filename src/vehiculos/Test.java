package vehiculos;

public class Test {
	
	public static void main(String[] args) {
		Coche c1 = new Coche(160,1300, "ABC1234");
		/*c1.abrirPuertas();
		c1.cerrarPuertas();
		c1.acelerar();
		c1.frenar();
	*/
		System.out.println(c1.pararMotor());
		System.out.println(c1.arrancarMotor());
		System.out.println(c1.pararMotor());
		System.out.println(c1.arrancarMotor());
		System.out.println(c1.pararMotor());
		
		
		System.out.println();
		Vehiculo v1 = new Coche (160, 1300, "ABC1234");
		System.out.println(v1);
		System.out.println();
		Vehiculo v2 = new Motocicleta(10, 1300, "ABC1234");
		System.out.println(v2);
		System.out.println();
		Vehiculo v3 = new Bicicleta(10,1300);
		v3.acelerar();
		v3.acelerar();
		System.out.println(v3);
		
	}

}
