package Zadaci_04_08_2016;

	/**
	 * 
	 * Metoda printa 100 nasumiènih uppercase karaktera i 100
	 * nasumiènih brojeva, 10 po liniji.
	 * 
	 */
public class Z4_100NasumicnihBrojeva_I_VelikihSlova {

	public static void main(String[] args) {

		printingRandom();
	}

	public static void printingRandom() {
		int counter = 1;
		// petlja za ispisivanje brojeva
		for (int i = 0; i < 100; i++) {
			int number = (int) (Math.random() * 100);
			// ispis 10 brojeva po liniji
			if (counter % 10 == 0) {
				System.out.println(" "+number + " ");
			} else {
				System.out.printf(" %2d ",number);
			}
			counter++;
		}
		System.out.println();
		// petlja za ispisivanje velikih slova
		for (int i = 0; i < 100; i++) {

			int number = (int) (Math.random() * 26) + 65;
			char ch = (char) number;
			// ispisuje 10 slova po liniji
			if (counter % 10 == 0) {
				System.out.println(ch + " ");
			} else {
				System.out.print(ch + " ");
			}
			counter++;
		}
	}

}
