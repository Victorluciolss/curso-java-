import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	 Locale.setDefault(Locale.US);	
	 Scanner sc = new Scanner(System.in);
	  
	  String x;
	  x = sc.next();
	  System.out.println("Voc� digitou: " + x); 
	  
	  int y;
	  y = sc.nextInt();
	  System.out.println("Voc� digitou: " + y); 
	  
	  Double z;
	  z = sc.nextDouble();
	  System.out.printf("Voc� digitou: %.2f%n" , z); 
	  
	  char f;
	  f = sc.next().charAt(0);
	  System.out.printf("Voc� digitou: " + f); 
	  
	  
	  char g;
	  g = sc.next().charAt(0);
	  System.out.printf("Voc� digitou: " + g); 
	  
	  sc.close();
	  
	}

}
