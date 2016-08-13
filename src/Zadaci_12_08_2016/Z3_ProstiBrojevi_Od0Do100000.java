package Zadaci_12_08_2016;

/**
 * 3. Napisati metodu sa sljedeæim headerom: public static int isPrime(int n)
 * koja provjerava da li je broj prost/prime. Napsati test program koji poziva
 * ovu metodu i ispisuje sve proste brojeve u rasponu od 0 do 100000.
 */
public class Z3_ProstiBrojevi_Od0Do100000 {

	public static void main(String[] args) {
		// petlja prolazi sve brojeve od 0 do 100000
		for (int i = 0; i < 100000; i++) {
			// ispisuju se svi brojevi koje je metoda vratila kao takve osim 1
			if (isPrime(i) != 0 && i != 1)
				System.out.println(isPrime(i));
		}

	}

	/** metoda vraca broj ako je prost ako nije vraca nulu */
	public static int isPrime(int n) {
		// svaki broj je djeljiv sa 1 pa pocinjemo od 2
		// nijedan broj ne mozemo podijeliti brojem koji je veci od njegove
		// polovine i zato je div <= n/2
		for (int div = 2; div <= n / 2; div++) {
			if (n % div == 0) {// ako je broj djeljiv sa nekim osim sa samim
				return 0; // sobom, nije prost i vraca se nula
			}
		}
		return n;
	}
}
