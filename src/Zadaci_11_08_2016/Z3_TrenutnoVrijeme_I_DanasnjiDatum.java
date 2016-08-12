package Zadaci_11_08_2016;

import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * 3. Ako pozovemo metodu System.currentTimeMillis() dobijemo broj milisekundi
 * od 1. januara 1970 do trenutka pozivanja metode. Napisati program koji
 * ispisuje trenutni datum i vrijeme u formatu
 * "Trenutni datum i vrijeme: 22. juli, 2015 19:59:47"
 */
public class Z3_TrenutnoVrijeme_I_DanasnjiDatum {

	public static void main(String[] args) {

		// kreiranje scannera i poruka korisniku da unese vremensku zonu
		Scanner input = new Scanner(System.in);
		System.out
				.println("Unesite vremensku zonu (od -5 do +5)"
						+ "\nNapomena: Za ljetnje racunanje vremena vremenska zona se uvecava za 1: ");

		int gmt = input.nextInt();

		// dobijanje ukupnog broja milisekundi od 1.1.1970. godine
		long millis = System.currentTimeMillis();

		// ispis rezultata pozivom na metode koje vracaju datum i vrijeme u
		// zadatom formatu
		System.out.println("Trenutni datum i vrijeme: " + currentDate() + " "
				+ currentTime(gmt, millis));

		input.close();

	}

	/** metoda za dobijanje trenutnog vremena */
	public static String currentTime(int gmt, long millis) {

		// ukupan broj sekundi pojednostavljuje dalje racunanje minuta i sati
		long totalSeconds = millis / 1000;

		long seconds =  totalSeconds % 60; // trenutne sekunde

		long totalMinutes = totalSeconds / 60; // ukupno minuta

		int minutes = (int) totalMinutes % 60; // trenutne minute

		int totalHours = (int) totalMinutes / 60 % 24; // ukupno sati

		int hours = (totalHours + gmt) % 24; // trenutni sati zavisno od
													// zone

		// vracena vrijednost: strng u zadatoj formi
		return hours + ":" + minutes + ":" + seconds;
	}

	/** metoda za dobijanje danasnjeg datuma */
	public static String currentDate() {

		// niz imena mjeseci
		String[] monthName = { "januar", "februar", "mart", "april", "maj",
				"juni", "juli", "avgust", "septembar", "oktobar", "novembar",
				"decembar" };
		
		// kreiranje objekta date za dan, mjesec i godinu
		GregorianCalendar date = new GregorianCalendar();

		// dobijanje treuntnih vrijednosti za dan, mjesec i godinu pozivanjem
		// metode get(GregorianCalendar)
		int day = date.get(GregorianCalendar.DAY_OF_MONTH);
		int month = date.get(GregorianCalendar.MONTH);
		int year = date.get(GregorianCalendar.YEAR);

		// vracena vrijednost u zadatoj formi
		return day + ". " + monthName[month] + ", " + year + ".";
	}
}
