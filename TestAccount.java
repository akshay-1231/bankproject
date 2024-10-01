package userinterface;

import entity.Account;
import operations.AccountOperation;
import java.util.Scanner;

public class TestAccount {

	public static void main(String[] args) {
		Account account1 = new Account(1, "Akshay", 30000);
		Account account2 = new Account(2, "Ajay", 40000);
		AccountOperation accountOperations = new AccountOperation();

		int ch;
		String choice;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("1.Accept Details");
			System.out.println("2.Display Details");
			System.out.println("3.Withdraw Amount");
			System.out.println("4.Deposite Amount");
			System.out.println("5.Transfer Amount");
			System.out.println("6.Check Balance");
			System.out.println("7.Update Balance");
			System.out.println("8.Exit");
			System.out.println("entre choice");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("accepting details");
				break;
			case 2:
				System.out.println("displaying details");
				System.out.println("accNo is" + account1.getAccNo());
				System.out.println("name is" + account1.getAccHolderName());
				System.out.println("balance is" + account1.getBalance());

				break;
			case 3:
				System.out.println("entre the amount to withdraw ");
				double amount = sc.nextDouble();
				boolean result = accountOperations.withdraw(account1, amount);
				if (result == true) {
					System.out.println("withdraw suceeful");
					System.out.println("new balance is" + account1.getBalance());
				} else
					System.out.println("withdraw  not suceeful");

				break;
			case 4:
				System.out.println("entre the amount to deposite ");
				amount = sc.nextDouble();
				result = accountOperations.deposite(account1, amount);
				if (result == true) {
					System.out.println("deposite is sucessful");
					System.out.println("the new balance is" + account1.getBalance());
				} else
					System.out.println("deposite is failed");

				break;
			case 5:

				System.out.println(" entre the amount to transfer");
				amount = sc.nextDouble();
				System.out.println("account1 old balance is" + account1.getBalance());
				System.out.println("account2 old balance is" + account2.getBalance());
				result = accountOperations.transfer(account1, account2, amount);
				if (result == true) {
					System.out.println("transfer is sucesful");
					System.out.println("account1 new balance is" + account1.getBalance());
					System.out.println("account2 new balance is" + account2.getBalance());
				} else
					System.out.println("transfer is failed");
				break;
			case 6:
				System.out.println("entre account number to check balance");
				int no=sc.nextInt();
			
			{
					
				}
				
				break;
			case 7:
				System.out.println("updateing balance");
				break;
			case 8:
				System.out.println("thank for visiting");
				break;

			}
			System.out.println("do you want to continue?(y/n)");
			choice = sc.next();

		} while (choice.equalsIgnoreCase("Y"));
		System.out.println("thank you !!!!");

	}

}
