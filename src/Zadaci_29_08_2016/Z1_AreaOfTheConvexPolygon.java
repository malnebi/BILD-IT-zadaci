package Zadaci_29_08_2016;

import java.util.ArrayList;

/**
 * 1. 11.15 (Area of a convex polygon) A polygon is convex if it contains any
 * line segments that connects two points of the polygon. Program prompts the
 * user to enter the number of points in a convex polygon, then enter the points
 * clockwise, and display the area of the polygon. Here is a sample run of the
 * program:
 */
// Enter the number of the points: 7
// Enter the coordinates of the points:
// -12 0 -8.5 10 0 11.4 5.5 7.8 6 -5.5 0 -7 -3.5 -3.5
// The total area is 250.075

// Enter the number of the points: 4
// Enter the coordinates of the points:
// 2 2 4 10 9 7 11 2
// The total area is 45.5

public class Z1_AreaOfTheConvexPolygon {

	static java.util.Scanner input = new java.util.Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter the number of the points:");
		// entering number of points
		int numberOfPoints = input.nextInt();

		// create matrix to put coordinates
		double[][] points = new double[numberOfPoints][2];

		System.out.println("Enter coordinates of the points: ");
		// entering coordinates
		for (int i = 0; i < points.length; i++) {
			for (int j = 0; j < points[i].length; j++) {
				points[i][j] = input.nextDouble();
			}
		}
		input.close();

		// Enter the coordinates of the points:
		// -12 0 -8.5 10 0 11.4 5.5 7.8 6 -5.5 0 -7 -3.5 -3.5
		// The total area is 232.57500

		// print result
		System.out.println("The total area is " + polygonArea(points));

	}

	/**
	 * method returns an area of the polygon based on coordinates of the points
	 */
	public static double polygonArea(double[][] points) {
		// list for x coordinates
		ArrayList<Double> x = new ArrayList<Double>();
		// list for y coordinates
		ArrayList<Double> y = new ArrayList<Double>();
		// from 2D array put coordinates in two arrays
		for (int k = 0; k < points.length; k++) {
			x.add(points[k][0]);
			y.add(points[k][1]);

		}
		double sum = 0;
		// formula for Area = 1/2|(x1*y2 - y1*x2)+(x2*y3 - y2*x3)+...+(xn*y1-
		// yn*x1)|
		for (int i = 0; i < x.size(); i++) {
			if (i == x.size() - 1) { // for last part of the formula
				sum += (x.get(i) * y.get(0) - y.get(i) * x.get(0));
			} else {
				sum += (x.get(i) * y.get(i + 1) - y.get(i) * x.get(i + 1));
			}
		}
		return Math.abs(sum / 2);

	}
	// primjer za 4 tacke:
	// 2 2 4 10 9 7 11 2
	// trebate dobiti 45.5

}
