package aplicatiom;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle cal;
		cal = new Rectangle();
		
		
		System.out.println("Enter rectangle width and heigth:");
		cal.width = sc.nextDouble();
	 	cal.heigth= sc.nextDouble();
	 	
	 	double arearec = cal.area();
	 	double perimetrorec = cal.perimetro();
	 	double diagonalrec = cal.diagonal();
	 	
	 	System.out.printf("AREA = %.2f%n", arearec);
	 	System.out.printf("PERIMETER = %.2f%n", perimetrorec);
	 	System.out.printf("DIAGONAL = %.2f%n", diagonalrec);
		
		
		
		sc.close();

	}

}
