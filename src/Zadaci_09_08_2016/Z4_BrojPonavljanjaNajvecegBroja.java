package Zadaci_09_08_2016;

import java.util.Scanner;

/**
 * Program ispisuje broj ponavljanja najveceg unesenog broja. Prvo se ucitava
 * neodredjen broj cijelih brojeva (unos prekida nula), zatim pronalazi najveci i
 * ispisuje koliko se taj broj puta ponovio. Na primjer, ukoliko unesemo 3 5 2 5
 * 5 5 0 program ispisuje da je najveci broj 5 i ispisuje da se isti ponavlja 4
 * puta.
 */
public class Z4_BrojPonavljanjaNajvecegBroja {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Unesite cijele brojeve. Nula prekida unos.");

		// varijabla za unos i uslov ponavljanja petlje
		int num = 1;
		// varijabla max cuva najveci broj
		int max = 0;
		// broj ponavljanja najveceg broja
		int i = 1;

		while (num > 0) {
			num = input.nextInt();
			if (num == max) { //
				i++; // brojac se uvecava ako se do tada najveci broj ponovi
			}
			if (num > max) {
				max = num; // novi broj postaje max ako je veci od dotadasnjeg
							// najveceg
			}
		}
		input.close();
		// ispis poruke sa rezultatom
		System.out.println("Najveæi broj je " + max + " i ponavlja se " + i
				+ " puta.");
	}

}
