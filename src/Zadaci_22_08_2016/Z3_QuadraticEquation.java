package Zadaci_22_08_2016;

//(Algebra: quadratic equations) Design a class named QuadraticEquation for
//a quadratic equation ax2 + bx + x = 0. The class contains:
//Private data fields a, b, and c that represent three coefficients.
// A constructor for the arguments for a, b, and c.
// Three getter methods for a, b, and c.
// A method named getDiscriminant() that returns the discriminant, which is
//b2 - 4ac.
// The methods named getRoot1() and getRoot2() for returning two roots of
//the equation r1 = (-b + 2b2 - 4ac) / 2a and r2 = (-b - 2b2 - 4ac) / 2a
//These methods are useful only if the discriminant is nonnegative. Let these methods
//return 0 if the discriminant is negative.
//Draw the UML diagram for the class and then implement the class. Write a test
//program that prompts the user to enter values for a, b, and c and displays the result
//based on the discriminant. If the discriminant is positive, display the two roots. If
//the discriminant is 0, display the one root. Otherwise, display “The equation has
//no roots.” See Programming Exercise 3.1 for sample runs.

public class Z3_QuadraticEquation {

	// create input object
	static java.util.Scanner input = new java.util.Scanner(System.in);

	public static void main(String[] args) {

		// mesagge to the user to enter values
		System.out.println("Enter a, b, c: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();

		input.close();

		// create an QuadraticEquation object
		QuadraticEquation q = new QuadraticEquation(a, b, c);

		// if discriminant larger then 0 equation has 2 roots
		if (q.getDiscriminant() > 0)
			System.out.println("This quadratic equation has two roots: "
					+ q.getRoot1() + " and " + q.getRoot2());

		// displaying result based on descriminant
		else if (q.getDiscriminant() == 0) {// if it's equal to 0 has one root

			if (q.getRoot2() > 0 && q.getRoot1() < 0)
				System.out.println("This quadratic equation has one root: "
						+ q.getRoot2());
			else
				System.out.println("This quadratic equation has one root: "
						+ q.getRoot1());
			// if discriminant is less then 0 - no roots
		} else
			System.out.println("This quadratic equation has no real roots");

	}

}

/** new class */
class QuadraticEquation {

	// private fields
	private double a;
	private double b;
	private double c;

	// constructor
	public QuadraticEquation(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	// getters and setters to accesss fields
	public double getA() {
		return a;
	}

	public double getb() {
		return b;
	}

	public double getC() {
		return c;
	}

	public double getDiscriminant() {
		return b * b - 4 * a * c;
	}

	//method to get first root
	public double getRoot1() {
		double r1 = -b + (Math.pow(getDiscriminant(), 0.5)) / 2 * a;
		if (r1 > 0)
			return r1;
		else
			return 0;
	}
	//method to get first root
	public double getRoot2() {
		double r2 = -b - (Math.pow(getDiscriminant(), 0.5)) / 2 * a;
		if (r2 > 0)
			return r2;
		else
			return 0;
	}

}
