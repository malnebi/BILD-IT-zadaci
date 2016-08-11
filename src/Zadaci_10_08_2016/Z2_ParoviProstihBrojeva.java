package Zadaci_10_08_2016;

/**
 * Program ispisuje sve twin prime brojeve manje od 10000, 10 parova po liniji.
 * Twin prime brojevi su par prostih brojeva koji se razlikuju za 2 ( 3 i 5, 5 i
 * 7, 11 i 13 itd.).
 */
public class Z2_ParoviProstihBrojeva {

	public static void main(String[] args) {

		// brojac za ispis po liniji
		int counter = 0;

		// petlja ide do 10 000 po definiciji zadatka
		for (int i = 0; i < 10000; i++) {

			// provjera da li je broj i njegov par prost
			if (isPrime(i) && isPrime(i + 2) && i != 0 && i != 1) {

				counter++;

				// ispis prostih parova
				System.out.print("(" + i + " " + (i + 2) + ") ");

				if (counter % 10 == 0) {// ako je ispisano 10 parova u jednoj
					System.out.println();// liniji prelazi u novu
				}
			}
		}
	}

	/** metoda provjerava da li je broj prost */

	public static boolean isPrime(int number) {

		boolean prime = true;

		for (int div = 2; div < number; div++) {// petlja za djelioce broja

			prime = true; // broj je prost...
			if (number % div == 0) {// ...ali ako nema ostatka pri dijeljenju
				prime = false; // nije. Prime dobija vrijednost false...
				break; // ... i program izlazi iz petlje
			}
		}
		return prime;
	}
}
