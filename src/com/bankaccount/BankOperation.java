package com.bankaccount;

public interface BankOperation {
	void createAccount(BankAccount acoount);
	void findAccount(long accountNumber);
	void displayAllAccounts();
}
