package Zadaci_06_08_2016;

import java.util.InputMismatchException;

/**
 * Program ispisuje sve prestupne godine, 10 po liniji, u rasponu koji korisnik
 * unese. Razmak izmedju godina jedan space.
 */
public class Z2_PrestupneGodine {

	static java.util.Scanner input = new java.util.Scanner(System.in);

	public static void main(String args[]) {
		System.out.println("Unesite pocetnu godinu: ");
		int startY = checkInput();
		System.out.println("Unesite krajnju godinu: ");
		int endY = checkInput();

		int year = startY;
		// brojac za kontrolu rasporeda 10 brojeva po redu
		int i = 0;
		final int NUMBERS_IN_A_ROW = 10;
		// brojac prestupnih godina
		int counter = 0;

		while (year < endY) {
			// provjera da li je godina prestupna
			if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
				i++;
				// uslov za ispis 10 godina u jednom redu
				if (i % NUMBERS_IN_A_ROW == 0) {
					System.out.println(year);
					counter++;
				} else {
					System.out.print(year + " ");
					counter++;
				}
			}
			year++;
		}
		System.out.println();
		System.out.println("Izmedju " + startY + ". i " + endY + ". godine "
				+ (endY < 2016 ? "bilo je " : "bice ") + counter
				+ " prestupnih godina."); 
	}

	/** metoda provjerava unos pomocu exceptiona*/
	public static int checkInput() {
		int number = 0;
		boolean error = true; // varijabla za provjeru
		do {
			try {
				number = input.nextInt();
				error = false;
			} catch (InputMismatchException e) {
				System.out.print("Nevalidan unos, pokusajte ponovo:  ");
				input.nextLine();
			}
		} while (error);
		return number;
	}
}
