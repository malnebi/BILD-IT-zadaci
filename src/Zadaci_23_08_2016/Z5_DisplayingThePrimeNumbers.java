package Zadaci_23_08_2016;

/**
 * 5. (Displaying the prime numbers) Program displays all the prime numbers less
 * than 120 in decreasing order. Useing the StackOfIntegers class stores the
 * prime numbers (e.g., 2, 3, 5, ...) and retrieve and display them in reverse
 * order.
 */
public class Z5_DisplayingThePrimeNumbers {

	public static void main(String[] args) {

		// create an object
		StackOfIntegers primes = new StackOfIntegers();

		// loop until 120 and add primes to the list
		for (int i = 2; i < 120; i++) {

			// call for method from other package to check if it's prime
			if (Zadaci_13_08_2016.Z4_Prosti_Palindrom_Broj.isPrime(i)) {
				primes.push(i); // add primes
			}
		}
		
		// pop an print primes in revere order	
		for (int i = primes.getSize(); i > 0; i--) {
			System.out.print(primes.pop() + " ");
		}
	}

}