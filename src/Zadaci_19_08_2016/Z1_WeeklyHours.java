package Zadaci_19_08_2016;

/**
 * 1.(Compute the weekly hours for each employee) Suppose the weekly hours for
 * all employees are stored in a two-dimensional array. Each row records an
 * employee’s seven-day work hours with seven columns. For example, the
 * following array stores the work hours for eight employees. Write a program
 * that displays employees and their total hours in decreasing order of the
 * total hours.
 */
// Su M T W Th F Sa
// Employee 0 2 4 3 4 5 8 8
// Employee 1 7 3 4 3 3 4 4
// Employee 2 3 3 4 3 3 2 2
// Employee 3 9 3 4 7 3 4 1
// Employee 4 3 5 4 3 6 3 8
// Employee 5 3 4 4 6 3 4 4
// Employee 6 3 7 4 8 3 8 4
// Employee 7 6 3 5 9 2 7 9

public class Z1_WeeklyHours {

	public static void main(String[] args) {
		// creaing a matrix with daily hours
		int[][] m = createMatrix();

		// creating a matrix with weekly hourse
		int[][] m2 = totalHours(m);

		// sorting total hours matrix
		sort(m2);

		// print sorted matrix
		for (int i = 0; i < m.length; i++) {
			System.out.println("Employee " + m2[i][0] + " has worked for "
					+ m2[i][1] + " hours.");
		}
	}

	/** method for creating a matrix */
	public static int[][] createMatrix() {

		int[][] m = { { 2, 4, 3, 4, 5, 8, 8 }, { 7, 3, 4, 3, 3, 4, 4 },
				{ 3, 3, 4, 3, 3, 2, 2 }, { 9, 3, 4, 7, 3, 4, 1 },
				{ 3, 5, 4, 3, 6, 3, 8 }, { 3, 4, 4, 6, 3, 4, 4 },
				{ 3, 7, 4, 8, 3, 8, 4 }, { 6, 3, 5, 9, 2, 7, 9 } };

		return m;
	}

	/** total hours of every employee (sum row elements of m[][]) */
	public static int[][] totalHours(int[][] m) {
		// create new matrix
		int[][] total = new int[m.length][2];

		for (int i = 0; i < m.length; i++) {
			int sum = 0;
			for (int j = 1; j < m[i].length; j++) {
				sum += m[i][j]; // summing elements of firts matrix row
			}
			total[i][0] = i; // 1. column = employee number
			total[i][1] = sum; // 2. column = sum
		}
		return total;
	}

	/**
	 * sort employees and their total hours in decreasing order of the total
	 * hours.
	 */
	public static void sort(int[][] m) {

		for (int j = 0; j < (m.length - 1); j++) {
			for (int i = 1; i < m.length; i++) {

				// if second row element larger then first, then replace both
				// sum and index

				if (m[i][1] > m[i - 1][1]) {

					// swap sum (second column)
					int temp1 = m[i][1];
					m[i][1] = m[i - 1][1];
					m[i - 1][1] = temp1;

					// swap employee number(first column)
					int temp = m[i][0];
					m[i][0] = m[i - 1][0];
					m[i - 1][0] = temp;
				}
			}
		}
	}
}
