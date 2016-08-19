package Zadaci_18_08_2016;

/**
 * 2. (Random number chooser) Write a method that returns a random number
 * between 1 and 54, excluding the numbers passed in the argument. The method
 * header is specified as follows: public static int getRandom(int... numbers)
 */
public class Z2_RandomNumberChooser {

	public static void main(String args[]) {

		// array of some numbers
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15,
				16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 29, 30, 31, 32,
				33, 34, 35, 36, 37, 38, 39, 51, 17, 28, 48, 23 };
		// result
		System.out.println("Random number : " + getRandom(numbers));

	}

	/** method returns a random number excluding the numbers in the argument */
	public static int getRandom(int... numbers) {

		// get random number from 1 to 54
		int random = (int) (Math.random() * 54) + 1;

		for (int i = 0; i < numbers.length; i++) {
			// if random equal numbers element get new random and check again
			// from beginning of array
			if (numbers[i] == random) {
				random = (int) (Math.random() * 54) + 1;
				i = 0;
			}
		}
		return random;

	}
}
