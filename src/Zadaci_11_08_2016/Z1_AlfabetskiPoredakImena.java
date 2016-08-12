package Zadaci_11_08_2016;

import java.util.Scanner;

/**
 * Program pita korisnika da unese imena tri grada te ih ispise u abecednom
 * redu. Na primjer, ukoliko korisnik unese Chicago, Los Angeles i Atlanta kao
 * gradove, program vraca Atlanta, Chicago, Los Angeles.
 */
public class Z1_AlfabetskiPoredakImena {

	public static void main(String[] args) {

		// kreiranje scannera i poruka korisniku
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite tri grada:");

		// svaki unos korisnika pretvaramo u velika slova inace poredak nece
		// biti tacan(velika slova su u ASCII kodu ispred malih)
		String city1 = input.nextLine().toUpperCase();
		String city2 = input.nextLine().toUpperCase();
		String city3 = input.nextLine().toUpperCase();

		input.close();

		// privremena varijabla za poredjenje
		String temp = "";

		// ukoliko je string-objekat "veci" od drugog-argument, rezultat metode
		// compareTo() bice veci od 0, sto znaci da bi (objekat)trebalo da bude
		// iza njega (argument) u alfabetskom poretku
		if (city1.compareTo(city2) > 0) {
			temp = city1; // ukoliko je uslov ispunjen stringovi
			city1 = city2; // mijenjaju mjesta
			city2 = temp;
		}
		if (city1.compareTo(city3) > 0) {
			temp = city1;
			city1 = city3;
			city3 = temp;
		}
		if (city2.compareTo(city3) > 0) {
			temp = city2;
			city2 = city3;
			city3 = temp;
		}
		// ispis poruke sa rezultatom
		System.out.print("Abecedni redoslijed gradova : \n" + city1 + "\n"
				+ city2 + "\n" + city3);

	}
}
