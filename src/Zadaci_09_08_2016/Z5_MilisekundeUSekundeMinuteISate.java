package Zadaci_09_08_2016;

import java.util.Scanner;

/***
 * Metoda : public static String convertMillis(long millis) pretavara
 * milisekunde u sate, minute i sekunde i vraca vrijednost u formatu
 * sati:minute:sekunde. Na primjer convertMillis(100000) treba da vrati 0:1:40.
 */
public class Z5_MilisekundeUSekundeMinuteISate {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Unesite broj milisekundi:");
		long millis = input.nextLong();

		input.close();
		// pozivanje metode
		System.out.println(convertMillis(millis));
	}

	// metoda za pretvaranje milisekundi u sekunde, minute i sate

	public static String convertMillis(long millis) {

		// racunanje sekundi, minuta i sati
		long seconds = (int) (millis / 1000) % 60;
		long minutes = (int) ((millis / (1000 * 60)) % 60);
		long hours = (int) ((millis / (1000 * 60 * 60)) % 24);

		// vraca string sa vremenskim formatom sekunde : minute: sati
		return hours + " : " + minutes + " : " + seconds;
	}
}
