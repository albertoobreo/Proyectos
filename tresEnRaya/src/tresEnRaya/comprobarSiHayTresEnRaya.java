package tresEnRaya;

public class comprobarSiHayTresEnRaya {

	public static boolean main(int[][] tablero) {

		boolean tresEnRaya = false;

		int comprobador = 0, comprobador2 = 0, numeroGanadorAspa = 30, numeroGanadorCirculo = 3;

		tresEnRaya = comprobarHorizontal(tablero, tresEnRaya, comprobador, comprobador2, numeroGanadorAspa,
										 numeroGanadorCirculo);
		tresEnRaya = comprobarVertical(tablero, tresEnRaya, comprobador, comprobador2, numeroGanadorAspa,
									   numeroGanadorCirculo);
		tresEnRaya = comprobarDiagonal(tablero, tresEnRaya, comprobador, comprobador2, numeroGanadorCirculo);

		return tresEnRaya;
	}

	public static boolean comprobarDiagonal(int[][] tablero, boolean tresEnRaya, int comprobador, int comprobador2,
			int numeroGanadorCirculo) {

		for (int i = 0; i < tablero.length; i++) {
			comprobador = tablero[i][i];
			comprobador2 = comprobador + comprobador2;
		}

		if (comprobador2 != numeroGanadorCirculo) {

			comprobador = 0;
			comprobador2 = 0;
			int j = 2;

			for (int i = 0; i < tablero.length; i++) {
				comprobador = tablero[i][j];
				comprobador2 = comprobador + comprobador2;
				j--;
			}
		}

		if (comprobador2 == numeroGanadorCirculo) {
			tresEnRaya = true;
		}

		return tresEnRaya;
	}

	public static boolean comprobarVertical(int[][] tablero, boolean tresEnRaya, int comprobador, int comprobador2,
			int numeroGanadorAspa, int numeroGanadorCirculo) {

		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero.length; j++) {

				comprobador = tablero[j][i];
				comprobador2 = comprobador + comprobador2;
			}

			if (comprobador2 == numeroGanadorAspa || comprobador2 == numeroGanadorCirculo) {
				tresEnRaya = true;
			}

			comprobador = 0;
			comprobador2 = 0;
		}

		return tresEnRaya;
	}

	public static boolean comprobarHorizontal(int[][] tablero, boolean tresEnRaya, int comprobador, int comprobador2,
			int numeroGanadorAspa, int numeroGanadorCirculo) {

		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero.length; j++) {

				comprobador = tablero[i][j];
				comprobador2 = comprobador + comprobador2;
			}

			if (comprobador2 == numeroGanadorAspa || comprobador2 == numeroGanadorCirculo) {
				tresEnRaya = true;
			}

			comprobador = 0;
			comprobador2 = 0;
		}

		return tresEnRaya;
	}
}