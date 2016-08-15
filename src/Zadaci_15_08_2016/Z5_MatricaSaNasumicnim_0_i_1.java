package Zadaci_15_08_2016;

/**
 * 5. Metoda public static void printMatrix(int n), ispisuje n x n matricu.
 * Svaki element u matrici je ili 0 ili 1, nasumicno generisana. Program pita
 * korisnika da unese broj n te mu ispise n x n matricu u konzoli.
 */
public class Z5_MatricaSaNasumicnim_0_i_1 {

	static java.util.Scanner input = new java.util.Scanner(System.in);

	public static void main(String[] args) {
		// poruka korisniku za unos
		System.out.println("Unesite broj za redove i kolone matrice: ");
		// unos uz provjeru
		int n = checkInput();
		input.close();

		// pozivanje metode za ispis rezultata
		printMatrix(n);
	}

	/** metoda za ispis matrice */
	public static void printMatrix(int n) {
		// kreiranje matrice
		int[][] matrix = new int[n][n];

		// petlja za inteks redova
		for (int i = 0; i < matrix.length; i++) {
			// petlja za index kolona
			for (int j = 0; j < matrix[i].length; j++) {
				// ubacivanje elemenata u polja matrice nasumicno 0 i 1
				matrix[i][j] = (int) (Math.random() * 2);
				// ispis elementa matrice
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println(); // prelazak u novi red
		}

	}

	/** provjera unosa */
	public static int checkInput() {
		int num = 0;
		boolean error = true; // provjera greske

		do {
			try {
				num = input.nextInt();
				// ukoliko se unese slovo ili negativan broj pokrenuce
				if (num < 0)// pokrenuce se exception
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
