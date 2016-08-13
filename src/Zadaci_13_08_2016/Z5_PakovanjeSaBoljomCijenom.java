package Zadaci_13_08_2016;

/**
 * 5. Pretpostavimo da kupujemo rižu ili neki drugi proizvod u dva razlièita
 * pakovanja. Želimo napisati program koji uporeðuje cijene ta dva pakovanja.
 * Program pita korisnika da unese težinu i cijenu oba pakovanja te ispisuje
 * koje pakovanje ima bolju cijenu.
 */
public class Z5_PakovanjeSaBoljomCijenom {

	static java.util.Scanner input = new java.util.Scanner(System.in);

	public static void main(String[] args) {

		// poruke korisniku i unos cijena i tezina pakovanja
		System.out.print("Unesite cijenu i tezinu prvog pakovanja: ");
		double price1 = checkInput(); // unos uz provjeru ispravnih vrojednosti
		double weght1 = checkInput();

		System.out.println("Unesite cijenu i tezinu drugog pakovanja: ");
		double price2 = checkInput();
		double weght2 = checkInput();
		input.close(); // zatvaranje Scannera

		// racunanje odnosa cijena i tezine pakovanja
		double firstPackaging = price1 / weght1;
		double secondPackaging = price2 / weght2;

		// ispis rezultata zavisi od odnosa cijena i tezina dva pakovanja
		if (firstPackaging < secondPackaging) {
			System.out.println(" Bolju cijenu ima prvo pakovanje.");

		} else if (firstPackaging == secondPackaging) {
			System.out.println(" Paketi imaju istu cijenu");
		} else {
			System.out.println("Bolju cijenu ima drugo pakovanje");
		}

	}

	/** provjera unosa */
	public static double checkInput() {
		double num = 0;
		boolean error = true; // provjera greske

		do {
			try {
				num = input.nextDouble();
				if (num < 0)// ukoliko se unese slovo ili negativan broj
					throw new Exception();// pokrenuce se exception
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
