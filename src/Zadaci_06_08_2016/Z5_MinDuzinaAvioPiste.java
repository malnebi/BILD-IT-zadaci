package Zadaci_06_08_2016;

import java.util.Scanner;

/**
 * 5. Ako imamo ubrzanje aviona a te brzinu pri kojoj avion uzlijece v, mozemo
 * izracunati minimalnu duzinu piste potrebne da avion uzleti koristeci se
 * formulom: duzina = v * v / 2a. Napisati program koji pita korisnika da unese
 * v u m/s i a u (m/s)*(m/s) te ispisuje minimalnu duzinu piste.
 * (Primjer: ukoliko unesemo 60 za brzinu i 3.5 za ubrzanje duzina piste je
 * 514.286)
 */
public class Z5_MinDuzinaAvioPiste {

	public static void main(String[] args) {
		// kreiranje scannera za unos sa tastature
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite brzinu aviona: ");
		double v = input.nextDouble();
		System.out.println("Unesite ubrzanje aviona: ");
		double a = input.nextDouble();

		input.close();

		// racunanje minimalne duzine piste
		double ranwayLength = (v * v) / (2 * a);
		// ispis poruke korisniku
		System.out.printf(
				"Minimalna duzina piste za uzlijetanje aviona iznosi: %.3f m.",
				ranwayLength);
	}

}
