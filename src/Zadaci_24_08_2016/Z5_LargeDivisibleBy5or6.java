package Zadaci_24_08_2016;

import java.math.BigInteger;

/**
 * 5. (Divisible by 5 or 6) Find the first ten numbers greater than
 * Long.MAX_VALUE that are divisible by 5 or 6.
 */
public class Z5_LargeDivisibleBy5or6 {

	public static void main(String[] args) {

		// create constants for comparation
		final BigInteger FIVE = new BigInteger("5");
		final BigInteger SIX = new BigInteger("6");

		// starting number is Long.MAX_VALUE
		BigInteger num = new BigInteger(Long.MAX_VALUE + "1");
		
		System.out
				.println("Numbers divisible by 5 or 6 larger then Long.MAX_VALUE :");

		// loop until 10 numbers is found
		for (int i = 1; i <= 10;) {

			// if number is divisible by 5 and 6 print it and count it
			if (num.remainder(FIVE).compareTo(BigInteger.ZERO) == 0
					|| num.remainder(SIX).compareTo(BigInteger.ZERO) == 0) {
				System.out.printf("%2d  %-15s\n", i, num);
				i++;
			}
			// move to next number
			num = num.add(BigInteger.ONE);// get nex value of num
		}
	}

}
