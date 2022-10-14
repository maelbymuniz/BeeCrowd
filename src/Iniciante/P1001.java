package Iniciante;

import java.util.Scanner;

public class P1001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A, B, X;
		
		Scanner teclado = new Scanner(System.in);
		
		A = Integer.parseInt(teclado.nextLine());
		B = Integer.parseInt(teclado.nextLine());
		X = A + B;
		
		System.out.printf("X = %d\n", X);
		
		teclado.close();
	}

}