package Zadaci_16_08_2016;

import java.util.InputMismatchException;

/**
 * 5. Program ispisuje piramidu brojeva do broja kojeg unese korisnik. (Na
 * primjer, ukoliko korisnik unese 7 vrh piramide je broj 1, red ispod vrha
 * piramide je 2 1 2, red ispod je 3 2 1 2 3, red ispod 4 3 2 1 2 3 4 itd.)
 */
public class Z5_PiramidaCijelihBrojeva {
	static java.util.Scanner input = new java.util.Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Unesite cijeli broj :");
		int num = input.nextInt();
		input.close();

		// spoljasnja petlja sluzi za broj redova
		for (int i = 0; i < num; i++) {
			// unutrasnjim petljama dobijamo praznine, lijevu i desnu stranu
			// piramide
			// prva unutrasnja petlja ostavlja prazna mjesta
			for (int j = 0; j < num - i; j++) {
				System.out.print(" ");
			}
			// ispis brojeva lijeve strane: od veceg ka manjem
			for (int j = i; j > 0; j--) {// prvi broj ispisa jednak broju reda
				System.out.print(j + 1);
			}
			// ispis brojeva desne strane: od manjeg ka vecem
			for (int j = 0; j < i + 1; j++) {// posljednji broj ispisa
				System.out.print(j + 1);
			}
			System.out.println(); // prelazak u novi red poslije ispisa reda
		}
	}

	public static int checkInput() {

		int num = 0;
		boolean error = true; // provjera greske

		do {
			try {
				num = input.nextInt();
				if (num < 1)
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
