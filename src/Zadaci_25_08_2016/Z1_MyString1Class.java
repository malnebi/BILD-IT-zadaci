package Zadaci_25_08_2016;

/**
 * 1. 10.22 (Implement the String class) The String class is provided in the
 * Java library. Provide your own implementation for the following methods (name
 * the new class MyString1):
 */

// public MyString1(char[] chars);
// public char charAt(int index);
// public int length();
// public MyString1 substring(int begin, int end);
// public MyString1 toLowerCase();
// public boolean equals(MyString1 s);
// public static MyString1 valueOf(int i);

public class Z1_MyString1Class {

	public static void main(String[] args) {

		// create an object of MyString1 class
		MyString1 str = new MyString1("Some text");

		// let's test methods and print its results
		System.out.println("First character of string: " + str.charAt(0));

		System.out.println("Convert to lower case " + str.toLowerCase());

		System.out.println();

		System.out.println("Substring (1, 3): " + str.substring(1, 3));

		System.out.println("Eqials to \"text\": "
				+ str.equals(new MyString1("some text")));

		System.out.println("Lower case and equals to \"text\": "
				+ str.toLowerCase().equals(new MyString1("text")));

		System.out.println("Value of number 65: " + MyString1.valueOf(65));
	}
}

class MyString1 {

	// an array that stores values
	private char[] value;

	MyString1() {
		this.value = null;
	}

	MyString1(String string) {
		this(string.toCharArray());
	}

	MyString1(char[] chars) {
		if (chars == null) {
			this.value = null;
			return;
		}
		this.value = chars;
	}

	public char charAt(int index) {
		return this.value[index];
	}

	public int length() {
		return this.value.length;
	}

	/** returns substring of string between two values of strings index */
	public MyString1 substring(int begin, int end) {

		// wrong size arguments returns null
		if ((begin + end) > length() || begin < 0 || end < 0) {
			System.out.println("(IndexOutOfRange)");
			return null;
		}

		// create new array of characters with required length
		char[] values = new char[end - begin];

		// copy only characters from begin to the end to the new array
		for (int i = 0; i < values.length; i++) {
			values[i] = this.value[begin];
			begin++;
		}
		return new MyString1(values);

	}

	/** convert to lower case */
	public MyString1 toLowerCase() {

		char[] newValue = new char[length()];

		for (int i = 0; i < newValue.length; i++) {
			newValue[i] = Character.toLowerCase(this.value[i]);
		}
		return new MyString1(newValue);
	}

	/** return true if every character of two strings matchs */
	public boolean equals(MyString1 s) {

		for (int i = 0; i < value.length; i++) {
			if (charAt(i) != s.charAt(i)) {
				return false;
			}
		}
		return true;
	}

	/** get value of a character */
	public static MyString1 valueOf(int i) {

		char[] ch = { (char) i };

		return new MyString1(ch);
	}

	/** overriden toString method */
	@Override
	public String toString() {
		String newValue = "";
		for (int i = 0; i < this.value.length; i++) {
			newValue += this.value[i];
		}
		return newValue;
	}

}
