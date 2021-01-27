import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int hr1 = sc.nextInt();
		int hr2 = sc.nextInt();
		 
		int duracao;
		
		if (hr1 < hr2 )	{	
			duracao = hr2 - hr1;
		}
		else {
			duracao = 24 - hr1 + hr2;		
		}		
			
		System.out.println("A duração do jogo foi de: " + duracao + " hs");
		sc.close();

	}

}
