package zadaci_08_09_2016;

/**
 * 5. 19.7 (Generic binary search) Implement the following method using binary
 * search. <br>
 * public static <E extends Comparable<E>> int binarySearch(E[] list, E key)
 */
public class Z5_BinarySearch_Generics {

	public static void main(String[] args) {
		// create list of integers (for binary search elements has to be in
		// increasing order)
		Integer[] integers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		// display results of binary search invoking generic method
		System.out.println("Index of element 5 in list lintegers is :"
				+ binarySearch(integers, 5));
	}

	/** generic method returns key element with binary search */
	public static <E extends Comparable<E>> int binarySearch(E[] list, E key) {

		int low = 0; // start index
		int high = list.length; // end index
		// loop
		while (low <= high) {
			int mid = (low + high) / 2; // find middle of the list
			// compare middle element with key
			// if it's the same return it (stop searching)
			// if middle is bigger search in the first half of the list
			// if it's smaller search in the second half of the list
			if (list[mid].compareTo(key) == 0) { // first comparing
				return mid;
			} else if (list[mid].compareTo(key) > 0) { // second comparing
				high = mid - 1;
			} else
				low = mid + 1; // third comparing
		}
		return -low - 1;
	}

}