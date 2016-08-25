package Zadaci_23_08_2016;

/**3. (The MyPoint class) Design a class named MyPoint to represent a point with
 x- and y-coordinates. The class contains:*/
//The data fields x and y that represent the coordinates with getter
//methods.
// A no-arg constructor that creates a point (0, 0).
// A constructor that constructs a point with specified coordinates.
// A method named distance that returns the distance from this point to a
//specified point of the MyPoint type.
// A method named distance that returns the distance from this point to
//another point with specified x- and y-coordinates.
/**
 * Draw the UML diagram for the class and then implement the class. Write a test
 * program that creates the two points (0, 0) and (10, 30.5) and displays the
 * distance between them. Sections 10.4–10.8
 */
public class Z3_MyPoint {

	public static void main(String[] args) {

		// create two objects with different constructors
		MyPoint point1 = new MyPoint();
		MyPoint point2 = new MyPoint(10, 30.5);

		// print result
		System.out.printf("Distance between (%.2f, %.2f)"
				+ "\nand (%.2f, %.2f) is: %.2f\n", point1.getX(),
				point1.getY(), point2.getX(), point2.getY(),
				point1.distance(point2));

	}

}

/**
 * Simple MyPoint class that have distance method. Use to store point location
 * on a 2D plane and retrieve distance to other points.
 */
class MyPoint {
	// The data fields x and y represent the coordinates
	private double x, y;

	// A no-arg constructor that creates a point (0, 0).
	public MyPoint() {
		this(0, 0);
	}

	// A constructor that constructs a point with specified coordinates.
	public MyPoint(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	// getter methods.
	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	/**
	 * A method named distance returns the distance from this point to a
	 * specified point of the MyPoint type.
	 */
	public double distance(double x, double y) {
		return Math.sqrt(Math.pow((x - this.x), 2) + Math.pow((y - this.y), 2));
	}

	/**
	 * A method named distance returns the distance from this point to another
	 * point with specified x- and y-coordinates.
	 */
	public double distance(MyPoint point) {
		return distance(point.getX(), point.getY());
	}
}