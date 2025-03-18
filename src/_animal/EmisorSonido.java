package _animal;

public interface EmisorSonido {
	//public abstract void emitirSonido();
	//public abstract --> Siempre
	
	
	void emitirSonido();
	
	//implementado
	default void emitirSonidoHecho() { System.out.println("hola");}    
	
	
}
