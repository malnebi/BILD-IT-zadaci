package Zadaci_06_09_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 2. 18.3 (Compute greatest common divisor using recursion) The gcd(m, n) can
 * also be defined recursively as follows: <br>
 * If m % n is 0, gcd(m, n) is n. <br>
 * Otherwise, gcd(m, n) is gcd(n, m % n). <br>
 * Write a recursive method to find the GCD. Write a test program that prompts
 * the user to enter two integers and displays their GCD.
 */
public class Z2_GCD_Recursion {

	static java.util.Scanner input = new java.util.Scanner(System.in);

	public static void main(String[] args) {

		// Create a Scanner take values from user
		Scanner input = new Scanner(System.in);
		System.out.print("Enter two numbers: ");
		int n1 = checkInput();
		int n2 = checkInput();

		// Find and display the gcd
		System.out.printf("The gdc of %d and %d is %d", n1, n2, gcd(n1, n2));

		input.close();

	}

	/** Recursive method for finding gcd */
	public static int gcd(int n1, int n2) {
		int gcd = 0;
		// if n1 is divisible with n2 then gcd is n
		// else do recursion...
		if (n1 % n2 == 0) {
			gcd = n2;
		} else {
			gcd = gcd(n1, n2 % n1);
		}
		return gcd;
	}

	/** the method for checking out users input ***/
	public static int checkInput() {
		int num = 0;
		boolean error = true; // check for error

		do {
			try {
				// input has to be any integer except zero
				num = input.nextInt();
				if (num == 0)
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
