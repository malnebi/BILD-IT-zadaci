package Zadaci_03_08_2016;

import java.util.Scanner;

public class Z3_StriktnoIdenticniNizovi {
	/**
	 * Program testira da li su nizovi striktono identicni (na istoj poziciji u
	 * oba niza su isti elementi)
	 * */
	public static void main(String[] args) {
		// inicijalizacija niza
		int[] array1 = new int[10];
		int[] array2 = new int[10];
		// kreiranje Scannera
		Scanner input = new Scanner(System.in);
		// poruka korisniku
		System.out.println("Unesite elemente prvog niza:");
		// popunjavanje prvog niza vrijednostima koje korisnik unosi sa tastature
		for (int i = 0; i < array1.length; i++) {
			array1[i] = input.nextInt();
		}
		
		System.out.println("Unesite elemente drugog niza:"); //!!!!na bootcampu bilo je bez ovog, izgubila pola boda
		// popunjavanje drugog niza
		for (int i = 0; i < array2.length; i++) {
			array2[i] = input.nextInt();
		}
		// zatvaranje Scannera
		input.close();
		// ispis rezultata testiranja jednakosti elemenata niza
		System.out.println("Dva niza "
				+ (equals(array1, array2) == true ? "su " : "nisu ")
				+ "striktno identicna.");
	}

	/** metoda koja vraca tru ako je niz identican, false ako nije */
	public static boolean equals(int[] niz1, int[] niz2) {
		// brojac
		int counter = 0;
		for (int i = 0; i < niz2.length; i++) {
			if (niz1[i] == niz2[i])
				counter++;
		}
		//metoda vraca true ukoliko brojac izbroji svih 10 jednakih elemenata 
		if (counter == 10)
			return true;
		else
			return false;
	}
}
