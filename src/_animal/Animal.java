package _animal;

import _animal.Animal.Clasificacion;

public abstract class Animal {
		// default las clases pueden acceder en el mismo paquete por paquete, protected los que heredan da igual el  paquete
		//constante
		//private final float peso;
		private float peso;
		
		//static { clasificacion = null;}

		//definicion de una estructura constante
		protected enum Clasificacion{
			VE, IN	
		}
		
		
		public abstract void show();
		
		
		
		public Animal(float peso) {
			super();
			this.peso = peso;
		}

		public static void show(Animal a) {
			a.show();
		
			
		}


		@Override
		public String toString() {
													// %f ---> FLOAT Y DOUBLE   FLOAT 4 BYTES DOUBLE 8BYTES POR TANTO MAS PRESCISO
			return String.format("Soy un animal de %f gramos",peso);
		}
		
		
		
		
		
		
		
		
		

}
