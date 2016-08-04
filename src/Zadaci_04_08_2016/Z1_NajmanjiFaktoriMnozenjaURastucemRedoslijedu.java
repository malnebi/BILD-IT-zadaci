package Zadaci_04_08_2016;

import java.util.Scanner;

public class Z1_NajmanjiFaktoriMnozenjaURastucemRedoslijedu {
	/**
	 * * Program pita korisnika da unese neki cijeli broj i ispisuje njegove
	 * najmanje faktore u rastuæem redosljedu. Npr, ukoliko korisnik unese 120
	 * program treba da ispiše 2, 2, 2, 3, 5. (2 * 2 * 2 * 3 * 5 = 120)
	 */
	public static void main(String[] args) {

		// Kreiranje scannera za unos sa konzole
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite cijeli broj: ");
		int num = input.nextInt();
		input.close();

		// dijeljenje broja do najmanjih jedinica

		int result = 0;
		int number = num; //
		int i = 2;

		System.out.println("Najmanji faktori mnozenja broja "+ number + " su: ");
		while (i < number) {
			// ukoliko je dijeljenik (num) djeljiv sa djeliocem (i) djelilac se
			// ispisuje, a rezultat postaje novi dijeljenik
			if (num % i == 0) {
				result = num / i;
				System.out.print(i + (result == 1 ? ". " : ", ")); // ispis
				num = result;

			} else
				i++;// djelilac se uvecava za 1 ukoliko se broj ne moze
					// podijeliti bez ostatka
		}
	}

}
