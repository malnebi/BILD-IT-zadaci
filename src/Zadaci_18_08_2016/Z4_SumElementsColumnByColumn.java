package Zadaci_18_08_2016;

/**
 * 4.(Sum elements column by column) Write a method that returns the sum of all
 * the elements in a specified column in a matrix using the following header:
 * public static double sumColumn(double[][] m, int columnIndex)
 */
public class Z4_SumElementsColumnByColumn{

	static java.util.Scanner input = new java.util.Scanner(System.in);

	public static void main(String[] args) {
		// meassage to user for entry
		System.out.println("Enter a 3-by-4 matrix row by row:");

		// create matrix
		double[][] matrix = new double[3][4];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = input.nextDouble();
			}
		}
		input.close();
		// printing results
		for (int index = 0; index < matrix[0].length; index++) {
			System.out.println("Sum of the elements at column " + index
					+ " is " + sumColumn(matrix, index));
		}
	}

	/** method for summing elements in matrix column */
	public static double sumColumn(double[][] m, int columnIndex) {
		double sum = 0;
		// going throught column and summing values
		for (int i = 0; i < m.length - 1; i++) {
			sum += m[i][columnIndex];
		}
		return sum;
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
