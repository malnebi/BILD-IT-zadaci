package Zadaci_17_08_2016;

/**
 * 2. Program prima karakter i vraca njegov Unicode. Npr: korisnik unese
 * karakter E program mu vraca 69 kao unicode za taj karakter.
 */
public class Z2_UnicodeDatogKaraktera {

	public static void main(String[] args) {
		// kreiranje Scanner objekta za unos sa tastature
		java.util.Scanner input = new java.util.Scanner(System.in);

		// poruka korisniku i unos karaktera
		System.out.println("Unesite karakter: ");
		char ch = input.nextLine().charAt(0);

		// pretvaranje u Unicode
		int unicode = (int) ch;

		// ispis rezultata
		System.out.print("Karakter za UNICODE karakter " + ch + " je "
				+ unicode);

		input.close();
	}

}
