import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		
		if (numero % 2 == 0)	{	
			System.out.println("Par:");
		}
		else {
			System.out.println("Impar:");			
		}		
			
		
		sc.close();

	}

}
