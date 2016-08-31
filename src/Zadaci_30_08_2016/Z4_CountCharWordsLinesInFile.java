package Zadaci_30_08_2016;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * 4. *12.13 (Count characters, words, and lines in a file) Write a program that
 * will count the number of characters, words, and lines in a file. Words are
 * separated by whitespace characters. The file name should be passed as a
 * command-line argument, as shown in Figure 12.13.
 */

public class Z4_CountCharWordsLinesInFile {

	public static void main(String[] args) throws IOException {
		// creates file
		java.io.File file = new java.io.File("test.txt");

		// if file allready exists display a message
		if (file.exists()) {
			System.out.println("File allready exist.");
		} else {
			file.createNewFile();
		}

		// create an object for write some text in the file
		PrintWriter input = new PrintWriter(file);
		// calling methods to write text in the file
		input.println("neki tekst");
		input.print("neki tekst ");
		input.close();

		// create Scanner object for input form file
		Scanner output = new Scanner(file);
		// default values for number of characters, words and lines
		int chars = 0;
		int words = 0;
		int lines = 0;

		// loop while there is words
		// read form file
		while (output.hasNext()) { // read lines form file
			String line = output.nextLine();
			lines++; // counting lines
			chars += line.length(); // counting characters
			words += line.split(" ").length; // counting words
		}
		output.close();

		// messages with results
		System.out.println("Number of words " + words);
		System.out.println("Number of chars " + chars);
		System.out.println("Number of lines " + lines);

	}

}