package Zadaci_09_08_2016;

import java.util.Scanner;

/**
 * Program pita korisnika da unese cijeli broj za danasnji dan
 * u sedmici (0 za ponedjeljak, 1 za utorak...) i da unese broj dana nakon
 * danasnjeg dana te mu ispise koji je to dan u buducnosti. (Primjer: ako
 * korisnik unese 1 kao danasnji dan a 3 kao dan u buducnosti program mu
 * ispisuje da je danas utorak a dan u buducnosti je petak.)
 */
public class Z1_BuduciDan {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		// poruka korisniku i unos danasnjeg dana i broja dana od danas
		System.out.println("Enter number for todays day (0 - 6):");
		int todaysDay = input.nextInt();

		// broj dana od danas
		System.out.println("Enter number of days from today: ");
		int numOfDays = input.nextInt();

		//racunanje buduceg dana
		int futureDay = (todaysDay + numOfDays) % 7;

		//Ispis rezultata
		System.out.println(" Today is " + getDayName(todaysDay) + ", for "
				+ numOfDays + " days will be " + getDayName(futureDay)+".");

		input.close();
	}

	//metoda za ispis naziva dana mjesto unesenog broja 
	private static String getDayName(int day) {

		String dayName = "";

		switch (day) {
		case 0:
			dayName = "Monday";
			break;
		case 1:
			dayName = "Tusday";
			break;
		case 2:
			dayName = "Wednsday";
			break;
		case 3:
			dayName = "Tursday";
			break;
		case 4:
			dayName = "Friday";
			break;
		case 5:
			dayName = "Saturday";
			break;
		case 6:
			dayName = "Sunday";
			break;

		}
		return dayName;
	}

}
