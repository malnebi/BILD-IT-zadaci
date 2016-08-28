package Zadaci_26_08_2016;

import java.util.InputMismatchException;

/**11.1 (The Triangle class) Design a class named Triangle that extends
 GeometricObject. The class contains:*/
// Three double data fields named side1, side2, and side3 with default
//values 1.0 to denote three sides of the triangle.
// A no-arg constructor that creates a default triangle.
// A constructor that creates a triangle with the specified side1, side2, and
//side3.
// The accessor methods for all three data fields.
// A method named getArea() that returns the area of this triangle.
// A method named getPerimeter() that returns the perimeter of this triangle.
// A method named toString() that returns a string description for the triangle.
//For the formula to compute the area of a triangle, see Programming Exercise 2.19.
//The toString() method is implemented as follows:
//return "Triangle: side1 = " + side1 + " side2 = " + side2 +
//" side3 = " + side3;
/**
 * Draw the UML diagrams for the classes Triangle and GeometricObject and
 * implement the classes. */
/**
 * A test program prompts the user to enter three sides of the triangle, a
 * color, and a Boolean value to indicate whether the triangle is filled. The
 * program should create a Triangle object with these sides and set the color
 * and filled properties using the input. The program displas the area,
 * perimeter, color, and true or false to indicate whether it is filled or not.
 */
public class Z1_TestTriangleFromGeometricObject {

	static java.util.Scanner input = new java.util.Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter sides of a triangle: ");
		double side1 = checkInput();
		double side2 = checkInput();
		double side3 = checkInput();

		System.out.println("Enter color of the triangle:");
		String color = input.next();

		System.out.println("Is triangle filled: ");

		TriangleFromGeometricObject triangle = new TriangleFromGeometricObject(
				side1, side2, side3);


		System.out.println("Here are the triangle details: ");
		
		triangle.setColor(color);
		System.out.println("Color : " + triangle.getColor());
		
		System.out.println("Perimeter: " + triangle.getPerimeter());

		System.out.println("Area: " + triangle.getArea());


	}

	/** the method for checking out user input ***/
	public static double checkInput() {
		double num = 0;
		boolean error = true; // check for error

		do {
			try {
				// input has to be pozitive number
				num = input.nextDouble();
				if (num < 0)
					throw new InputMismatchException();
				error = false;

			} catch (InputMismatchException e) {

				System.out.print("Wrong input, try again...:  ");
				input.nextLine();
			}
			// loop continue while there is an error
		} while (error);

		return num;
	}
}

class TriangleFromGeometricObject extends GeometricObject {
	/**
	 * double data fields named side1, side2, and side3 with default values 1.0
	 * to denote three sides of the triangle.
	 */
	private double side1 = 1;
	private double side2 = 1;
	private double side3 = 1;

	/** A no-arg constructor creates a default triangle */
	public TriangleFromGeometricObject() {
	}

	/**
	 * A constructor creates a triangle with the specified side1, side2, and
	 * side3.
	 */
	TriangleFromGeometricObject(double side1, double side2, double side3) {
		super(); // calling the contructor of superclass GeometricObjects
					// (although it automatically calls the empty
					// super construktor)
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	/** The accessor methods for all three data fields */
	public double getSide1() {
		return side1;
	}

	public double getSide2() {
		return side2;
	}

	public double getSide3() {
		return side3;
	}

	/** A method named getPerimeter() returns the perimeter of this triangle */
	public double getPerimeter() {
		return side1 + side2 + side3;
	}

	/** A method named getArea() that returns the area of this triangle. **/
	public double getArea() {
		double s = getPerimeter() / 2;
		// using formula for triangle area
		return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	}

	/** A method named toString() returns a string description for the triangle */
	public String toString() {
		// calling toString() method of its superclass

		return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = "
				+ side3;
	}

}