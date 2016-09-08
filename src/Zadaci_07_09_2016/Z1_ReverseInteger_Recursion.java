package Zadaci_07_09_2016;

/**
 * 1. 18.8 (Print the digits in an integer reversely) Write a recursive method
 * that displays an int value reversely on the console using the following
 * header: public static void reverseDisplay(int value) <br>
 * For example, reverseDisplay(12345) displays 54321. Write a test program that
 * prompts the user to enter an integer and displays its reversal.
 */
public class Z1_ReverseInteger_Recursion {

	static java.util.Scanner input = new java.util.Scanner(System.in);

	public static void main(String[] args) {

		// message to the user
		System.out.println("Enter number: ");

		int number = checkInput(); // invoke method for checking input

		input.close();

		// invok method to get reversed number
		reverse(number);
	}

	/** method prints digits in reverse */
	public static void reverse(int n) {
		// if number is 0 return n
		// else print last and using recursion do else for all except last one
		if (n == 0)
			return;
		else {
			System.out.print(n % 10); // print last digit
			reverse(n / 10); // invoke recursion method to get new number
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
