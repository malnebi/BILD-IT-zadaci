package Zadaci_27_08_2016;

import java.util.ArrayList;

/**
 * 2. 11.11 (Sort ArrayList) Write the following method that sorts an ArrayList
 * of numbers:
 */
// public static void sort(ArrayList<Integer> list)
/**
 * Write a test program that prompts the user to enter 5 numbers, stores them in
 * an array list, and displays them in increasing order.
 */

public class Z2_SortArrayList {

	static java.util.Scanner input = new java.util.Scanner(System.in);

	public static void main(String[] args) {

		// message to the user
		System.out.println("Enter 5 integer numbers: ");

		// create ArrayList for entered numbers
		ArrayList<Integer> list = new ArrayList<Integer>();

		// add elements to the lists
		for (int i = 1; i < 6; i++) {
			list.add(Z1_LargestRowAndColumnIndex.checkInput());
		}

		// calling method to sort list elements
		sort(list);

	}

	public static void sort(ArrayList<Integer> list) {

		// sorting elements from smallest
		for (int i = 0; i <= list.size() - 1; i++) {

			// set first element and its index to the current minimum
			int currentMin = list.get(i);
			int currentMinIndex = i;

			// go through the list to set minimum to the index of minimum
			for (int j = i + 1; j < list.size(); j++) {
				// if currentMin larger then next swap them
				if (currentMin > list.get(j)) {
					currentMin = list.get(j);
					currentMinIndex = j;
				}
			}
			// swap list.get(i) and list.get(currentMinIndex) if necessary
			if (currentMinIndex != i) {
				list.set(currentMinIndex, list.get(i));
				list.set(i, currentMin);
			}

		}
		// print sorted list
		for (int i = 0; i <= list.size() - 1; i++) {
			System.out.print(" " + list.get(i));
		}
	}

}