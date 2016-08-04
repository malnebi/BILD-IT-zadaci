package Zadaci_04_08_2016;

import java.util.Scanner;

/** 
 * Program za ispis brojeva u rastucem redosljedu.
 */

public class Z3_Ispis3BrojaURastucemRedosiljedu {
	public static void main(String[] args) {

		// kreiranje Scannera za unos sa konzole
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite tri broja: ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();

		input.close();

		// pozivanje metode
		displaySortedNumbers(num1, num2, num3);
	}

	/** metoda ispisuje brojeve u rastucem redoslijedu */
	public static void displaySortedNumbers(double num1, double num2,
			double num3) {
		// ispistivanje uslova i ispis rezultata
		if (num1 < num2 && num2 < num3)
			System.out.println(num1 + " " + num2 + " " + num3);

		else if (num1 < num3 && num3 < num2)
			System.out.println(num1 + " " + num3 + " " + num2);

		else if (num2 < num3 && num3 < num1)
			System.out.println(num2 + " " + num3 + " " + num1);

		else if (num2 < num1 && num1 < num3)
			System.out.println(num2 + " " + num1 + "  " + num3);

		else if (num3 < num2 && num2 < num1)
			System.out.println(num3 + "  " + num2 + "  " + num1);

		else if (num3 < num1 && num1 < num2)
			System.out.println(num3 + "  " + num1 + "  " + num2);

	}
}
