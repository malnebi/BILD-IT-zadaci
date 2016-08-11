package Zadaci_10_08_2016;

/**
 * Program ispisuje sve moguce kombinacije za biranje dva broja u rasponu od 1
 * do 7 i njihov broj. Program treba da ispise sve moguce parove brojeva u datom
 * rasponu, krenuvsi sa 1 2, 1 3, 1 4, itd. Broj mogucih kombinacija je 21.
 */
public class Z3_BrojSvihParovaBrojevaOd1Do7 {

	public static void main(String[] args) {

		System.out.println(" Kobinacije brojeva od 1 do 7:");

		// brojac parova
		int count = 0;

		// vanjska petlja za prvi broj u paru
		for (int i = 1; i < 7; i++) {

			// unutrasnja petlja za drugi broj u paru
			for (int j = 1; j < (8 - i); j++) {
				// ispis para
				System.out.print(i + " " + (j + i) + (i == 6 ? "." : ","));
				count++;
			}
			System.out.println();
		}
		System.out
				.println(" Broj svih mogucih kombinacija brojeva od 1 do 7 je "
						+ count + ".");
	}
}
