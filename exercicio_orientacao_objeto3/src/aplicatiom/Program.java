package aplicatiom;

import java.util.Locale;
import java.util.Scanner;

import entities.Notas;

public class Program {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Notas total = new Notas();
		
		System.out.println("Name:");
		total.name = sc.nextLine();
		total.grade1 = sc.nextDouble();
		total.grade2 = sc.nextDouble();
		total.grade3 = sc.nextDouble();
		
		System.out.printf("Final Grade = %.2f%n", total.finalGrade());
		
		if (total.finalGrade() < 60.0) {
		System.out.println("FAILED");
		System.out.printf("MISSING %.2f POINTS%n", total.missingPoints());
		}
		else {
		System.out.println("PASS");
		}
		
		sc.close();


	}

}
