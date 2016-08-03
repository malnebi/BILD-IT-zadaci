package Zadaci_02_08_2016;

import java.util.Scanner;

/**
 * Program ispisuje matricu ciji elementi sadrze nule i jedinice. Broj kolona i
 * redova daje korinsik na pocetku programa.
 **/
public class Z4_Matrica_sa_0_i_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Unesite broj redova i kolona n X n matrice: ");

		int n = input.nextInt();

		input.close();
		// pozivanje metode za ispis 
		printMatrix(n);

	}

	/** metoda za ispis matrice */
	public static void printMatrix(int n) {
		// kreiranje matrice
		int[][] matrix = new int[n][n];

		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				// kao elementi pojavljuju se nule i jedinice nasumicno
				matrix[row][column] = (int) (Math.random() * 2);
				System.out.print(matrix[row][column] + " ");
			}
			System.out.println();
		}
	}
}
