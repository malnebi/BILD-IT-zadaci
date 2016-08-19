package Zadaci_18_08_2016;

/**
 * (Pattern recognition: consecutive four equal numbers) The following method
 * tests whether the array has four consecutive numbers with the same value.
 * public static boolean isConsecutiveFour(int[] values) A test program prompts
 * the user to enter a series of integers and displays if the series contains
 * four consecutive numbers with the same value. The program first prompt the
 * user to enter the input size—i.e., the number of values in the series.
 */
public class Z3_PatternRecognition_ConsecutiveFours {

	static java.util.Scanner input = new java.util.Scanner(System.in);

	public static void main(String[] args) {

		// message to user and entry with checking
		System.out.println("Enter number of valuese:");
		int numOfValues = checkInput();

		// create an array
		int[] array = new int[numOfValues];

		System.out.println("Enter the values: ");

		for (int i = 0; i < array.length; i++) {
			// entering values for arrays elements
			array[i] = checkInput();
		}
		input.close();

		// checking if method returns true or false and printing appropriate
		// message
		if (isConsecutiveFour(array))
			System.out.println("The list has consecutive fours");
		else
			System.out.println("The list has no consecutive fours");
	}

	/** method returns boolean for existing consecutive fours */
	public static boolean isConsecutiveFour(int[] values) {

		int value = values[0];
		int counter = 1;

		for (int i = 1; i < values.length; i++) {
			if (values[i] == value) {
				counter++; // if value exist increase counter

				if (counter == 4) {// if counter reaches desired value
					return true; // return true
				}
			} else {// if values not mached, set counter to 1
				value = values[i];
				counter = 1;
			}
		}// if it goes throught loop not finding consecutive fours return false
		return false;
	}

	/** check entry ***/
	public static int checkInput() {
		int num = 0;
		boolean error = true; // check for error

		do {
			try {
				// input has to be an integer and not negative number
				num = input.nextInt();
				if (num < 0)
					throw new Exception();
				error = false;

			} catch (Exception e) {

				System.out.print("Wrong input, try again...:  ");
				input.nextLine();
			}
			// loop continue while there is an error
		} while (error);

		return num;
	}
}
