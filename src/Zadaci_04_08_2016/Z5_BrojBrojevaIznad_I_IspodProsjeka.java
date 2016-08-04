package Zadaci_04_08_2016;

import java.util.Scanner;

/**
 * Program ucitava neodredjeni broj cijelih brojeva (nula prekida unos), ispisuje
 * koliko je brojeva bilo iznad ili jednako prosjeku svih unesenih brojeva a
 * koliko ispod prosjeka. Maksimalan niz brojeva koje korisnik moze unijeti 100.
 * */
public class Z5_BrojBrojevaIznad_I_IspodProsjeka {

	public static void main(String[] args) {

		// kreiranje Scannera za unos sa tastature
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite niz brojeva (0 prekida unos): ");
		// kreiranje niza
		int[] array = new int[100];

		// dodavanje elemenata u niz unosom korisnika
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
			if (array[i] == 0) {
				break;// ako je uneseni broj 0, prekidamo dodavanje elemenata
			}
		}
		input.close();

		// vrijednost metode za racunanje prosjeka dodajemo varijabli
		int average = average(array);
		// brojac za brojeve iznad ili jednake prosjeku
		int aboveOrEqual = 0;
		// brojac za brojeve ispod prosjeka
		int below = 0;

		// prolazimo sve brojeve u nizu
		for (int num : array) {
			// ako je trenutni element 0, dosli smo do kraja unesenih brojeva
			if (num == 0) {
				break;
			} else { // ako trenutni element nije nula
				// ako je veci ili jednak prosjeku
				if (num >= average) {
					// povecavamo broj brojeva vecih ili jednakih prosjeku
					aboveOrEqual++;
				} else { // ako je manji od prosjeka
					// povecavamo broj brojeva manjih od prosjeka
					below++;
				}
			}
		}
		// ispis rezultata
		System.out.println("Prosjek unesenih brojeva je : " + average);
		System.out.println(aboveOrEqual
				+ (aboveOrEqual < 5 ? " broja su" : " brojeva je ") + "iznad ili je jednako prosjeku.");
		System.out.println(below + (below < 5 ? " broja su " : " brojeva je")
				+ "ispod prosjeka.");  // ternarni operatori za razlicit ispis zavisno od brojeva
	}

	/** Metoda racuna prosjek niza cijelih brojeva */
	public static int average(int[] array) {
		int sum = 0;
		int count = 0; // brojac koji cuva broj elemenata u nizu

		// prolazimo kroz cijeli niz
		for (int element : array) {
			// dodajemo vrijednosti elemenata na varijablu suma
			sum += element;
			// ako je trenutni element nula, dosli smo do kraja unesenih brojeva
			// u niz
			if (element == 0) {
				break;
			}
			// povecavanje broja elemenata
			count++;
		}
		// vracamo prosjek
		return sum / count;
	}

}
