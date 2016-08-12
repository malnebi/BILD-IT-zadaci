package Zadaci_11_08_2016;

import java.util.Scanner;

/**
 * 4. Napisati program koji pita korisnika da unese broj minuta (npr. 1
 * milijardu) te ispiše korisniku koliko je to u godinama i danima. Zbog
 * jednostavnosti, pretpostavimo da godina ima 365 dana.
 */
public class Z4_BrojGodina_I_Dana_U_Minutima {

	public static void main(String[] args) {
		// kreiranje Scannera, poruka korisniku i unos
		Scanner unos = new Scanner(System.in);
		System.out.print("Unesite broj minuta (npr. milijardu): ");
		long minute = unos.nextLong();

		// racunanje godina i dana
		double godine = minute / 60 / 24 / 365;
		double dani = (minute / 60 / 24) % godine;

		// ispis rezultata
		System.out.print(minute + " minuta je približno " + godine
				+ " godina i " + dani + " dana.");
		
		// zatvaranje Scannera
		unos.close();
	}

}
