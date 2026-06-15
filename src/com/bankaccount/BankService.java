package com.bankaccount;

import java.util.HashMap;

public class BankService implements BankOperation{
	HashMap<Long, BankAccount> hm=new HashMap<Long, BankAccount>();
	@Override
	public void createAccount(BankAccount acoount) {
		if(hm.get(acoount.getAccountNumber()) == null) {
			hm.put(acoount.getAccountNumber(), acoount);
			System.out.println("Account created successfully");
		}
		else {
			System.out.println("Account already exists");
		}
	}

	@Override
	public void findAccount(long accountNumber) {
		BankAccount findAccount=hm.get(accountNumber);
		if(findAccount!=null)
			findAccount.displayAcoountDetails();
		else
			System.out.println("Account not found");
		
	}

	@Override
	public void displayAllAccounts() {
		for(BankAccount ac:hm.values()) {
			ac.displayAcoountDetails();
			System.out.println();
		}
		
	}

}
