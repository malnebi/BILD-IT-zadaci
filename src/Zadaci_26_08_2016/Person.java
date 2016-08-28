package Zadaci_26_08_2016;

/**
 * Person --------- -name: String -addres: String -phonNum: String -email:
 * String ------------------- Person() Person(name: String, addres: String,
 * phonNum: String, e-mail: String)
 * */

public class Person {
	/** string data fields */
	private String name;
	private String addres;
	private String phoneNum;
	private String eMail;

	/** A no-arg constructor creates a default person */
	Person() {
		this("Osoba", "Adresa", "066/235/123", "mail@mail.com");
	}

	/**
	 * A constructor creates a person with the specified name, addres, phoneNum,
	 * and eMail.
	 */
	Person(String name, String addres, String phoneNum, String eMail) {
		this.name = name;
		this.addres = addres;
		this.phoneNum = phoneNum;
		this.eMail = eMail;
	}

	/** the accessor and mutator metods for data fields */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddres() {
		return addres;
	}

	public void setAddres(String addres) {
		this.addres = addres;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getEMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	/**
	 * An overriden method toString() returns a string description for the
	 * person.
	 */

	@Override
	public String toString() {
		return "Name = " + name + ", Addres = " + addres + ", Phone Number = "
				+ phoneNum + ", eMail = " + eMail;
	}

}
