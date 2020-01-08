package tresEnRaya;

public class otros {
	public static boolean preguntar(boolean repetir, int x, int y) {

		int respuesta;

		System.out.println("Esta es tu eleccion X: " + x + " |" + " Y: " + y);
		System.out.println("Pulse 0 si desea repetir la elección.");
		respuesta = Leer.entero();

		if (respuesta == 0) {
			repetir = true;
		}
		return repetir;
	}

	public static boolean saberJugador(int turno) {

		boolean jugadorAspa;

		System.out.println();
		if (turno % 2 == 0) {
			System.out.println("Fichas X:");
			jugadorAspa = true;
		} else {
			System.out.println("Fichas O:");
			jugadorAspa = false;
		}
		return jugadorAspa;
	}

	public static void saberFicha(int[][] tablero, int circulo, int aspa, boolean jugadorAspa, int x, int y) {

		if (jugadorAspa) {
			tablero[y - 1][x - 1] = aspa;
		} else {
			tablero[y - 1][x - 1] = circulo;
		}
	}

	public static int[] rellenarVectorY(int[] vectorY) {

		int numeroY = 3;

		for (int i = 0; i < vectorY.length; i++) {
			vectorY[i] = numeroY;
			numeroY--;
		}
		return vectorY;
	}
}