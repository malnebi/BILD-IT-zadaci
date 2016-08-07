package Zadaci_06_08_2016;

import java.util.InputMismatchException;

/**
 * Program vraca da li je broj koji unese korisnik palindrom.
 * 
 * Metoda: public static int reverse(int number) prima cijeli broj kao argument
 * i vraca isti ispisan naopako. (npr. reverse(456) vraca 654.) Metoda: public
 * static boolean isPalindrome(int number) vraca true ukoliko je broj palindrom
 * a false ukoliko nije. Reverse metoda se koristi za implementaciju
 * isPalindrome metode.
 */
public class Z3_PalindromBroj {

	static java.util.Scanner input = new java.util.Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Unesite cijeli trocifren broj: ");
		int number = checkInput();
		// ispis rezultata koristenjem ternarnog operatora
		System.out.println("Broj " + number
				+ (isPalindrome(number) ? " je " : " nije ") + "palindrom");
	}

	/** metoda za obrtanje broja */
	public static int reverse(int number) {
		
//ako broj nije trocifren????		
//		if(number > 1000){
//			for (int i = number; i < 0; i--) {
//			//ako je jedna cifra onda se ona dodaje u broj
//				if (result < 9){
//				}
//				1234 / 100 = 12
//						12 / 10 = 1
//						12 % 10 = 2
//						1234 % 100 = 3
//						1234 % 1000 = 4 
//				
//				(4554 / 100) % 100 = 
//				554 / 100 
//			}
//		}
		
		// rastavljanje broja za cifre
		int dig1 = number / 100;
		int dig2 = (number % 100) / 10;
		int dig3 = number % 10;
		// sastavljanje novog broja
		int reverse = dig3 * 100 + dig2 * 10 + dig1;
		return reverse;
	}

	/** metoda provjerava da li je broj palindrom */
	public static boolean isPalindrome(int number) {
		int reverse = reverse(number);
		// ako je uneseni broj isti obrnutom onda je palindrom
		if (reverse == number)
			return true;
		else
			return false;
	}

	/** metoda za provjeru unosa */
	public static int checkInput() {
		int number = 0;
		boolean error = true; // varijabla za provjeru
		do {
			try {
				number = input.nextInt();
				error = false;
			} catch (InputMismatchException e) {
				System.out.print("Nevalidan unos, pokusajte ponovo:  ");
				input.nextLine();
			}
		} while (error);
		return number;
	}

}
