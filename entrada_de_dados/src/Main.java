import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	 Locale.setDefault(Locale.US);	
	 Scanner sc = new Scanner(System.in);
	  
	  String x;
	  x = sc.next();
	  System.out.println("Você digitou: " + x); 
	  
	  int y;
	  y = sc.nextInt();
	  System.out.println("Você digitou: " + y); 
	  
	  Double z;
	  z = sc.nextDouble();
	  System.out.printf("Você digitou: %.2f%n" , z); 
	  
	  char f;
	  f = sc.next().charAt(0);
	  System.out.printf("Você digitou: " + f); 
	  
	  
	  char g;
	  g = sc.next().charAt(0);
	  System.out.printf("Você digitou: " + g); 
	  
	  sc.close();
	  
	}

}
