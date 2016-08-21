package Zadaci_20_08_2016;

//ULM Diagram
// StopWatch __________ 
// -startTime : long 
// -endTime: long 
//  ----------- 
// +StopWatch(): 
// +start(): long
// +stop(): long 
// +getElapsedTime(): long 

public class Z3_StopWatch {
	// fields
	private long startTime;
	private long endTime;

	// constructor
	public Z3_StopWatch() {
	}

	// get current time (use it for time when program starts)
	long start() {
		return this.startTime = System.currentTimeMillis();
	}

	// get current time (use it for time when program ends)
	long stop() {
		return this.endTime = System.currentTimeMillis();
	}

	// get elapsed time from start to stop program
	long getElapsedTime() {
		return this.endTime - this.startTime;
	}

	/** sorts and displays 10000 randomly chosen numbers* */
	public void selectionSort(int[] list) {
		for (int i = 0; i < list.length - 1; i++) {
			// Find the minimum in the list[i..list.length-1]
			int currentMin = list[i];
			int currentMinIndex = i;

			for (int j = i + 1; j < list.length; j++) {
				if (currentMin > list[j]) {
					currentMin = list[j];
					currentMinIndex = j;
				}
			}
			// Swap list[i] with list[currentMinIndex] if necessary
			if (currentMinIndex != i) {
				list[currentMinIndex] = list[i];
				list[i] = currentMin;
			}
		}
		for (int i = 1; i < list.length; i++) {
			System.out.print(list[i] + "   ");
			// print 100 numbers in one row
			if (i % 100 == 0) {
				System.out.println(list[i]);
			}
		}
	}

	/**
	 * method for displaying a result
	 */
	public String toString() {

		return "Elapsed time: " + getElapsedTime();
	}
}
