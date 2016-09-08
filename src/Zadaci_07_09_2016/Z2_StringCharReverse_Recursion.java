package Zadaci_07_09_2016;

import java.util.Scanner;

/**
 * 2. 18.9 (Print the characters in a string reversely) Write a recursive method
 * that displays a string reversely on the console using the following header:
 * public static void reverseDisplay(String value) <br>
 * For example, reverseDisplay("abcd") displays dcba. Write a test program that
 * prompts the user to enter a string and displays its reversal.
 */
public class Z2_StringCharReverse_Recursion {

	public static void main(String[] args) {
		// create an object for entry, display message and take entry from the
		// user
		Scanner input = new Scanner(System.in);
		System.out.println(" Enter string:");
		String s = input.nextLine();

		input.close();

		// display results invoking revers recursive method
		System.out.print("Revers string: ");
		reverseString(s);
	}

	/** reverse method gives string revers */
	public static void reverseString(String s) {

		if (s.length() == 0) {
			return;
		} else {
			// print last character of the string
			System.out.print(s.charAt(s.length() - 1));
			// invoke reverse method on new string (substring)
			reverseString(s.substring(0, (s.length() - 1)));
		}
	}

}
