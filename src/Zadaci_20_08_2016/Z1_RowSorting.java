package Zadaci_20_08_2016;

/**
 * 1.(Row sorting) Implement the following method to sort the rows in a
 * twodimensional array. A new array is returned and the original array is
 * intact. public static double[][] sortRows(double[][] m) Write a test program
 * that prompts the user to enter a 3 * 3 matrix of double values and displays a
 * new row-sorted matrix. Here is a sample run:
 */
// Enter a 3-by-3 matrix row by row:
// 0.15 0.875 0.375
// 0.55 0.005 0.225
// 0.30 0.12 0.4

// The row-sorted array is:
// 0.15 0.375 0.875
// 0.005 0.225 0.55
// 0.12 0.30 0.4
public class Z1_RowSorting {

	// creating Scanner object
	static java.util.Scanner input = new java.util.Scanner(System.in);

	public static void main(String[] args) {

		// message to the user
		System.out.println("Enter a 3-by-3 matrix row bay row: ");

		// creating matrix
		double[][] m = createMatrix();

		// mesagge and print result
		System.out.println("The row sorted array is: ");

		// create new sorted matrix
		double[][] matrix = sortRows(m);

		input.close();

		// displaying new matrix
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static double[][] sortRows(double[][] m) {

		for (int i = 0; i < m.length; i++) {

			for (int j = 0; j < m[i].length; j++) {

				double currentMin = m[i][j];
				int currentMinIndex = j;

				// searching for lowest element in matrix row
				for (int k = j + 1; k < m[i].length; k++) {
					if (currentMin > m[i][k]) {
						currentMin = m[i][k];
						currentMinIndex = k;
					}
				}
				// if index of the smallest is different from current j, then
				// replace m[i][j] with the smallest in the row
				// m[i][currentMinIndex]
				if (currentMinIndex != j) {
					m[i][currentMinIndex] = m[i][j];
					m[i][j] = currentMin;
				}
			}
		}
		return m;
	}

	public static double[][] createMatrix() {

		// create matrix and take values from the user
		double[][] m = new double[3][3];

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = input.nextDouble();
			}
		}
		return m;
	}
}
