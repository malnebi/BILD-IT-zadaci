package Zadaci_02_08_2016;

import java.util.Scanner;

public class Z2_BrojTacnihINetacnihOdgovora {
	/**
	 * Metoda prima kao argument broj pitanja na osnovu koga generiše nasumièna
	 * pitanja oduzimanja npr : „Koliko je 5 - 2 ?“, broji taène i netaène
	 * odgovora te ih ispisuje korisniku.
	 * */
	
	public static void main(String[] args) {
		int numberOfQuestions = 5;
		numberOfQuestions(numberOfQuestions);
	}
	/**
	 * metoda numberOfQuestions generise onoliko pitanja koliko je dato u
	 * argumentu i ispisuje broj tacnih i netacnih odgovora
	 **/
	public static void numberOfQuestions(int numOfQuestions) {
		Scanner input = new Scanner(System.in);
		// brojac pitanja
		int i = 0;
		// brojaci tacnih i netacnih odgovora
		int countCorrect = 0;
		int countINCorrect = 0;
		// svaki prolazak kroz petlju generise pitanje na koje korisnik daje
		// odgovor
		while (i < numOfQuestions) {
			// nasumicno biranje brojeva
			int num1 = (int) (Math.random() * 10);
			int num2 = (int) (Math.random() * 10);

			System.out.println("Koliko je " + num1 + " - " + num2 + " ?");
			// unos korisnikovog odgovora
			int userANSW = input.nextInt();

			int result = num1 - num2;
			// poredjenje odgovora korisnika i rezultata, ukoliko je isti
			// uvecava se brojac tacnih, u suprotnomuvecava brojac netacnih
			if (userANSW == result) {
				countCorrect++;
			} else {
				countINCorrect++;
			}
			i++;
		}
		input.close();
		System.out.println("Tacni odgovori: " + countCorrect
				+ " \nNetacni odgovori: " + countINCorrect);

	}
}
