package Zadaci_26_08_2016;

/**
 * 2. 11.2 (The Person, Student, Employee, Faculty, and Staff classes) Design a
 * class named Person and its two subclasses named Student and Employee. Make
 * Faculty and Staff subclasses of Employee. A person has a name, address, phone
 * number, and email address. A student has a class status (freshman, sophomore,
 * junior, or senior). Define the status as a constant. An employee has an
 * office, salary, and date hired. Use the MyDate class defined in Programming
 * Exercise 10.14 to create an object for date hired. A faculty member has
 * office hours and a rank. A staff member has a title. Override the toString
 * method in each class to display the class name and the person�s name.****
 * **Draw the UML diagram for the classes and implement them. ****************
 * **Write a test program that creates a Person, Student, Employee, Faculty, and
 * Staff, and invokes their toString() methods.
 */
public class Z2_TestPersonStudentFacultyStuff {

	public static void main(String[] args) {

		Person p = new Person("Ranka Radic", "Vrsacka, 12", "066/123-123",
				"ranka@live.com");
		System.out.println(p.toString());

		Student s = new Student("Natasa Talic", "Vozdovacka, 52",
				"065/236-541", "nata@live.com");
		System.out.println(s.toString());

		Employee e = new Employee("Hemofarm", 10000);
		System.out.println(e.toString());

		Faculty f = new Faculty(); // create an object with default values for
									// class Faculty
		System.out.println(f.toString());

		Stuff st = new Stuff("Menager");

		System.out.println(st.toString());

	}

}
