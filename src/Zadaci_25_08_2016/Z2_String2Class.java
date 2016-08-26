package Zadaci_25_08_2016;

/**
 * 2. 10.23 (Implement the String class) The String class is provided in the
 * Java library. Provide your own implementation for the following methods (name
 * the new class MyString2):
 * */
// public MyString2(String s);
// public int compare(String s);
// public MyString2 substring(int begin);
// public MyString2 toUpperCase();
// public char[] toChars();
// public static MyString2 valueOf(boolean b);
public class Z2_String2Class {

	/** Method tests MyString2 class. */
	public static void main(String[] args) {

		// create some strings
		String a = "somestr";
		String b = "SomeStrings";

		System.out.printf("String \"%s\" and \"%s\":\n", a, b);

		System.out.println("System compareTo(): " + a.compareTo(b));

		System.out.print("Custom compareTo(): ");
		
		// create and object that refers to another string (a)
		MyString2 a2 = new MyString2(a);

		System.out.println(a2.compareTo(b));

		System.out.println("Substring of first string with 2: "
				+ a2.substring(2));
		System.out.println("First string to upper case: " + a2.toUpperCase());

		System.out.println("Boolean valueOf(): " + MyString2.valueOf(true)
				+ " " + MyString2.valueOf(false));
	}
}

/**
 * Custom String implementation. Can store maximum of Character.MAX_VALUE
 * characters.
 */
class MyString2 {
	// variable for storing all values
	private char[] value;

	public MyString2() {
		this.value = null;
	}

	public MyString2(String s) {
		this(s.toCharArray());
	}

	public MyString2(char[] value) {
		this.value = value;
	}

	/**
	 * Method compares two strings and returns difference as integer.
	 */
	public int compareTo(String s) {
		// check if this or argument string is null
		if (s == null) {
			// if both null return 0 else -2
			return this.value == null ? 0 : -2;
		}
		// create variables
		int range = 0;
		char ch1, ch2;
		// get range from smaller string
		if (this.value.length > s.length()) {
			range = s.length();
		} else {
			range = this.value.length;
		}
		// loop to range
		for (int i = 0; i < range; i++) {
			// get both characters
			ch1 = value[i];
			ch2 = s.charAt(i);
			// if characters not equal
			if (ch1 != ch2) {
				// return subtraction of thos etwo
				return (int) (ch1 - ch2);
			}
		}
		// strings can have same content at same indexes
		// but different length return difference
		return this.value.length - s.length();
	}

	/**
	 * Method returns substring from argument to the end.
	 */
	public MyString2 substring(int begin) {
		// if invalid argument return null
		if (begin > this.value.length || begin < 0) {
			System.out.println("Can't return substring.(IndexOutOfRange)");
			return null;
			// if equal as length return new empty string
		} else if (begin == this.value.length) {
			return new MyString2("");
		}
		// create list with appropriate subtracted size
		char[] newList = new char[this.value.length - begin];
		for (int i = 0, index = begin; i < newList.length; i++, index++) {
			newList[i] = this.value[index];
		}
		// return new string
		return new MyString2(newList);
	}

	/** Method returns this string all characters as upper case. */
	public MyString2 toUpperCase() {
		// create new list and add all characters but set to upper case
		char[] newList = new char[this.value.length];
		for (int i = 0; i < newList.length; i++) {
			newList[i] = Character.toUpperCase(this.value[i]);
		}
		return new MyString2(newList);
	}

	/** Method returns string as char list. */
	public char[] toChars() {
		return this.value;
	}

	/** Method returns boolean value as string */
	public static MyString2 valueOf(boolean b) {
		MyString2 newStr = b ? new MyString2("true") : new MyString2("false");
		return newStr;
	}

	// method toString to print values easily
	@Override
	public String toString() {
		// create new string buffer and add all values to it
		StringBuffer str = new StringBuffer();
		for (char c : value) {
			str.append(c);
		}
		// return buffer converted to string
		return str.toString();
	}
}