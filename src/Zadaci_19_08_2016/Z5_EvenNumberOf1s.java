package Zadaci_19_08_2016;

/**
 * 5.(Book: 8.22 Even number of 1s) Write a program that generates a 6-by-6
 * two-dimensional matrix filled with 0s and 1s, displays the matrix, and checks
 * if every row and every column have an even number of 1s.
 */
public class Z5_EvenNumberOf1s {

	public static void main(String[] args) {

		// calling method to create and print matrix
		int[][] m = createAndPrintMatrix();

		// matrix for even number of 1s in rows, but not in columns
		// int[][] m = { { 1, 0, 0, 1, 0, 1 },
		// { 1, 0, 0, 0, 1, 1 },
		// { 0, 0, 1, 1, 0, 1 },
		// { 1, 1, 1, 0, 0, 0 },
		// { 0, 1, 1, 0, 1, 0 },
		// { 1, 0, 0, 1, 1, 0 } };

		// get sum of row/column elements
		int[] sumR = sumRow(m);
		int[] sumC = sumCol(m);

		// print results
		System.out.print("Rows ");
		print(sumR);
		System.out.print("Columns ");
		print(sumC);

	}

	/** method for creating and printing matrix */
	public static int[][] createAndPrintMatrix() {

		int[][] m = new int[6][6];

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				// filling matrix with randomly chosen 1s and 0s
				m[i][j] = (int) (Math.random() * 2);
				// print matrix element
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
		return m;
	}

	/** method for print result */
	public static void print(int[] array) {

		int counter = 0;
		// go through the array and compair result previously summed
		// columns/rows elements
		for (int i = 1; i < array.length; i++) {

			if (array[i] != array[i - 1])
				counter++;// with everi various sums, increase counter
		}
		if (counter == 0) {
			System.out.println("has even numbers of 1s. ");
		} else
			System.out.println("has not even numbers of 1s");
	}

	/** method returns sum row elements */
	public static int[] sumRow(int[][] matrix) {

		int[] sumRow = new int[matrix.length];
		for (int i = 0; i < matrix.length; i++) {
			int sum = 0;
			for (int j = 0; j < matrix[i].length; j++) {
				sum += matrix[i][j];// summing elements
			}
			sumRow[i] = sum;// add sum to array
		}
		return sumRow;
	}

	/** method returns sum column elements */
	public static int[] sumCol(int[][] matrix) {
		// create an array
		int[] sumCol = new int[matrix.length];

		for (int i = 0; i < matrix.length; i++) {
			int sum = 0;
			for (int j = 0; j < matrix[i].length; j++) {
				sum += matrix[j][i];// summing elements
			}
			sumCol[i] = sum; // add sum to array
		}
		return sumCol;
	}
}