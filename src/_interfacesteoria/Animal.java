package _interfacesteoria;

public abstract class Animal extends Object implements Desplazable {

	//el metodo dezplazable lo implemente en los hijos y me obliga a implkementarlo en el primer hijo
	public void respirar() {
		System.out.println(this.getClass().getSimpleName() + " respirando");
	}
	
	
}
