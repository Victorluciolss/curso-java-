package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int [][] mat = new int[m][n];
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				mat [i][j] = sc.nextInt();
				
			}
		}
		
		
		
		
		
		sc.close();
	 
	}

}
