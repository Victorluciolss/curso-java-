import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		while (x != 0 && y != 0 ) {	
			if (x > 0 && y > 0) {
				 System.out.println("1° Q");
			}
			else if (x < 0 && y > 0) {
				 System.out.println("2° Q");
			}
			else if (x < 0 && y < 0) {
				 System.out.println("3° Q");
			}
			else			
				System.out.println("4° q");
			
			x = sc.nextInt();
			y = sc.nextInt();
		}
		
				
		sc.close();
	}

}
