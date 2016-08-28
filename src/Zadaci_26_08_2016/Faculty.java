package Zadaci_26_08_2016;

/*Faculty
 * ----------
 * -officeHours: int
 * -rank: int
 * 
 */
public class Faculty extends Employee {
	// int data fields named officeHours and rank to denote employees office
	// hours and ranking

	private int officeHours;
	private int rank;

	// A no-arg constructor that creates a default faculty.
	public Faculty() {
		this(8, 23);
	}

	// A constructor that creates a faculty with the specified officeHours and
	// rank
	public Faculty(int officeHours, int rank) {
		this.officeHours = officeHours;
		this.rank = rank;
	}

	// The accessor and mutator methods for all three data fields.
	public int getOfficeHours() {
		return officeHours;
	}

	public void setOfficeHours(int officeHours) {
		this.officeHours = officeHours;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	// An overriden method toString() that returns a string description for the
	// faculty.
	@Override
	public String toString() {
		return super.toString() + "\nFaculty_fromEmployee [officeHours="
				+ officeHours + ", rank=" + rank + "]";
	}

}
