package Zadaci_01_09_2016;

import java.util.ArrayList;

/**
 * 5. 13.3 (Sort ArrayList) Write the following method that sorts an ArrayList
 * of numbers. public static void sort(ArrayList<Number> list)
 */
public class Z5_SortArrayList {

	public static void main(String[] args) {

		//create list
		ArrayList<Number> list = new ArrayList<>();
		
		// adding numbers to the list randomly 
		for (int i = 0; i < 10; i++) {
			list.add((int) (Math.random() * 100));
		}
		
		// invoking sort method
		sort(list);
	}

	/**method sorts numbers in increasing order*/
	public static void sort(ArrayList<Number> list) {

		// loop goes while there is elements in the list

		// sorting elements from smallest
		for (int i = 0; i <= list.size() - 1; i++) {

			// set first element and its index to the current minimum
			Number currentMin = list.get(i);
			int currentMinIndex = i;

			// go through the list to set minimum to the index of minimum
			for (int j = i + 1; j < list.size(); j++) {
				// if currentMin larger then next swap them
				if (((Comparable<Number>) currentMin).compareTo(list.get(j)) > 0) {
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
