package tresEnRaya;

import java.util.IllegalFormatCodePointException;

public class comprobarBloqueoFicha {
	public static int main(int[][] tablero, int x, int y) {

		int fichaCasiBloqueada = 0;

		fichaCasiBloqueada = Derecha(tablero, x, y, fichaCasiBloqueada);
		fichaCasiBloqueada = Abajo(tablero, x, y, fichaCasiBloqueada);
		fichaCasiBloqueada = Arriba(tablero, x, y, fichaCasiBloqueada);
		fichaCasiBloqueada = Izquierda(tablero, x, y, fichaCasiBloqueada);
		fichaCasiBloqueada = DiagonalAbajoDerecha(tablero, x, y, fichaCasiBloqueada);
		fichaCasiBloqueada = DiagonalAbajoIzquierda(tablero, x, y, fichaCasiBloqueada);
		fichaCasiBloqueada = DiagonalArribaDerecha(tablero, x, y, fichaCasiBloqueada);
		fichaCasiBloqueada = DiagonalArribaIzquierda(tablero, x, y, fichaCasiBloqueada);
		return fichaCasiBloqueada;
	}

	public static int Derecha(int[][] tablero, int x, int y, int fichaCasiBloqueada) {

		if (x - 1 == 0 || x - 1 == 1) {
			x++;
			if (tablero[y - 1][x - 1] > 0) {
				fichaCasiBloqueada++;
			} else {
				fichaCasiBloqueada--;
			}
			x--;
		}
		return fichaCasiBloqueada;
	}

	public static int Abajo(int[][] tablero, int x, int y, int fichaCasiBloqueada) {

		if (y - 1 == 0 || y - 1 == 1) {
			y++;
			if (tablero[y - 1][x - 1] > 0) {
				fichaCasiBloqueada++;
			} else {
				fichaCasiBloqueada--;
			}
			y--;
		}
		return fichaCasiBloqueada;
	}

	public static int Arriba(int[][] tablero, int x, int y, int fichaCasiBloqueada) {

		if (y - 1 == 2 || y - 1 == 1) {
			y--;
			if (tablero[y - 1][x - 1] > 0) {
				fichaCasiBloqueada++;
			} else {
				fichaCasiBloqueada--;
			}
			y++;
		}
		return fichaCasiBloqueada;
	}

	public static int Izquierda(int[][] tablero, int x, int y, int fichaCasiBloqueada) {

		if (x - 1 == 2 || x - 1 == 1) {
			x--;
			if (tablero[y - 1][x - 1] > 0) {
				fichaCasiBloqueada++;
			} else {
				fichaCasiBloqueada--;
			}
			x++;
		}
		return fichaCasiBloqueada;
	}

	public static int DiagonalAbajoDerecha(int[][] tablero, int x, int y, int fichaCasiBloqueada) {

		if ((x - 1 == 0 || x - 1 == 1) && (y - 1 == 0 || y - 1 == 1)) {
			x++;
			y++;
			if (tablero[y - 1][x - 1] > 0) {
				fichaCasiBloqueada++;
			} else {
				fichaCasiBloqueada--;
			}
		}
		return fichaCasiBloqueada;
	}

	public static int DiagonalAbajoIzquierda(int[][] tablero, int x, int y, int fichaCasiBloqueada) {

		if ((x - 1 == 2 || x - 1 == 1) && (y - 1 == 0 || y - 1 == 1)) {
			x--;
			y++;
			if (tablero[y - 1][x - 1] > 0) {
				fichaCasiBloqueada++;
			} else {
				fichaCasiBloqueada--;
			}
		}
		return fichaCasiBloqueada;
	}

	public static int DiagonalArribaDerecha(int[][] tablero, int x, int y, int fichaCasiBloqueada) {

		if ((x - 1 == 0 || x - 1 == 1) && (y - 1 == 2 || y - 1 == 1)) {
			x++;
			y--;
			if (tablero[y - 1][x - 1] > 0) {
				fichaCasiBloqueada++;
			} else {
				fichaCasiBloqueada--;
			}
		}
		return fichaCasiBloqueada;
	}

	public static int DiagonalArribaIzquierda(int[][] tablero, int x, int y, int fichaCasiBloqueada) {

		if ((x - 1 == 2 || x - 1 == 1) && (y - 1 == 2 || y - 1 == 1)) {
			x--;
			y--;
			if (tablero[y - 1][x - 1] > 0) {
				fichaCasiBloqueada++;
			} else {
				fichaCasiBloqueada--;
			}
		}
		return fichaCasiBloqueada;
	}

	public static int comprobarSiTodasLasFichasEstanBloqueadas(int[][] tablero, int circulo, int fichaCasiBloqueada,
			int limiteFichaCasiBloqueada, int bloqueo, int todasFichasBloqueadas) {
		for (int i = 2; i > -1; i--) {
			for (int j = 0; j < tablero.length; j++) {
				if (tablero[i][j] == circulo) {
					fichaCasiBloqueada = comprobarBloqueoFicha.main(tablero, j + 1, i + 1);
					if (fichaCasiBloqueada >= limiteFichaCasiBloqueada) {
						bloqueo++;
					}
				}
			}
		}
		return bloqueo;
	}
}