package Zadaci_06_08_2016;

import java.util.Scanner;

/**
 * Program pita korisnika da unese neki string te mu ispisuje sve karaktere koji
 * se nalaze na neparnim pozicijama. Na primjer, ako korisnik unese string
 * Beijing Chicago, program vraca BiigCiao.
 */
public class Z4_NeparniKarakteriUStringu {

	public static void main(String[] args) {
		// kreiranje skenera za unos sa tastature
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite string: ");
		String str = input.nextLine();
		// zatvaranje Scannera
		input.close();

		for (int i = 0; i < str.length(); i++) {
			// u Javi, prvi karakter u stringu, nizu ili listi pocinje nulom, pa
			// bi neparne POZICIJE bile 0,2,4,6 itd. iako su to parni brojevi
			if (i % 2 == 0) { // provjera pozicije karaktera
				System.out.print(str.charAt(i)); // ispis karaktera 
			}
		}
	}

}
