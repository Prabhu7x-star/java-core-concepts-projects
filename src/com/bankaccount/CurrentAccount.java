package com.bankaccount;

public class CurrentAccount extends BankAccount{

	public CurrentAccount(long accountNumber, String accountHolderName, double balance) {
		super(accountNumber, accountHolderName, balance);
	}

	@Override
	void withdraw(double amount) throws InsufficientBalanceException {
		if(getBalance()-amount<0) {
			throw new InsufficientBalanceException("Insuuficient Balance"+getBalance());
		}
		else {
			setBalance(getBalance()-amount);
			System.out.println("Reamining balance: "+getBalance());
		}
	}
	
}
