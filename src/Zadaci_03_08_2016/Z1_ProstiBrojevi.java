package Zadaci_03_08_2016;

import java.util.Scanner;

public class Z1_ProstiBrojevi {
	/**
	 * 1. Napisati metodu koja prima 2 argumenta: poèetni broj i krajnji broj te
	 * printa sve proste brojeve u zadanom rangu. BONUS: metoda može primati i
	 * treæi argument, broj brojeva za isprintati po liniji.
	 * */
	public static void main(String[] args) {
		// kreiranje Scannera
		Scanner input = new Scanner(System.in);
		// ispis poruke korisniku
		System.out.println("Enter start and end number: ");
		// unos pocetnog i krajnjeg broja
		int startNum = input.nextInt();
		int endNum = input.nextInt();
		System.out
				.println("Enter number of numbers you want to be printed in one line:");
		// unos broja brojeva u jednoj liniji
		int numPerLine = input.nextInt();
		// pozivanje metode za ispis prostih brojeva
		printPrimeNumbers(startNum, endNum, numPerLine);
		// zatvaranje Scannera
		input.close();

	}  

	/** metoda koja isisuje proste brojeve */
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

			if (prime) { // ako je broj prost uveæava brojaè
				counter++;
				// testira da li broj treba da bude posljednji u redu ako treba,
				// ispiše ga i prelazi u novi red
				if (counter % numPerLine == 0) {
					System.out.println(num);
				} else
					// ukoliko broj ne treba da bude posljednji u redu, dodaje
					// broj i razmak
					System.out.printf(" %4d ", num);
			}
			num++; // testira sljedeæi broj
		}
	}

}
