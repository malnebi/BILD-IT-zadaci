package Zadaci_31_08_2016;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

/**
 * 3. 12.19 (Count words) Write a program that counts the number of words in
 * President Abraham Lincoln’s Gettysburg address from
 * http://cs.armstrong.edu/liang/data/ Lincoln.txt.
 */
public class Z3_CountWordsFromAdress {

	public static void main(String[] args) throws IOException {

		// creates URL object to store web adress of textual file
		URL url = new URL("http://cs.armstrong.edu/liang/data/Lincoln.txt");

		// create scanner object to read from web file
		Scanner input = new Scanner(url.openStream());

		int sumWords = 0;

		// loop goes if it has more to read in file (more lines)
		while (input.hasNextLine()) {
			// temporary line from the file stored into string
			String line = input.nextLine();
			// adding number of words from each line into sum
			sumWords += line.split(" ").length;
		}
		input.close();

		// print result
		System.out.println("File has: " + sumWords + " words.");

	}

}
