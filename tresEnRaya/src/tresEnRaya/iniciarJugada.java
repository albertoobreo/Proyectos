package tresEnRaya;

public class iniciarJugada {
	public static void main(int[][] tablero) {

		System.out.println();
		System.out.println("Fichas O:");
		System.out.println("El primer movimiento ser� en el centro del tablero.");
		System.out.println("Pulse cualquier tecla para empezar a jugar...");
		char se�al = Leer.letra();

		tablero[1][1] = 1;
	}
}