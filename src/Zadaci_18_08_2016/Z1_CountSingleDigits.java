package Zadaci_18_08_2016;

/**
 * 1. (Count single digits) Program generates 100 random integers between 0 and
 * 9 and displays the count for each number. (Hint: Use an array of ten
 * integers, say counts, to store the counts for the number of 0s, 1s, . . . ,
 * 9s.)
 */
public class Z1_CountSingleDigits {

	public static void main(String[] args) {

		// an array for entered numbers
		int[] array = new int[100];

		// an array for store each number occurrence
		int[] count = new int[100];

		// loading arrays
		for (int i = 0; i < count.length; i++) {

			// entering random numbers in array
			array[i] = (int) (Math.random() * 10);
			// every time number appears in array[], the element
			// on the same index in count[] is increased
			count[array[i]]++;
		}

		// print the number of repetitions of the numbers
		for (int i = 1; i < count.length; i++) {

			if (count[i] != 0) {
				// if the element not 0 then print
				System.out.println(" Broj " + i + " se ponovio " + count[i]
						+ (count[i] == 1 ? " put." : " puta."));
			}
		}
	}
}