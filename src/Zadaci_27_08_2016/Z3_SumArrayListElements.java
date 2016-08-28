package Zadaci_27_08_2016;

import java.util.ArrayList;
import java.util.InputMismatchException;

/**3.
 11.12 (Sum ArrayList) Write the following method that returns the sum of all numbers
 in an ArrayList:*/
//public static double sum(ArrayList<Double> list)
/**
 * Write a test program that prompts the user to enter 5 numbers, stores them in
 * an array list, and displays their sum.
 */
public class Z3_SumArrayListElements {

	static java.util.Scanner input = new java.util.Scanner(System.in);

	public static void main(String[] args) {

		// message to the user
		System.out.println("Enter 5 numbers: ");

		// create ArrayList for entered numbers
		ArrayList<Double> list = new ArrayList<Double>();

		// add elements to the lists
		for (int i = 0; i < 5; i++) {
			list.add(checkInput());
		}

		// print result of method sum(list)
		System.out.println("Sum of your entered numbers is: " + sum(list));

	}

	/** method for sum list elements */
	public static double sum(ArrayList<Double> list) {

		double sum = 0;

		for (int i = 0; i < 5; i++) {
			sum += list.get(i);
		}

		return sum;
	}

	/** the method for checking out user input ***/
	public static double checkInput() {
		double num = 0;
		boolean error = true; // check for error

		do {
			try {
				// input has to be not negative number
				num = input.nextDouble();
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
