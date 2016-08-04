package Zadaci_04_08_2016;

import java.util.Scanner;   

public class Z1_NajmanjiFaktoriMnozenjaURastucemRedoslijedu {
	/** 
	 * Program ispisuje najmanje faktore mnozenja broja kojeg unosi korisnik, u
	 * rastucem redoslijedu. Npr, ukoliko korisnik unese 120 program treba da
	 * ispiše 2, 2, 2, 3, 5. (2 * 2 * 2 * 3 * 5 = 120)
	 */
	public static void main(String[] args) {

		// Kreiranje scannera za unos sa konzole
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite cijeli broj: ");
		int num = input.nextInt();
		input.close();

		// dijeljenje broja do najmanjih jedinica

		int result = 0;
		int number = num; //
		int i = 2;
		int count = 0; // kontrolni brojac za slucaj da se broj moze pomnoziti
						// samo sa sobom, u petlju se nece 

		while (i < number) {
			// ukoliko je dijeljenik (num) djeljiv sa djeliocem (i) djelilac se
			// ispisuje, a rezultat postaje novi dijeljenik
			if (num % i == 0) {
				result = num / i;
				System.out.print(i + (result == 1 ? " " : ", ")); // ispis
				num = result;
				count++;

			} else {
				i++;
			}// djelilac se uvecava za 1 ukoliko se broj ne moze
				// podijeliti bez ostatka
		}
		System.out.println((count == 0 ? "Broj se moze pomnoziti samo sa jedan."
				: "su najmanji faktori mnozenja broja " + number));

	}

}
