package Zadaci_17_08_2016;

import java.util.InputMismatchException;

/**
 * * 3. Program ispisuje svih 16 bita za dati cijeli (short) broj. U javi, short
 * vrijednost se sprema u samo 16 bita. Npr: korisnik unese broj 5 - program
 * ispisuje 0000000000000101
 */
public class Z3_ShortToBinary {

	static java.util.Scanner input = new java.util.Scanner(System.in);

	public static void main(String[] args) {

		// poruka korisniku
		System.out.print("Unesite broj izmedju  -32,768 i - 32,767: ");

		// unos uz provjeru
		short numShort = checkInput();

		// format stringa za ispis, dodavanje vodecih nula
		String numBin = String.format("%16s", Integer.toBinaryString(numShort))
				.replace(' ', '0');

		// ako je broj manji od 0, koristi zadnjih 16 bita broja (metoda
		// Integer.toBinaryString vraca 32 bita za negativan broj))
		if (numShort < 0) {
			numBin = numBin.substring(numBin.length() - 16);
		}// ispis rezultata
		System.out
				.println("Broj " + numShort + " u binarnom obliku: " + numBin);
	}

	/** provjera unosa */
	public static short checkInput() {
		short num = 0;
		boolean error = true; // provjera greske

		do {
			try {
				num = input.nextShort();
				// ukoliko je unos manji od -32,768 ili veci od 32,767, ponovi
				// unos
				if (num < -32768 || num > 32767) {
					throw new InputMismatchException();
				}
				error = false;

			} catch (InputMismatchException e) {
				System.out.print("Pogresan unos, pokusajte ponovo. \n");
				input.nextLine();
			}
		} while (error);// petlja se izvrsava dok postoji greska

		return num;
	}

}
