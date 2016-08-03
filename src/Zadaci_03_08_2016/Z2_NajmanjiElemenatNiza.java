package Zadaci_03_08_2016;

import java.util.Scanner;

public class Z2_NajmanjiElemenatNiza {
	/**
	 * Program trazi od korisnika da unese deset brojeva i poziva metodu koja
	 * vraca najmanji element u nizu.
	 * */
	public static void main(String[] args) {

		double[] array = new double[10];

		Scanner input = new Scanner(System.in);
		System.out.println("Enter 10 numbers: ");
		// popunjavanje elemenata niza iz konzole
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextDouble();
		}
		input.close();
		// ispis rezultata
		System.out.println("Najmanji broj u nizu je: "
				+ minElementInArray(array));
	}

	/** metoda vraca najmanji element niza */
	public static double minElementInArray(double[] array) {
		// pocetna vrijednost varijable koja cuva najmanju vrijednost je prvi
		// element u nizu
		double minNumber = array[0];
		// petlja ispituje elemente, ako su manji od prethodnog varijabla
		// minNumber dobija tu vrijednost
		for (int i = 1; i < array.length; i++) {
			if (minNumber > array[i]) {
				minNumber = array[i];
			}
		}
		return minNumber;
	}
}
