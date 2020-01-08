package tresEnRaya;

public class seleccionarFicha {
	public static void main(int turno, int[][] tablero, int circulo, int aspa) {

		int y, x, fichaCasiBloqueada, bloqueo, limiteFichaCasiBloqueada = 3, todasFichasBloqueadas = 2;

		boolean jugadorAspa, fichaMedio, noHayFicha, repetir, fichaSuya, fichaBloqueada;

		int[] vectorY = new int[tablero.length];

		jugadorAspa = otros.saberJugador(turno);

		do {

			repetir = false;
			fichaMedio = false;
			noHayFicha = false;
			fichaSuya = false;
			fichaBloqueada = false;
			fichaCasiBloqueada = 0;
			bloqueo = 0;

			if (jugadorAspa == false) {
				bloqueo = comprobarBloqueoFicha.comprobarSiTodasLasFichasEstanBloqueadas(tablero, circulo,
						fichaCasiBloqueada, limiteFichaCasiBloqueada, bloqueo, todasFichasBloqueadas);
			}

			if (bloqueo == todasFichasBloqueadas) {
				System.out.println("Todas tus fichas están bloqueadas...");
				System.out.println("Siguiente jugador.");
				break;
			}

			System.out.println("Seleccione qué ficha quiere mover:");
			x = colocarFicha.coordenadaX(tablero);
			y = colocarFicha.coordenadaY(tablero);
			repetir = otros.preguntar(repetir, x, y);

			vectorY = otros.rellenarVectorY(vectorY);
			y = vectorY[y - 1];

			fichaSuya = comprobarSiLaFichaEsDelJugador(tablero, circulo, aspa, y, x, jugadorAspa, fichaSuya);
			fichaMedio = comprobarSiEsFichaMedio(y, x, fichaMedio);
			noHayFicha = comprobarSiHayFicha(tablero, y, x, noHayFicha);

			if (fichaSuya == false) {
				System.out.println();
				System.out.println("¡Esa ficha no es suya!");
				System.out.println();
			}

			if (fichaSuya) {
				fichaCasiBloqueada = comprobarBloqueoFicha.main(tablero, x, y);
			}

			if (fichaCasiBloqueada >= limiteFichaCasiBloqueada) {
				System.out.println();
				System.out.println("Esa ficha está bloqueda...");
				System.out.println();
				fichaBloqueada = true;
			}

			if (fichaMedio == false && repetir == false && fichaBloqueada == false) {
				tablero[y - 1][x - 1] = 5;
			}

		} while (fichaMedio || noHayFicha || fichaBloqueada || fichaSuya == false);
	}

	public static boolean comprobarSiLaFichaEsDelJugador(int[][] tablero, int circulo, int aspa, int y, int x,
			boolean jugadorAspa, boolean fichaCorrecta) {

		if (jugadorAspa) {
			if (tablero[y - 1][x - 1] == aspa) {
				fichaCorrecta = true;
			}
		} else {
			if (tablero[y - 1][x - 1] == circulo) {
				fichaCorrecta = true;
			}
		}
		return fichaCorrecta;
	}

	public static boolean comprobarSiHayFicha(int[][] tablero, int y, int x, boolean noHayFicha) {

		if (tablero[y - 1][x - 1] == 0) {
			System.out.println("Seleccione unas coordenadas donde haya ficha...");
			noHayFicha = true;
		}
		return noHayFicha;
	}

	public static boolean comprobarSiEsFichaMedio(int y, int x, boolean fichaMedio) {

		if (x == 2 && y == 2) {
			System.out.println();
			System.out.println("La ficha del medio no se puede mover...");
			fichaMedio = true;
		}
		return fichaMedio;
	}
}