package Zadaci_20_08_2016;

/*** 3.(Stopwatch) Design a class named StopWatch. The class contains:*/
//Private data fields startTime and endTime with getter methods.
// A no-arg constructor that initializes startTime with the current time.
// A method named start() that resets the startTime to the current time.
// A method named stop() that sets the endTime to the current time.
// A method named getElapsedTime() that returns the elapsed time for the
//stopwatch in milliseconds.
/**
 * Draw the UML diagram for the class and then implement the class. Write a test
 * program that measures the execution time of sorting 100,000 numbers using
 * selection sort.
 */
public class Z3_TestStopWatch {

	public static void main(String[] args) {
		
		Z3_StopWatch watch = new Z3_StopWatch();

		System.out.println("Start time: " + watch.start());

		int[] list = new int[1000];
		for (int i = 0; i < list.length; i++) {
			list[i] = (int) (Math.random() * 100000);
		}

		watch.selectionSort(list);

		System.out.println();
		System.out.println("End time: " + watch.stop());

		System.out.println(watch.getElapsedTime());
		System.out.println(watch.toString());
	}

}
