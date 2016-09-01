package Zadaci_31_08_2016;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/***
 * 12.24 (Create large dataset) Create a data file with 1,000 lines. Each line
 * in the file consists of a faculty member’s first name, last name, rank, and
 * salary. The faculty member’s first name and last name for the ith line are
 * FirstNamei and LastNamei. The rank is randomly generated as assistant,
 * associate, and full. The salary is randomly generated as a number with two
 * digits after the decimal point. The salary for an assistant professor should
 * be in the range from 50,000 to 80,000, for associate professor from 60,000 to
 * 110,000, and for full professor from 75,000 to 130,000. Save the file in
 * Salary.txt. Here are some sample data:
 */
// FirstName1 LastName1 assistant 60055.95
// FirstName2 LastName2 associate 81112.45
// . . .
// FirstName1000 LastName1000 full 92255.21
public class Z5_CreateLargeDataSet {

	public static void main(String[] args) throws FileNotFoundException {

		// create file
		File file = new File("Salary.txt");

		// create object for write into the file
		PrintWriter input = new PrintWriter(file);

		// rank : assistant, associate, full (randomly)
		// create an array of
		String[] rank = { "assistent", "associate", "full" };

		// loop to write 1000 lines
		for (int i = 0; i < 1000; i++) {

			input.print("FirstName" + i + " ");
			input.print("LastName" + i + " ");

			int rankIndex = (int) (Math.random() * 2);
			input.print(rank[rankIndex] + " ");

			// get salary for every rank randomly
			double assistentSalary = Math.random() * 30000 + 50000;
			double associateSalary = Math.random() * 50000 + 60000;
			double fullSalary = Math.random() * 65000 + 75000;

			// salary is based on ranking
			switch (rankIndex) {
			case 0: // if it randomly choosen 0 write salary for assistent
				input.printf("  %6.2f\n", assistentSalary);
				break;
			case 1: // if it randomly choosen 0 write salary for associate
				input.printf("  %6.2f\n", associateSalary);
				break;
			case 2: // if it randomly choosen 0 write salary for full
				input.printf("  %6.2f\n", fullSalary);
				break;
			}

		}
		input.close();
	}

}
