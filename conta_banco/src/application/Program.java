package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Operations;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Operations operations;
		
		System.out.print("Enter account number:" );
		int number = sc.nextInt();
		System.out.print("Enter account holder:");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.println("Is there na initial deposit (y/n)?");
		char resp = sc.next().charAt(0);
		if(resp == 'y') {
			System.out.print("Enter initial deposit value:");
			double initialDeposit = sc.nextDouble();
			operations = new Operations(number, holder, initialDeposit);
		}
		else {
			operations = new Operations(number, holder);
			
		}
		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(operations);
		
		System.out.println();
		System.out.println("Enter a deposit value:");
		double depositValue = sc.nextDouble();
		operations.deposit(depositValue);
		System.out.println("Updated account data:");
		System.out.println(operations);
		
		System.out.println();
		System.out.println("Enter a withdraw value:");
		double withdrawValue = sc.nextDouble();
		operations.withdraw(withdrawValue);
		System.out.println("Updated account data:");
		System.out.println(operations);
		 
		 
		
		
		sc.close();

	}

}
