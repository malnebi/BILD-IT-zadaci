package Zadaci_05_08_2016;

import java.util.Scanner;

/**
 * Program ispisuje najveci zajednicki prefix za dva stringa, ukoliko isti
 * postoji. Na primjer, ukoliko korisnik unese sljedeca dva stringa
 * "Dobrodosli u Dubai" i "Dobrodosli u Vankuver" program treba da ispise:
 * Najveci zajednicki prefix za dva stringa je "Dobrodosli u".
 */
public class Z3_ZajednickiPrefiksDvaStringa {

	public static void main(String[] args) {
		// kreiranje Scannera za unos sa tastature
		Scanner input = new Scanner(System.in);
		System.out.println(" Unesite prvi string:");
		String str1 = input.nextLine();
		System.out.println(" Unesite drugi string:");
		String str2 = input.nextLine();

		// vrijednost varijable j sluzice kao broj ponavljanja petlje
		int j = 0;
		if (str1.length() > str2.length()) {
			j = str2.length(); // j ima vrijednost duzine manjeg stringa
		} else
			j = str1.length();

		// referensna varijabla prefix sluzi za gradjenje prefiksa
		StringBuilder prefix = new StringBuilder();

		for (int i = 0; i < j; i++) {
			// u petlji se porede karakteri i ukoliko su isti dodaju se na
			// prefix
			if (str2.charAt(i) == str1.charAt(i)) {
				prefix.append(str1.charAt(i));
			} else
				break; // petlja se prekida kada se dodje do prvog razlicitog
						// karaktera u stringu
		}
		input.close();
		// ispis poruke zavisi od postojanja zajednickog prefiksa, odnosno od
		// duzine stringa
		if (prefix.length() != 0) {
			System.out
					.println("Najveci zajednicki prefiks za dva stringa je: \""
							+ prefix + "\"");
		} else
			System.out.println("Dva stringa nemaju zajednicki prefiks.");
	}
}
