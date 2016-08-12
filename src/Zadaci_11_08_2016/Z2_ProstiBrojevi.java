package Zadaci_11_08_2016;

/**
 * Program ispisuje sve proste brojeve od 2 do 1000, ukljucujuæi i 2 i 1000.
 * Program treba da ispise 8 brojeva po liniji te razmak izmedju brojeva treba
 * da bude jedan space.
 * */
public class Z2_ProstiBrojevi {

	public static void main(String[] args) {

		// raspon brojeva od 2 do 1000
		int startNum = 2;
		int endNum = 1000;

		// brojevi u liniji
		int numPerLine = 8;

		// pozivanje metode za ispis prostih brojeva u zadatom rasponu i
		printPrimeNumbers(startNum, endNum, numPerLine);

	}

	/** metoda koja ispisuje proste brojeve */
	public static void printPrimeNumbers(int startNum, int endNum,
			int numPerLine) {

		int num = startNum;
		// brojac
		int counter = 0;
		while (num < endNum) {
			boolean prime = true; // pretpostavka da je broj prost

			for (int div = 2; div <= num / 2; div++) {
				// provjerava da li je broj prost ukoliko je uslov tacan broj
				// nije prost izlazi iz for petllje
				if (num % div == 0) {
					prime = false;
					break;
				}
			}

			if (prime) { // ako je broj prost uvecava brojac
				counter++;
				// testira da li broj treba da bude posljednji u redu ako treba,
				// ispise ga i prelazi u novi red
				if (counter % numPerLine == 0) {
					System.out.println(num);
				} else
					// ukoliko broj ne treba da bude posljednji u redu, dodaje
					// broj i razmak
					System.out.print(num + " ");
			}
			num++; // testira sljedeci broj
		}
	}
}
