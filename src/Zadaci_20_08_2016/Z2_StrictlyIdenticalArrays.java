package Zadaci_20_08_2016;

/***
 * 2.(Strictly identical arrays) The two-dimensional arrays m1 and m2 are
 * strictly identical if their corresponding elements are equal. Write a method
 * that returns true if m1 and m2 are strictly identical, using the following
 * header: public static boolean equals(int[][] m1, int[][] m2) Write a test
 * program that prompts the user to enter two 3 * 3 arrays of integers and
 * displays whether the two are strictly identical. 
 * */
public class Z2_StrictlyIdenticalArrays {
	// creating Scanner object
	static java.util.Scanner input = new java.util.Scanner(System.in);

	public static void main(String[] args) {

		// message to the user and creating matrix
		System.out.print("Enter list1: ");
		int[][] m1 = createMatrix();

		System.out.print("Enter list2: ");
		int[][] m2 = createMatrix();

		input.close();
		// call on method equals(m1,m2) check whether the marices are or
		// aren't strictly identical, and print appropriate message
		boolean bul = equals(m1, m2);

		if (bul == true)
			System.out.println("The two arrays are strictly identical");
		else
			System.out.println("The two arrays ARE NOT strictly identical");
		System.out.println();

	}

	/** method for creating a matrix */
	public static int[][] createMatrix() {

		// create matrix and take values from the user
		int[][] m = new int[3][3];

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = input.nextInt();
			}
		}
		return m;
	}

	/**
	 * method compaires the value of each element of the two matrices and return
	 * true or false
	 */
	public static boolean equals(int[][] matrica1, int[][] matrica2) {
		int counter = 0;
		for (int i = 0; i < matrica1.length; i++) {
			for (int j = 0; j < matrica1.length; j++) {
				if (matrica1[i][j] == matrica2[i][j])
					counter++;
			}
		}
		if (counter == 9)
			return true;
		else
			return false;
	}
}
