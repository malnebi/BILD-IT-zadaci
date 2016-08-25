package Zadaci_24_08_2016;

import java.math.BigInteger;

/**
 * 3. 10.18 (Large prime numbers) Write a program that finds five prime numbers
 * larger than Long.MAX_VALUE.
 */
public class Z3_LargePrime {

	public static void main(String[] args) {
		// create an object from BigInteger class
		BigInteger num = new BigInteger(Long.MAX_VALUE + "1");

		// calling a method for print numbers
		printPrimeNumbers(num);

	}

	/** method prints prime numbers */
	public static void printPrimeNumbers(BigInteger num) {

		int counter = 0;

		while (counter < 5) {

			boolean prime = true; // assume number is prime

			for (BigInteger div = new BigInteger("2"); div.compareTo(num
					.divide(new BigInteger("2"))) <= 0; div.add(BigInteger.ONE)) {

				// if condition is true number isn't prime, break
				if (num.remainder(div).equals(BigInteger.ZERO)) {
					prime = false;
					break;
				}
			}

			if (prime) { // if it's prime
				counter++; // increase counter
				System.out.println(num + " ");// print number
			}
			num = num.add(BigInteger.ONE); // test next number
		}
	}

}
