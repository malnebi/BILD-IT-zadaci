package Zadaci_03_08_2016;

import java.util.Scanner;

public class Z4_LociranjeNajvecegElementaUMatrici {
	/**
	 * Program ispisuje lokaciju najveceg elementa u matrici
	 */
	public static void main(String[] args) {
		// kreira scanner
		Scanner input = new Scanner(System.in);
		// poruka korisniku
		System.out.print("Unesite broj kolona i redova matrice");
		int numOfRows = input.nextInt();
		int numOfCol = input.nextInt();
		// kreiranje matrice
		double[][] mat = new double[numOfRows][numOfCol];
		System.out.println("Unesite elemente matrice: ");
		// popunjavanje matrice vrijednostima koje korisnik unosi sa tastature
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = input.nextDouble();
			}
		}

		// kreiranje novog niza, pozivanje metode koja vraca vrijednost indeksa
		// najvecg el
		int[] larg = locateLargest(mat);
		// zatvaranje Scannera
		input.close();

		System.out.println("NAjveci element je na (" + larg[0] + ", " + larg[1]
				+ ")");
	}

	/**
	 * metoda vraca vrijednost u obliku niz, sa dva elementa, koji predstavljaju
	 * indekse najveceg elementa matrice
	 * */
	public static int[] locateLargest(double[][] a) {
		int[] arrayLargest = new int[2];
		double largest = a[0][0];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (largest < a[i][j]) {
					largest = a[i][j];
					arrayLargest[0] = i;
					arrayLargest[1] = j;
				}
			}
		}
		return arrayLargest;
	}
}
