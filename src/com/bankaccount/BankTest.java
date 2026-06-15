package com.bankaccount;

public class BankTest {
	public static void main(String[] args) {
		BankService service=new BankService();
		 try {

	            // Create Accounts
	            BankAccount s1 =
	                    new SavingAccount(
	                            1001,
	                            "Prabhu",
	                            5000);

	            BankAccount c1 =
	                    new CurrentAccount(
	                            1002,
	                            "Rahul",
	                            10000);

	            // Add Accounts
	            service.createAccount(s1);
	            service.createAccount(c1);

	            System.out.println("\n===== All Accounts =====");
	            service.displayAllAccounts();

	            System.out.println("\n===== Find Account =====");
	            service.findAccount(1001);

	            System.out.println("\n===== Deposit =====");
	            s1.deposit(2000);

	            System.out.println("\n===== Withdraw from Savings =====");
	            s1.withdraw(3000);

	            System.out.println("\n===== Withdraw from Current =====");
	            c1.withdraw(5000);

	            System.out.println("\n===== Updated Accounts =====");
	            service.displayAllAccounts();

	            // Exception Test
	            System.out.println("\n===== Exception Test =====");
	            s1.withdraw(4000);

	        }
	        catch (InsufficientBalanceException e) {

	            System.out.println(
	                    "Exception: " + e.getMessage());
	        }
	}
}
