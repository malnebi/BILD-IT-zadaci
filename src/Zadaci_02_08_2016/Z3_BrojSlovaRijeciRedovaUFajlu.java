package Zadaci_02_08_2016;

import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Program broji karaktere, rijeèi i linije teksta u fajlu. Rijeci su odvojene
 * razmakom, ime fajla je proslijedjeno kao argument u program.
 **/
public class Z3_BrojSlovaRijeciRedovaUFajlu {
	public static void main(String[] args) throws IOException {
		// kreiranje text filea
		File file = new File(
				"C:\\Users\\Administrator\\git\\BILD-IT_zadaci\\src\\text.txt");
		
		// kreiranje objekta za tekst file
		java.io.PrintWriter output = new java.io.PrintWriter(file);
		// upisivanje rijeci u file metodama print i prinln
		output.print("Kratka recenica.");
		output.println("Malo duza recenica.");
		output.print(" Do sada najduza recenica.");
		output.close();
		
		//pozivanje main metode druge klase kojoj prosledjujemo fajl
		KlasaKojaSePoziva.main(file); 		
	}
}

class KlasaKojaSePoziva {
	public static void main(File file) throws FileNotFoundException {
		// u slucaju da file ne postoji
		if (file == null) {
			System.out.println("Fajl ne postoji");
			System.exit(0);
		}
		// brojaci
		int counterLine = 0;
		int counterWord = 0;
		int counterChar = 0;

		// citanje iz filea
		Scanner input = new Scanner(file);

		while (input.hasNext()) { // ucitavanje linija iz fajla
			String line = input.nextLine(); // i brojanje linija
			counterLine++;
			counterChar += line.length(); // brojanje karaktera
			counterWord += line.split(" ").length; // brojanje rijeci

		}
		input.close();
		System.out.print("Tekst u fajlu ima :" + counterLine + " linija, "
				+ counterWord + "rijeci i " + counterChar + " karaktera.");
	}
}

