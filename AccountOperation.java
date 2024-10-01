package operations;

import entity.Account;

public class AccountOperation {
	// account :- no ,name,balace<--30000
	public boolean withdraw(Account account, double amount) // 2000
	{
		double bal = account.getBalance(); // 30000
		if (bal < amount) {
			System.out.println("not enough balance");
			return false;
		} else if (amount < 0) {
			System.out.println("witdraw amount cannot negative");
			return false;
		} else {
			bal = bal - amount; // 30000-2000=28000
			account.setBalance(bal); // 28000
			return true;
		}

	}

	public boolean deposite(Account account, double amount) {
		double bal = account.getBalance(); // 30000
		if (amount < 0) {
			System.out.println("deposite amount can not negative");
			return false;
		} else if (amount > 100000) {

			System.out.println("show proof");
			return false;
		} else {
			bal = bal + amount;
			account.setBalance(bal);
			return false;
		}
	}

	public boolean transfer(Account account1, Account account2, double amount)

	{

		double bal1 = account1.getBalance();

		double bal2 = account2.getBalance();

		if (amount < 0)
		{
		
			System.out.println(" transfer the amount can not be -ve");

			return false;

		}

		else if (bal1 < amount)

		{

			System.out.println("not enough balance!!!");

			return false;

		}

		else

		{

			 bal1 = bal1 - amount;

			 bal2 = bal2 + amount;

			account1.setBalance(bal1);

			account2.setBalance(bal2);

			return true;

		}
	}
}