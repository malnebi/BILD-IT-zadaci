package Zadaci_26_08_2016;

/*Stuff
 * ---------
 * -title : String
 * 
 * */
public class Stuff extends Employee {
	/** string data field */
	private String title;

	/** A no-arg constructor creates a default triangle. */
	public Stuff() {
		title = "title";
	}

	/**
	 * A constructor creates a stuff with the specified title.
	 */
	public Stuff(String title) {
		this.setTitle(title);
	}

	/** The accessor and mutator methods for data field. */
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * An overriden method named toString() that returns a string description
	 * for the stuff
	 */

	@Override
	public String toString() {
		return "\nStuff" + super.toString() + "Title=" + title;
	}

}
