import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B , C, aretrian, areacir, areatrap, areaqua, arearetn;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		
		aretrian = A * C / 2;
		areacir = (Math.pow(C , 2) * 3.14159);
		areatrap = ((A+B) * C / 2);
		areaqua = (Math.pow(B, 2));
		arearetn = A * B;
		
		System.out.printf("Triangulo: %.3f%n circulo: %.3f%n Trapezio: %.3f%n Quadrado: %.3f%n Retangulo: %.3f%n", aretrian, areacir, areatrap, areaqua, arearetn);
		
		
		
		
		
		
		sc.close();

	}

}
