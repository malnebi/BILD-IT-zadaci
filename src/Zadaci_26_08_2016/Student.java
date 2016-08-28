package Zadaci_26_08_2016;

/**
 * Student_fromPerson ----------- -class Status: String ---------------
 * Student_fromPerson
 * */
public class Student extends Person {
	/** data fields */
	final static String CLASS_STATUS_1 = "Freshman";
	final static String CLASS_STATUS_2 = "Sophomore";
	final static String CLASS_STATUS_3 = "Junior";
	final static String CLASS_STATUS_4 = "Senior";
	private String status;

	/** A no-arg constructor creates a default student */
	public Student() {

	}

	/**
	 * A constructor creates a student with the specified name, addres,
	 * phoneNum, eMail and status
	 */
	public Student(String name, String addres, String phoneNum, String eMail) {
		super(name, addres, phoneNum, eMail); // calling on its super class
												// constructor for those fields
	}

	/** The accessor and mutator methods for all three data fields. */
	public String getClassStatus() {
		return status;
	}

	public void setClassStatus(String status) {
		this.status = status;
	}

	/**
	 * An overriden method toString() returns a string description for the
	 * student.
	 */

	@Override
	public String toString() {
		return "\nStudent " + super.toString() + " Class status = " + status;
	}

}
