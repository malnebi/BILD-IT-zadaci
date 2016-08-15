package Zadaci_15_08_2016;

/**
 * 1. Program nasumicno generise cijeli broj izmedju 1 i 12 i ispisuje ime
 * mjeseca za taj broj. (Januar za 1, Ferbruar za 2....)
 */
public class Z1_NasumicniMjeseci {

	public static void main(String[] args) {

		// broj za mjesec generisan nasumicno
		// da rezultat ne bi mogao da bude 0 pisemo + 1
		int month = (int) (Math.random() * 12) + 1;

		// niz sa imenima mjeseci
		String[] monthName = { "januar", "februar", "mart", "april", "maj",
				"juni", "juli", "avgust", "septembar", "oktobar", "novembar",
				"decembar" };

		// broj mjeseca
		System.out.print(month + ". mjesec je ");
		// naziv mjeseca (month - 1 posto index pocinje od nule)
		System.out.println(monthName[month - 1] + ". ");

	}

}
