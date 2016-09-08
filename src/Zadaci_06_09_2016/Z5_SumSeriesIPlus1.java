package Zadaci_06_09_2016;

/**
 * 5. 18.6 (Sum series) Write a recursive method to compute the following
 * series: <br>
 * m(i) = 1/2 +2/3 + ... +i/i + 1 <br>
 * Write a test program that displays m(i) for i = 1, 2, . . ., 10.
 */
public class Z5_SumSeriesIPlus1 {

	public static void main(String[] args) {
		// calculate and display result
		System.out.printf(
				"Sum of 10 series numbers 1/2, 2/3,3/4,...,10/11 is %.2f",
				sum(10));

	}

	/*** recursive method returns sum of series numbers */
	public static double sum(double n) {
		// no need to do recursion if there is one number
		if (n < 1) {
			return n;

		} else { //   m(i) = 1/2 +2/3 + ... +i/i + 1 
			return n / (n + 1) + sum(n - 1); // use recursive method
		}
	}
}
