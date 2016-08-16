package Zadaci_16_08_2016;

import java.util.Scanner;

/***
 * 2. Napisati program koji pita korisnika da unese neki string te mu ispisuje
 * dužinu tog stringa kao i prvo slovo stringa.
 */
public class Z2_DuzinaPrvoSLovo_Stringa{

	public static void main(String[] args) {

		// kreiranje Scanner objekta, poruka korisniku i unos
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite string: ");
		String str = input.nextLine();
		input.close(); // zatvaranje Scannera

		// ispis poruke
		System.out.println("Duzina stringa : " + str.length());

		// u slucaju da string ne pocinje slovom prolazi kroz petlju
		for (int i = 0; i < str.length(); i++) {

			// ispis prvog nadjenog slova
			if (Character.isLetter(str.charAt(i))) {
				System.out.println("Prvo slovo stringa : " + str.charAt(i));
				break; // izlazak iz petlje
			}
		}
	}
}