package Zadaci_12_08_2016;

/**
 * 1. Pretpostavimo da se registarska tablica za auto sastoji od tri uppercase
 * karaktera i 4 broja u sljedeæem formatu AAA-1234. Napisati program koji
 * nasumièno generiše tablicu.
 * */
public class Z1_RegistarskaTablica {

	public static void main(String[] args) {

		System.out.println("Registarska tablica: ");

		// for petlja za nasumicna velika slova
		for (int i = 0; i < 3; i++) {

			// Math.random() daje rezultat u double formatu pa castujemo u int,
			// a dalje u char za dobijanje velikog slova (26 velikih slova a 65
			// dodajemo zbog pozicije u ASCII kodu)
			char ch = (char) ((int) (Math.random() * 26) + 65);
			System.out.print(ch); // printanje slova
		}

		// ispis crtice izmedju slova i cifara
		System.out.print("-");

		// petlja za nasumicne cifre
		for (int i = 0; i < 4; i++) {
			int num = (int) (Math.random() * 10);
			System.out.print(num); // printanje cifre
		}

	}

}
