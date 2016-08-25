package Zadaci_23_08_2016;

import java.util.InputMismatchException;

/**
 * 4. 10.5 (Displaying the prime factors) The program prompts the user to enter
 * a positive integer and displays all its smallest factors in decreasing order.
 * For example, if the integer is 120, the smallest factors are displayed as 5,
 * 3, 2, 2, 2. Use the StackOfIntegers class to store the factors (e.g., 2, 2,
 * 2, 3, 5) and retrieve and display them in reverse order.
 */
public class Z4_DisplayingThePrimeFactors {

	static java.util.Scanner input = new java.util.Scanner(System.in);

	public static void main(String[] args) {

		// create list and variable to store number
		StackOfIntegers factors = new StackOfIntegers();
		int userNumber = 0;

		// prompt the user to enter the number
		System.out.println("Enter one number for calculating its factors:");
		userNumber = checkInput();

		// create first divider and loop until number becomes non divisable
		int div = 2; // default devider is the smalest even number

		do {
			// if number can be divided add to list divider and divided number
			if (userNumber % div == 0) {
				factors.push(div);
				userNumber /= div; // get new num
			} else {
				div++; // increase devider and try again
			}
		} while (userNumber > 1);

		// pop factors and print them
		System.out.print("Factors: ");
		for (int i = factors.getSize(); i > 0; i--) {
			System.out.print(factors.pop() + " ");
		}
		input.close();
	}

	/** the method for checking out user input***/
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

/**
 * Class for storing any length of numbers in array.
 */
class StackOfIntegers {
	// fields for element array and size
	private int[] elements;
	private int size = 0;
	// default capacity of the list is 16
	private static final int DEFAULT_CAPACITY = 16;

	public StackOfIntegers() {
		this(DEFAULT_CAPACITY);
	}

	public StackOfIntegers(int capacity) {
		this.elements = new int[capacity];
	}

	/** Push a new integer to the top of the stack */
	public void push(int value) {
		if (size >= elements.length) {
			int[] temp = new int[elements.length * 2];
			System.arraycopy(elements, 0, temp, 0, elements.length);
			elements = temp;
		}

		elements[size++] = value;
	}

	/** Return and remove the top element from the stack */
	public int pop() {
		return elements[--size];
	}

	/** Return the top element from the stack */
	public int peek() {
		return elements[size - 1];
	}

	/** Test whether the stack is empty */
	public boolean empty() {
		return size == 0;
	}

	/** Return the number of elements in the stack */
	public int getSize() {
		return size;
	}
}
