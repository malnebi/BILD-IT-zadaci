package Zadaci_16_08_2016;

/***
 * 3. Program pita korisnika da unese Social Security Number (SSN) u formatu
 * DDD-DD-DDDD gdje D predstavlja broj. Program treba da provjerava da li je
 * broj unesen u ispravnom formatu. Ukoliko nije, program pita korisnika da
 * pokuša ponovo. Ukoliko jeste unešen u pravom formatu, program završava sa
 * radom.
 * 
 */

public class Z3_SocialSecurityNumber {

	static java.util.Scanner input = new java.util.Scanner(System.in);

	public static void main(String[] args) {
		// poruka korisniku
		System.out
				.println("Unesite SSN broj u formatu DDD-DD-DDDD, (D je cifra): ");

		String str = checkSSN();// unos sa tastature
		// metoda checkSSN() vrsi provjeru dok se ne unese ispravan broj

		input.close(); // zatvaranje Scannera

		// poruka da je broj ispravan
		System.out.println("Broj " + str + " je ispravan.");
	}

	/** provjera unosa */
	public static String checkSSN() {
		String str = ""; // pocetna vrijednost stringa
		boolean error = true; // provjera greske

		do {
			try {
				str = input.nextLine();
				// da li je broj ispravan odnosno da li je u zadatom formatu
				// provjerava metoda isRightFormatSSN(str)
				if (!isRightFormatSSN(str)) {

					throw new Exception();
				}
				error = false;

			} catch (Exception e) {
				// poruka korisniku za pogresan unos
				System.out.print("Pogresan unos, pokusajte ponovo:  ");
				input.next();
			}
		} while (error); // petlja se izvrsava dok postoji greska

		System.out.println(isRightFormatSSN(str));
		return str;
	}

	public static boolean isRightFormatSSN(String str) {

		if (Character.isDigit(str.charAt(0))
				&& Character.isDigit(str.charAt(1))
				&& Character.isDigit(str.charAt(2)) && str.charAt(3) == '-'
				&& Character.isDigit(str.charAt(4))
				&& Character.isDigit(str.charAt(5)) && str.charAt(6) == '-'
				&& Character.isDigit(str.charAt(7))
				&& Character.isDigit(str.charAt(8))
				&& Character.isDigit(str.charAt(9))
				&& Character.isDigit(str.charAt(10)))
			return true;
		else
			return false;
	}
}
