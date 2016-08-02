package zadaci_01_08_2016;

import java.util.Scanner;

public class Z3_NajveciZajednickiDjelilac {

	public static void main(String[] args) {

		// formiranje objekta tipa/klase Scanner
		Scanner input = new Scanner(System.in);
		// poruka korisniku
		System.out.println("Unesite dva cijela broja: ");
		// dodjela unesenih vrijednosti varijablama num1 i num2
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		// zatvaranje Scannera
		input.close();

		// ispis rezultata korisniku
		System.out.println("Najveci zajednicki djelilac za " + num1 + " i "
				+ num2 + " je : " + nzd(num1, num2)); 
	}

	/** metoda koja vraca vrijednost najveceg zajednickog djelioca **/
	public static int nzd(int num1, int num2) {
		// varijabla min dobija vrijednost manjeg broja, koristice se za broj
		// ponavljanja petlje
		int min;
		if (num1 < num2) {
			min = num1;
		} else
			min = num2;
		// pocetna vrijednost var nzd je 1
		int nzd = 1;
		// prolaz kroz petlju ispituje da li su oba broja djeljiva sa istim
		// brojem, petlja pocinje sa 1 pa do manjeg broja
		for (int i = 1; i < min ; i++) {
			// SAMO ako su OBA broja djeljiva sa i, nzd dobija vrijednost i
			if (num1 % i == 0 && num2 % i == 0)
				nzd = i;
			// petlja se izvrsava do vrijednosti manjeg broja
		}
		// po zavrsetku petlje metodi se vraca vrijednost nzd
		return nzd;
	}
}
