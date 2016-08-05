package Zadaci_05_08_2016;

import java.util.Scanner;

/**
 * Program prima 10 cijelih brojeva i ispisuje ih u obrnutom redosljedu.
 * */
public class Z4_CijeliBrojeviUObrnutomRedosljedu {

	public static void main(String args[]) {
		// kreiranje Scannera za unos sa tastature
		Scanner input = new Scanner(System.in);
		System.out.println(" Unesite 10 cijelih brojeva:");
		// kreiranje niza sa 10 elemenata
		int[] array = new int[10];
		// unos elemenata u niz sa tastature
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}
		input.close();
		// prolaz kroz niz petljom
		for (int i = 0; i < array.length - 1; i++) {
			// unutrasnja petlja prolazi kroz niz tako da najveci element
			// bude na pocetku na kraju njenog izvrsenja
			for (int j = 1; j < array.length; j++) {
				// za niz u opadajucem redosljedu, ako je prvi element manji od
				// drugog, zamijene mjesta
				if (array[j - 1] < array[j]) {
					int temp = array[j];
					array[j] = array[j - 1];
					array[j - 1] = temp;
				}
			}
		}
		System.out.println("Ispis brojeva u opadajucem redoslijedu: ");
		for (int e : array) {
			System.out.print(e + " ");
		}
	}
}
