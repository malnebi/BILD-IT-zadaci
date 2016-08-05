package Zadaci_05_08_2016;

import java.util.Scanner;

/**
 * Program za ispis broja slova u stringu koji unese korisnik.
 * Slova se broje u metodi.
 */
public class Z5_BrojSlovaUStringu {
	public static void main(String[] args) {
		// kreiranje Scannera za unos sa tastature
		Scanner input = new Scanner(System.in);
		System.out.println(" Unesite string:");
		String str = input.nextLine();
		input.close();
		// ispis rezultata i pozivanje metode
		System.out.println("Broj slova u stringu je: " + countLetters(str));
	}

	/** metoda koja broji slova u stringu */
	public static int countLetters(String s) {
		// brojac slova u stringu
		int countLetters = 0;
		// petlja za prolazak kroz string
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			// ako je karakter slovo, brojac se uvecava
			if (Character.isLetter(ch)) {
				countLetters++;
			}
		}
		return countLetters;
	}
}
