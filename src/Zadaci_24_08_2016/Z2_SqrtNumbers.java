package Zadaci_24_08_2016;

import java.math.BigDecimal;

/**
 * 2. 10.17 (Square numbers) Find the first ten square numbers that are greater
 * than Long.MAX_VALUE. A square number is a number in the form of n¡2. For
 * example, 4, 9, and 16 are square numbers. Find an efficient approach to run
 * your program fast.
 */
public class Z2_SqrtNumbers {

	public static void main(String[] args) {

		// create an object num that refers to number greater than greatest long
		BigDecimal num = new BigDecimal(Long.MAX_VALUE);

		BigDecimal startNum = new BigDecimal((long) (Math.sqrt(Long.MAX_VALUE)));

		BigDecimal squareNum;

		int count = 1; // counter for desired numbers

		// loop until 10th number is found
		while (count <= 10) {
			// multiply starting number to get squared n^2
			squareNum = startNum.multiply(startNum);
			// if number is bigger than long max print it and count
			if (squareNum.compareTo(num) > 0) {
				System.out.printf("%2d  %20s\n", count, squareNum);
				count++;
			}
			// add one to the starting number
			startNum = startNum.add(BigDecimal.ONE);
		}

	}
}
