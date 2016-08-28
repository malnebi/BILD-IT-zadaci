package Zadaci_26_08_2016;

/** class is blueprint for geometric objects any kind */

public class GeometricObject {

	// private fields co
	private String color = "white"; // default color
	private boolean filled = false;
	private java.util.Date dateCreated;

	public GeometricObject() {
		dateCreated = new java.util.Date();
	}

	public GeometricObject(String color) {
		dateCreated = new java.util.Date();
		this.color = color;
	}

	public java.util.Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(java.util.Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	public String toString() {
		return "color is" + color + "\nCreation date is" + dateCreated;
	}
}
