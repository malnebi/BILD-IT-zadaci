package Zadaci_01_09_2016;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

/**
 * 1. 12.25 (Process large dataset) A university posts its employees’ salaries
 * at http:// cs.armstrong.edu/liang/data/Salary.txt. Each line in the file
 * consists of a faculty member’s first name, last name, rank, and salary (see
 * Programming Exercise 12.24). Program display the total salary for assistant
 * professors, associate professors, full professors, and all faculty,
 * respectively, and display the average salary for assistant professors,
 * associate professors, full professors, and all faculty, respectively.
 */
public class Z1_ProcessLargeDataSet {

	public static void main(String[] args) throws IOException {

		// creates URL object to store web adress of textual file
		URL url = new URL("http://cs.armstrong.edu/liang/data/Salary.txt");

		// create object to read form a web file
		Scanner input = new Scanner(url.openStream());

		// variables for total salary of a rank
		double totalAssistant = 0;
		double totalAssociate = 0;
		double totalFull = 0;

		// counters
		int countAssistant = 0;
		int countAssociate = 0;
		int countFull = 0;

		while (input.hasNext()) { // loop while there is strings

			String rank = input.next(); // read a string

			// find appropriate rank to get salary
			switch (rank) {

			case "assistant": // if a read string is "assistent" use next double
				totalAssistant += input.nextDouble();
				countAssistant++;
				break;
			case "associate":// if a read string is "associate" use next double
				totalAssociate += input.nextDouble();
				countAssociate++;
				break;
			case "full":// if a read string is "full" use next double
				totalFull += input.nextDouble();
				countFull++;
				break;
			}
		}

		input.close();
		// get average for every rank
		double averageAssistant = totalAssistant / countAssistant;
		double averageAssociate = totalAssociate / countAssociate;
		double averageFull = totalFull / countFull;

		// dispaly results
		System.out
				.printf("For ASSISTANT profesors: \n - total salary is %.2f \n - average is  %.2f",
						totalAssistant, averageAssistant);
		System.out
				.printf("\nFor ASSOCIATE profesors: \n - total salary is %.2f \n - average is %.2f",
						totalAssociate, averageAssociate);
		System.out
				.printf("\nFor FULL profesors: \n - total salary is %.2f \n - average is %.2f",
						totalFull, averageFull);

	}

}
