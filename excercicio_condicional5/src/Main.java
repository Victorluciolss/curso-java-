import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod = sc.nextInt();
		int quant = sc.nextInt();
		
		double valor;
		if ( cod == 1  )	{			
			valor = 4 * quant;
		}
		else if (cod == 2) {
			valor = 4.5 * quant;				
		}
		else if (cod == 3) {
			valor = 5 * quant;
		}
		else {
			valor = 2 * quant;	
		}				
		System.out.printf("Total R$: %.2f%n ", valor);	
		
		sc.close();
	}

}
