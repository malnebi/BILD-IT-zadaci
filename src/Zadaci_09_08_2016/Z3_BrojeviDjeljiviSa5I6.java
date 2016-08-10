package Zadaci_09_08_2016;

/**
 * 3. Napišite program koji ispisuje sve brojeve, od 100 do 1000, 10 brojeva po
 * liniji, koji su djeljivi i sa 5 i sa 6. Razmak izmeðu brojeva treba biti
 * taèno jedan space.
 */
public class Z3_BrojeviDjeljiviSa5I6 {

	public static void main(String[] args) {

		// broj brojeva u redu je konstanta
		final int NUMBRES_IN_A_ROW = 10;

		// kontrolna varijabla za broj brojeva u jednom redu
		int num = 1;

		// petljom se provjeravaju svi brojevi od 100 do 1000
		for (int i = 100; i < 1000; i++) {
			// ispitivanje uslova djeljivosti broja sa 5 i 6
			if (i % 5 == 0 && i % 6 == 0) {
				// ispisivanje po 10 brojeva u jednom redu
				if (num % NUMBRES_IN_A_ROW == 0) {
					System.out.println(i);
				} else {
					System.out.print(i + " "); // razmak izmedju dva broja
				}
				num++;
			}
		}

	}

}
