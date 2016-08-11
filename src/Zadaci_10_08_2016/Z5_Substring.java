package Zadaci_10_08_2016;

import java.util.Scanner;

/***
 * 5. Napisati program koji pita korisnika da unese dva stringa te provjerava i
 * ispisuje da li je drugi string substring prvog stringa. Na primjer, ukoliko
 * korisnik unese ABCD kao prvi string a BC kao drugi string program mu ispisuje
 * da je BC substring ABCD stringa.
 */
public class Z5_Substring {

	public static void main(String[] args) {
		// kreirane scanner objekta za unos
		Scanner input = new Scanner(System.in);

		// poruke korisniku da unese strig i karakter i unos
		System.out.println("Unesite prvi string: ");
		String str1 = input.nextLine();

		System.out.println("Unesite drugi string: ");
		String str2 = input.nextLine();

		//zatvoren Scanner
		input.close();
		
		// uslov i ispis rezultata
		if (str2.contains(str1)) { // pozivamo metodu contains() na str1 ciji je
									// argument str2
			System.out.println(str1 + " je substring stringa " + str2);
		} else {
			System.out.println(str1 + " nije substring stringa " + str2);
		}

	}

}
