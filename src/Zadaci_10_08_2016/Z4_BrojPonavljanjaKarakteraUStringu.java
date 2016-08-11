package Zadaci_10_08_2016;

import java.util.Scanner;

/**
 * Metoda: public static int count(String str, char a), pronalazi broj
 * ponavljanja odreðenog karaktera u stringu. Program pita korisnika da unese
 * string i koji karakter zeli da prebroji u datom stringu i ispise mu koliko se
 * puta odredeni karakter ponovio u zadatom stringu.
 */
public class Z4_BrojPonavljanjaKarakteraUStringu {

	public static void main(String[] args) {
		// kreirane scanner objekta za unos
		Scanner input = new Scanner(System.in);

		// poruke korisniku da unese strig i karakter i unos
		System.out.println("Unesite string: ");
		String str = input.nextLine();

		System.out.println("Unesite karakter koji zelite da prebrojite: ");
		char ch = input.nextLine().charAt(0);

		input.close();

		// ispis poruke sa rezultatom
		System.out.println("Karakter " + ch + " se ponovio " + count(str, ch)
				+ " puta.");
	}

	/** metoda za racunanje broja ponavljanja karaktera u stringu */
	public static int count(String str, char a) {

		// brojac ponavljanja karaktera
		int num = 0;

		// prolaz kroz string karakter po karakter
		for (int i = 0; i <= str.length() - 1; i++) {

			if (str.charAt(i) == a)// karakter stringa jednak zadatom karakteru
				num++; // uvecanje brojaca
		}
		return num; 
	}

}
