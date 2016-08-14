package Zadaci_13_08_2016;

/**
 * 3. Emirp brojevi (prime unazad) je nepalindromski prosti broj koji je prosti
 * broj i kada ispisemo naopako. Na primjer, broj 17 i broj 71 su prosti brojevi
 * tako da su brojevi i 17 i 71 emirp brojevi. Napisati program koji ispisuje
 * prvih 100 emirp brojeva, 10 brojeva po liniji.
 **/
public class Z3_EmirpBroj_NepalindromskiProstBroj {

	public static void main(String[] args) {
		// brojac emirp bojeva
		int counter = 0;
		// pocinjemo sa prvim mogucim emirp brojem
		int num = 13;
		// petlja se zavrsava sa stotim emirp brojem
		while (counter < 100) {
			// broj treba da je prost i ako je naopako ispisan s tim da nije
			// palindrom broj
			if (isPrime(num) && isPrime(reverse(num)) && (num != reverse(num))) {
				counter++;
				// ispis 10 brojeva po liniji
				if (counter % 10 == 0) {
					System.out.println();
				} else {
					System.out.print(num + " ");
				}
			}
			num++;
		}
	}

	/** metoda za obrtanje broja */
	public static int reverse(int number) {
		int reverse = 0;
		// petlja se izvrsava dok se broj potpuno ne rastavi na cifre
		while (number != 0) {
			// ostatkom dijeljenja dobijamo posljednju cifru ()
			int digit = number % 10; // npr: od 6543 je 3
			// dijeljenjem sa 10 dobijamo novi broj bez
			// jedinica(posljednja cifra) od kojeg u sljedecem krugu petlje
			// izdvajamo posljednju cifru i tako redom
			number = number / 10;
			// reverse broju dodajemo posljednju cifru number broja,
			// prethodni reverse mnozimo sa 10, tako da posljednja cifra number
			// broja postaje prva reverse
			reverse = (reverse * 10) + digit;
		}
		return reverse;
	}

	/** metoda za ispistivanje da li je broj prost */
	public static boolean isPrime(int n) {
		// svaki broj je djeljiv sa 1 pa pocinjemo od 2
		// nijedan broj ne mozemo podijeliti brojem koji je veci od njegove
		// polovine i zato je div <= n/2
		for (int div = 2; div <= n / 2; div++) {
			if (n % div == 0) {// ako je broj djeljiv sa nekim osim sa samim
				return false; // sobom, nije prost i vraca se nula
			}
		}
		return true;
	}

}
