package Zadaci_23_08_2016;

/**2.
 10.3 (The MyInteger class) Design a class named MyInteger. The class contains:*/
// An int data field named value that stores the int value represented by this
//object.
// A constructor that creates a MyInteger object for the specified int value.
// A getter method that returns the int value.
// The methods isEven(), isOdd(), and isPrime() that return true if the
//value in this object is even, odd, or prime, respectively.
// The static methods isEven(int), isOdd(int), and isPrime(int) that
//return true if the specified value is even, odd, or prime, respectively.
// The static methods isEven(MyInteger), isOdd(MyInteger), and
//isPrime(MyInteger) that return true if the specified value is even, odd,
//or prime, respectively.
// The methods equals(int) and equals(MyInteger) that return true if
//the value in this object is equal to the specified value.
// A static method parseInt(char[]) that converts an array of numeric
//characters to an int value.
// A static method parseInt(String) that converts a string into an int
//value.
/**
 * Draw the UML diagram for the class and then implement the class. Write a
 * client program that tests all methods in the class.
 */
public class Z2_MyInteger {

	public static void main(String[] args) {

		// create object calling contructor with int argument
		MyInteger myInteger = new MyInteger(7);

		System.out.println("Number" + myInteger.getValue() + " is even: "
				+ myInteger.isEven());
		System.out.println("Number" + myInteger.getValue() + " is odd: "
				+ myInteger.isOdd());
		System.out.println("Number" + myInteger.getValue() + " is prime: "
				+ myInteger.isPrime());

		// declare int variable num and assign value
		int num = 12;

		// calling on static methods
		System.out.println("Number" + num + " is even: "
				+ MyInteger.isEven(num));
		System.out.println("Number" + num + " is odd: " + MyInteger.isOdd(num));
		System.out.println("Number" + num + " is prime: "
				+ MyInteger.isPrime(num));
		System.out.println();

		System.out.println("Static methods with objects as args.");

		System.out.println(myInteger.getValue());
		System.out.println(MyInteger.isEven(myInteger));
		System.out.println(MyInteger.isOdd(myInteger));
		System.out.println(MyInteger.isPrime(myInteger));

		// create new object
		MyInteger o = new MyInteger(7);

		System.out.println("Number " + o.getValue() + " is equal to "
				+ myInteger.getValue() + " : " + myInteger.equals(o));

		System.out.println("Number " + myInteger.getValue()
				+ " is equal to 10 " + myInteger.equals(10));

		String str = "123";
		System.out.println("Convert string " + str + " to integer "
				+ MyInteger.parseInt(str));

		// check whether method parseInt(str) works
		System.out.println(MyInteger.parseInt(str) + 5);
	}
}

class MyInteger {
	// An int data field value stores the int value represented by this object.
	private int value;

	// A constructor creates a MyInteger object for the specified int value.
	MyInteger(int value) {
		this.value = value;
	}

	// A getter method returns the int value.
	int getValue() {
		return value;
	}

	/**
	 * The methods isEven(), isOdd(), and isPrime() return true if the value in
	 * this object is even, odd, or prime, respectively.
	 */
	boolean isEven() {
		if (value % 2 == 0)
			return true;
		else
			return false;
	}

	boolean isOdd() {
		if (value % 2 != 0)
			return true;
		else
			return false;
	}

	boolean isPrime() {
		for (int i = 2; i <= value / 2; i++) {
			if (value % i == 0) {
				return false;
			}
		}
		return true;
	}

	/**
	 * The static methods isEven(int), isOdd(int), and isPrime(int) return true
	 * if the specified value is even, odd, or prime, respectively.
	 */
	public static boolean isEven(int num) {
		if (num % 2 == 0)
			return true;
		else
			return false;
	}

	public static boolean isOdd(int num) {
		if (num % 2 != 0)
			return true;
		else
			return false;
	}

	public static boolean isPrime(int num) {
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	/**
	 * The static methods isEven(MyInteger), isOdd(MyInteger), and
	 * isPrime(MyInteger) return true if the specified value is even, odd, or
	 * prime, respectively.
	 */
	public static boolean isEven(MyInteger object) {
		if (object.getValue() % 2 == 0) {
			return true;
		}
		return false;
	}

	public static boolean isOdd(MyInteger object) {
		if (object.getValue() % 2 != 0)
			return true;
		else
			return false;
	}

	public static boolean isPrime(MyInteger object) {
		for (int i = 2; i <= object.getValue() / 2; i++) {
			if (object.getValue() % i == 0) {
				return false;
			}
		}
		return true;
	}

	/**
	 * The methods equals(int) and equals(MyInteger) that return true if the
	 * value in this object is equal to the specified value.
	 */
	public boolean equals(int num) {
		if (this.value == num) {
			return true;
		}
		return false;
	}

	public boolean equals(MyInteger object) {
		if (this.value == object.value) {
			return true;
		}
		return false;
	}

	/**
	 * A static method parseInt(char[]) that converts an array of numeric
	 * characters to an int value.
	 */

	public static int parseInt(char[] array) { // take an array
		String str = new String(array);
		int num = Integer.parseInt(str); // the method converts numeric string
											// in numeric value
		return num;
	}

	/**
	 * A static method parseInt(String) that converts a string into an int
	 * value.
	 */
	public static int parseInt(String str) { // take a string
		int num = Integer.parseInt(str);
		return num;
	}
}
