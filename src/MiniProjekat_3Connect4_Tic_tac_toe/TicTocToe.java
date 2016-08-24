package MiniProjekat_3Connect4_Tic_tac_toe;

public class TicTocToe {

	static java.util.Scanner input = new java.util.Scanner(System.in);

	public static void main(String[] args) {
		// create matrix to note moves
		char[][] move = new char[3][3];

		int row = 0;
		int col = 0;
		// control variable for loop
		boolean noWin = true;

		// move counters
		int countMove_X = 0;
		int countMove_O = 0;

		// display table at begining
		displayTable(move, row, col);

		// if players played their 5th move, print message and stop loop
		if (win(move) == false && (countMove_O == 5 || countMove_X == 5)) {
			System.out.println("No winner.");
			noWin = true;
		}

		while (noWin) {

			// print message and take input for row and column for player X
			do {
				System.out.println("Enter a row (0, 1, or 2) for player X:");
				row = checkInput();
				System.out.println("Enter a column (0, 1, or 2) for player X:");
				col = checkInput();

			} while (!free(move, row, col)); // repeat input if place is taken

			move[row][col] = 'X'; // note move for playar X

			displayTable(move, row, col);

			countMove_X++;

			// on 3rd move player X has chance to winn, so check method win()
			if (countMove_X >= 3 && win(move)) {
				System.out.println("X player won. ");
				break;
			}

			// print message and take input for row and column for player X
			do {
				System.out.println("Enter a row (0, 1, or 2) for player O:");
				row = checkInput();
				System.out.println("Enter a column (0, 1, or 2) for player O:");
				col = checkInput();

			} while (!free(move, row, col) == false); // repeat input if place
														// is taken

			move[row][col] = 'O'; // note player Os move

			countMove_O++;

			displayTable(move, row, col);

			// chance to win for player O
			if (countMove_O >= 3 && win(move)) {
				System.out.println("O player won. ");
				break;
			}
		}

	}

	/** method for printing table */
	public static void displayTable(char[][] move, int row, int col) {

		for (int i = 0; i < move.length; i++) {
			System.out.println("-------------"); // print line
			for (int j = 0; j < move[i].length; j++) {
				System.out.print("| " + move[i][j] + " ");
			}
			System.out.print("|");
			System.out.println(); // new line after every code line
		}
		System.out.println("-------------"); // long enging line

	}

	/** check if place is taken */
	public static boolean free(char[][] move, int row, int col) {

		if (move[row][col] == 'X' || move[row][col] == 'O') {
			System.out
					.println("Incorrenct entry, place is allready taken. Pick another one.");
			return false; // not free
		} else
			return true; // its free
	}

	/** check if there is winner */
	public static boolean win(char[][] move) {

		// checking elements in row (horizontal)
		for (int i = 0; i < move.length; i++) {
			if (move[i][0] == move[i][1] && move[i][1] == move[i][2])
				return true;
		}

		// checking elements in column (vertical)
		for (int j = 0; j < move[0].length; j++) {

			if (move[0][j] == move[1][j] && move[1][j] == move[2][j])
				return true;
		}

		// check the diagonal elements
		if ((move[0][0] == move[1][1] && move[0][0] == move[2][2])
				|| (move[0][2] == move[1][1] && move[0][2] == move[2][0])) {
			return true;
		}

		return false;

	}

	/** check users input ***/
	public static int checkInput() {
		int num = 0;
		boolean error = true; // check for error

		do {
			try {
				// input has to be an integer, between 0 and 2
				num = input.nextInt();
				if (num < 0 || num > 2)
					throw new Exception();
				error = false;

			} catch (Exception e) {

				System.out.print("Wrong input, try again...:  ");
				input.nextLine();
			}
			// loop continue while there is an error
		} while (error);

		return num;
	}
}
