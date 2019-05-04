package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Account;

public class Bank {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner read = new Scanner(System.in);
		Account client;

		System.out.print("Enter account number: ");
		int account = read.nextInt();

		System.out.print("Enter account holder: ");
		read.nextLine();
		String holder = read.nextLine();

		System.out.print("Is ther an initial deposit (y/n)?");
		char answer = read.next().charAt(0);
		if (answer == 'y') {
			System.out.print("Enter initial deposit value: $ ");
			double initialDeposit = read.nextDouble();
			client = new Account(account, holder, initialDeposit);
		} else {
			client = new Account(account, holder);
		}

		System.out.println();
		System.out.println("Account data:");
		System.out.println(client);
		
		System.out.println();
		System.out.print("Enter a deposit value: $ ");
		double amount = read.nextDouble();
		client.deposit(amount);
						
		System.out.println("Updated account data:");
		System.out.println(client);
		
		System.out.println();
		System.out.print("Enter a withdraw value: $ ");
		double amount2 = read.nextDouble();
		client.withdraw(amount2);
		
		System.out.println("Updated account data:");
		System.out.println(client);
		
		read.close();
	}

}
