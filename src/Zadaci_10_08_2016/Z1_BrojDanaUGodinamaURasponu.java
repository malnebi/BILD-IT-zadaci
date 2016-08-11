package Zadaci_10_08_2016;

import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * Metoda: public static int numberOfDayInAYear(int year), vraca broj dana u
 * godini. Korisnik unosi pocetnu i krajnju godinu a program ispisuje broj dana
 * za svaku godinu u rasponu.
 */
public class Z1_BrojDanaUGodinamaURasponu {

	public static void main(String[] args) {

		// kreiranje scannera
		Scanner input = new Scanner(System.in);

		// poruka korisniku i unos
		System.out.println("Unesite pocetnu i krajnju godinu:");

		int startYear = input.nextInt();
		int endYear = input.nextInt();

		input.close();

		GregorianCalendar calendar = new GregorianCalendar();

		// dobijanje trenutne godine za ternarni operator u ispisu
		int presentYear = calendar.get(GregorianCalendar.YEAR);

		for (int i = startYear; i <= endYear; i++) {

			// ispis rezultata
			System.out.println("U " + i + ". godini "
					+ (i < presentYear ? " bilo je " : " bice ")
					+ numberOfDayInAYear(i) + " dana.");
		}

	}

	// metoda koja vraca broj dana u godini
	public static int numberOfDayInAYear(int year) {

		if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
			return 366;
		else
			return 365;
	}

}
