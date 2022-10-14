package Iniciante;

import java.util.Scanner;

class P1007 {

	public static void main(String[] args) {
		
		int A, B, C, D, diferenca;
		
		Scanner teclado = new Scanner(System.in);
		
		A = teclado.nextInt();
		B = teclado.nextInt();
		C = teclado.nextInt();
		D = teclado.nextInt();

		diferenca = (A*B - C*D);
		
		System.out.println("DIFERENCA = " + diferenca);
		
		teclado.close();
	}

}
