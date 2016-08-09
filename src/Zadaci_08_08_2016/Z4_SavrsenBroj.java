package Zadaci_08_08_2016;

/**
 * 4. Pozitivni cijeli broj je savrsen broj ukoliko je jednak zbiru svih svojih
 * pozitivnih djelilaca, iskljucujuci sebe. Na primjer, 6 je prvi savrseni broj
 * jer 6 = 3 + 2 + 1. Sljedeci je 28 jer 28 = 14 + 7 + 4 + 2 + 1. Samo 4
 * savrsena broja postoje u rasponu od 0 do 10.000. Napisite program koji
 * ispisuje sva 4.
 */
public class Z4_SavrsenBroj {

	public static void main(String[] args) {

		System.out.println("Savrseni brojevi su: ");

		// kroz petlju se ispituju brojevi do 10000
		for (int num = 1; num < 10000; num++) {

			// kontrolna varijabla, suma svih djelilaca nekog broja
			int sum = 0;

			for (int div = 1; div < num; div++) {
				if (num % div == 0) {
					sum = sum + div;
				}
			}
			if (num == sum)// ako je suma djelilaca broja jednaka broju
				System.out.println(sum); // broj se ispisuje
		}
	}
}
