package Zadaci_08_08_2016;

import java.util.Scanner;

/**
 * Napisati program koji ispisuje tri nasumièna cijela broja te pita korisnika
 * da unese njihov zbir. Ukoliko korisnik pogriješi, program ispisuje pitanje
 * ponovo sve sa porukom da pokuša ponovo. Ukoliko korisnik unese taèan odgovor,
 * program mu èestita i završava sa radom.
 * 
 */
public class Z1_ZbirTriBroja {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		// kontrolna varijabla
		boolean incorrect = true;
		// nasumicni brojevi
		int num1 = (int) (Math.random() * 10);
		int num2 = (int) (Math.random() * 10);
		int num3 = (int) (Math.random() * 10);
		// petlja se izvrsava bar jedanput bez obzira na uslov
		do {
			// ispis pitanja korisniku
			System.out.println("Koliko je " + num1 + " + " + num2 + " + "
					+ num3 + " ? ");
			// korisnikov unos i rezultat
			int sumUser = input.nextInt();
			int result = num1 + num2 + num3;
			// provjera uslova da su rezultat i korisnikov uslov jednaki
			if (sumUser != result) {
				System.out.println("Netacan odgovor! Pokusajte ponovo.");
			} else {
				System.out.println("Cestitamo! Dali ste tacan odgovor.");
				System.exit(1); // program prestaje kada se da tacan odgovor
			}
			// petlja se ponavlja sve dok kontrolna varijabla ima vrijednost
			// true
		} while (incorrect);

		input.close();

	}
}
