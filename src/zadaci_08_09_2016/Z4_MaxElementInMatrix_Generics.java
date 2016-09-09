package zadaci_08_09_2016;

/**
 * 4. 19.6 (Maximum element in a two-dimensional array) Write a generic method
 * that returns the maximum element in a two-dimensional array.<br>
 * public static <E extends Comparable<E>> E max(E[][] list)
 */
public class Z4_MaxElementInMatrix_Generics {

	public static void main(String[] args) {

		// create matrix of integers
		Integer[][] integers = { { 1, 2, 3, }, { 2, 1, 5 }, { 8, 2, 5 } };
		// create matrix of doubles
		Double[][] doubles = { { 4.02, 8.5, 7.2 }, { 8.5, 2.9, 7.2 },
				{ 4.02, 8.5, 2.9, } };

		// display results invoking generic method
		System.out.println("Max element in the list of integers is "
				+ max(integers));
		System.out.println("Max element in the list of doubles is "
				+ max(doubles));
	}

	/** generic method returns maximum element in a matrix */
	public static <E extends Comparable<E>> E max(E[][] list) {
		// max object of generic type
		E max = list[0][0]; // default is value of the first element

		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list[i].length; j++) {
				// if current max is smaller then current element in list
				// max gets value of the current element
				if (max.compareTo(list[i][j]) < 0) {
					max = list[i][j];
				}
			}
		}
		return max;
	}
}
