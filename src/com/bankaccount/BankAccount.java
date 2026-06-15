package com.bankaccount;

public abstract class BankAccount {
	private long accountNumber;
	private String accountHolderName;
	private double balance;
	public BankAccount(long accountNumber, String accountHolderName, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}
	abstract void withdraw(double amount) throws InsufficientBalanceException;
	void deposit(double amount) {
		balance+=amount;
		System.out.println(amount+" is deposited successfully");
	}
	void displayAcoountDetails() {
		System.out.println("Account number: "+accountNumber+"\n"+
				"AccountHolerName: "+accountHolderName+"\n"
				+"Balance: "+balance);
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	
}
