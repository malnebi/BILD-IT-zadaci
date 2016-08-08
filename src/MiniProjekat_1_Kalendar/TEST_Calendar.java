package MiniProjekat_1_Kalendar;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TEST_Kalendar {

	static File file = new File(System.getProperty("user.dir") + "\\notes.txt");
	static java.util.Scanner input = new java.util.Scanner(System.in);

	public static void main(String[] args) throws IOException {

		System.out.println("Wellcome to calendar!");

		file.delete(); // ponistavanje podsjetnika za prvo pokretanje programa
		if (file.length() != 0) {
			System.out.println("Notes:");
			writeNoteOut();
		} else
			System.out.println("You have no any notes yet!");
		System.out.println();
		// OPCIJE
		System.out.println("Options: ");
		options();
	}

	/** Opcije */

	public static void options() throws IOException {
		System.out.println();
		System.out.println("Show calendar 1; " + "\nMake note 2;"
				+ "\nShow notes 3; " + "\nExit 4.");
		// izbor opcije
		int choose = input.nextInt();

		if (choose == 1) {
			printCalendar();
		} else if (choose == 2) {
			writeNoteIn();
		} else if (choose == 3) {
			writeNoteOut();
		} else if (choose == 4) {
			System.exit(1);
		} else {
			System.out.println("Wrong input, please try again.");
			options();
		}

	}

	/** ispis kalendara */

	public static void printCalendar() throws IOException {
		// unos godine i mjeseca za kalendar
		System.out.println("Enter year: ");
		int year = checkInput();

		System.out.println("Enter number for month (1 - 12): ");
		int month = checkInput();

		Calendar calendar = new Calendar(year, month);
		calendar.printMonth(year, month);
		System.out.println();
		System.out.println("If you like to choose new option: ");
		// ispis opcija za dalji rad programa
		options();
	}

	/** upis podsjetnika */

	public static void writeNoteIn() throws IOException {
		// kreiranje objekta za upis podsjetnika u fajl
		java.io.BufferedWriter bf = new java.io.BufferedWriter(new FileWriter(
				file, true));

		System.out.println("Enter a month (number 1 - 12):");
		int month = checkInput();
		System.out.println("Enter a year for a note:");
		int year = checkInput();

		Calendar calendar = new Calendar(year, month);

		boolean incorrect = true;
		int day = 0;
		System.out.println("Enter a day in a month: ");
		// petlja radi dok je unos netacan
		while (incorrect) {
			day = checkInput();
			// provjera da li je uneseni dan u opsegu za odredjeni mjesec
			if (day < calendar.getNumberOfDaysInMonth(year, month) && day > 0) {
				incorrect = false;
			} else {
				System.out.print("Wrong input, try again: ");
			}
		}
		// poruka korisniku i upis podsjtnika
		System.out.println("Enter NOTE: ");
		input.nextLine();
		String note = input.nextLine();

		// podsjetnik se unosi u fajl zajedno sa datumom
		bf.write(day + ". " + calendar.getMonthName(month) + " " + year + ".  "
				+ note + "\n");
		bf.close(); // bf se mora zatvoriti inace je unos onemogucen
		System.out.println();
		// poruka korisniku o opcijama za dalji rad
		System.out.println("You can choose another option: ");
		options();
	}

	/** citanje podsjetnika iz fajla i ispis */

	public static void writeNoteOut() throws IOException {
		// kreiranje Scannera za citanje iz fajla
		Scanner output = new Scanner(file);
		// petlja se izvrsava dok ima stringa
		while (output.hasNextLine()) {
			// svaki string se ispisuje onako kako je i unesen u fajl
			String note1 = output.nextLine();
			System.out.println(note1);
		}
		output.close();
		System.out.println();
		//poruka o opcijama za dalji rad
		System.out.println("Options avaliable: ");
		options();
	}

	/** provjera unosa za cijele brojeve */

	public static int checkInput() {
		int num = 0;
		boolean error = true; // provjera greske

		do {
			try {
				num = input.nextInt();
				if (num < 0) {
					throw new InputMismatchException("Negative number");
				}
				error = false;
			} catch (InputMismatchException e) {
				System.out.print("Wrong input, try again:  ");
				input.nextLine();
			}
			// izvrsavace se dok greska postoji
		} while (error);

		return num;
	}
}