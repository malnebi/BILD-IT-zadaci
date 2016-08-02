package zadaci_01_08_2016;

import java.util.Scanner;

public class Z5_BrojPonavljanjaNajvecegBrojaNiza {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Unesite cijele brojeve, 0 prekida unos.");
		int num = 1;
		int max = 0;
		int counter = 1;

		do {
			num = input.nextInt();
			if (num == max) {
				counter++;
			}
			if (num > max) {
				max = num;
			}
		} while (num != 0);

		input.close();
		System.out.println("Najveci broj " + max + " se ponovio " + counter
				+ " puta");
	}

}
