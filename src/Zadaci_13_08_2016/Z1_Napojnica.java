package Zadaci_13_08_2016;

/**
 * 1. (Izraèunavanje napojnice) Napisati program koji uèitava ukupan iznos
 * raèuna koji treba uplatiti kao i procenat tog raèuna kojeg želimo platiti kao
 * napojnicu te izraèunava ukupan raèun i napojnicu. Na primjer, ukoliko
 * korisnik unese 10 kao raèun i 15 % kao procenat za napojnicu program treba da
 * ispiše da je ukupan raèun za uplatiti 11.5 a napojnica 1.5.
 * */
public class Z1_Napojnica {
	static java.util.Scanner input = new java.util.Scanner(System.in);

	public static void main(String[] args) {

		// kreiranje scannera, poruka korisniku i unos

		System.out.print("Unesite ukupan iznos racuna: ");
		double receipt = checkInput();

		System.out.print("Unesite iznos napojnice u procentima: ");
		double tip = checkInput();

		input.close();

		// racunanje i ispis iznosa napojnice i ukupnog racuna
		calculateTipAndPrintReceipt(receipt, tip);

	}

	/** metoda za racunanje napojnice i racuna i printanje rezultata */
	private static void calculateTipAndPrintReceipt(double receipt,
			double tipPercent) {

		// iznos napojnice
		double valueOfTip = receipt * (tipPercent / 100);

		// iznos racuna
		double valueOfReceipt = receipt + valueOfTip;

		// stampanje rezultata
		System.out.println("Ukupna vrijednost racuna je: " + valueOfReceipt);
		System.out.println("Napojnica iznosi: " + valueOfTip);

	}

	/** provjera unosa */
	public static double checkInput() {
		double num = 0;
		boolean error = true; // provjera greske

		do {
			try {
				num = input.nextDouble();
				// ukoliko se unese slovo ili negativan broj pokrenuce
				if (num < 0)// pokrenuce se exception
					throw new Exception();
				error = false;

			} catch (Exception e) {
				// poruka korisniku za pogresan unos
				System.out.print("Pogresan unos, pokusajte ponovo:  ");
				input.nextLine();
			}
			// petlja se izvrsava dok postoji greska
		} while (error);

		return num;
	}
}
