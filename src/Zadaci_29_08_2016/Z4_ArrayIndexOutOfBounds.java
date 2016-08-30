package Zadaci_29_08_2016;


/**
 * 4. 12.3 (ArrayIndexOutOfBoundsException) Write a program that meets the
 * following requirements: ********************************************* *******
 * ##Creates an array with 100 randomly chosen integers.******************
 * ******* ##Prompts the user to enter the index of the array, then displays the
 * corresponding element value. If the specified index is out of bounds, display
 * the message Out of Bounds.
 */
public class Z4_ArrayIndexOutOfBounds {
	static java.util.Scanner input = new java.util.Scanner(System.in);

	public static void main(String[] args) {

		// number of array elements
		int n = 100;
		// create an array of n elements and fill it with randomly choosen
		// integers
		int[] array = new int[n];

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 100);

			// displays 10 per line
			System.out.printf(" %4d", array[i]);

			if (i % 10 == 0 && i != 1) {
				System.out.println();
			}
		}

		System.out
				.println("\nEnter index of the array element (0-99) you want to be displayed:");
		// takes number from user with chek for bounds
		int index = checkInput(n);

		System.out.println("Element is " + array[index]);

	}

	/** the method for checking out user input ***/
	public static int checkInput(int n) {

		int num = 0;
		boolean error = true; // control variable (check for error)

		do {
			try {
				// input has to be an integer and not negative number
				num = input.nextInt();
				// input mast be between 0 and 100
				if (num < 0 || num >= 100)
					throw new IndexOutOfBoundsException();
				error = false;

				// if there is an error exeption will be caught
			} catch (IndexOutOfBoundsException e) {

				System.out.print("Out of bounds, try again...:  ");
				input.nextLine();// clear for another input
			}
			// loop continue while there is an error
		} while (error);

		return num;
	}

}
