package Zadaci_12_08_2016;

/**
 * Program ucitava cijele brojeve u rasponu od 1 do 100, broji i ispisuje koliko
 * je koji broj puta unesen. Pretpostavimo da nula prekida unos brojeva. Ukoliko
 * unesemo sljedeci niz brojeva 2 5 6 23 42 58 2 6 0 program nam ispisuje da se
 * broj 2 ponavlja 2 puta, broj 5 jednom, broj 6 2 puta, broj 23 jednom, itd.
 */
public class Z5_BrojPonavljanja100UnesenihBrojeva {

	static java.util.Scanner input = new java.util.Scanner(System.in);

	public static void main(String[] args) {
		
		// poruka korisniku za unos
		System.out.println("Unesite cijele brojeve do 100 (0 prekida unos): ");
		
		// niz od 100 elemenata za unesene brojeve
		int[] array = new int[100];

		// niz koji sadrzi broj pojavljanja unesenih brojeva
		int[] count = new int[100];

		int num = 1;
		int i = 0;

		// petljom se popunjavaju nizovi
		while (num != 0) { // unosenje traje dok se ne unese 0

			num = checkInput(); // unos uz provjeru

			array[i] = num; // unos u niz array

			count[num]++; // uvecanje vrijednosti elementa niza count kad se
							// unese broj jednak njegovom indexu
			i++;
		}

		input.close();

		// ispis broja ponavljanja unesenih brojeva
		for (i = 1; i < count.length; i++) {

			if (count[i] != 0) {
				// ako element niza count[] nije nula ispisuje se
				System.out.println(" Broj " + i + " se ponovio " + count[i]
						+ (count[i] == 1 ? " put." : " puta."));
			}
		}
	}

	/** provjera unosa */
	public static int checkInput() {
		int num = 0;
		boolean error = true; // provjera greske

		do {
			try {
				num = input.nextInt();// unos mora biti Int

				// ukoliko se unese negativan broj ili trocifren
				if (num < 0 || num > 99)// pokrenuce se exception
					throw new Exception();
				error = false;

			} catch (Exception e) {
				// poruka korisniku za pogresan unos
				System.out.print("Pogresan unos, pokusajte ponovo:  ");
				input.nextLine();
			}
			// petlja se izvrsava dok postoji greska
		} while (error);

		return num;
	}
}
