package Iniciante;

import java.util.Scanner;

public class P1004 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int A, B, PROD;
		
		A = teclado.nextInt();
		B = teclado.nextInt();
		PROD = A * B;
		
		System.out.println("PROD = " + PROD);
		
		teclado.close();

	}

}
