package Zadaci_15_08_2016;

/**
 * 4. Metoda: public static int sumDigits(long n), izracunava zbir svih brojeva
 * u cijelom broju. Npr: ako pozovemo metodu i proslijedimo joj broj 234
 * (sumDigits(234)) metoda treba da vrati 9. (2 + 3 + 4 = 9)
 */
public class Z4_ZbirCifaraUCijelomBroju {

	static java.util.Scanner input = new java.util.Scanner(System.in);

	public static void main(String[] args) {
		// poruka korisniku za unos
		System.out.println("Unesite cijeli broj");
		// unos korisnika uz provjeru
		long num = checkInput();

		input.close();

		// ispis poruke sa rezultatom
		System.out
				.println("Zbir cifara broja " + num + " je " + sumDigits(num));

	}

	/** metoda za sabiranje cifara cijelog broja */
	public static int sumDigits(long n) {
		// varijabla zbor cifara
		long sumDig = 0;
		// petlja se izbrsava dok se broj potpuno ne rastavi na cifre
		while (n != 0) {
			// ostatkom pri dijeljenju dobija se posljednja cifra
			long dig = n % 10;
			// novi broj bez posljednje cifre
			n = n / 10;
			// zbir cifara = na prethodni zbir dodaje cifru
			sumDig = sumDig + dig;
		}
		// vracena vrijednost metode
		return (int) sumDig;
	}

	/** provjera unosa */
	public static long checkInput() {
		long num = 0;
		boolean error = true; // provjera greske

		do {
			try {
				num = input.nextLong();
				// ukoliko se unese slovo ili negativan broj pokrenuce
				if (num < 0)// pokrenuce se exception
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
