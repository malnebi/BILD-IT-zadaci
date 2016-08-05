package Zadaci_05_08_2016;

/**
 * Program simulira nasumicno izvlacenje karte iz spila od 52 karte. Program
 * ispistuje koja karta je izvuèena (A, 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q ili K)
 * i znak u kojem je data karta (Srce, Pik, Djetelina, Kocka). Primjer: Karta
 * koju ste izvukli je 10 u znaku kocke.
 */
public class Z2_NasumicnoIzvlacenjeKarata {

	public static void main(String args[]) {

		// kreiranje niza koji se sastoji iz broja koji moze imati jedna karta
		String[] broj = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10",
				"J", "Q", "K" };
		// kreiranje niza koji se sastoji iz znakova karata
		String[] znak = { "Srce", "Pik", "Djetelina", "Kocka" };

		// ispis rezultata se vrsi na osnovu pozicije u nizu, index dobijen nasumicno
		System.out.println("Karta koju ste izvukli je: "
				+ broj[(int) (Math.random() * broj.length)] + " "
				+ znak[(int) (Math.random() * znak.length)]); 
	}
}
