package zadaci_08_09_2016;

/**
 * 2. 19.4 (Generic linear search) Implement the following generic method for
 * linear search. <br>
 * public static <E extends Comparable<E>> int linearSearch(E[] list, E key)
 */
public class Z2_LinearSearch_Generics {

	public static void main(String[] args) {

		// create lists of objects various types
		Integer[] integers = { 3, 5, 1, 2, 4 };
		String[] strings = { "London", "Paris", "New York", "Austin" };
		Double[] doubles = { 2.2, 5.2, 2.1, 7.2 };

		// implementation generic method for linear search elements
		System.out.println("Index of element 1 in list lintegers is :"
				+ linearSearch(integers, 1));
		System.out.println("Index of element Paris in list strings is :"
				+ linearSearch(strings, "Paris"));
		System.out.println("Index of element 2.2 in list double is :"
				+ linearSearch(doubles, 2.2));

	}

	/** generic method returns key element with linear search */
	public static <E extends Comparable<E>> int linearSearch(E[] list, E key) {

		// loop till find key element
		for (int i = 0; i < list.length; i++) {
			if (key.compareTo(list[i]) == 0)
				return i;
		}
		return -1; // return value if element isn't in the list
	}
}
