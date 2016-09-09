package zadaci_08_09_2016;

/**
 * 3. 19.5 (Maximum element in an array) Implement the following method that
 * returns the maximum element in an array.<br>
 * public static <E extends Comparable<E>> E max(E[] list)
 */
public class Z3_MaxElementInArray_Generics {

	public static void main(String[] args) {
		// create list of integers
		Integer[] integers = { 1, 5, 8, 15, 23, 12, 58 };
		// create list of doubles
		Double[] doubles = { 4.02, 8.5, 2.9, 7.2 };

		// display results invoking generic method
		System.out.println("Max element in the list of integers is "
				+ max(integers));
		System.out.println("Max element in the list of doubles is "
				+ max(doubles));
	}

	/** generic method returns maximum element in an array */
	public static <E extends Comparable<E>> E max(E[] list) {
		// max object of generic type
		E max = list[0]; // default is value of the first element

		for (int i = 1; i < list.length; i++) {
			// if current max is smaller then current element in list
			// max gets value of the current element
			if (max.compareTo(list[i]) < 0) {
				max = list[i];
			}
		}
		return max;

	}
}
