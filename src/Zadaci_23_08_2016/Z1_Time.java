package Zadaci_23_08_2016;

/**1 (The Time class) Design a class named Time. The class contains:*/
// The data fields hour, minute, and second that represent a time.
//A no-arg constructor that creates a Time object for the current time. (The
//values of the data fields will represent the current time.)
//A constructor that constructs a Time object with a specified elapsed time
//since midnight, January 1, 1970, in milliseconds. (The values of the data
//fields will represent this time.)
//A constructor that constructs a Time object with the specified hour, minute,
//and second.
//Three getter methods for the data fields hour, minute, and second,
//respectively.
//A method named setTime(long elapseTime) that sets a new time
//for the object using the elapsed time. For example, if the elapsed time is
//555550000 milliseconds, the hour is 10, the minute is 19, and the second is
//10.
/**
 Draw the UML diagram for the class and then implement the class. Write
 a test program that creates two Time objects (using new Time() and new
 Time(555550000)) and displays their hour, minute, and second in the format
 hour:minute:second.*/
/**
 * (Hint: The first two constructors will extract the hour, minute, and second
 * from the elapsed time. For the no-arg constructor, the current time can be
 * obtained using System.currentTimeMillis(), as shown in Listing 2.7,
 * ShowCurrentTime.java.)
 */
/**
 * Time ---------- +hour : int +minute : int +second ; int -elapsedTime : long
 * ---------------- Time() Time(elapsedTime : long) Time(hour: int, minut: int,
 * second : int) getHours: int getMinutes : int getSeconds: int
 * setTime(elapsedTime: long): void toString() : String
 * */

public class Z1_Time {

	public static void main(String[] args) {

		// create two objects
		Time time1 = new Time();
		Time time2 = new Time(555550000);

		// print
		System.out.println("Current time: " + time1.getHours() + ":"
				+ time1.getMinutes() + ":" + time1.getSeconds());
		System.out.printf("Desired time:  " + time2.getHours() + ":"
				+ time1.getMinutes() + ":" + time2.getSeconds());
	}

}

class Time {

	// The data fields hour, minute, and second that represent a time
	private int hour;
	private long minute;
	private long second;

	// A no-arg constructor that creates a Time object for the current time.
	Time() {
		// The values of the data fields represent the current time.
		long totalMiliseconds = System.currentTimeMillis();
		second = (totalMiliseconds / 1000) % 60;
		minute = (totalMiliseconds / 1000) / 60 % 60;
		hour = (int) (totalMiliseconds / 1000 / 60 / 60) % 24 + 2;
	}

	// A constructor that constructs a Time object with a specified elapsed time
	// since midnight, January 1, 1970, in milliseconds. (The values of the data
	// fields will represent this time.)

	Time(long time) {
		setTime(time);
	}

	// A constructor that constructs a Time object with the specified hour,
	// minute, and second.
	Time(int hour, int minute, int second) {

	}

	// Three getter methods for the data fields hour, minute, and second,
	// respectively.

	int getHours() {
		return hour;
	}

	long getMinutes() {
		return minute;
	}

	long getSeconds() {
		return second;
	}

	// A method named setTime(long elapseTime) that sets a new time for the
	// object using the elapsed time.
	void setTime(long elapsedTime) {
		// get secondr, minutes and hours from elapsed time
		this.second = (elapsedTime / 1000) % 60;
		this.minute = (elapsedTime / 1000) / 60 % 60;
		this.hour = (int) ((elapsedTime / 1000) / 60 / 60) % 24;
	}

}