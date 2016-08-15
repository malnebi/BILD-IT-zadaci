package Zadaci_15_08_2016;

/**
 * 3. Program sabira sljedecu seriju 1/3 + 3/5 + 5/7 + 7/9 + 9/11 + 11/13 .....
 * + 95/97 + 97/99.
 */
public class Z3_ZbirNeparnihRazlomaka {

	public static void main(String[] args) {

		// varijabla z azbir brojeva
		double suma = 0;

		// petljom prolazimo kroz neparne brojeve od 1 do 97
		for (int i = 1; i < 98; i += 2) {
			// na svaki neparni i dodajemo 2 tako da i dalje dobijamo neparan
			// broj u razlomku
			suma = suma + (double) i / (i + 2);

		}
		// ispis rezultata
		System.out.println(suma);

	}

}
