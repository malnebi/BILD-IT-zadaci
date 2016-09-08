package Zadaci_06_09_2016;

/**
 * 4. 18.5 (Sum series) Write a recursive method to compute the following
 * series: <br>
 * m(i) = 1/3 +2/5 +3/7 +4/9 + 5/11 +6/13 + ... +i/(2i + 1) <br>
 * Write a test program that displays m(i) for i = 1, 2, . . ., 10.
 */
public class Z4_SumSeries2IPlus1 {

	public static void main(String[] args) {
		// calculate and display result
		System.out.printf(
				"Sum of 10 series numbers 1/3, 2/5, 3/7 ,..., 10/21 is %.2f",
				sum(1));

	}

	/*** recursive method returns sum of series numbers */
	public static double sum(double n) {
		// no need to do recursion if there is one number just return its value
		if (n < 1) {
			return n;

		} else { // * m(i) = 1/3 +2/5 +3/7 +4/9 + 5/11 +6/13 + ... +i/(2i + 1)
			return n / (2 * n + 1) + sum(n - 1); // use recursive method
		}
	}
}
