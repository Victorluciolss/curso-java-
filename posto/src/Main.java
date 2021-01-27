import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);		
		
		int cod = sc.nextInt();	
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
			
		
		while (cod !=4) {
			
			if (cod == 1) {	
				alcool += 1 ; 				
			}
			else if (cod == 2) {	
				gasolina += 1 ; 			
			}
			else if (cod == 3) {	
				diesel += 1 ; 			
			}
			 
			cod = sc.nextInt();
					
		}
		
		System.out.println("Muito Obrigado");
		System.out.println("Alcool " + alcool);
		System.out.println("Gasolina " + gasolina);
		System.out.println("Diesel " + diesel);
		
		sc.close();
	}

}
