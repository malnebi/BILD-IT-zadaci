package Zadaci_04_08_2016;

import java.util.Scanner; 

	/**
	 * Program ispisuje 10 cifreni ISBN broj. Korisnik unese prvih 9 ISBN
	 * cifara a program izracuna posljednju i ispisuje kompletan broj.
	 * (Primjer: ukoliko unesemo, kao prvih 9 brojeva, 013601267 program nam
	 * ispisuje 0136012671 kao ISBN-10 broj. Ukoliko unesemo 013031997 kao prvih
	 * 9 brojeva, program nam ispisuje 013031997X kao ISBN-10 broj)
	 * */

public class Z2_ISBN_broj {
	public static void main(String[] args) {

		// kreiranje Scannera za unos sa konzole
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite 9 cifara ISBN broja: ");

		// kreiranje niza za smjestaj unesenih brojeva
		int[] array = new int[9];

		int result = 0; // zbir brojeva pomnozenih sa indexom + 1

		// uneseni brojevi se smjestaju u niz 
		for (int i = 0; i < array.length; i++) {
			array[i] = unos.nextInt();
			result = array[i] * (i + 1) + result;
		}
		unos.close();

		// petlja za ispis dijela ISBN broja, unesenog od strane korisnika
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}

		int checksum = result % 11; // izracunavanje posljednjeg broja i
									// dodavanje na uneseni dio
		if (checksum == 10) // ukoliko je to 10 dodaje se X prema konvencij
			System.out.print("X");
		else
			System.out.println(checksum);
	}
}
