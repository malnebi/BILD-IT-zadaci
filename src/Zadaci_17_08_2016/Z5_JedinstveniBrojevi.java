package Zadaci_17_08_2016;

import java.util.InputMismatchException;

/**
 * 5. Program ucitava 10 brojeva te ispisuje koliko je jedinstvenih brojeva
 * uneseno i sve ih ispisuje razmaknute jednim spaceom. Ukoliko se neki broj
 * pojavljuje vise puta, ispisuje se samo jednom.
 */
public class Z5_JedinstveniBrojevi {
	static java.util.Scanner input = new java.util.Scanner(System.in);

	public static void main(String[] args) {

		// poruka korisniku za unos
		System.out.println("Unesite 10 cijelih brojeva: ");

		// kreiranje niza
		int[] array = new int[10];

		for (int i = 0; i < array.length; i++) {
			array[i] = checkInput(); // unos uz provjeru
		}

		// ispis
		System.out.println("Jedinstveni brojevi su: ");

		int count = 0; // brojac jedinstvenih brojeva
		// provjera jedistvenih brojeva
		for (int i = 0; i < array.length; i++) {
			boolean unique = true;

			// petlja ide od pocetka do trenutno unesenog broja i provjerava da
			// li broj vec postoji u nizu
			for (int j = 0; j < i; j++) {
				// ako broj vec postoji u nizu
				if (array[i] == array[j]) {
					unique = false; // broj nije jedinstven
					break; // izlazi iz petlje
				}
			}
			// ako je broj jedinstven, ispisuje ga i povecava brojac
			if (unique) {
				System.out.print(array[i] + " ");
				count++;
			}
		}
		// ispis broja jedinstvenih brojeva
		System.out.println("\nU unesenom nizu je : " + count
				+ " jedinstevnih brojeva.");

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
