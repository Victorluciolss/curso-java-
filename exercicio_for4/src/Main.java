import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			int a = sc.nextInt();
			int b = sc.nextInt();

			if (b != 0) {
				double divisao = (double) a / b;
				System.out.printf("%.1f%n", divisao);

			} else {

				System.out.println("Divisão imposivel");
			}

		}

		sc.close();

	}

}
