package Zadaci_01_09_2016;

import java.util.ArrayList;

/**
 * 4. 13.2 (Shuffle ArrayList) Write the following method that shuffles an
 * ArrayList of numbers:
 * */
// public static void shuffle(ArrayList<Number> list)
public class Z4_ShuffleArrayList {

	public static void main(String[] args) {

		// create list
		ArrayList<Number> list = new ArrayList<>();

		// adding numbers to the list increasing order
		for (int i = 1; i < 10; i++) {
			list.add(i);
		}
		// invoking the shuffle method
		shuffle(list);

	}

	/** method prints numbers shuffled */
	public static void shuffle(ArrayList<Number> list) {
		// loop goes while there is elements in the list
		for (int i = 0; i < list.size(); i++) {

			// num stores value of element we remove
			Number num = list.get(i);

			// removing element
			list.remove(list.get(i));

			// creating random index
			int random = (int) (Math.random() * list.size() - 1);

			// adding back the value of element we removed at random index
			list.add(random, num);
		}
		// prints shuffled list
		System.out.print(list);

	}

}
