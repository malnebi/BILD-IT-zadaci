package Zadaci_20_08_2016;

public class Transaction {
	private java.util.Date date;
	private char type;
	private double amount;
	private double balance;
	private String description;

	public Transaction() {
	}

	public Transaction(char type, double amount, double balance,
			String description) {
		this.setType(type);
		this.amount = amount;
		this.balance = balance;
		this.description = description;
		date = new java.util.Date();
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public java.util.Date getDate() {
		return date;
	}

	public char getType() {
		return type;
	}

	public void setType(char type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Transaction [date=" + date + ", type=" + type + ", amount="
				+ amount + ", balance=" + balance + ", description="
				+ description + "]";
	}

	
}
