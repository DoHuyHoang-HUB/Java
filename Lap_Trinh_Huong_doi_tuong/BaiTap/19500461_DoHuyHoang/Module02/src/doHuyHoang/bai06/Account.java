package doHuyHoang.bai06;

import java.text.NumberFormat;
import java.util.Locale;

public class Account {
	private long accountNumber;
	private String name;
	private double balance;
	private final double RATE = 0.035;

	public Account() {
		accountNumber = 999999;
		name = "Chua Xac Ä?inh";
		balance = 50000;
	}

	public Account(String name, long accountNumber) {
		if (!name.equals(""))
			this.name = name;
		if (accountNumber > 0)
			this.accountNumber = accountNumber;
	}

	public Account(String name, long accountNumber, double balance) {
		this.name = name;
		this.accountNumber = accountNumber;
		if (balance >= 50000)
			this.balance = balance;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public boolean deposit(double amount) {
		if (amount > 0) {
			this.balance = this.balance + amount;
			return true;
		}
		return false;
	}

	public boolean withdraw(double amount, double fee) {
		if (amount > 0 && amount + fee <= balance) {
			this.balance = this.balance - (amount + fee);
			return true;
		}
		return false;
	}

	public void addInterest() {
		this.balance = this.balance + this.balance * RATE;
	}

	public boolean tranfer(Account acc2, double amount) {
		if (amount <= this.balance) {
			acc2.balance = acc2.balance + amount;
			this.balance = this.balance - amount;
			return true;
		}
		return false;
	}

	public String toString() {
		Locale locale = new Locale("vi", "VN");
		NumberFormat formater = NumberFormat.getCurrencyInstance(locale);
		return String.format("%-20s %15d %10s", this.name, this.accountNumber, formater.format(balance));
	}

}
