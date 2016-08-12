package Zadaci_12_08_2016;

import java.util.InputMismatchException;

/**
 * Program ispisuje tri broja u rastucem redoslijedu. Bonus: Metoda prima tri
 * cijela broja kao argumente i vraca brojeve u rastucem redosljedu.
 * */
public class Z4_SortiranjeTriBroja_RastuciRedoslijed {
	static java.util.Scanner input = new java.util.Scanner(System.in);

	public static void main(String[] args) {

		// poruka korisniku
		System.out.println("Unesite tri broja: ");

		// unos brojeva uz provjeru
		int num1 = checkInput();
		int num2 = checkInput();
		int num3 = checkInput();

		// poziv metode za ispis sortiranih brojeva
		ascendingOrder(num1, num2, num3);

	}

	/** metoda koja sortira tri broja u rastucem redoslijedu */
	public static void ascendingOrder(int n1, int n2, int n3) {
		// kreiranje niza sa elementima unesenih brojeva
		int[] array = { n1, n2, n3 };

		// pozivanje metode za sortiranje niza
		java.util.Arrays.sort(array);

		// ispis
		System.out.println("Brojevi u rastucem redoslijedu: " + array[0] + " "
				+ array[1] + " " + array[2]);
	}

	/** provjera unosa */
	public static int checkInput() {
		int num = 0;
		boolean error = true; // provjera greske

		do {
			try {
				num = input.nextInt();// unos mora biti Int!
				if (num < 0)// ukoliko se ne unese cijeli pozitivan broj
					throw new InputMismatchException();// pokrenuce se exception
				error = false;

			} catch (InputMismatchException e) {
				System.out.print("Pogresan unos, pokusajte ponovo:  ");
				input.nextLine();
			}
			// petlja se izvrsava dok postoji greska
		} while (error);

		return num;
	}
}