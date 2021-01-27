import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero1 = sc.nextInt();
		int numero2 = sc.nextInt();
		
		int soma1 = numero1 + numero2 ;
		System.out.println("A soma é: " + soma1);
		
		int numero3 = sc.nextInt();
		int numero4 = sc.nextInt();
		
		int soma2 = numero3 + numero4 ;
		System.out.println("A soma é: " + soma2);
		
		int numero5 = sc.nextInt();
		int numero6 = sc.nextInt();
		
		int soma3 = numero5 + numero6 ;
		System.out.println("A soma é: " + soma3);
		
		sc.close();

	}

}
