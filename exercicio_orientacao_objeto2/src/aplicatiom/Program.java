package aplicatiom;

import java.util.Locale;
import java.util.Scanner;

import entities.Salario;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Salario dados = new Salario();

		System.out.println("Name:");
		dados.name = sc.nextLine();
		System.out.println("GrossSalary:");
		dados.grossSalary = sc.nextDouble();
		System.out.println("Tax:");
		dados.tax = sc.nextDouble();

		System.out.println();
		System.out.println("Employee: " + dados);

		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		dados.increaseSalary(percentage);

		System.out.println();
		System.out.println("Updated data: " + dados);

		sc.close();

	}

}
