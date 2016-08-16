package MiniProjekat_2;

/**
 * (Game: craps) Craps is a popular dice game played in casinos. Write a program
 * to play a variation of the game, as follows: Roll two dice. Each die has six
 * faces representing values 1, 2, …, and 6, respectively. Check the sumFirstof
 * the two dice. If the sumFirstis 2, 3, or 12 (called craps), you lose; if the
 * sumFirstis 7 or 11 (called natural), you win; if the sumFirstis another value
 * (i.e., 4, 5, 6, 8, 9, or 10), a point is established. Continue to roll the
 * dice until either a 7 or the same point value is rolled. If 7 is rolled, you
 * lose. Otherwise, you win. Your program acts as a single player. Here are some
 * sample runs. You rolled 5 + 6 = 11 You win You rolled 1 + 2 = 3 You lose You
 * rolled 4 + 4 = 8 point is 8 You rolled 6 + 2 = 8 You win You rolled 3 + 2 = 5
 * point is 5 You rolled 2 + 5 = 7 You lose
 */
public class Craps {

	public static void main(String[] args) {
		// bacanje kockica prvi put
		// ispis i dodjela vrijednosti varijabli sum
		int sumFirst = rollDice();

		// ako je zbir 2, 3 ili 12 - gubitak
		if (sumFirst == 2 || sumFirst == 3 || sumFirst == 12) {

			lose(); // ispis poruke o gubitku

			// ako je zbir 7 ili 11 - pobjeda
		} else if (sumFirst == 7 || sumFirst == 11) {

			win(); // ispis poruke o pobjedi
		}

		else { // u drugim slucajevima (rezultat 4,5,6,8,9 ili 10) dobijamo
			point(sumFirst); // ispis poruke o rezultatu

			int sumNext = sumFirst; // var sumNext dodjeljujemo vrijednost
									// sumFirstda sacuvamo
			// prvu vrijednost

			do {
				sumFirst = sumNext; // sumFirstvracamo vrijednost sumNext ...
				// a za sumNext bacamo kockice

				sumNext = rollDice(); // pozivanje metode za bacanje kockice

				if (sumFirst == sumNext) {// ako je rezultat bacanja kockica
											// jednak
					// prethodnom - pobjeda

					win(); // ispis poruke
					break; // izlazak iz petlje
				} else if (sumNext == 7) { // ako je rezultat 7

					lose(); // ispis poruke
					break; // izlazak iz petlje
				} else {
					point(sumNext);// ispis poruke o rezultatu
				}
			} while (sumNext != 7 || sumFirst != sumNext);// bacanje kockica se
															// nastavlja
			// dok se ne dobije isti
			// rezultat ili 7
		}

	}

	/** metoda vraca ispis poruke o bacanju i rezultat sabiranja */
	public static int rollDice() {

		// nasumicno bacanje kockica
		int dice1 = (int) (Math.random() * 5 + 1);
		int dice2 = (int) (Math.random() * 5 + 1);

		// ispis poruke
		System.out.println("You rolled " + dice1 + " + " + dice2 + " = "
				+ (dice1 + dice2));

		return dice1 + dice2; // rezultat

	}

	/** metoda za ispis poruke o pobjedi */
	public static void win() {
		System.out.println("You win!");
	}

	/** metoda za ispis poruke o gubitku */
	public static void lose() {
		System.out.println("You lose.");
	}

	/** metoda za ispis rezultata sabiranja */
	public static void point(int point) {
		System.out.println("Point is " + point + ". Roll again.");
		System.out.println();
	}
}
