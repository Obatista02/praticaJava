package application;

import entities.Account;
import entities.SavingsAccount;
import entities.businessAccount;

public class program {

	public static void main(String[] args) {

		Account acc1 = new Account(1001, "alex", 1000.0);

		acc1.saque(200);
		System.out.println(acc1.getBalance());

		// conta poupança

		Account acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
		acc2.saque(200);
		System.out.println("----------------------------");
		System.out.println(acc2.getBalance());
		System.out.println("----------------------------");
		Account acc3 = new businessAccount(1003, "Joao", 1000.0, 500.0);
		acc3.saque(200);
		System.out.println(acc3.getBalance());
	}
}
