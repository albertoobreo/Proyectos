package tresEnRaya;

public class mostrarTablero {

	public static int[][] main(int[][] tablero, int circulo, int aspa) {

		System.out.println("  _________________");
		for (int i = 0; i < tablero.length; i++) {
			System.out.println(" |     |     |     |");
			System.out.print(" |  ");

			for (int j = 0; j < tablero[i].length; j++) {
				if (tablero[i][j] == circulo)
					System.out.print("O  |  ");
				else if (tablero[i][j] == aspa)
					System.out.print("X  |  ");
				else
					System.out.print("   |  ");
			}
			System.out.println();
			System.out.println(" |_____|_____|_____|");
		}

		return tablero;
	}
}