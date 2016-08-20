package Zadaci_19_08_2016;

/**
 * 2.( Algebra: multiply two matrices) Write a method to multiply two matrices.
 * The header of the method is: public static double[][]
 * multiplyMatrix(double[][] a, double[][] b) To multiply matrix a by matrix b,
 * the number of columns in a must be the same as the number of rows in b, and
 * the two matrices must have elements of the same or compatible types. Let c be
 * the result of the multiplication. Assume the column size of matrix a is n.
 * Each element cij is ai1 * b1j + ai2 * b2j + c + ain * bnj. For example, for
 * two 3 * 3 matrices a and b, c
 * 
 * 
 * where cij = ai1 * b1j + ai2 * b2j + ai3 * b3j. Write a test program that
 * prompts the user to enter two 3 * 3 matrices and displays their product.
 */
public class Z2_MultuplyTwoMatrices {

	public static void main(String[] args) {
		// message to the user
		System.out.println("Enter number for size of matrices:");
		int n = Zadaci_18_08_2016.Z4_SumElementsColumnByColumn.checkInput();

		// message to the user and enter values into the matrix
		System.out.println("Enter values for first matrix:");
		// creating a matrix calling a method from other class
		double[][] a = Zadaci_18_08_2016.Z5_AddTwoMatrices
				.enterMatrixElements();

		// message to the user and enter values into the matrix
		System.out.println("Enter values for second matrix:");
		double[][] b = Zadaci_18_08_2016.Z5_AddTwoMatrices
				.enterMatrixElements();

		// creating new resulting matrix, calling a method to do that
		double[][] c = multiplyTwoMatrices(a, b, n);

		System.out.println("Two matrixes and resulting matrix : ");
		// calling method for printing results
		print(a, b, c);
	}

	// 1 2 3 4 5 6 7 8 9
	// 0 2 4 1 4.5 2.2 1.1 4.3 5.2

	/** printing matrices */
	public static void print(double[][] a, double[][] b, double[][] c) {

		// printing values (row by row) and space, * or =
		for (int i = 0; i < c.length; i++) {
			Zadaci_18_08_2016.Z5_AddTwoMatrices.printRow(a, i);
			System.out.print((i == 1) ? "* " : "  ");
			Zadaci_18_08_2016.Z5_AddTwoMatrices.printRow(b, i);
			System.out.print((i == 1) ? "= " : "  ");
			Zadaci_18_08_2016.Z5_AddTwoMatrices.printRow(c, i);
			System.out.println();
		}
	}

	/** multiply elements of two matrices */
	public static double[][] multiplyTwoMatrices(double[][] a, double[][] b,
			int n) {
		// creating new matrix
		double[][] c = new double[n][n];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {

				int m = 1;
				c[i][j] = a[i][0] * b[0][j];// default value

				// loop will goes until add up all the multiplied couples in one
				// row and column as stated in the task
				while (m != n) {
					c[i][j] += a[i][m] * b[m][j];
					m++;
				}
			}
		}
		return c;
	}

}
