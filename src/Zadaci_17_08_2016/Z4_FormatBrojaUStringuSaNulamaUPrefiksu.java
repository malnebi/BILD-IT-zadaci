package Zadaci_17_08_2016;

import java.util.InputMismatchException;

/**
 * 4. Metoda : public static String format(int number, int width) vraca string
 * broja sa prefiksom od jedne ili vise nula. Velicina stringa je width
 * argument. Na primjer, ukoliko pozovemo metodu format(34, 4) vraca 0034;
 * format(34, 5) vraca 00034. Ukoliko je uneseni broj veci nego width argument,
 * metoda vraca samo string broja. Npr. format(34, 1) vraca 34.
 * */
public class Z4_FormatBrojaUStringuSaNulamaUPrefiksu {

	static java.util.Scanner input = new java.util.Scanner(System.in);

	public static void main(String[] args) {

		// poruke korisniku i unos
		System.out.print("Unesite broj: ");
		int number = checkInput(); // unos broja uz provjeru

		System.out.print("Unesite sirinu stringa : ");
		int width = checkInput(); // unos sirine ispisa

		// ako je unos manji od 0, unos se ponavlja
		while (width < 0) {
			System.out
					.print("Sirina ispisa ne moze biti negativan broj. Pokusajte ponovo: ");
			width = checkInput();
		}

		// ispis rezultata
		System.out.println("Ispis: " + format(number, width));

	}

	/** meroda za vracanje broja u string formatu sa nulama u prefiksu */
	public static String format(int number, int width) {

		// pretvaranje broja u string
		String numStr = String.valueOf(number);

		// kreiranje novog stringa
		String str = "";

		char zero = '0';

		// broj nula u stringu
		int numOfZeroes = width - numStr.length();

		// dodavanje nula u novi string
		for (int i = 0; i < numOfZeroes; i++) {
			str = str + zero;
		}
		// dodavanje string broja na nule
		str = str + numStr;

		return str;
	}

	// provjera unosa
	public static int checkInput() {
		int num = 0;
		boolean error = true; // provjera greske

		do {
			try {
				num = input.nextInt();
				error = false;

			} catch (InputMismatchException e) {
				System.out.print("Pogresan unos, pokusajte ponovo: ");
				input.nextLine();
			}
			// petlja se izvrsava dok postoji greska
		} while (error);

		return num;
	}
}
