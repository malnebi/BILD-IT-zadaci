package Zadaci_07_09_2016;

import java.util.Scanner;

/**
 * 3. 18.10 (Occurrences of a specified character in a string) Recursive method
 * finds the number of occurrences of a specified letter in a string using the
 * following method header: public static int count(String str, char a) <br>
 * For example, count("Welcome", 'e') returns 2. Program prompts the user to
 * enter a string and a character, and displays the number of occurrences for
 * the character in the string.
 */
public class Z3_OccurancesOfChar_Recursion {

	public static void main(String[] args) {
		// create an object for entry, display messages and take entries from
		// the user
		Scanner input = new Scanner(System.in);
		System.out.println(" Enter string:");
		String s = input.nextLine();
		System.out.println(" Enter character: ");
		char ch = input.nextLine().charAt(0);

		input.close();

		// display results invoking revers recursive method
		System.out
				.printf("Number of occurences for the character '%s' in string \"%s\" is %d.",
						ch, s, count(s, ch));
	}

	/** recursive method returns number of character occurancies */
	public static int count(String s, char ch) {

		// if length of string is zero return zero
		if (s.length() == 0) {

			return 0;
			// if the last char from the string is the same as the one in
			// argument, add 1 and invoke recursiv method to check for another
			// char
		} else if (s.charAt(s.length() - 1) == ch) {
			// create new string without last char
			s = s.substring(0, (s.length() - 1));

			return 1 + count(s, ch);

			// if char in the string isn't the same as args, just invoke method
		} else {
			s = s.substring(0, (s.length() - 1));
			return count(s, ch);
		}
	}
}
