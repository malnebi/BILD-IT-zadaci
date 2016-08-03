package Zadaci_02_08_2016;

public class Z1_PrestupneGodine {
	/**
	 * Program ispisuje sve prestupne godine, 10 po liniji, odvojene jednim
	 * spaceom, od godine 101 do 2100, i njihov ukupan broj u ovom vremenskom
	 * periodu.
	 */
	public static void main(String[] args) {

		int startY = 101;
		int endY = 2100;
		// varijabla year predstavlja sve godine izmedju pocetne i krajnje
		int year = startY;
		// brojac za kontrolu rasporeda 10 brojeva po redu
		int i = 0;
		// broj brojeva u jednom redu
		final int NUMBERS_IN_A_ROW = 10;
		// brojac prestupnih godina
		int counter = 0;

		while (year < endY) {
			// provjera da li je godina prestupna, ako jeste uvecava brojac
			// counter
			if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
				i++;
				// uslov za ispis 10 godina u jednom redu
				if (i % NUMBERS_IN_A_ROW == 0) {
					System.out.println(year);
					counter++;
				} else {
					System.out.print(year + " ");
					counter++;
				}
			}
			year++;
		}
		System.out.println();
		System.out.println("Izmedju " + startY + ". i " + endY + ". godine "
				+ (endY < 2016 ? "bilo je " : "bice ") + counter
				+ " prestupnih godina."); // ternarni operator, za izbor izmedju
											// dvije opcije zavisno od
											// posljednje godine
	}

}
