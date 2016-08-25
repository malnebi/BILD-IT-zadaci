package Zadaci_24_08_2016;

import java.math.BigDecimal;

/**
 * 1.(Divisible by 2 or 3) Find the first ten numbers with 50 decimal digits
 * that are divisible by 2 or 3.
 */
public class Z1_DivisibleBy2or3 {

	public static void main(String[] args) {

		String str = "1";

		// create string to represents first 50 decimal digits number
		for (int i = 0; i < 49; i++) {
			str = str + "0";
		}

		// create an object BigDecimal class, calling contructor with String arg
		BigDecimal num = new BigDecimal(str);
		int count = 0;
		while (count < 10) {
			// num has to be divisible by 2 or 3
			if (num.remainder(new BigDecimal(2)).equals(BigDecimal.ZERO)
					|| num.remainder(new BigDecimal(3)).equals(BigDecimal.ZERO)) {

				count++;
				System.out.println(num); // ako je djeljiv sa 2 ili 3, ispisi
			}
			num = num.add(BigDecimal.ONE); // add 1 to num string
		}
	}

}
