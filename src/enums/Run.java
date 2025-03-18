package enums;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		
		int numero = 1;
		for (Mes m : Mes.values()) {
			if (m.getNumMes() == numero) {
				System.out.println(m.presentación());
			}
		}
		
		//Dado un mes, indica su nombre en inglés, en español y su número de mes.
		String mes = "Enero";
		for (Mes m : Mes.values()) {
			if (m.getMesEn().equals(mes) || m.getMesEs().equals(mes)) {
				System.out.println(m.presentación());
			}
		}
		
		System.out.println(Mes.E.valueOf("E"));
	}

}
  