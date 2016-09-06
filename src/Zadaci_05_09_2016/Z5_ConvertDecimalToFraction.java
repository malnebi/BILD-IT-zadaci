package Zadaci_05_09_2016;

import java.util.Scanner;

/**
 * 5. 13.19 (Convert decimals to fractions) Program prompts the user to enter a
 * decimal number and displays the number in a fraction. Hint: read the decimal
 * number as a string, extract the integer part and fractional part from the
 * string, and use the BigInteger implementation of the Rational class in
 * Programming Exercise 13.15 to obtain a rational number for the decimal
 * number. Here are some sample runs: <br>
 * Enter a decimal number: 3.25 <br>
 * The fraction number is 13/4 <br>
 * <br>
 * Enter a decimal number: -0.45452 <br>
 * The fraction number is -11363/25000
 */
public class Z5_ConvertDecimalToFraction {

	public static void main(String[] args) {

		// createScanner object, mesage and entry
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a decimal number: ");
		String s = input.next();

		RationalBigInteger r = new RationalBigInteger(s);
		// displays result
		System.out.println("The fraction number is "
				+ r.getNumerator().toString() + "/"
				+ r.getDenominator().toString());

		input.close();

	}

}
