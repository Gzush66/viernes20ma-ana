package ejercicioCincoPuntoTresDos;

public class Ejercicio4_2_01 {

	public static void main(String[] args) { // (int)(Math.random()*((N-M+1)+M)
		int random; // se declara el array, y se rellena aleatoriamente
		int num[][] = new int[5][9];
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[0].length; j++) {
				do {
					random = (int) (Math.random() * 201); // se recurre a una funcion para asegurarnos que no haya
				} while (estaRepetido(num, i, j, random)); // numeros repetidos
				num[i][j] = random;
			}
		}

		int max = num[0][0]; // se localizan los maximos y minimos
		int min = num[0][0];
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j < 9; j++) {
				if (num[i][j] > max) {
					max = num[i][j];
				}
				if (num[i][j] < min) {
					min = num[i][j];
				}
			}
		}

		for (int i = 1; i < 5; i++) { // le imprime al lado si es maximo o minimo
			for (int j = 1; j < 9; j++) {
				System.out.print(num[i][j] + "\s\s");
				if (num[i][j] == max) {
					System.out.print("maximo");
				}
				if (num[i][j] == min) {
					System.out.print("minimo");
				}
				System.out.println();

			}
		}

	}

	// funcion para que no haya numeros repetidos
	public static boolean estaRepetido(int[][] array, int i, int j, int random) {
		for (int fila = 0; fila <= array.length; fila++) {
			for (int col = 0; col < array[0].length; col++) {
				if (array[fila][col] == random) {
					return true;
				}
				if ((fila == i) && (col == j)) {
					return false;
				}
			}
		}
		return false;
	}

}