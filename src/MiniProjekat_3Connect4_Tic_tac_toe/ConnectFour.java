package MiniProjekat_3Connect4_Tic_tac_toe;

public class ConnectFour {

	static java.util.Scanner input = new java.util.Scanner(System.in);

	public static void main(String[] args) {

		char[][] move = new char[6][7]; // matrix for note moves

		int row = 0;
		int col = 0;

		boolean noWin = true; // control variable for loop

		int countMove_R = 0;
		int countMove_Y = 0;

		// first display of the games table
		displayTable(move, row, col);

		noWin = true;

		while (noWin) {
			do {// print message and take input for column for yellow player
				System.out.println("Drop a yellow disk at column (0–6):");
				col = checkInput();
				row = freeRow(move, col);// finding a free row to put Y
				move[row][col] = 'Y';

			} while (free(row));// if there is no free field - repeat

			displayTable(move, row, col);
			countMove_Y++;

			// on 4th move yellow player has chance to winn, so check it by
			// calling method win()
			if (countMove_Y >= 4 && win(move)) {
				System.out.println("The yellow player won. ");
				break;
			}

			// its red players turn
			do {
				System.out.println("Drop a red disk at column (0–6):");

				col = checkInput();
				row = freeRow(move, col);// finding a free row to put Y
				move[row][col] = 'R';

			} while (free(row));

			displayTable(move, row, col);
			countMove_R++;

			// chance to winn for red player, check method win()
			if (countMove_R >= 4 && win(move)) {
				System.out.println("The red player won. ");
				break;
			}
		}

		// if players played their 21st move, print message and stop loop
		if (!win(move) && (countMove_R == 21 || countMove_Y == 21)) {
			System.out.println("No winner.");
		}
	}

	/** method for printing table */
	public static void displayTable(char[][] move, int row, int col) {

		for (int i = 0; i < move.length; i++) {
			for (int j = 0; j < move[i].length; j++) {
				System.out.print("|" + move[i][j]);
			}
			System.out.print("|");
			System.out.println(); // new line after every code line
		}
		System.out.println("---------------"); // long enging line
		System.out.println(" 0 1 2 3 4 5 6 ");// numbers for column
		System.out.println();
	}

	/** method finds first free row in the column */
	public static int freeRow(char[][] move, int column) {

		int row = -1; // default -1
		for (int i = 5; i >= 0; i--) { // check for free field in the column,
										// loop goes till last row
			if (move[i][column] == (char) 0) {
				row = i; // at first free field return row index
				break;
			}
		}
		return row; // return default if there is no free field
	}

	/** method check if there is free fielnd in the column */
	public static boolean free(int row) {
		if (row < 0) {
			System.out.println("There is no free field, chose new column. ");
			return true;
		} else
			return false;

	}

	/**
	 * check if there is winner: if there is 4 same elements in row, column or
	 * diagonal return true
	 */
	public static boolean win(char[][] move) {

		// check the elements in row (horizontal)
		for (int i = 5; i >= 0; i--) {
			// count matches
			int count4 = 1;
			for (int j = 0; j < 6; j++) {
				if (move[i][j] != (char) 0 && move[i][j] == move[i][j + 1])
					count4++; // every match increase counter
				else
					// if there is no match
					count4 = 1;// return counter on 1

				if (count4 == 4)
					return true;
			}
		}

		// checking the elements in column (vertical)
		for (int j = 0; j <= 6; j++) {

			int count4 = 1;

			for (int i = 5; i > 0; i--) {

				if (move[i][j] != (char) 0 && move[i][j] == move[i - 1][j])
					count4++;// every match increase counter
				else
					// if there is no match
					count4 = 1;// return counter on 1

				if (count4 == 4)
					return true;
			}
		}
		// check the elements in the right diagonal (/)
		for (int i = 5; i >= 3; i--) {
			for (int j = 0; j <= 3; j++) {
				if (move[i][j] == move[i - 1][j + 1]
						&& move[i][j] == move[i - 2][j + 2]
						&& move[i][j] == move[i - 3][j + 3])
					return true;
			}
		}
		// check the elements in the left diagonal (\)
		for (int i = 5; i >= 3; i--) {
			for (int j = 3; j <= 6; j++) {
				if (move[i][j] == move[i - 1][j - 1]
						&& move[i][j] == move[i - 2][j - 2]
						&& move[i][j] == move[i - 3][j - 3])
					return true;
			}
		}

		return false;

	}

	/** check users input ***/
	public static int checkInput() {
		int num = 0;
		boolean error = true; // check for error

		do {
			try {
				// input has to be an integer, between 0 and 6
				num = input.nextInt();
				if (num < 0 || num > 6)
					throw new Exception();
				error = false;

			} catch (Exception e) {

				System.out.print("Wrong input, try again...:  ");
				input.nextLine();
			}

		} while (error);// loop continue while there is an error

		return num;
	}
}
