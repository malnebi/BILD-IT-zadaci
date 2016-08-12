package Zadaci_12_08_2016;

import java.util.InputMismatchException;

/**
 * Program ispisuje najveæi i najmanji zajednièki djelilac za ta dva broja koja
 * unosi korisnik.
 */
public class Z2_ZajednickiDjelioci2Broja {

	static java.util.Scanner input = new java.util.Scanner(System.in);

	public static void main(String[] args) {
		// poruka korisniku za unos
		System.out.println("Unesite dva cijela pozitivna broja");
		// unos dva broja
		int num1 = checkInput(); // provjera unosa
		int num2 = checkInput();

		input.close();

		// poruka korisniku sa rezultatima dobijenim pozivanjem metoda
		System.out.println("Najveci zajednicki djelilac "
				+ greatestComonDivisor(num1, num2));
		System.out.println("Najmanji zajednicki djelilac "
				+ lowestComonDivisor(num1, num2));

	}

	/** metoda za dobijanje najmanjeg zajednickog djelioca */
	public static int lowestComonDivisor(int n1, int n2) {

		int n; // kontrolna varijabla ima vrijednost manjeg broja
		if (n1 < n2) {
			n = n1;
		} else {
			n = n2;
		}

		int lcd = 1;
		int i = 2;
		// petlja ide do vrijednosti manjeg broja
		while (i <= n) {
			if (n1 % i == 0 && n2 % i == 0) {// ako su oba broja djeljiva sa "i"
				lcd = i;// "lcd" dobija vrijednost "i"
				break; // dobili smo vrijednost najmanjeg djelioca i pelja se
						// zavrsava
			}
			i++; // brojac se uvecava ako prethodni uslov nije ispunjen
		}
		return lcd;
	}

	/** metoda za dobijanje najveceg zajednickog djelioca */
	public static int greatestComonDivisor(int n1, int n2) {

		int n; // kontrolna varijabla ima vrijednost manjeg broja
		if (n1 < n2) {
			n = n1;
		} else {
			n = n2;
		}
		int gcd = 1;
		int i = 1;

		// petlja ide do vrijednosti manjeg broja
		while (i <= n) {
			if (n1 % i == 0 && n2 % i == 0)// ako su oba broja djeljiva sa "i"
				gcd = i;// "gcd" dobija vrijednost "i
			i++; // brojac se uvecava dok se ne dobije najveci djelilac
		}
		return gcd;
	}

	/** provjera unosa */
	public static int checkInput() {
		int num = 0;
		boolean error = true; // provjera greske

		do {
			try {
				num = input.nextInt();// unos mora biti Int!
				if (num < 0)// ukoliko se ne unese cijeli pozitivan broj
					throw new InputMismatchException();// pokrenuce se exception
				error = false;

			} catch (InputMismatchException e) {
				System.out.print("Pogresan unos, pokusajte ponovo:  ");
				input.nextLine();
			}
			// petlja se izvrsava dok postoji greska
		} while (error);

		return num;
	}
}
