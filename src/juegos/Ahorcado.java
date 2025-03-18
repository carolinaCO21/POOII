package juegos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Ahorcado {
//INTENTOS MAXIMOS POR FALLO 6 YA QUE TIENE 6 PARTES DEL CUERPO
	private ArrayList<String> palabras;

	public Ahorcado() {
		this.palabras = new ArrayList<>();
		String[] animales = { "perro", "caballo", "gato", "serpiente", "pato", "pez" };
		for (String a : animales) {
			palabras.add(a);
		}  
		
	}

	private String obtenerElementoAleatorio() {
		Random random = new Random();
		int indiceAleatorio = random.nextInt(palabras.size());
		return palabras.get(indiceAleatorio);
	}

	private boolean entradaValida(String entrada) {
		if (entrada == null || entrada.isEmpty() || entrada.length() >1) {
		    return false;
		}
		char caracterValido = entrada.charAt(0);
		// return return Character.isLetter(caracterValido); FIN
		if (!(caracterValido >= 'a' && caracterValido <= 'z')) {
			return false;
		}

		return true;

	}

	public void adivinar() {
		String animal = obtenerElementoAleatorio();
		System.out.println(animal);
		Scanner scanner = new Scanner(System.in);
		int contadorIntentos = 0;
		int maximoIntentosFallidos = 6;
		int contadorFallos= 0;
		String palabra = "";
		String [] historico = new String[animal.length()];
		Arrays.fill(historico, "-");
		while (!animal.equals(palabra) && contadorFallos < maximoIntentosFallidos) {
			contadorIntentos++;
			System.out.printf("%nIntentos: %d%n", contadorIntentos);
			System.out.printf("Introduce tu intento: ");
			String entrada = scanner.next().toLowerCase();
			if (!entradaValida(entrada)) {
				System.out.println("Ha introducido una opción invalida");
				continue;
			}
			boolean acierto = false;
			for (int i = 0; i < historico.length; i++) {
				if (animal.charAt(i) ==  entrada.charAt(0)) {
					historico[i] = entrada;
					acierto = true;
				} 
			}
            palabra = String.join("", historico); 
            	
		     if (!acierto) {
		            contadorFallos++;
		        }
		        
		        imprimirDibujo(contadorFallos);
           
				for (String letra : historico) {
						System.out.print(letra);		
				}
				//System.out.printf("%n%s",palabra);
		}
			
				if (animal.equals(palabra)) {
					System.out.printf("%nHAS GANADO!! GRACIAS POR JUGAR");
				} else {
					System.out.printf("%nHAS PERDIDO!! GRACIAS POR JUGAR");
				}
	}
	
	private static void imprimirDibujo(int number) {
        switch (number) {
            case 6:
                System.out.println(""
                		+ "   _______\r\n"
                		+ " |/      |\r\n"
                		+ " |      O\r\n"
                		+ " |     /|\\\r\n"
                		+ " |     / \\\r\n"
                		+ " |______\r\n"
                		+ "");
                break;
            case 5:
                System.out.println(""
                		+ "  _______\r\n"
                		+ " |/      |\r\n"
                		+ " |      O\r\n"
                		+ " |     /|\\\r\n"
                		+ " |     /   \r\n"
                		+ " |______\r\n"
                		+ "");
                break;
            case 4:
                System.out.println(""
                		+ "  _______\r\n"
                		+ " |/      |\r\n"
                		+ " |      O\r\n"
                		+ " |     /|\\\r\n"
                		+ " |      \r\n"
                		+ " |______\r\n"
                		+ "");
                break;
            case 3:
                System.out.println("  "
                		+ "  _______\r\n"
                		+ " |/      |\r\n"
                		+ " |      O\r\n"
                		+ " |     /|\r\n"
                		+ " |        \r\n"
                		+ " |______\r\n"
                		+ "");
                break;
            case 2:
                System.out.println("   _______\r\n"
                		+ " |/      |\r\n"
                		+ " |      O\r\n"
                		+ " |      |\r\n"
                		+ " |      \r\n"
                		+ " |______\r\n"
                		+ "");
                break;
            case 1:
                System.out.println(" "
                		+ "  _______\r\n"
                		+ " |/      |\r\n"
                		+ " |      O\r\n"
                		+ " |     \r\n"
                		+ " |      \r\n"
                		+ " |______\r\n"
                		+ "");
                break;
            case 0:
                System.out.println(" "
                		+ "  _______\r\n"
                		+ " |/      |\r\n"
                		+ " |      \r\n"
                		+ " |       \r\n"
                		+ " |      \r\n"
                		+ " |______\r\n"
                		+ " ");
                break;
            
        }
    }

	

	// INTRODUCIR LETRAS

	/*
	 * Descripción del ejercicio: Palabra secreta: Una palabra es seleccionada
	 * aleatoriamente desde un conjunto predefinido de palabras. Adivinanzas: El
	 * jugador adivina letras, y si la letra está en la palabra, se revela en el
	 * lugar correspondiente. Si no está, se registra un fallo. Array para las
	 * letras adivinadas: Usamos un Array para almacenar las letras que el jugador
	 * ha adivinado. Revelación de la palabra: Se debe mostrar la palabra actual con
	 * las letras adivinadas correctamente y guiones para las letras no adivinadas.
	 * Límites: El jugador tiene un número limitado de intentos para adivinar la
	 * palabra correctamente.
	 */

	@Override
	public String toString() {
		return String.format("%s", palabras);
	}

	public static void main(String[] args) {
		Ahorcado a1 = new Ahorcado();
		System.out.println(a1);
		a1.adivinar();
	}

}
