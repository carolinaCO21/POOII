package interfacesfuncionales;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

// Operaciones porque es una clase de utilidades y no necesita instancia
public class Operaciones  {
		String s = "Hola";
	/*Realizar un conjunto de métodos (no estáticos) que realicen los siguientes cálculos: */
	  
		public int cuadrado(int x) {
			//(int) Math.pow(numero, 2);
			return x*x;
		}
		
		public int cubo(int x) {
			//(int) Math.pow(numero, 3);
			return x*x*x;
		}
		
		public int triple(int x) {
			
			return x*3;
		}
		
		public int doble(int x) {
			
			return x*2;
		}
		//El resultado del polinomio 

		public int polinomio(int x) {	
			return 5*cubo(x)+7*cuadrado(x)+9;
		}
		
		public int polinomio(int x,int a, int b, int c) {	
			return a*cubo(x)+b*cuadrado(x)+c;
		}
		
		public List<Integer> filtra(int[] numeros, FiltroEnteros f) {
			
			List<Integer> listaFiltrada = new ArrayList<>();
			for (int num : numeros) {
				if(f.filtrar(num)) {
					listaFiltrada.add(num);
					
				}
			}
		
			return  listaFiltrada;
		}
		
		
		
		/*- Realizar una conjunto de métodos (no estáticos) que comparan el String de la instancia con el String del parámetro para devolver true o false en función de:
		    1. Si son iguales
	    	        
*/
		public boolean compara(String a) {
			
			return this.s.equals(a);
		}
		        
		
		
		public static void main(String[] args) {
			Operaciones o1 = new Operaciones();
			int x = 2;
			System.out.println(o1.cuadrado(x));
			System.out.println(o1.cubo(x));
			System.out.println(o1.doble(x));
			System.out.println(o1.triple(x));
			System.out.println(o1.polinomio(x));
			System.out.println(o1.polinomio(x, 5, 7, 9));
			System.out.println("============================");
			
			//dado colecciones ->
			
			//instancio un object con una interfaz
						//expresion landa -> funcion/método 
						//(parámetros) -> {//cuerpo   return colecciones;}						
			//Si solo hay un parametro  -> puedo quitar parentesis, { return }   --> (double s) -> {return s+s;}
			
			//método aplciable a todo --> s -> s+s
									// (int s) -> {return s*s}
			//Los parámetros de la lambda deben ser diferentes de las variables externas
			//no están en conflicto directo con los parámetros de los métodos, ya que son variables locales dentro de la lambda
			X <Integer> cuadrado  = s -> s*s;
			X <Integer> cubo = s -> s*s*s;
			X <Integer> doble = s -> s*2;
			X <Integer> triple = s -> s*3;												
			X <Integer>polinomio = s -> 5* s * s * s + 7 * s * s + 9;
			CuatroEnteros polinomioVariable = (s,a,b,c) -> a* s * s * s + b * s * s + c;
			System.out.println(cuadrado.dale(x));
			System.out.println(cubo.dale(x));
			System.out.println(doble.dale(x));
			System.out.println(triple.dale(x));
			System.out.println(polinomio.dale(x));
			System.out.println("polinomio Variable");
			int a = 5, b = 7, c = 9;
			System.out.println(polinomioVariable.dale(x, a, b, c));
			System.out.println("============================");
			double  d2 = 2.0;
			X <Double> mitad = (s) -> s / 2;
			X <Double> cuartaParte = (s) -> s / 2;
			X <Double> decimaPARTE = (s) -> s / 10;
			DosX <Double> nSimaParte = (s, m) -> s / m;
			//	1. La mitad
			System.out.println(mitad.dale(d2));
			//2. La cuarta parte
			System.out.println(cuartaParte.dale(d2));
			//3. La décima parte
			System.out.println(decimaPARTE.dale(d2));
			//4. La n-sima parte
			System.out.println(nSimaParte.dale(7.0, 15.0));
			
			int p= 1;
			int w= 2;
			DosX <Integer> fraccionI = (z, m) -> z / m;
			System.out.println(fraccionI.dale(p, w));
			System.out.println("============================");
			//2. A partir de un Array de enteros primitivos, calcular:
			int [] enteros = {1,2,3,4,5,6,7,8,9,10};
			
			DosX <Integer> suma = (m, i) -> m+=i; 
			System.out.println();
			int sum = 0;

		    //1. La suma
			for (int entero : enteros) {
				
				System.out.println(suma.dale(entero, entero));
			
			}
			System.out.println(suma.dale(3, 1));
			System.out.println("================");
			for (int i : enteros) {
				sum+= i;
			}
			System.out.println(sum);
		
		    //2. La suma de los pares
		    //3. La suma de los impares
		    //4. La suma de los positivos
		    //5. La suma de los negativos
		    //6. La suma de los mayores de 100
		    //7. La suma de los mayores de un número determinado
			
			
			/*
			 
			 
			 */
			
			Operaciones op = new Operaciones();
			System.out.println(op.filtra(new int[] {2, 3,-7,-5}, s -> s > 0));
			System.out.println(op.filtra(enteros, s -> s > 0));
			X <Integer> p5 = (Integer s) -> {return s  + 2;}; 
			Function<Integer, Double> f = s -> s * 2.0;
			System.out.println(f.apply(4));
			
			
			
			
			
		}


		
		
}
