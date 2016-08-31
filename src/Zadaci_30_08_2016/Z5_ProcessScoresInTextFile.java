package Zadaci_30_08_2016;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * 5. 12.14 (Process scores in a text file) Suppose that a text file contains an
 * unspecified number of scores separated by blanks. Write a program that
 * prompts the user to enter the file, reads the scores from the file, and
 * displays their total and average.
 */
public class Z5_ProcessScoresInTextFile {

	public static void main(String[] args) throws FileNotFoundException {
		// create an object for user input
		Scanner inputUser = new Scanner(System.in);
		// message to the user
		System.out.println("Enter a file name: ");

		String fileName = inputUser.nextLine();

		inputUser.close();

		// create file if it allready doesen't exists
		java.io.File file = new java.io.File(fileName);

		// create an object for write text in the file
		PrintWriter input = new PrintWriter(file);
		// calling methods to write text in the file
		input.println("90");
		input.println("75");
		input.println("91");
		input.println("79");

		input.close();

		try {
			// create object for read form file
			Scanner output = new Scanner(file);
			double sum = 0;
			int numberOfScores = 0;

			// loop while there is text
			while (output.hasNext()) {
				// asign value read form the file to the score variable
				double score = output.nextDouble();
				sum += score;
				numberOfScores++;
			}

			output.close();

			// print results
			System.out.println("Number of scores in the file : "
					+ numberOfScores);
			System.out.println("Total is: " + sum);
			System.out.println("Average is : " + (sum / numberOfScores));

			// catch exception if file not found
		} catch (FileNotFoundException e) {
			System.out.println("File doesent exists.");
		}
	}
}
