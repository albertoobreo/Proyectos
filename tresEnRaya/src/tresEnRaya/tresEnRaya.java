package tresEnRaya;

import java.util.IllegalFormatCodePointException;

public class tresEnRaya {

	public static void main(String[] args) {

		boolean tresEnRaya;

		int turno = 1, finalColocarFichas = 7, circulo = 1, aspa = 10;

		int[][] tablero = new int[3][3];

		System.out.println(" JUEGO DEL TRES EN RAYA");
		mostrarTablero.main(tablero, circulo, aspa);
		iniciarJugada.main(tablero);
		System.out.println();
		System.out.println("TURNO " + turno);
		mostrarTablero.main(tablero, circulo, aspa);
		turno++;

		do {
			colocarFicha.main(turno, tablero, circulo, aspa);
			tresEnRaya = comprobarSiHayTresEnRaya.main(tablero);
			System.out.println();
			System.out.println("TURNO " + turno);
			mostrarTablero.main(tablero, circulo, aspa);

			if (tresEnRaya) {
				System.out.println();
				System.out.println("TRES EN RAYA.");
				break;
			} else {
				turno++;
			}

		} while (turno < finalColocarFichas);

		if (tresEnRaya == false) {
			do {
				seleccionarFicha.main(turno, tablero, circulo, aspa);
				mostrarTablero.main(tablero, circulo, aspa);
				moverFicha.main(tablero, circulo, aspa, turno);
				tresEnRaya = comprobarSiHayTresEnRaya.main(tablero);
				System.out.println();
				System.out.println("TURNO " + turno);
				mostrarTablero.main(tablero, circulo, aspa);

				if (tresEnRaya) {
					System.out.println();
					System.out.println("TRES EN RAYA.");
					break;
				} else {
					turno++;
				}
			} while (tresEnRaya == false);
		}
		if (turno % 2 == 0) {
			System.out.println("¡Ganan las fichas X!");
		} else {
			System.out.println("¡Ganan las fichas O!");
		}
	}
}