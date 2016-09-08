package Zadaci_06_09_2016;

/**
 * 3. 18.4 (Sum series) Write a recursive method to compute the following
 * series: <br>
 * m(i) = 1 + 1/2 +1/3 + ... +1/i <br>
 * Write a test program that displays m(i) for i = 1, 2, . . ., 10.
 */
public class Z3_SumSeries {

	public static void main(String[] args) {

		// calculate and display result
		System.out
				.printf("Sum of 10 series numbers 1, 1/2,1/3,...,1/10 is %.2f",
						sum(10));

	}

	/*** recursive method returns sum of series numbers */
	public static double sum(double n) {
		// no need to do recursion if there is one number just return its value
		if (n == 1) {
			return n;

		} else { // m(i) = 1 + 1/2 +1/3 + ... +1/i <br>
			return 1 / n + sum(n - 1); // use recursive method
		}
	}
}
