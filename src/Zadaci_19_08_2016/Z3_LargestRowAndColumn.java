package Zadaci_19_08_2016;

/**
 * 3.(Largest row and column) Write a program that randomly fills in
 * 0s and 1s into a 4-by-4 m, prints the matrix, and finds the first row and
 * column with the most 1s. Here is a sample run of the program:
 */
// 0011
// 0011
// 1101
// 1010
// The largest row index: 2
// The largest column index: 2
public class Z3_LargestRowAndColumn {

	public static void main(String[] args) {
		// create matrix and filling it with randomly chosen elements
		int[][] m = new int[4][4];
		fillMatrix(m);

		// get array of sum elements for rows/coulumns
		int[] sumR = sumRow(m);
		int[] sumC = sumCol(m);

		// get maximum of rows/columns
		int maxNumOf1sR = max(sumR);
		int maxNumOf1sC = max(sumC);

		// printing messages with results for largest index
		System.out.println(" The largest row index is "
				+ indexOfMax(sumR, maxNumOf1sR));

		System.out.println(" The largest column index is "
				+ indexOfMax(sumC, maxNumOf1sC));
	}

	/** fill matrix with randomly chosen 0s and 1s */
	public static void fillMatrix(int[][] m) {
		// filling matrix with randomly chosen 0 or 1
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = (int) (Math.random() * 2);
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}

	}

	/** return an array of summed elements in matrix rows */
	public static int[] sumRow(int[][] matrix) {
		// creating an array for summing elements of matrix row
		int[] sumR = new int[matrix.length];

		for (int i = 0; i < matrix.length; i++) {
			int sum = 0;
			for (int j = 0; j < matrix[i].length; j++) {
				sum += matrix[i][j];// summing elements of row matrix
			}
			sumR[i] = sum; // add sum to array
		}
		return sumR;
	}

	/** return an array of summed elements in matrix columns */
	public static int[] sumCol(int[][] matrix) {
		// creating an array for summing elements of matrix column
		int[] sumC = new int[matrix.length];

		for (int i = 0; i < matrix.length; i++) {
			int sum = 0;// summing elements of matrix column
			for (int j = 0; j < matrix[i].length; j++) {
				sum += matrix[j][i];
			}
			sumC[i] = sum;
		}
		return sumC;
	}

	/** searching for largest column/row (with most 1s) */
	public static int max(int[] array) {
		int max = array[0];
		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		return max;
	}

	/** searching for index of largest column/row (with most 1s) */
	public static int indexOfMax(int[] array, int maxNum) {
		int index = 0;
		for (int i = 0; i < array.length; i++) {
			if (maxNum == array[i]) {
				index = i;
				break;
			}
		}
		return index;
	}
}
