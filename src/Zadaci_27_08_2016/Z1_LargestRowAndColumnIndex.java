package Zadaci_27_08_2016;

import java.util.ArrayList;
import java.util.InputMismatchException;

/**
 * 1.*11.9 (Largest rows and columns) Write a program that randomly fills in 0s
 * and 1s into an n-by-n matrix, prints the matrix, and finds the rows and
 * columns with the most 1s. (Hint: Use two ArrayLists to store the row and
 * column indices with the most 1s.) Here is a sample run of the program:
 */
// Enter the array size n: 4
// The random array is
// 0011
// 0011
// 1101
// 1010
// The largest row index: 2
// The largest column index: 2,
public class Z1_LargestRowAndColumnIndex {

	static java.util.Scanner input = new java.util.Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter the array size n: ");
		int n = checkInput();

		// create matrix and filling it with randomly chosen elements
		int[][] m = new int[n][n];

		// calling for the method of the Z3_LargestRoWAnColumn class in the
		// Zadaci_19_8_2016 package
		Zadaci_19_08_2016.Z3_LargestRowAndColumn.fillMatrix(m);

		// get array of sum elements for rows/coulumns
		int[] sumR = Zadaci_19_08_2016.Z3_LargestRowAndColumn.sumRow(m);
		int[] sumC = Zadaci_19_08_2016.Z3_LargestRowAndColumn.sumCol(m);

		// creates ArrayList objects to store the row and column indices with
		// the most 1s
		ArrayList<Integer> listRow = new ArrayList<Integer>();
		ArrayList<Integer> listCol = new ArrayList<Integer>();

		// add elements to the lists
		for (int i = 0; i <= sumC.length - 1; i++) {
			listRow.add(sumR[i]);
		}

		for (int i = 0; i <= sumC.length - 1; i++) {
			listCol.add(sumC[i]);
		}

		// default maxRow and MaxCol, value of the first element in the list
		int maxRow = listRow.get(0);
		int maxCol = listCol.get(0);

		// default indexR and indexC
		int indexR = 0;
		int indexC = 0;

		for (int i = 1; i < listRow.size(); i++) {
			// if next element value is greater then previous, maxRow gets next
			if (maxRow < listRow.get(i)) {
				maxRow = listRow.get(i);
				indexR = i; // index greater

			}
			// if next element value is greater then previous, maxCol gets next
			if (maxCol < listCol.get(i)) {
				maxCol = listCol.get(i);
				indexC = i;
			}

		}

		// printing messages with results for largest index
		System.out.println(" The largest row index is " + indexR);

		System.out.println(" The largest column index is " + indexC);

	}

	
	/** the method for checking out user input ***/
	public static int checkInput() {
		int num = 0;
		boolean error = true; // check for error

		do {
			try {
				// input has to be an integer and not negative number
				num = input.nextInt();
				if (num < 0)
					throw new InputMismatchException();
				error = false;

			} catch (InputMismatchException e) {

				System.out.print("Wrong input, try again...:  ");
				input.nextLine();
			}
			// loop continue while there is an error
		} while (error);

		return num;
	}
}
