package Zadaci_22_08_2016;

/*1.(The Fan class) Design a class named Fan to represent a fan. The class contains:*/
//
// Three constants named SLOW, MEDIUM, and FAST with the values 1, 2, and 3 to
//denote the fan speed.
// A private int data field named speed that specifies the speed of the fan (the
// default is SLOW).
// A private boolean data field named on that specifies whether the fan is on
// (the default is false).
// A private double data field named radius that specifies the radius of the fan
// (the default is 5).
// A string data field named color that specifies the color of the fan (the
// default is blue).
// The accessor and mutator methods for all four data fields.
// A no-arg constructor that creates a default fan.
/*
 * A method named toString() that returns a string description for the fan. If
 * the fan is on, the method returns the fan speed, color, and radius in one
 * combined string. If the fan is not on, the method returns the fan color and
 * radius along with the string “fan is off” in one combined string.
 */
/*
 * Draw the UML diagram for the class and then implement the class. Write a test
 * program that creates two Fan objects. Assign maximum speed, radius 10, color
 * yellow, and turn it on to the first object. Assign medium speed, radius 5,
 * color blue, and turn it off to the second object. Display the objects by
 * invoking their toString method.
 */
class Fan {
	// desired fields
	private static final int SLOW = 1;
	private int speed = SLOW;
	private boolean on;
	private double radius = 5;
	String color = "blue";

	Fan() {

	}

	// setters and getters for private data fields
	void setSpeed(int newSpeed) {
		speed = newSpeed;
	}

	int getSpeed() {
		return speed;
	}

	void isOn(boolean newOn) {
		on = newOn;
	}

	boolean getOn() {
		return on;
	}

	void setRadius(double newRadius) {
		radius = newRadius;
	}

	double getRadius() {
		return radius;
	}

	void setColor(String newColor) {
		color = newColor;
	}

	String getColor() {
		return color;
	}

	// toString method displays fan status
	public String toString() {
		if (getOn()) // if fan is on, print speed, color and radius
			return "The fan is on. The Speed is " + getSpeed() + ", color is "
					+ getColor() + ", radius is " + getRadius();

		else
			// if fan is off we can see color and radius without speed
			return "The fan is off.  Color is " + getColor() + ", radius is "
					+ getRadius();
	}

}

public class Z1_Fan {

	private static final int MEDIUM = 2;
	private static final int FAST = 3;

	public static void main(String[] args) {

		// create Funs objects (fan1, fan2)
		Fan fan1 = new Fan();
		Fan fan2 = new Fan();

		// applay the methods on Funs objects (fan1, fan2)
		fan1.isOn(true);
		fan1.setSpeed(FAST);
		fan1.setColor("yellow");
		fan1.setRadius(10);

		// print status of fan1
		System.out.println(fan1.toString());

		fan2.isOn(false);
		fan2.setSpeed(MEDIUM);
		fan2.setColor("blue");
		fan2.setRadius(5);

		// print status of fan2
		System.out.println(fan2.toString());

	}
}
