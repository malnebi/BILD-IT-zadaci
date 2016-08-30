package Zadaci_29_08_2016;

import java.util.ArrayList;
import java.util.InputMismatchException;

import javax.swing.text.StyledEditorKit.ForegroundAction;

/**
 * 2. 11.17 (Algebra: perfect square) Program prompts the user to enter an
 * integer m and find the smallest integer n such that m * n is a perfect
 * square. (Hint: Store all smallest factors of m into an array list. n is the
 * product of the factors that appear an odd number of times in the array list.
 * For example, consider m = 90, store the factors 2, 3, 3, 5 in an array list.
 * 2 and 5 appear an odd number of times in the array list. So, n is 10.) Here
 * are sample runs:
 */

// Enter an integer m: 1500
// The smallest number n for m * n to be a perfect square is 15
// m * n is 22500

// Enter an integer m: 63
// The smallest number n for m * n to be a perfect square is 7
// m * n is 441

public class Z2_ {

	static java.util.Scanner input = new java.util.Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter an integer m: ");
		int m = checkInput();

		System.out.println("Factors for number " + m + " are ");
		System.out.print(factors(m));

		ArrayList<Integer> factors = factors(m);

		int n = n(factors);

		System.out.println();
		System.out
				.println("The smallest number n for m * n to be a perfect square is "
						+ n(factors) + "\n m * n is " + m * n);

	}

	/** find factors for number m */
	public static ArrayList<Integer> factors(int m) {

		ArrayList<Integer> factors = new ArrayList<Integer>();

		int num = m;
		do {
			for (int i = 2; i < m; i++) {

				if (num % i == 0) {
					factors.add(i);
					num /= i;
				}
			}

		} while (num != 1);

		return factors;
	}

	/**
	 * methods finds unique numbers from factor list and smallest integer such
	 * that m * n is a perfect square
	 */
	public static int n(ArrayList<Integer> factors) {

		for (int i = 0; i < factors.size(); i++) {
			for (int j = 1; j < i; j++) {

				if (factors.get(i) == factors.get(j)) {
					factors.remove(i);
					break;
				}
			}
		}

		int n = 1;
		for (int j = 0; j < factors.size(); j++) {

			n *= factors.get(j);
		}

		return n;
	}

	/** chack if it is perfect sqrt */

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
