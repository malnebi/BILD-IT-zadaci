package Zadaci_17_08_2016;

import java.util.InputMismatchException;

/**
 * 1. Program prima ASCII kod (cijeli broj izmeðu 0 i 127 koji unosi korisnik)
 * te ispisuje koji je to karakter. Npr: korisnik unese 69 kao ASCII kod,
 * program mu ispisuje da se karakter E nalazi na toj poziciji u kodu.
 * */
public class Z1_ASCII_Karakteri {
	// kreiranje Scanner objekta za unos sa tastature
	static java.util.Scanner input = new java.util.Scanner(System.in);

	public static void main(String[] args) {

		// poruka korisniku za unos
		System.out
				.println("Za ispis karaktera unesite cijeli broj od 0 do 127: ");

		// unos korisnika uz provjeru
		int num = checkInput();

		// dobijanje karaktera na poziciji koju je unio korisnik
		char ch = (char) num;

		// ispis rezultata
		System.out.println("Na " + num + " poziciji u ASCII kodu nalazi se: "
				+ ch);

	}

	public static int checkInput() {

		int num = 0;
		boolean error = true; // provjera greske

		do {
			try {
				num = input.nextInt();
				if (num < 0 || num >= 127)
					throw new InputMismatchException("Pogresan unos");
				// ako je unos tacan zaustavlja petlju
				error = false;
			} catch (InputMismatchException e) {
				System.out.print("Pogresan unos, unesite ponovo:  ");
				input.nextLine();
			}
		} while (error);

		return num;
	}
}
