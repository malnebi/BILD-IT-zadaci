package Zadaci_24_08_2016;

import java.math.BigInteger;

/**
 * 4. 10.19 (Mersenne prime) A prime number is called a Mersenne prime if it can
 * be written in the form 2^p - 1 for some positive integer p. Write a program
 * that finds all Mersenne primes with p … 100 and displays the output as shown
 * below. (Hint: You have to use BigInteger to store the number, because it is
 * too big to be stored in long. Your program may take several hours to run.)
 */
// p 2^p – 1
// 2 3
// 3 7
// 5 31
// ...
public class Z4_MersennePrime {

	public static void main(String args[]) {

		// create mersenne variable and loop to 100 iterations
		BigInteger mersenne;

		for (int i = 2; i <= 100; i++) {

			// check if iteration is prime
			if (isPrime(new BigInteger("i"))) {

				// get mersenne number from prime
				mersenne = getMersenne(i);

				// check if mersenne is prime and print it
				if (isPrime(mersenne)) {
					System.out.printf("%3d  %s\n", i, mersenne);
				}
			}
		}

	}

	/** checks if number is prime **/
	public static boolean isPrime(BigInteger num) {
		for (BigInteger i = new BigInteger("2"); i.compareTo(num) < 0; i = i
				.add(BigInteger.ONE)) {
			if (num.remainder(i).equals(BigInteger.ZERO)) {
				return false;
			}
		}
		return true;
	}

	/** get marsenne number */
	public static BigInteger getMersenne(int n) {
		return new BigInteger("2").pow(n).subtract(BigInteger.ONE);
	}
}
