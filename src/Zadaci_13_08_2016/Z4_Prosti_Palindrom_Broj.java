package Zadaci_13_08_2016;

/**
 * 4. Program ispisuje prvih 100 palindrome prostih brojeva, 10 brojeva po
 * liniji. Primjer takvog broja su brojevi 131, 313 i 757.
 */
public class Z4_Prosti_Palindrom_Broj {

	public static void main(String[] args) {

		int number = 2;

		// brojac palindrom-prostih brojeva
		int counter = 0;

		while (counter < 100) {
			// uslov da je broj prost i palindrom istovremeno
			if (isPrime(number) && isPalindrom(number)) {
				counter++;
				// ispis 10 brojeva po liniji
				if (counter % 10 == 0) {
					System.out.println(number);
				} else {
					System.out.print(number + " ");
				}
			}
			number++;
		}

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

	/** provjera da li je broj palindrom */
	public static boolean isPalindrom(int num) {
		// ako je broj jednak obrnutom onda je palindrom
		if (num == reverse(num)) {
			return true;
		}
		return false;
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

}
