package tresEnRaya;

public class moverFicha {
	public static void main(int[][] tablero, int circulo, int aspa, int turno) {

		boolean repetir, yaHayFicha, jugadorAspa, fichaNoMovida;

		int yMovida = 0, xMovida = 0, magicNumber = 2, x, y;

		int[] vectorY = new int[tablero.length];

		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero.length; j++) {
				if (tablero[i][j] == 5) {
					tablero[i][j] = 0;
					yMovida = i;
					xMovida = j;
				}
			}
		}

		jugadorAspa = otros.saberJugador(turno);

		do {
			fichaNoMovida = false;
			repetir = false;
			yaHayFicha = false;

			x = colocarFicha.coordenadaX(tablero);
			y = colocarFicha.coordenadaY(tablero);
			repetir = otros.preguntar(repetir, x, y);

			vectorY = otros.rellenarVectorY(vectorY);
			y = vectorY[y - 1];

			yaHayFicha = colocarFicha.comprobarSiHayFicha(tablero, repetir, yaHayFicha, x, y);

			if ((x - 1 == xMovida + magicNumber || x - 1 == xMovida - magicNumber) || y - 1 == yMovida + magicNumber
					|| y - 1 == yMovida - magicNumber) {
				System.out.println("Seleccione unas coordenadas que estén contiguas a la movida.");
			}

			if (x - 1 == xMovida || y - 1 == yMovida) {
				System.out.println("Ahí es donde estaba la ficha...");
				System.out.println();
				fichaNoMovida = true;
			}

		} while ((x - 1 == xMovida + magicNumber || x - 1 == xMovida - magicNumber)
				|| (y - 1 == yMovida + magicNumber || y - 1 == yMovida - magicNumber) || yaHayFicha || repetir
				|| fichaNoMovida);

		otros.saberFicha(tablero, circulo, aspa, jugadorAspa, x, y);
	}
}