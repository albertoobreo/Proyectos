package tresEnRaya;

import java.util.Arrays;

import tresEnRaya.Leer;

public class colocarFicha {
	public static int[][] main(int turno, int[][] tablero, int circulo, int aspa) {

		boolean repetir, yaHayFicha, jugadorAspa;

		int x, y;

		int[] vectorY = new int[tablero.length];

		jugadorAspa = otros.saberJugador(turno);

		do {

			yaHayFicha = false;
			repetir = false;

			x = coordenadaX(tablero);
			y = coordenadaY(tablero);
			repetir = otros.preguntar(repetir, x, y);

			vectorY = otros.rellenarVectorY(vectorY);
			y = vectorY[y - 1];

			yaHayFicha = comprobarSiHayFicha(tablero, repetir, yaHayFicha, x, y);

		} while (yaHayFicha || repetir);

		otros.saberFicha(tablero, circulo, aspa, jugadorAspa, x, y);

		return tablero;
	}

	public static boolean comprobarSiHayFicha(int[][] tablero, boolean repetir, boolean yaHayFicha, int x, int y) {
		if (tablero[y - 1][x - 1] > 0 && !repetir) {
			System.out.println();
			System.out.println("Ya hay una ficha...");
			yaHayFicha = true;
		}
		return yaHayFicha;
	}

	public static int coordenadaY(int[][] tablero) {
		int y;
		do {

			System.out.println("Introduce la coordenada Y:");
			y = Leer.entero();

			if (y < 1 || y > tablero.length) {
				System.out.println("Inserte una coordenada Y entre 1 y " + tablero.length + "...");
			}

		} while (y < 1 || y > tablero.length);
		return y;
	}

	public static int coordenadaX(int[][] tablero) {
		int x;
		do {

			System.out.println("Introduce la coordenada X:");
			x = Leer.entero();

			if (x < 1 || x > tablero.length) {
				System.out.println("Inserte una coordenada X entre 1 y " + tablero.length + "...");
			}

		} while (x < 1 || x > tablero.length);
		return x;
	}
}