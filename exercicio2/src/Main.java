import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
	
		Scanner sc = new Scanner(System.in);
		
		double r = sc.nextDouble();
				
		r = Math.pow(r,2);
		
		double area = r * 3.14159;
		
		System.out.printf("A aréa é: %.4f%n" , area);
		
		
		sc.close();	}

}
