package tresEnRaya;

public class iniciarJugada {
	public static void main(int[][] tablero) {

		System.out.println();
		System.out.println("Fichas O:");
		System.out.println("El primer movimiento será en el centro del tablero.");
		System.out.println("Pulse cualquier tecla para empezar a jugar...");
		char señal = Leer.letra();

		tablero[1][1] = 1;
	}
}