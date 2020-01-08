package tresEnRaya;

import java.util.Scanner;

public class Leer {
	static Scanner lector = new Scanner(System.in);

	public static int entero() {
		int retorno = lector.nextInt();
		return retorno;
	}

	public static char letra() {
		char retorno = lector.nextLine().toLowerCase().charAt(0);
		return retorno;
	}
}