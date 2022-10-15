package Iniciante;

import java.util.Scanner;

public class P1006 {

	public static void main(String[] args) {
		
		Double A, B, C, MEDIA;
		
		Scanner teclado = new Scanner(System.in);
		
		A = teclado.nextDouble();
		B = teclado.nextDouble();
		C = teclado.nextDouble();
		
		MEDIA = ((A * 2) + (B * 3) + (C * 5) ) / 10;
		
		System.out.printf("MEDIA = %.1f\n", MEDIA);

		teclado.close();
	}

}
