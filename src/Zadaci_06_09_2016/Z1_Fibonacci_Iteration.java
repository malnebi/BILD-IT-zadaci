package Zadaci_06_09_2016;

import java.util.InputMismatchException;


/**
 * 1. 18.2 (Fibonacci numbers) Rewrite the fib method in Listing 18.2 using
 * iterations. Hint: To compute fib(n) without recursion, you need to obtain
 * fib(n - 2) and fib(n - 1) first. Let f0 and f1 denote the two previous
 * Fibonacci numbers. The current Fibonacci number would then be f0 + f1. The
 * algorithm can be described as follows: <br>
 * f0 = 0; // For fib(0) <br>
 * f1 = 1; // For fib(1) <br>
 * for (int i = 1; i <= n; i++) { <br>
 * currentFib = f0 + f1; <br>
 * f0 = f1; <br>
 * f1 = currentFib; <br>
 * <br>
 * // After the loop, currentFib is fib(n) <br>
 * Write a test program that prompts the user to enter an index and displays its
 * Fibonacci number.
 */
public class Z1_Fibonacci_Iteration {

	static java.util.Scanner input = new java.util.Scanner(System.in);

	public static void main(String[] args) {
		// message to the user
		System.out.print("Enter an index for a Fibonacci number: ");
		int index = checkInput(); // invoking method to check input

		// Find and display the Fibonacci number
		System.out.println("The Fibonacci number at index " + index + " is "
				+ fib(index) + ".");

		input.close();
	}

	/** the method for finding Fibonacci number */
	public static int fib(int index) {
		// default values for fibonacci and f0, f1
		int fibonacci = 0;
		int f0 = 0;
		int f1 = 1;

		// if index is not 0 or 1 calculate fibonacci
		if (index != 0 && index != 1) {

			// loop starts from 2 (fib on index 2 is 1)
			for (int i = 2; i <= index; i++) {
				fibonacci = f0 + f1;
				f0 = f1;
				f1 = fibonacci;
			}
			// else fibonacci is index
		} else {
			fibonacci = index;
		}
		return fibonacci;
	}

	/** check input ***/
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
