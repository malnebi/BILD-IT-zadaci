package Zadaci_26_08_2016;

/*Employee
 * ---------
 * -office: String
 * salary: double
 * -dateHired: MyDate
 * 
 * **/
public class Employee extends Person {
	/** data fields */
	private String office;
	private double salary;

	/** A no-arg constructor that creates a default employee. */
	public Employee() {
		office = "Office";
		salary = 1290.00;
	}

	/** A constructor that creates an employee with the specified office, salary */
	public Employee(String office, double salary) {
		this.office = office;
		this.salary = salary;
	}

	/** The accessor and mutator methods for data fields. */
	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	/**
	 * An overriden method named toString() returns a string description for the
	 * employee
	 */
	@Override
	public String toString() {
		return "\nEmployee " + super.toString() + "Office = " + office
				+ ", Salary=" + salary + "";
	}

}
