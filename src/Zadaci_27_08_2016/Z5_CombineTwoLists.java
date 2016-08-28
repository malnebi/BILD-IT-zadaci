package Zadaci_27_08_2016;

import java.util.ArrayList;

/**5.
 11.14 (Combine two lists) Write a method that returns the union of two array lists of
 integers using the following header:*/
//public static ArrayList<Integer> union( ArrayList<Integer> list1, ArrayList<Integer> list2)
/**
 * For example, the union of two array lists {2, 3, 1, 5} and {3, 4, 6} is {2,
 * 3, 1, 5, 3, 4, 6}. Write a test program that prompts the user to enter two
 * lists, each with five integers, and displays their union. The numbers are
 * separated by exactly one space in the output. Here is a sample run:
 */
// Enter five integers for list1: 3 5 45 4 3
// Enter five integers for list2: 33 51 5 4 13
// The combined list is 3 5 45 4 3 33 51 5 4 13*/
public class Z5_CombineTwoLists {

	public static void main(String[] args) {
		// messages to the user
		System.out.println("Enter 5 integers for list1: ");

		// create an object from ArrayList for entered numbers
		ArrayList<Integer> list1 = new ArrayList<Integer>();

		// add elements to the lists
		for (int i = 0; i < 5; i++) {
			// call method from other package and class, to store and check
			// input
			list1.add(Z1_LargestRowAndColumnIndex.checkInput());
		}

		System.out.println("Enter 5 integers for list2: ");

		// create an object from ArrayList for entered numbers
		ArrayList<Integer> list2 = new ArrayList<Integer>();

		// add elements to the lists
		for (int i = 0; i < 5; i++) {
			list2.add(Z1_LargestRowAndColumnIndex.checkInput());
		}

		System.out.println("The combined list is ");

		// create new list union and call method to fill it
		ArrayList<Integer> union = union(list1, list2);

		// print union list elements
		for (int i = 0; i < (list1.size() + list2.size()); i++) {
			System.out.print(union.get(i) + " ");
		}

	}

	/** method returns list with all elements from list1 and list2 */
	public static ArrayList<Integer> union(ArrayList<Integer> list1,
			ArrayList<Integer> list2) {
		// create new list union to store elements from list1 and list2
		ArrayList<Integer> union = new ArrayList<Integer>();

		union.addAll(list1);// append all from list1
		union.addAll(list2);// append all from list2

		return union;

	}
}
