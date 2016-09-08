package Zadaci_07_09_2016;

/**
 * 4. 18.11 (Sum the digits in an integer using recursion) Recursive method:
 * public static int sumDigits(long n) <br>
 * computes the sum of the digits in an integer. For example, sumDigits(234)
 * returns 2 + 3 + 4 = 9. Program prompts the user to enter an integer and
 * displays its sum.
 */
public class Z4_SumDigitsOfInteger_Recursion {

	static java.util.Scanner input = new java.util.Scanner(System.in);

	public static void main(String[] args) {

		// message to the user
		System.out.println("Enter number: ");

		long n = checkInput(); // invoke method for checking input

		input.close();

		// invoke method to get sum of digits
		System.out.printf("Sum of dgits in %d is %d", n, sumDigits(n));
	}

	/** recursive method returns sum of digits in number */
	public static int sumDigits(long n) {
		// if there is one dig return it
		if (n < 10) {
			return (int) n;
			// get digit form number and add it to another when invoke method
			// again
		} else {
			int dig = (int) (n % 10);
			return dig + sumDigits(n / 10);
		}
	}

	/** checking input */
	public static long checkInput() {
		long num = 0;
		boolean error = true; // check for error

		do {
			try {
				num = input.nextLong();

				// number must be long integer nonnegativ number
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
