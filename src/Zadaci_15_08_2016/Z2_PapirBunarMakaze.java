package Zadaci_15_08_2016;

import java.util.Scanner;

/**
 * 2. Program igra sa protivnikom rock-paper-scissors. (papir-bunar-makaze)
 * Program nasumicno generise brojeve 0, 1 i 2 koji predstavljaju papir, bunar i
 * makaze. Program pita korisnika da unese 0, 1 ili 2 te mu ispisuje poruku o
 * pobjedi racunara ili korisnika.
 */
public class Z2_PapirBunarMakaze {

	public static void main(String[] args) {

		// kreiranje Scanner objekta, poruka korisniku i unos
		Scanner input = new Scanner(System.in);
		System.out.print("Unesite 0 (makaze), 1 (papir), 2 (bunar): ");
		int user = input.nextInt();

		input.close();

		// generisanje nasumicnog broja 0, 1 ili 2 koji predstavlja znak
		// racunara
		int comp = (int) (Math.random() * 3);

		// ako su racunar i korisnik odabrali isti znak
		if (comp == user) {
			// ispis poruku da je nerijeseno zavisno od izabranog znaka

			switch (comp) { // switch na osnovu izbor racunara

			case 0: // makaze
				System.out
						.println("I vi i racunar ste izabrali makaze. \nNerijeseno.");
				break;
			case 1: // papir
				System.out
						.println("I vi i racunar ste izabrali papir. \nNerijeseno.");
				break;
			case 2: // bunar
				System.out
						.println("I vi i racunar ste izabrali bunar. \nNerijeseno.");
				break;
			}
		} else { // ako su izabrali razlicite znakove, utvrditi pobjednika i
					// ispisati poruku

			switch (user) { // switch na osnovu izbora korisnika

			case 0: // korisnik bira makaze
				if (comp == 1) { // racunar - papir, korisnika pobjedjuje
					System.out
							.println("Izabrali ste makaze. Racunar je izabrao papir. \nVasa pobjeda!");

				} else if (comp == 2) { // racunar - bunar, korisnik gubi
					System.out
							.println("Izabrali ste makaze. Racunar je izabrao bunar. \nRacunar je pobijedio.");
				}
				break;

			case 1: // ako korisnik bira papir
				if (comp == 0) { // racunar - makaze, korisnik gubi
					System.out
							.println("Izabrali ste papir. Racunar je izabrao makaze. \nRacunar je pobijedio.");
				} else if (comp == 2) { // racunar - bunar, korisnik pobjedjuje
					System.out
							.println("Izabrali ste papir. Racunar je izabrao bunar. \nVasa pobjeda!");
				}
				break;
			case 2: // ako korisnik bira bunar
				if (comp == 0) { // racunar - makaze, korisnik pobjedjuje
					System.out
							.println("Izabrali ste bunar. Racunar je izabrao makaze. \nVasa pobjeda!");
				} else if (comp == 1) { // racunar - papir, korisnik gubi
					System.out
							.println("Izabrali ste bunar. Racunar je izabrao papir. \nRacunar je pobjedio.");
				}
				break;
			}
		}
	}

}
