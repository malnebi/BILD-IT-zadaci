package Zadaci_20_08_2016;

import java.util.ArrayList;

/* Acount
 * ---------------------------
 * -id: int = 0
 * -balance: double = 0
 * -annualInterestRate: double = 0
 * -dateCreated: Date
 * -name : String
 * ---------------------------
 * +Acount()
 * +Acount(newId: int, newBalance: double)
 * +getId(): int
 * +getBalace(): double
 * +getAnnualInterestRate(): double
 * +setId(newId : int): void
 * +setBalance(newBalance: double): void
 * +setAnnualInterestRate(newAnnualInterestRate: double): void
 * +getDateCreated(): Date
 * +getMonthlyInterestRate(): double
 * +getMonthlyInterest(): double
 * +withdraw(): double
 * +deposit(): double */
class Z4_Account {
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private java.util.Date dateCreated;
	private String name;
	private ArrayList<Transaction> transactions = new ArrayList<>();

	Z4_Account() {
		dateCreated = new java.util.Date();
	}

	Z4_Account(int id, String name, double balance) {
		this.setName(name);
		this.id = id;
		this.balance = balance;
		dateCreated = new java.util.Date();
	}

	int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public java.util.Date getDateCreated() {
		return dateCreated;
	}

	double monthlyInterest() {
		return getBalance() * getMonthlyInterestRate();
	}

	public double getMonthlyInterest() {
		return monthlyInterest();
	}

	double monthlyInterestRate() {
		return (getAnnualInterestRate() / 100) / 12; // getAnn...je u procentima
	}

	double getMonthlyInterestRate() {
		return monthlyInterestRate();
	}

	void withdraw(double amount) {
		balance = balance - amount;
		Transaction tr = new Transaction('W', amount, balance,
				"Podigli ste novac");
		transactions.add(tr);
	}

	void deposit(double amount) {
		balance = balance + amount;
		Transaction tr = new Transaction('D', amount, balance, "Depozit");
		transactions.add(tr);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/** print information about client and */
	@Override
	public String toString() {
		return "Account id=" + id + ", \nbalance=" + balance
				+ "\n annualInterestRate=" + annualInterestRate
				+ "\n dateCreated=" + dateCreated + "\n name=" + name
				+ "\n Transactions=" + transactions;
	}

	/** displaying all transactions for one client */
	public void summary() {
		
		System.out.println("Account id: " + id + "\nName: " + name
				+ "\nBalance=" + balance + "\nAnnual interest rate: "
				+ annualInterestRate);

		for (int i = 0; i < transactions.size(); i++) {
			// calling toString() method in Transaction class for display
			// information about transaction
			System.out.println(transactions.get(i).toString());
		}
		System.out.println();
	}
}
