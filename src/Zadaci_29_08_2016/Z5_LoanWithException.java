package Zadaci_29_08_2016;

/**
 * 5. 12.4 (IllegalArgumentException) Modify the Loan class in Listing 10.2 to
 * throw IllegalArgumentException if the loan amount, interest rate, or number
 * of years is less than or equal to zero.
 */
public class Z5_LoanWithException {
	static java.util.Scanner input = new java.util.Scanner(System.in);

	public static void main(String args[]) {
		// print message to the uset
		System.out
				.println("Enter anual interest rate, number of years and loan amond:");

		// to test exception try to enter zero or less
		double annualInterestRate = input.nextDouble();
		int numberOfYears = input.nextInt();
		double loanAmount = input.nextDouble();

		// create contructor with specified fields
		Loan loan = new Loan(annualInterestRate, numberOfYears, loanAmount);

		System.out.println();
		if (numberOfYears == 0 || loanAmount == 0 || annualInterestRate == 0) {
			System.out
					.println("Results of calling methods if we try to enter zero");

			// if we enter 0 will get exception message
			loan.setAnnualInterestRate(annualInterestRate);
			loan.setLoanAmount(loanAmount);
			loan.setNumberOfYears(numberOfYears);
		} else {
			// if we enter correct values
			System.out.println("Annual interest rate is "
					+ loan.getAnnualInterestRate());
			System.out.println("Loan amond is " + loan.getLoanAmount());
			System.out
					.println("Numbers of years is " + loan.getNumberOfYears());
		}
	}
}

class Loan {
	// data fielnds
	private double annualInterestRate;
	private int numberOfYears;
	private double loanAmount;
	private java.util.Date loanDate;

	/** Default constructor that creates default loan */
	public Loan() {
		this(2.5, 1, 1000);
	}

	/**
	 * Construct a loan with specified annual interest rate, number of years,
	 * and loan amount
	 */

	public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
		// if you try to set value to 0 it will trow and exception
		try {
			loanDate = new java.util.Date();
			this.annualInterestRate = annualInterestRate;
			this.numberOfYears = numberOfYears;
			this.loanAmount = loanAmount;
			if (numberOfYears <= 0 || loanAmount <= 0
					|| annualInterestRate <= 0) {
				throw new IllegalArgumentException();
			}
		} catch (IllegalArgumentException e) {
			System.out.println("The items has to be greater than 0!");
		}
		loanDate = new java.util.Date();
	}

	/** Return annualInterestRate */
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	/** Set a new annualInterestRate */
	public void setAnnualInterestRate(double annualInterestRate) {

		try {
			this.annualInterestRate = annualInterestRate;
			if (annualInterestRate <= 0) {
				throw new IllegalArgumentException();
			}
			// it starts exception if we try to enter 0 or les
		} catch (IllegalArgumentException e) {
			System.out.println("The item has to be greater than 0!");
		}
	}

	/** Return numberOfYears */
	public int getNumberOfYears() {
		return numberOfYears;
	}

	/** Set a new numberOfYears */
	public void setNumberOfYears(int numberOfYears) {
		try {
			this.numberOfYears = numberOfYears;
			if (numberOfYears <= 0) {
				throw new IllegalArgumentException();
			}
			// it starts exception if we try to enter 0 or les
		} catch (IllegalArgumentException e) {
			System.out.println("The item has to be greater than 0!");
		}
	}

	/** Return loanAmount */
	public double getLoanAmount() {
		return loanAmount;
	}

	/** Set a new loanAmount */
	public void setLoanAmount(double loanAmount) {
		try {
			this.loanAmount = loanAmount;
			if (loanAmount <= 0) {
				throw new IllegalArgumentException();
			}
			// it starts exception if we try to enter 0 or les
		} catch (IllegalArgumentException e) {
			System.out.println("The item has to be greater than 0!");
		}

	}

	/** Find monthly payment */
	public double getMonthlyPayment() {
		double monthlyInterestRate = annualInterestRate / 1200;
		double monthlyPayment = loanAmount
				* monthlyInterestRate
				/ (1 - (1 / Math.pow(1 + monthlyInterestRate,
						numberOfYears * 12)));
		return monthlyPayment;
	}

	/** Find total payment */
	public double getTotalPayment() {
		double totalPayment = getMonthlyPayment() * numberOfYears * 12;
		return totalPayment;
	}

	/** Return loan date */
	public java.util.Date getLoanDate() {
		return loanDate;
	}
}
