package Zadaci_29_08_2016;

import java.util.InputMismatchException;

/**
 * 3. 12.2 (InputMismatchException) Program prompts the user to read two
 * integers and displays their sum. Program prompts the user to read the number
 * again if the input is incorrect.
 */
public class Z3_InputMismatchEcxeption {
	static java.util.Scanner input = new java.util.Scanner(System.in);

	public static void main(String[] args) {
		// message to the user for enter numbers
		System.out.println("Enter two numbers: ");
		int n1 = checkInput();// call method for check input
		int n2 = checkInput();

		// display result
		System.out.println("Sum of " + n1 + " and " + n2 + " is " + (n1 + n2));

	}

	/** the method for checking out user input ***/
	public static int checkInput() {

		int num = 0;
		boolean error = true; // control variable (check for error)

		do {
			try {
				// input has to be an integer and not negative number
				num = input.nextInt();
				if (num < 0)
					throw new InputMismatchException();
				error = false;

				// if there is an error exeption will be caught
			} catch (InputMismatchException e) {

				System.out.print("Wrong input, try again...:  ");
				input.nextLine();// clear for another input
			}
			// loop continue while there is an error
		} while (error);

		return num;
	}

}
