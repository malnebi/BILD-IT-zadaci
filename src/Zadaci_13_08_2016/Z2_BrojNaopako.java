package Zadaci_13_08_2016;

/**
 * 2. Napišite metodu sa sljedeæim headerom koja vraæa naopako ispisan broj koji
 * joj je proslijeðen kao argument: public static void reverse(int number). Na
 * primjer, reverse(3456) treba da vrati 6543. Napisati program koji pita
 * korisnika da unese neki cijeli broj te mu vrati isti ispisan naopako.
 * */

public class Z2_BrojNaopako {
	// kreiranja scanner objekta, static jer ne moze biti instanciran, koristi
	// se u jos jednoj klasi
	static java.util.Scanner input = new java.util.Scanner(System.in);

	public static void main(String[] args) {

		// poruka korisniku
		System.out.println("Unesite cijeli broj : ");

		int number = checkInput(); // unos uz provjeru

		input.close();

		// ispis rezultata metodom reverse()
		reverse(number);
	}

	/** metoda za obrtanje broja */
	public static void reverse(int number) {
		//
		int reverse = 0;
		// petlja se izvrsava dok se broj potpuno ne rastavi
		while (number != 0) {
			// ostatkom dijeljenja dobijamo posljednju cifru
			int digit = number % 10; // npr: od 6543 je 3
			number = number / 10;
			// 1. 6543 % 10 = 3
			// 1. 6543 / 10 = 654
			// 2. 654 % 10 = 4
			// 2. 654 / 10 = 65
			// 3. 65 % 10 = 5
			// 3. 65 / 10 = 6
			// 4. 6 % 10 = 6
			// 5. 6 / 10 = 0 petlja je zavrsena
			reverse = (reverse * 10) + digit;
			// 1.(0 * 10)+ 3 = 3
			// 2.(3 * 10)+ 4 = 34
			// 3.(34 * 10) + 5 = 345
			// 4.(345 * 10) + 6 = 3456
		}

		System.out.println("Broj napisan naopako: " + reverse);
	}

	/** provjera unosa */
	public static int checkInput() {
		int num = 0;
		boolean error = true; // provjera greske

		do {
			try {
				num = input.nextInt();

				// ukoliko se unese negativan broj
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
