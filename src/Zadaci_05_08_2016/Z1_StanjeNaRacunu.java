package Zadaci_05_08_2016;

import java.util.Scanner;

/**
 * Program racuna stanje na racunu za neki vremenski perioda na osnovu mjesecnog
 * iznosa i broja mjeseci sto unosi korisnik. Ako svaki mjesec uplatimo $100 na
 * stedni racun koji ima godisnju interesnu stopu od 5%. Mjesecna interesna
 * stopa je stoga 0.05 / 12 = 0.00417. Nakon prvog mjeseca vrijednost na racunu
 * postaje 100 * (1 + 0.00417) = 100.417; nakon drugog mjeseca (100 + 100.417) *
 * (1 + 0.00417) = 201.252, a nakon treceg (100 + 201.252) * (1 + 0.00417) =
 * 302.507 i tako dalje.
 */
public class Z1_StanjeNaRacunu {
	public static void main(String[] args) {
		// kreiranje Scannera za unos sa tastature
		Scanner input = new Scanner(System.in);
		System.out.println(" Unesite mjesecni iznos stednje:");
		double monthAmount = input.nextInt();
		System.out
				.println("Unesite broj mjeseci nakon kojih zelite da znate stanje na Vasem racunu:");
		int numOfMonths = input.nextInt();
		input.close();

		// godisnja kamatna stopa
		double yearInterestRate = 5;
		// mjesecna kamatna stopa, dobijena na osnovu godisnje
		double monthInterestRate = (yearInterestRate / 100) / 12;
		// suma na racunu, pocetna je 0
		double accountAmount = 0;
		// petlja za izracunavanje sume, izvrsava se onoliko puta koliko je
		// navedeno mjeseci
		for (int i = 0; i < numOfMonths; i++) {
			accountAmount = (monthAmount + accountAmount)
					* (1 + monthInterestRate);
		}
		System.out.printf(
				"Stanje na racunu nakon %d. mjeseca iznosice %5.3fKM.",
				numOfMonths, accountAmount);
	}
}
