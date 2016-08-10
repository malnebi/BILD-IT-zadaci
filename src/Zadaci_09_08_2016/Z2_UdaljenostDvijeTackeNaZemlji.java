package Zadaci_09_08_2016;

/**
 * Program racuna udaljenost izmedju dvije tacke na osnovu unesenih koordinata.
 * Korisnik unosi stepene a program ih konvertuje u radijane (jer Java
 * trigonometrijske metode koriste radiane) i racuna udaljenost po formuli: d =
 * radius * arccos (sin(x1) X * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2)).
 * Sirina i duzina u ovoj formuli se odnose na zapad i sjever. Koristimo
 * negativne vrijednosti da oznaèimo istok i jug.
 */
public class Z2_UdaljenostDvijeTackeNaZemlji {

	static java.util.Scanner input = new java.util.Scanner(System.in);

	public static void main(String[] args) {

		// poruka korisniku i pozivanje metode u kojoj se korisnikov unos
		// pretvara u radiane
		System.out.println("Unesite koordinate prve tacke u stepenima: ");
		double x1 = enterAndConvert();
		double y1 = enterAndConvert();

		System.out.println("Unesite koordinate druge tacke u stepenima: ");
		double x2 = enterAndConvert();
		double y2 = enterAndConvert();

		input.close();

		final double EARTHS_RADIUS = 6371.01;

		double greatCircleDistance;

		greatCircleDistance = EARTHS_RADIUS
				* Math.acos((Math.sin(x1) * Math.sin(x2) + Math.cos(x1)
						* Math.cos(x2) * Math.cos(y1 - y2)));// degrees into
																// Math.toRadians()

		System.out.println("Rastojanje izmedju dvije tacke je: "
				+ greatCircleDistance);
	}

	/** metoda za pretvaranje unosa u radiane */

	public static double enterAndConvert() {

		// korisnikov unos
		double point = input.nextDouble();

		// pretvaranje stepena u radijane
		point = Math.toRadians(point);

		return point;
	}
}
