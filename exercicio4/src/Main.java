import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int funcionario = sc.nextInt();
		double horas = sc.nextDouble();
		double valor = sc.nextDouble();
		 
		double salario = horas * valor;
		
		System.out.println("O numero do funcionario �: " + funcionario);
		System.out.printf("E seu salario � U$ : %.2f", salario);
		
		sc.close();

	}

}
