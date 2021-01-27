package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter account data");
		System.out.print("Number:");
		int number = sc.nextInt();
		System.out.print("Holder:");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Initial balance:");
		double initialBalance = sc.nextDouble();
		System.out.print("Withdraw limit: :");
		double withdrawLimit = sc.nextDouble();
		System.out.print("Enter amount for withdraw:");
		double amountWithdraw = sc.nextDouble();
		if (initialBalance < amountWithdraw) {
			System.out.println("Withdraw error: Not enough balance");
		} else {
			if (amountWithdraw > withdrawLimit) {
				System.out.println("Withdraw error: The amount exceeds withdraw limit");
			}

		}
		System.out.println("Enter amount for withdraw:");
		double amount = sc.nextDouble();
		amount = - initialBalance;
		System.out.printf("New balance: %.2f", amount);

		sc.close();

	}

}
