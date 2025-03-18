package _interfacesteoria;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Test {
	public static void main(String[] args) {
		
		
		Mosca m = new Mosca();
		Animal ma = new Mosca();
		Perro p = new Perro();
		Animal pa = new Perro();
		
		Animal [] animales = {ma, pa, p , m};
		List<Animal> listAnimales = new ArrayList<>(Arrays.asList(animales));
		
		Mosca m1 = new Mosca();
		Avion a1 = new Avion();
		Volador mv1 = new Mosca();
		Volador av1 = new Avion();
		//interfaz Volador		
		Volador [] voldores = {mv1, av1, m1, a1};
		
		//no respira un Volador -> Avion
		for (Volador volador : voldores) {
			// si el volador es animal que respire
			// DEVUELVE TRUE O FALSE
			if (volador instanceof Animal) {
				((Animal)volador).respirar();
			}
			volador.planear();
		}
		
		//herencia multiple
		
		//interfaz funcional solo tiene un método
		/*
		 variable dato asociado objeto etc, ahora podemos enchufarle a una variable una función
		 */
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
