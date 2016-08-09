package Zadaci_08_08_2016;

import java.util.Scanner;

/**
 * 2. Napisati program koji pita korisnika da unese mjesec i godinu te mu ispiše
 * broj dana u datom mjesecu. Na primjer, ukoliko korisnik unese kao godinu 2012
 * a kao mjesec 2, program treba ispisati da je Februar 2012 imao 29 dana.
 * Ukoliko korisnik unese kao godinu 2015 a kao mjesec 3, program treba ispisati
 * da je Mart 2015 imao 31 dan.
 * */
public class Z2_BrojDanaUMjesecu_UnosMjesecInt {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Unesite mjesec (1 -12):");
		int mjesec = input.nextInt();

		System.out.println("Unesite godinu: ");
		int godina = input.nextInt();

		input.close();

		System.out.println(nazivMjeseca(mjesec) + " " + godina + ". godine "
				+ (godina < 2016 || (mjesec < 8 && godina == 2016) ? "imao je " : "imace ")
				+ brojDanaUMjesecu(godina, mjesec) + " dana."); 

	}

	public static String nazivMjeseca(int mjesec) {
		String nazivMjeseca = "";
		switch (mjesec) {
		case 1:
			nazivMjeseca = "Januar";
			break;
		case 2:
			nazivMjeseca = "Februar";
			break;
		case 3:
			nazivMjeseca = "Mart";
			break;
		case 4:
			nazivMjeseca = "April";
			break;
		case 5:
			nazivMjeseca = "May";
			break;
		case 6:
			nazivMjeseca = "Juni";
			break;
		case 7:
			nazivMjeseca = "Juli";
			break;
		case 8:
			nazivMjeseca = "Avgust";
			break;
		case 9:
			nazivMjeseca = "Septembar";
			break;
		case 10:
			nazivMjeseca = "Oktobar";
			break;
		case 11:
			nazivMjeseca = "Novembar";
			break;
		case 12:
			nazivMjeseca = "Decembar";
			break;
		}
		return nazivMjeseca;
	}

	public static int brojDanaUMjesecu(int godina, int mjesec) {

		if (mjesec == 1 || mjesec == 3 || mjesec == 5 || mjesec == 7
				|| mjesec == 8 || mjesec == 10 || mjesec == 12)
			return 31;
		if (mjesec == 4 || mjesec == 6 || mjesec == 9 || mjesec == 11)
			return 30;
		if (mjesec == 2) {
			// ako je godina prestupna 28 dana, 29 ako nije
			return prestupnaGodina(godina)  ? 28 : 29;
		}
		return 0;
	}

	/** provjera da li je godina prestupna */
	public static boolean prestupnaGodina(int godina) {

		if (godina % 400 == 0 || (godina % 4 == 0 && godina % 100 != 0))
			return true;
		else
			return false;
	}

}
