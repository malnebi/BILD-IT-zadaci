package Zadaci_18_08_2016;

/**
 * 5.(Algebra: add two matrices) Write a method to add two matrices. The header
 * of the method is as follows: public static double[][] addMatrix(double[][] a,
 * double[][] b)
 * 
 * In order to be added, the two matrices must have the same dimensions and the
 * same or compatible types of elements. Let c be the resulting matrix. Each
 * element cij is aij + bij. For example, for two 3 * 3 matrices a Write a test
 * program that prompts the user to enter two 3 * 3 matrices and displays their
 * sum.
 */
public class Z5_AddTwoMatrices {

	static java.util.Scanner input = new java.util.Scanner(System.in);

	public static void main(String[] args) {

		// message to user and enter values into the matrix
		System.out.println("Enter values for first matrix:");
		double[][] a = enterMatrixElements();

		// message to user and enter values into the matrix
		System.out.println("Enter values for second matrix:");
		double[][] b = enterMatrixElements();

		input.close();
		// creating new resulting matrix, calling a method to do that
		double[][] c = addMatrices(a, b);

		System.out.println("Two added matrixes and resulting matrix : ");
		// calling method for printing results
		print(a, b, c);

	}

	/** method for entering the values ​​of matrix elements */
	public static double[][] enterMatrixElements() {
		// create matrix
		double[][] m = new double[3][3];
		// enter matrix elements
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = checkInput();
			}
		}
		return m;
	}

	/** adding two matrices */
	public static double[][] addMatrices(double[][] a, double[][] b) {

		double[][] c = new double[3][3];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		return c;
	}

	/** printing row */
	public static void printRow(double[][] m, int row) {

		for (int i = 0; i < m[row].length; i++) {
			// printing values in a row
			System.out.printf("%.1f  ", m[row][i]);
		}
	}

	/** printing matrixes */
	public static void print(double[][] a, double[][] b, double[][] c) {
		
		// printing values (row by row) and space, + or =
		for (int i = 0; i < c.length; i++) {
			printRow(a, i);
			System.out.print((i == 1) ? "+ " : "  ");
			printRow(b, i);
			System.out.print((i == 1) ? "= " : "  ");
			printRow(c, i);
			System.out.println();
		}
	}

	/** check entry */
	public static int checkInput() {
		int num = 0;
		boolean error = true;// check for error
		do {
			try {
				// input has to be an integer and not negative number
				num = input.nextInt();
				if (num < 0)
					throw new Exception();
				error = false;

			} catch (Exception e) {

				System.out.println("Wrong enter. Try again.");
				input.nextLine();
			}
			// loop continue while there is an error
		} while (error);

		return num;
	}

}
