package generics;



public class Test {
	
	public static void main(String[] args) {
		Articulo a1 = new Articulo("Artículo 1");
		CajaArticulo ca1= new CajaArticulo(a1);
		// Se lee de deracha a izquierda 
		// metiendo la instancia en la caja sin poder acceder al articulo sin pasar a la caja
		CajaArticulo ca2 = new CajaArticulo(new Articulo("Articulo 2"));
		CajaString cs1 = new CajaString("Caja String 1");
		System.out.println(ca1);
		System.out.println(ca2);
		System.out.println(cs1);
		System.out.println("CAJA PARA TODO");
		CajaParaTodo c1 = new CajaParaTodo(new Articulo("Otro articulo"));
		CajaParaTodo c2 = new CajaParaTodo("Otro String");
		System.out.println(c1);
		System.out.println(c2);
		String s = ((String)c2.getContenido()).toLowerCase();
		Caja<String> c10 = new Caja<>("caja genérica 10"); // 
		System.out.println(c10.getContenido().toUpperCase());
		Caja<Articulo> c11 = new Caja<Articulo>(new Articulo("articulo maravilloso"));
		System.out.println(c11.getContenido());
		System.out.println("PAREJA====");
		Pareja<String, String> p1 = new Pareja<>("hola", "adios");
		System.out.println(p1);
		System.out.println("ESTANTERIA===");
		Estanteria<String> e1 = new Estanteria<>(new String [] {"1","22"});
		System.out.println(e1);
		
	}

}
