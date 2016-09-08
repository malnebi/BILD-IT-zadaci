package Zadaci_07_09_2016;

/**
 * 5. 18.13 (Find the largest number in an array) Write a recursive method that
 * returns the largest integer in an array. Write a test program that prompts
 * the user to enter a list of eight integers and displays the largest element.
 */
public class Z5_FindLargestInArray_Recursion {

	static java.util.Scanner input = new java.util.Scanner(System.in);

	public static void main(String[] args) {

		// message to the user
		System.out.println("Enter 8 numbers: ");

		int[] array = new int[8];

		for (int i = 0; i < array.length; i++) {
			array[i] = checkInput();
		}

		input.close();

		// invok method to get lagrest number and display result
		System.out.printf("The largest number from your list is %d",
				largest(array, 7));
	}

	/** recursive method returns largest number in array */
	public static int largest(int[] array, int index) {

		// recursion stops when it reach first element in array
		if (index == 0) {
			return array[0];

		} else {
			int currentL = array[index]; // current largest number
			int largest = largest(array, index - 1);// recursive call
			// instead if if statement, we use ternary operator to get largest
			return currentL > largest ? currentL : largest;
		}

	}

	/** checking input */
	public static int checkInput() {
		int num = 0;
		boolean error = true; // check for error

		do {
			try {
				num = input.nextInt();

				// number must be integer nonnegativ number
				if (num < 0)
					throw new Exception();
				error = false;

			} catch (Exception e) {
				// message to the user
				System.out.print("Wrong entry, try again:  ");
				input.nextLine();
			}
			// loop till there is error
		} while (error);

		return num;
	}
}
