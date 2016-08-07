package Zadaci_06_08_2016;

import java.util.Scanner;

/**
 * Program ucitava iznos investicije, godisnju kamatnu stopu i broj godina te
 * vraca buducu vrijednost investicije koristeci formulu:
 * buducaVrijednostInvesticije = iznosInvesticije * (1 +
 * mjesecnaInteresnaStopa)^brojGodina*12. Na primjer, ukoliko se kao iznos
 * investicije unese 1000, 3.25 za godisnju kamatnu stopu i 1 za broj godina
 * program vraca 1032.98 kao buducu vrijednost investicije.
 */
public class Z1_VrijednostBuduceInvesticije {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Unesite vrijednost investicije: ");
		double investmentValue = input.nextDouble();
		System.out.println("Unesite godisnju kamatnu stopu: ");
		double yearInterestRate = input.nextDouble();
		System.out
				.println("Unesite broj godina za koji zelite da znate buducu vrijednost vase investicije: ");
		int numberOfYears = input.nextInt();

		input.close();

		// vrijednost buduce investicije
		System.out.printf(
				"Vrijednost buduce investicije bice: %.2f",
				futureInvestmentValue(investmentValue, yearInterestRate,
						numberOfYears));

	}

	/** metoda za racunanje vrijednosti buduce investicije */
	public static double futureInvestmentValue(double investmentValue,
			double yearIterestRate, int numberOfYears) {
		// mjesecna kamatna stopa
		double monthInterestRate = yearIterestRate / (12 * 100);

		return Math.pow((1 + monthInterestRate), numberOfYears * 12)
				* investmentValue;
	}
}
