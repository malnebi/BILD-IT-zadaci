package Zadaci_08_08_2016;

import java.util.Scanner;

/**
 * Neke web stranice forsiraju odredjena pravila za passworde. Napisati metodu
 * koja provjerava da li je unijeti string validan password. Pravila da bi
 * password bio validan su sljedeca: 1. Password mora biti sacinjen od najmanje
 * 8 karaktera. 2. Password smije da se sastoji samo od slova i brojeva. 3.
 * Password mora sadrzati najmanje 2 broja. Napisati program koji pita korisnika
 * da unese password te mu ispisuje "password je validan" ukoliko su sva pravila
 * ispostovana ili "password nije validan" ukoliko pravila nisu ispostovana.
 */
public class Z5_Password {

	public static void main(String[] args) {

		// kreiranje scannera
		Scanner input = new Scanner(System.in);

		// kontrolna varijabla za izvrsavanje petlje
		boolean isInvalid = true;

		do {
			// ispis poruke korisniku i unos
			System.out.println("Enter password: ");
			String password = input.nextLine();

			// provjeravanje uslova pozivanjem metode
			if (passWord(password) == true) {

				System.out.println("Password is valid.");
				System.exit(0); // izlazak iz programa ukoliko je sifra validna

			} else {

				isInvalid = true; // sifra nije validna, unos se ponavlja
				System.out.println("Password is invalid! Please try again.");
			}

			// petlja se ponavlja dok je sifra nevalidna
		} while (isInvalid);

		input.close();
	}

	/** metoda koja potvrdjuje validnost sifre */

	public static boolean passWord(String s) {

		// uslov za sadrzaj sifre
		boolean condition = true;

		// kontrolna varijabla za brojeve u sifri
		int counter = 0;

		for (int i = 0; i < s.length(); i++) {

			// provjerava da li su uneseni samo brojevi i slova
			condition = Character.isLetterOrDigit(s.charAt(i));

			// brojanje brojeva u skladu sa uslovom
			if (Character.isDigit(s.charAt(i))) {
				counter++;
			}
		}
		// provjeravanje uslova i vracanje vrijednosti true ili false
		if (s.length() >= 8 && condition && counter >= 2) {

			return true;

		} else {

			return false;
		}

	}
}