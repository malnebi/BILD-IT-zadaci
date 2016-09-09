package zadaci_08_09_2016;

import java.util.ArrayList;

/**
 * 1. 19.3 (Distinct elements in ArrayList) Write the following method that
 * returns a new ArrayList. The new list contains the non-duplicate elements
 * from the original list. <br>
 * public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list)
 */
public class Z1_DistinctElementsInArrayList_Generic {

	static java.util.Scanner input = new java.util.Scanner(System.in);

	public static void main(String[] args) {

		// message to the user
		System.out.println("Enter 10 integer numbers: ");

		// create ArrayList for entered numbers
		ArrayList<Integer> list = new ArrayList<Integer>();

		// add elements to the lists
		for (int i = 0; i < 10; i++) {
			list.add(checkInput());
		}

		// create new list for unique elements, invoke generic method
		ArrayList<Integer> unique = removeDuplicates(list);

		System.out.println("The unique numbers are: ");
		// print unique elements
		for (int i = 0; i < unique.size(); i++) {
			System.out.print(unique.get(i) + " ");
		}
	}

	/**
	 * generic method returns list of unique elements generic type (it is
	 * applicable for any type of object(Integer, String, Double...) in list)
	 */
	public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {

		// creating new array list where we will store numbers
		ArrayList<E> unique = new ArrayList<E>();

		// check every element of the list
		for (int i = 0; i < list.size(); i++) {
			// if unique list doesn't contain the element, add it to the unique
			// list
			if (!unique.contains(list.get(i))) {
				unique.add(list.get(i));
			}
		}
		return unique;
	}

	/** checking input */
	public static int checkInput() {
		int num = 0;
		boolean error = true; // check for error

		do {
			try {
				num = input.nextInt();

				// number must be integer nonnegativ number
				if (num < 0)
					throw new Exception();
				error = false;

			} catch (Exception e) {
				// message to the user
				System.out.print("Wrong entry, try again:  ");
				input.nextLine();
			}
			// loop till there is error
		} while (error);

		return num;
	}
}