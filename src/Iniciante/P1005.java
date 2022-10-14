package Iniciante;

import java.util.Scanner;

public class P1005 {

	public static void main(String[] args) {
		
		Double A, B, MEDIA;
		
		Scanner teclado = new Scanner(System.in);
		
		A = teclado.nextDouble();
		B = teclado.nextDouble();
		
		MEDIA = ((A * 3.5) + (B * 7.5))/11;
				
		System.out.printf("MEDIA = %.5f\n", MEDIA);
		
		teclado.close();

	}

}
