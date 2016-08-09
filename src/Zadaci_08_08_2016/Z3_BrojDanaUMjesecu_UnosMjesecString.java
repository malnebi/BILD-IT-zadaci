package Zadaci_08_08_2016;

/**
 * 3. Napisati program koji pita korisnika da unese godinu i prva tri slova
 * imena mjeseca (prvo slovo uppercase) te mu ispiše broj dana u tom mjesecu. Na
 * primjer, ukoliko korisnik kao godinu unese 2001 a kao mjesec Jan program mu
 * ispisuje da Jan 2011 ima 31 dan.
 */
public class Z3_BrojDanaUMjesecu_UnosMjesecString {

	static java.util.Scanner input = new java.util.Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Unesite mjesec (prva tri slova, prvo veliko) :");
		String mjesec = input.nextLine();

		System.out.println("Unesite godinu: ");
		int godina = input.nextInt();

		input.close();

		System.out.println(mjesec + " " + godina + ". godine "
				+ (godina < 2016 ? "imao je " : "imace ")
				+ brojDanaUMjesecu(godina, mjesec) + " dana.");

	}

	public static int brojDanaUMjesecu(int godina, String mjesec) {

		if (mjesec == "Jan" || mjesec == "Mar" || mjesec == "Maj"
				|| mjesec == "Jul" || mjesec == "Avg" || mjesec == "Okt"
				|| mjesec == "Dec")
			return 31;
		if (mjesec == "Apr" || mjesec == "Jun" || mjesec == "Sep"
				|| mjesec == "Nov")
			return 30;
		if (mjesec == "Feb") {
			// ako je godina prestupna 28 dana, 29 ako nije
			return prestupnaGodina(godina) == true ? 28 : 29;
		}
		return 0;
	}

	/** provjera da li je godina prestupna */
	public static boolean prestupnaGodina(int godina) {

		if (godina % 400 == 0 || (godina % 4 == 0 && godina % 100 != 0))
			return true;
		else
			return false;
	}

	// provjera upis mjeseca
	public static String checkInputS() {

		String str = "";
		boolean error = true; // kontrolna varijabla

		do {
			str = input.next();
			// ako je unesen validan naziv mjeseca prekida petlju
			if (tacanNaziv(str)) {
				error = false;
			} else {
				System.out.print("Pogresan unos, unesite ponovo: ");
			}
		} while (error);

		return str;
	}

	public static boolean tacanNaziv(String str) {

		switch (str) {
		case "Jan":
		case "Feb":
		case "Mar":
		case "Apr":
		case "Maj":
		case "Jun":
		case "Jul":
		case "Avg":
		case "Sep":
		case "Okt":
		case "Nov":
		case "Dec":
			return true;
		}
		return false;
	}
}
