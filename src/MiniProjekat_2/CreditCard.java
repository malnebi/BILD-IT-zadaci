package MiniProjekat_2;

/**
 * (Financial: credit card number validation) Credit card numbers follow certain patterns. 
 * A credit card number must have between 13 and 16 digits. It must start with:
 *  4 for Visa cards
 *  5 for Master cards
 *  37 for American Express cards
 *   6 for Discover cards
 *    Credit card numbers are generated following this validity check, commonly known as the 
 *    Luhn check or the Mod 10 check, which can be described as follows 
 *    (for illustration, consider the card number 4388576018402626):
 *    1. Double every second digit from right to left. If doubling of a digit results in a 
 *    two-digit number, add up the two digits to get a single-digit number.
 *    2. Now add all single-digit numbers from Step 1. 
 *    4 + 4 + 8 + 2 + 3 + 1 + 7 + 8 = 37 
 *    3. Add all digits in the odd places from right to left in the card number. 
 *    6 + 6 + 0 + 8 + 0 + 7 + 8 + 3 = 38
 *    4. Sum the results from Step 2 and Step 3. 
 *    37 + 38 = 75 
 *    5. If the result from Step 4 is divisible by 10, the card number is valid; otherwise, 
 *    it is invalid. For example, the number 4388576018402626 is invalid, but the 
 *    number 4388576018410707 is valid. 
 *    Write a program that prompts the user to enter a credit card number as a long 
 *    integer. Display whether the number is valid or invalid.   
 */
import java.util.Scanner;

public class CreditCard {
	
	// varijable sa vrijednostima za prefikse brojeva navedenih kartica
	public static final int PREFIX_VISA = 4;
	public static final int PREFIX_MASTER = 5;
	public static final int PREFIX_AMERICAN_EXPRESS = 37;
	public static final int PREFIX_DISCOVER = 6;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Molimo unesite broj kreditne kartice:");

		long number = input.nextLong();
		input.close();

		if (isValid(number)) {
			System.out.println("Broj koji ste unijeli je validan.");
		} else
			System.out.println("Broj koji ste unijeli nije validan.");

		// 4388576018402626 is invalid
		// 4388576018410707 is valid.
	}

	/** Return true if the card number is valid */
	public static boolean isValid(long number) {

		// suma brojeva na parnim (duplirani) i neparnim mjestima u broju racuna
		int sum = sumOfDoubleEvenPlace(number) + sumOfOddPlace(number);

		// ako je velicina broja izmedju 13 and 16, a suma podiejljena sa 10 bez
		// ostatka, vraca true
		if (getSize(number) >= 13 && getSize(number) <= 16 && sum % 10 == 0) {
			// provjera da li se prefiks slaze sa nekim od ponudjenih
			if (prefixMatched(number, PREFIX_VISA)
					|| prefixMatched(number, PREFIX_MASTER)
					|| prefixMatched(number, PREFIX_AMERICAN_EXPRESS)
					|| prefixMatched(number, PREFIX_DISCOVER))
				;
			return true;
		} else
			return false;
	}

	/** Get the result from Step 2 */
	public static int sumOfDoubleEvenPlace(long number) {

		int sum = 0;
		while (number != 0) {
			// dobijanje posljednje dvije cifre broja racuna
			int dig = (int) (number % 100);

			// od posljednje dvije cifre dobijamo prvu
			dig = dig / 10;

			// iz broja racuna izbacujemo posljednje 2 cifre i dobijamo novi
			// broj
			number = number / 100;
			// zbir cifara
			// metodom getDigit(dig) dobijamo cifru za sabiranje
			sum = sum + getDigit(dig);
		}
		return sum;
	}

	/**
	 * Return this number if it is a single digit, otherwise, return the sum of
	 * the two digits
	 */
	public static int getDigit(int number) {

		// ako je broj pomnozen sa 2 dvocifren sabiramo njegove cifre
		number = number * 2;
		if (number >= 10) {
			// rastavljanje broja na cifre
			int dig1 = number / 10;
			int dig2 = number % 10;
			// vraca zbir cifara kod dvocifrenog broja
			return dig1 + dig2;
		} else {
			// vraca broj ako je jednocifren
			return number;
		}
	}

	/** Return sum of odd-place digits in number */
	public static int sumOfOddPlace(long number) {

		// zbir ima pocetnu vrijednost posljednje cifre
		int sum = (int) (number % 10);

		number = number / 10; // broj je skracen za posljednju cifru

		while (number != 0) {
			// dobijamo pretposljednju cifru
			int dig = (int) (number % 100 / 10);
			number = number / 100; // izbacujemo posljednje dvije cifre
			sum = sum + dig;
		}
		return sum;
	}

	/** vraca true ako je cifra d ista kao prefiks broja kartice */
	public static boolean prefixMatched(long number, int d) {

		// prefiks broja racuna
		int prefix = (int) getPrefix(number, getSize(d));
		// ispistuje da li je prefiks broja isti kao d
		if (prefix == d)
			return true;
		else
			return false;

	}

	/** vraca broj cifara u d*/
	public static int getSize(long d) {
		int numDig = 0;
		// broj ima cifara onoliko koliko puta se moze podijeliti sa 10
		while (d != 0) {
			d = d / 10;
			numDig++;
		}
		return numDig;
	}

	/**
	 * Return the first k number of digits from number. If the number of digits
	 * in number is less than k, return number.
	 */
	public static long getPrefix(long number, int k) {

		int num = getSize(number) - k;

		for (int i = 0; i < num; i++) {
			number = number / 10; // dijeljenjem broja sa 10 dolazi do
									// prefiksa
		}
		return number; // vraca prefiks
	}
}
