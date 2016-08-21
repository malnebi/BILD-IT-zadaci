package Zadaci_20_08_2016;

///**4.(The Account class) Design a class named Account that contains:
//A private int data field named id for the account (default 0).
// A private double data field named balance for the account (default 0).
// A private double data field named annualInterestRate that stores the current
//interest rate (default 0). Assume all accounts have the same interest rate.
// A private Date data field named dateCreated that stores the date when the
//account was created.
// A no-arg constructor that creates a default account.
// A constructor that creates an account with the specified id and initial balance.
// The accessor and mutator methods for id, balance, and annualInterestRate.
// The accessor method for dateCreated.
// A method named getMonthlyInterestRate() that returns the monthly
//interest rate.
// A method named getMonthlyInterest() that returns the monthly interest.
// A method named withdraw that withdraws a specified amount from the
//account.
// A method named deposit that deposits a specified amount to the account.
/**
 * Draw the UML diagram for the class and then implement the class. (Hint: The
 * method getMonthlyInterest() is to return monthly interest, not the interest
 * rate. Monthly interest is balance * monthlyInterestRate. monthlyInterestRate
 * is annualInterestRate / 12. Note that annualInterestRate is a percentage,
 * e.g., like 4.5%. You need to divide it by 100.) Write a test program that
 * creates an Account object with an account ID of 1122, a balance of $20,000,
 * and an annual interest rate of 4.5%. Use the withdraw method to withdraw
 * $2,500, use the deposit method to deposit $3,000, and print the balance, the
 * monthly interest, and the date when this account was created.
 */
public class Z4_TestAccount {

	public static void main(String[] args) {

		// for testing class Z4_Account we'll first create objects
		// calling the constructor with arguments for id, name and balance
		Z4_Account acc = new Z4_Account(123, "Maja", 1000);
		Z4_Account acc1 = new Z4_Account(124, "Pavle", 100000);
		Z4_Account acc2 = new Z4_Account(125, "Dejan", 1000);

		/** after creating an objects we'll call some methods */

		// withdrawing sum for an object acc (id=123, name="Maja")
		acc.withdraw(500);

		// withdrawing sum for an object acc2 (id=125, name="Dejan")
		acc2.withdraw(200);

		// withdrawing sum for an object acc1 (id=124, name="Pavle")
		acc1.withdraw(500);

		// deposit sum for and object acc2 (id=125, name="Dejan")
		acc2.deposit(600);

		// displaying all transaction for the objects
		acc2.summary();
		acc1.summary();

		System.out.println();

		//displaying 
		System.out.println(acc1.toString());

	}

}
