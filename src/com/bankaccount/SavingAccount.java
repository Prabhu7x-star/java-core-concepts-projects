package com.bankaccount;

public class SavingAccount extends BankAccount{

	public SavingAccount(long accountNumber, String accountHolderName, double balance) {
		super(accountNumber, accountHolderName, balance);
	}

	@Override
	void withdraw(double amount) throws InsufficientBalanceException {
		if(getBalance()-amount<1000) {
			throw new InsufficientBalanceException("Balance may be go below 1000 reamining: "+getBalance());
		}
		else {
			setBalance(getBalance()-amount);
			System.out.println("Remaining balance: "+getBalance());
		}
	}
	

}
