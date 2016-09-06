package Zadaci_05_09_2016;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * 4. 13.17 (Math: The Complex class) A complex number is a number in the form a
 * + bi, where a and b are real numbers and i is 2-1. The numbers a and b are
 * known as the real part and imaginary part of the complex number,
 * respectively. You can perform addition, subtraction, multiplication, and
 * division for complex numbers using the following formulas: <br>
 * a + bi + c + di = (a + c) + (b + d)i <br>
 * a + bi - (c + di) = (a - c) + (b - d)i <br>
 * (a + bi)*(c + di) = (ac - bd) + (bc + ad)i <br>
 * (a + bi)/(c + di) = (ac + bd)/(c2 + d2) + (bc - ad)i/(c2 + d2) Obtain the
 * absolute value for a complex number using the formula: //|a + bi| = 2¡ a^2 +
 * b^2 (A complex number can be interpreted as a point on a plane by identifying
 * the (a,b) values as the coordinates of the point. The absolute value of the
 * complex number corresponds to the distance of the point to the origin, as
 * shown in Figure 13.10b.)<br>
 * Design a class named Complex for representing complex numbers and the methods
 * add, subtract, multiply, divide, and abs for performing complexnumber
 * operations, and override toString method for returning a string
 * representation for a complex number. The toString method returns (a + bi) as
 * a string. If b is 0, it simply returns a. Complex class also implements the
 * Cloneable interface. <br>
 * Provide three constructors Complex(a, b), Complex(a), and Complex().
 * Complex() creates a Complex object for number 0 and Complex(a) creates a
 * Complex object with 0 for b. Also provide the getRealPart() and
 * getImaginaryPart() methods for returning the real and imaginary part of the
 * complex number, respectively. <br>
 * Test program prompts the user to enter two complex numbers and displays the
 * result of their addition, subtraction, multiplication, division, and absolute
 * value. Here is a sample run:
 */
// Enter the first complex number: 3.5 5.5
// Enter the second complex number: -3.5 1
// (3.5 + 5.5i) + (-3.5 + 1.0i) = 0.0 + 6.5i
// (3.5 + 5.5i) - (-3.5 + 1.0i) = 7.0 + 4.5i
// (3.5 + 5.5i) * (-3.5 + 1.0i) = -17.75 + -13.75i
// (3.5 + 5.5i) / (-3.5 + 1.0i) = -0.5094 + -1.7i
// |(3.5 + 5.5i)| = 6.519202405202649*/

public class Z4_ComplexNumber {

	public static void main(String[] args) throws CloneNotSupportedException {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first complex number: ");
		double a1 = input.nextDouble();
		double b1 = input.nextDouble();

		System.out.println("Enter the second complex number: ");
		double a2 = input.nextDouble();
		double b2 = input.nextDouble();

		input.close();
		// create complex number with users inputs
		Complex a = new Complex(a1, b1);
		Complex b = new Complex(a2, b2);

		// make a clone object using overriden method clone(), a and clonedA are
		// different objects with the same contents
		Complex clonedA = (Complex) a.clone();

		// invoke toString() method on a and b, to show them and other methods
		// add(), subtract(), multiply(), divide()
		System.out.println(a.toString() + " + " + b.toString() + " = "
				+ a.add(b));

		// using cloneedA insted of a should give the same result of summing as
		// previous one
		System.out.println("Use cloned object of 'a' to calculate sum.");
		System.out.println(clonedA.toString() + " + " + b.toString() + " = "
				+ clonedA.add(b));

		System.out.println(a.toString() + " - " + b.toString() + " = "
				+ a.subtract(b));
		System.out.println(a.toString() + " * " + b.toString() + " = "
				+ a.multiply(b));
		System.out.println(a.toString() + " / " + b.toString() + " = "
				+ a.divide(b));

	}
}

/***/
class Complex implements Cloneable {

	private double a;
	private double b;

	/**
	 * Provide three constructors Complex(a, b), Complex(a), and Complex().
	 */
	// creates a Complex object with specified fields
	public Complex(double a, double b) {
		this.a = a;
		this.b = b;
	}

	// creates a Complex object with 0 for b
	public Complex(double a) {
		this.b = 0;
		this.a = a;

	}

	// creates a Complex object for number 0
	public Complex() {
		this(0);
	}

	// method returns the real part of the complex number
	public double getRealPart() {
		return a;
	}

	// method returns imaginary part of the complex number
	public double getImaginaryPart() {
		return b;
	}

	public Complex add(Complex complex) {
		// formula a + bi + c + di = (a + c) + (b + d)i
		return new Complex((a + complex.a), (b + complex.b));
	}

	public Complex subtract(Complex complex) {
		// formula a + bi - (c + di) = (a - c) + (b - d)i
		return new Complex((a - complex.a), (b - complex.b));
	}

	public Complex multiply(Complex complex) {
		// formula (a + bi)*(c + di) = (ac - bd) + (bc + ad)i
		return new Complex((a * complex.a - b * complex.b), (b * complex.a + a
				* complex.b));
	}

	public Complex divide(Complex complex) {
		// (a+bi)/(c+di)=(ac+bd)/(c^2 +d^2)+(bc-ad)i/(c^2 +d^2)
		return new Complex((a * complex.a + b * complex.b)
				/ ((Math.pow(complex.a, 2) + Math.pow(complex.b, 2))), (b
				* complex.a - a * complex.b)
				/ ((Math.pow(complex.a, 2) + Math.pow(complex.b, 2))));
	}

	// get absolute value
	public double abs() {
		return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
	}

	/** overriden clone() method form an Object class */
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		if (b == 0) {
			return a + "";
		}
		// to represent decimal format as 3 pleace after point
		DecimalFormat decimal = new DecimalFormat("#.###");
		return "(" + decimal.format(a) + " + " + decimal.format(b) + "i)";

	}

}
