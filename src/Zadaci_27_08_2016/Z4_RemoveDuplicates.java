package Zadaci_27_08_2016;

import java.util.ArrayList;

/**4.
 *11.13 (Remove duplicates) Write a method that removes the duplicate elements from
 an array list of integers using the following header:*/
/**
 * Write a test program that prompts the user to enter 10 integers to a list and
 * displays the distinct integers separated by exactly one space. Here is a
 * sample run:
 */
public class Z4_RemoveDuplicates{

	public static void main(String[] args) {

		// message to the user
		System.out.println("Enter 10 integer numbers: ");

		// create ArrayList for entered numbers
		ArrayList<Integer> list = new ArrayList<Integer>();

		// add elements to the lists
		for (int i = 0; i < 10; i++) {
			list.add(Z1_LargestRowAndColumnIndex.checkInput());
		}

		// calling method to sort list elements

		System.out.println("The unique numbers are: ");
		removeDuplicate(list);
	}

	public static void removeDuplicate(ArrayList<Integer> list) {

		// creating new array list where we will store numbers
		ArrayList<Integer> unique = new ArrayList<Integer>();

		// check every element of the list
		for (int i = 0; i < list.size(); i++) {
			// if unique list doesn't contain the element, adds it to the unique
			// list
			if (!unique.contains(list.get(i))) {
				unique.add(list.get(i));
			}
		}
		// print unique elements
		for (int i = 0; i < unique.size() - 1; i++) {
			System.out.print(unique.get(i) + " ");
		}

	}
}