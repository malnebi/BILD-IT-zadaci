package zadaci_01_08_2016;
//importovanje klase Scanner koja je potrebna za pravljenje objekta za unos
import java.util.Scanner;

public class Z2_Broj_Samoglasnika_I_Suglasnika {

	public static void main(String[] args) {

		// fromiranje objekta tipa Scanner
		Scanner input = new Scanner(System.in);
		// poruka korisniku
		System.out.println("Unesite nisku: ");
		// dodjeljivanje niske varijabli "str" i pretvaranje u velika slova
		String str = input.nextLine().toUpperCase();
		// zatvaranje scannera
		input.close();

		// inicijalizacija vrijednosti broja samoglasnika i suglasnika u nisci
		int brojSamoglasnika = 0;
		int brojSuglasnika = 0;
		// inicijalizacija vrijednosti za iteraciju
		int i = 0;

		// petlja za prolazak kroz nisku ()
		while (i <= str.length() - 1) {
			// za svaku iteraciju i brojac samoglasnika se uvecava ako je na tom
			// indeksu A,E,I,O ili U (prethodno su karakteri pretvoreni u velika
			// slova pa mala ne navodim)
			if (str.charAt(i) == 'A' || str.charAt(i) == 'E'
					|| str.charAt(i) == 'I' || str.charAt(i) == 'O'
					|| str.charAt(i) == 'U') {
				brojSamoglasnika++;
				// ukoliko je u nisci nema karaktera izlazi iz petlje
			} else if (Character.isWhitespace(str.charAt(i))) {
				// brojac suglasnika se uvecava ukoliko prethodni uslovi nisu
				// ispunjeni
			} else
				brojSuglasnika++;
			i++;
		}
		// ispis poruke korisniku o broju samoglasnika i suglasnika
		System.out.println("Broj samoglasnika je: " + brojSamoglasnika
				+ "\nBroj suglasnika je: " + brojSuglasnika++);
	}
}
