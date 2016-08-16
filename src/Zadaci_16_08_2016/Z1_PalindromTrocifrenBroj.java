package Zadaci_16_08_2016;

/***
 * 1. Program provjerava da li je trocifreni broj palindrom. Broj je palindrom
 * ukoliko se cita isto i sa lijeva na desno i sa desna na lijevo npr. 121, 131,
 * itd.
 */
public class Z1_PalindromTrocifrenBroj {
	// kreiranje objekta klase Scanner za unos sa tastature
	static java.util.Scanner input = new java.util.Scanner(System.in);

	public static void main(String[] args) {

		// poruka korisniku i unos
		System.out.println("Unesite cijeli trocifren broj: ");
		int num = checkInput(); // unos sa konzole sa provjerom
		input.close();// zatvaranje scannera

		// provjra broja pozivanjem metode i ispis poruka
		if (isPalindrom(num))
			System.out.println("Broj " + num + " je palindrom.");
		else
			System.out.println("Broj " + num + " nije palindrom.");

	}

	/** metoda provjerava da li je uneseni broj palindrom */
	public static boolean isPalindrom(int num) {

		int dig1 = num / 100; // dobijanje prve cifre
		int dig3 = num % 10; // dobijanje trece cifre

		if (dig1 == dig3)// ako su prva i treca cifra iste
			return true; // vraca true
		else
			return false;

	}

	/** provjera unosa */
	public static int checkInput() {
		int num = 0;
		boolean error = true; // provjera greske

		do {
			try {
				num = input.nextInt();
				// broj mora biti pozitivan i trocifren
				if (num < 0 || num > 999)
					throw new Exception();
				error = false;

			} catch (Exception e) {
				// poruka korisniku za pogresan unos
				System.out.print("Pogresan unos, pokusajte ponovo:  ");
				input.nextLine();
			}
			// petlja se izvrsava dok postoji greska
		} while (error);

		return num;
	}
}
