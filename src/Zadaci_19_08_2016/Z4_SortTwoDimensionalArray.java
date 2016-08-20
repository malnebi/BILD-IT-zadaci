package Zadaci_19_08_2016;

/**
 * 4.(Sort two-dimensional array) Write a method to sort a two-dimensional array
 * using the following header: public static void sort(int m[][]) The method
 * performs a primary sort on rows and a secondary sort on columns. For example,
 * the following array {{4, 2},{1, 7},{4, 5},{1, 2},{1, 1},{4, 1}} will be
 * sorted to {{1, 1},{1, 2},{1, 7},{4, 1},{4, 2},{4, 5}}.
 */
public class Z4_SortTwoDimensionalArray {

	public static void main(String[] args) {
		// create matrix
		int[][] m = { { 4, 2 }, { 1, 7 }, { 4, 5 }, { 1, 2 }, { 1, 1 },
				{ 4, 1 } };

		// the method called for sort and print result
		sort(m);

	}

	/** method sorts rows first then column and print result */
	public static void sort(int m[][]) {

		// sort rows
		for (int i = 0; i < m.length - 1; i++) {
			for (int j = 0; j < m.length - i - 1; j++) {
				// if next row is greater than previous one switch
				if (sum(m[j]) > sum(m[j + 1])) {
					int[] tmp = m[j];
					m[j] = m[j + 1];
					m[j + 1] = tmp;

				}
			}
		}
		// sort columns
		for (int i = 0; i < m.length - 1; i++) {
			for (int j = 0; j < m.length - i - 1; j++) {
				// if next column is greater than previous one switch
				if (m[j][0] > m[j + 1][0]) {
					int[] tmp = m[j];
					m[j] = m[j + 1];
					m[j + 1] = tmp;

				}
			}
		}
		// print
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}

	}

	/** method returning sum of elements in for rows of matrix */
	public static int sum(int[] m) {
		int sum = 0;
		for (int i : m) {
			sum += i;
		}
		return sum;
	}

}
