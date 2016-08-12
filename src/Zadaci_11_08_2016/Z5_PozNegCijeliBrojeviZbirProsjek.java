package Zadaci_11_08_2016;

import java.util.InputMismatchException;

/**
 * Program ucitava neodredjen broj cijelih brojeva, ispisuje broj pozitivnih i
 * negativnih te izracunava ukupnu sumu i prosjek svih unesenih brojeva.
 * (Korisnik prekida unos tako što unese nulu). Na primjer, ukoliko korisnik
 * unese 1 2 -1 3 0 program treba da ispiše da je broj pozitivnih brojeva 3,
 * negativnih brojeva 1, suma ili zbir su 5.0 a prosjek svih brojeva je 1.25.
 */
public class Z5_PozNegCijeliBrojeviZbirProsjek {

	static java.util.Scanner input = new java.util.Scanner(System.in);

	public static void main(String[] args) {

		// poruka korisniku
		System.out.println("Unesite cijele brojeve (0 prekida unos): ");

		// pocetne vrijednosti varijabli
		int poz = 0;
		int neg = 0;
		int sum = 0;
		int num = 0;

		do { // petlja se izvrsava bar jedanput

			num = checkInput(); // unos sa provjerom

			sum = sum + num;

			if (num > 0) { // brojanje pozitivnih
				poz++;
			} else if (num < 0) { // brojanje negativnih
				neg++;
			}

		} while (num != 0); // uslov za prekid unosa

		input.close();

		if (sum == 0) // ako je unesena samo 0
			System.out.println("Unesena je samo 0.");
		else {
			// prosjek
			double averrage = sum / (neg + poz);

			// ispis poruka sa rezultatima
			System.out.println("Broj pozitivnih brojeva : " + poz);
			System.out.println("Broj negativnih brojeva : " + neg);
			System.out.println("Zbir : " + sum);
			System.out.printf("Prosjek : %.2f", averrage);
		}
	}

	/** provjera unosa */
	public static int checkInput() {
		int num = 0;
		boolean error = true; // provjera greske

		do {
			try {
				num = input.nextInt(); // ukoliko se ne unese cijeli broj
				error = false; // pokrenuce se exception

			} catch (InputMismatchException e) {
				System.out.print("Wrong input, try again:  ");
				input.nextLine();
			}
			// petlja se izvrsava dok postoji greska
		} while (error);

		return num;
	}
}
