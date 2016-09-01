package Zadaci_31_08_2016;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

/**
 * 4. 12.23 (Process scores in a text file on the Web) Suppose that the text
 * file on the Web http://cs.armstrong.edu/liang/data/Scores.txt contains an
 * unspecified number of scores. Program reads the scores from the file and
 * displays their total and average. Scores are separated by blanks.
 */
public class Z4_ProcesInTextFileFromWeb {

	public static void main(String[] args) throws IOException {

		// creates URL object to store web adress of textual file
		URL url = new URL("http://cs.armstrong.edu/liang/data/Scores.txt");

		// create object for read form web file
		Scanner input = new Scanner(url.openStream());

		double sum = 0;
		int numberOfScores = 0;

		// loop while there is text
		while (input.hasNext()) {
			// asign value read from the file to the score variable
			double score = input.nextDouble();
			sum += score; // get total of scores
			numberOfScores++; // get number of scores
		}

		input.close();

		// print results
		System.out.println("Total is: " + sum);
		System.out.println("Average is : " + (sum / numberOfScores));

	}

}
