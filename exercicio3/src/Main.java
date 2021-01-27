import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numero1 = sc.nextInt();
		int numero2 = sc.nextInt();
		int numero3 = sc.nextInt();
		int numero4 = sc.nextInt();
		
		int diferenca = (numero1*numero2 - numero3*numero4);
		
		System.out.println("Diferenca = " + diferenca);
			
		sc.close();	
		

	}

}
