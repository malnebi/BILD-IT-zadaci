package Zadaci_22_08_2016;

/** 4.(Algebra: 2 * 2 linear equations) Design a class named LinearEquation for a
 2 * 2 system of linear equations:*/
//a*x + b*y = e     c*x + d*y = f
//x = (e*d - b*f) /(a*d - b*c)      y = (a*f - e*c) / (a*d - b*c)
//   The class contains:
// Private data fields a, b, c, d, e, and f.
// A constructor with the arguments for a, b, c, d, e, and f.
// Six getter methods for a, b, c, d, e, and f.
// A method named isSolvable() that returns true if a*d - b*c is not 0.
// Methods getX() and getY() that return the solution for the equation.
/**
 * Draw the UML diagram for the class and then implement the class. Write a test
 * program that prompts the user to enter a, b, c, d, e, and f and displays the
 * result. If ad - bc is 0, report that “The equation has no solution.”
 */

public class Z4_LinearEquation {

	// create input object
	static java.util.Scanner input = new java.util.Scanner(System.in);

	public static void main(String[] args) {

		// message to the user and input values for 6 variables
		System.out.println("Enter a,b,c,d,e,f: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();

		input.close();

		// create LinearEquation object
		LinearEquation lin = new LinearEquation(a, b, c, d, e, f);

		// display result
		if (lin.isSolvable())
			System.out.println("X is " + lin.getX() + ", Y is " + lin.getY());
		else
			System.out.println("The linear equation has no solution.");
	}

}

class LinearEquation {

	// private data fields
	private double a, b, c, d, e, f;

	// contructor
	public LinearEquation(double a, double b, double c, double d, double e,
			double f) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
	}

	// getters and setters to accesss fields
	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}

	public double getC() {
		return c;
	}

	public double getD() {
		return d;
	}

	public double getE() {
		return e;
	}

	public double getF() {
		return f;
	}

	// control method for checking if equation is 
	public boolean isSolvable() {
		if ((a * d - b * c) > 0) {
			return true;
		} else
			return false;
	}

	public double getX() {
		// formula to get x
		return (e * d - b * f) / (a * d - b * c);
	}

	public double getY() {
		// formula to get y
		return (a * f - e * c) / (a * d - b * c);
	}

}
