package Zadaci_02_08_2016;

public class Z5_BacanjeNovcica {
	/**
	 * Napisati metodu koja prima jedan argument te simulira bacanje novèiæa
	 * toliko puta. Nakon što se simulacija završi, program ispisuje koliko puta
	 * je novèiæ pokazao glavu a koliko puta pismo.
	 */
	public static void main(String[] args) {
		// broj bacanja novcica 
		int n = (int) (Math.random() * 20 + 1);
		// ispis poruke o broju bacanja novcica
		System.out.println("Novcic je bacen " + n + " puta.");
		// pozivanje metode sa simulacijom bacanja novcica i rezultatima
		coin(n);
	}

	/** metoda koja simulira bacanje novcica i ispis rezultata **/
	public static void coin(int n) {
		// brojaci za glavu i pismo
		int head = 0;
		int letter = 0;
		// simulacija bacanja novcica pomocu petlje
		for (int i = 0; i < n; i++) {
			// nasumicni odabir brojeva, gdje 0 predstavlja glavu a 1 pismo
			int coin = (int) (Math.random() * 2);
			if (coin == 0) {
				head++;
			} else
				letter++;
		}
		// ispis rezultata
		System.out.println(" Glava " + head);
		System.out.println(" Pismo " + letter);
	}
}
