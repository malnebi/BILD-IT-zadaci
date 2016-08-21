package Zadaci_20_08_2016;

/**5.(The Location class) Design a class named Location for locating a maximal
 value and its location in a two-dimensional array. The class contains public data
 fields row, column, and maxValue that store the maximal value and its indices
 in a two-dimensional array with row and column as int types and maxValue as
 a double type.*/

/**
 * The following method returns the location of the largest element in a
 * two-dimensional array: public static Location locateLargest(double[][] a) The
 * return value is an instance of Location. Write a test program that prompts
 * the user to enter a two-dimensional array and displays the location of the
 * largest element in the array. Here is a sample run:
 */
// Enter the number of rows and columns in the array: 3 4
// Enter the array:
// 23.5 35 2 10
// 4.5 3 45 3.5
// 35 44 5.5 9.6
// The location of the largest element is 45 at (1, 2)

class Location {
	public int row;
	public int column;
	public double maxValue;

	public Location() {

	}

}

public class Z5_Location {

	static java.util.Scanner input = new java.util.Scanner(System.in);

	public static void main(String args[]) {

		System.out.print("Enter a number or rows and collumns for the array: ");

		int rows = input.nextInt();
		int col = input.nextInt();

		// create matrix
		double[][] m = new double[rows][col];

		// mesagge
		System.out.println("Enter the array: ");
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = input.nextDouble();
			}
		}

		Location loc = largest(m);
		// print result
		System.out.printf("The location of the largest"
				+ " element is %.2f at (%d, %d)\n", loc.maxValue, loc.row,
				loc.column);

	}

	/** method returns object Location class */
	public static Location largest(double[][] a) {

		// create location object
		Location loc = new Location();

		// default value for field maxValue
		loc.maxValue = a[0][0];

		for (int row = 0; row < a.length; row++) {
			for (int col = 0; col < a[row].length; col++) {
				// if current maxValue less then next, set new maxValue and
				// row and column index of its location
				if (loc.maxValue < a[row][col]) {
					loc.maxValue = a[row][col];

					loc.row = row;
					loc.column = col;
				}
			}
		}
		return loc;
	}

}
