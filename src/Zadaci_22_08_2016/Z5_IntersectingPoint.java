package Zadaci_22_08_2016;

/**
 * 5.(Geometry: intersecting point) Suppose two line segments intersect. The two
 * endpoints for the first line segment are (x1, y1) and (x2, y2) and for the
 * second line segment are (x3, y3) and (x4, y4). Write a program that prompts
 * the user to enter these four endpoints and displays the intersecting point.
 * As discussed in Programming Exercise 3.25, the intersecting point can be
 * found by solving a linear equation. Use the LinearEquation class in
 * Programming Exercise 9.11 to solve this equation.
 */

public class Z5_IntersectingPoint {

	// create input object
	static java.util.Scanner input = new java.util.Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter four endpoints :");

		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		double x4 = input.nextDouble();
		double y4 = input.nextDouble();

		input.close();

		// use linear equation to get points
		double a = y1 - y2;
		double b = x2 - x1;
		double c = y3 - y4;
		double d = x4 - x3;
		double e = (y1 - y2) * x1 - ((x1 - x2) * y1);
		double f = (y3 - y4) * x3 - ((x3 - x4) * y3);

		// create an object of LinearEquation class
		LinearEquation lin = new LinearEquation(a, b, c, d, e, f);

		// displays result
		if (lin.isSolvable())
			// print coordinats of intersecting points
			System.out.printf("The intersecting point is at: (%.3f, %.3f)",
					lin.getX(), lin.getY());
		else
			System.out.println("The two lines are parallel.");

	}
}
