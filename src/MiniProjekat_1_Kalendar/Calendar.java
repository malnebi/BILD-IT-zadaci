package MiniProjekat_1_Kalendar;

public class Calendar {

	private int year;
	private int month;

	public Calendar(int year, int month) {
		this.year = year;
		this.month = month;
	}

	/** ispis kalendara */

	public void printMonth(int year, int month) {

		System.out.println("*****************************");
		printMonthTitle();
		printMonthBody();
		System.out.println();
		System.out.println("*****************************");
	}

	/** ispis naslova kalendara */

	public void printMonthTitle() {
		System.out.println("       " + getMonthName(month) + " " + year
				+ "         ");
		System.out.println("______________________________");
		System.out.println(" Sun Mon Tus Wed Thu Fry Sat ");

	}

	/** nazivi mjeseci */

	public static String getMonthName(int month) {
		String monthName = "";
		switch (month) {
		case 1:
			monthName = "January";
			break;
		case 2:
			monthName = "February";
			break;
		case 3:
			monthName = "Mart";
			break;
		case 4:
			monthName = "April";
			break;
		case 5:
			monthName = "May";
			break;
		case 6:
			monthName = "Jun";
			break;
		case 7:
			monthName = "July";
			break;
		case 8:
			monthName = "Avgust";
			break;
		case 9:
			monthName = "September";
			break;
		case 10:
			monthName = "Oktober";
			break;
		case 11:
			monthName = "November";
			break;
		case 12:
			monthName = "December";
			break;
		}
		return monthName;
	}

	/** ispis tijela kalendara */

	public void printMonthBody() {

		// prvi dan u mjesecu
		int startDay = getStartDay();

		// broj dana u mjesecu
		int numberOfDaysInMonth = getNumberOfDaysInMonth(year, month);

		// prazna mjesta prije prvog dana u mjesecu
		int i = 0;
		for (i = 1; i < startDay; i++) {
			System.out.print("    ");
		}
		for (i = 1; i <= numberOfDaysInMonth; i++) {
			System.out.printf("%4d", i);
			// prelazak u novi red
			if ((i + startDay - 1) % 7 == 0) {
				System.out.println();
			}
		}
	}

	/** racunanje prvog dana u mjesecu */

	public int getStartDay() {

		int totalDays = 0;
		// broj dana nakon ove godine
		for (int i = 1800; i < year; i++) {
			if (isLeapYear(i)) {
				totalDays += 366;
			} else
				totalDays += 365;
		}
		// broj dana u ovoj godini nakod unesenog mjeseca
		for (int i = 1; i < month; i++) {
			totalDays += getNumberOfDaysInMonth(i, year);
		}
		// ukupan broj dana + 3 dana za prvi dan 1800 (srijeda) + 1
		// jer ovaj kalendar pocinje od nedjelje
		return (totalDays + 4) % 7;
	}

	/** ukupan broj dana */

	public int getTotalNumberOfDays(int year, int month) {

		int total = 0;
		// ukupan broj dana od 1800 do 1/1/oznacene godine
		for (int i = 1800; i < year; i++)
			if (isLeapYear(i)) // year
				total = total + 366;
			else
				total = total + 365; // *

		// dodaje dane od Jan do izabranog mjeseca u kalendar
		for (int i = 1; i < month; i++)
			total = total + getNumberOfDaysInMonth(year, i);

		return total;
	}

	/** metoda za broj dana u mjesecu */
	public int getNumberOfDaysInMonth(int year, int month) {

		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8
				|| month == 10 || month == 12)
			return 31;
		if (month == 4 || month == 6 || month == 9 || month == 11)
			return 30;
		if (month == 2)
			return isLeapYear(year) ? 29 : 28; // ako je godina prestupna 28
												// dana, 29 ako nije
		return 0; // ako je unos za mjesec netacan (nijedan od ponudjenih)
	}

	/** provjera da li je godina prestupna */
	public boolean isLeapYear(int year) {

		if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
			return true;
		else
			return false;
	}

}
