package Iniciante;

import java.util.Scanner;

public class P1002 {

	public static void main(String[] args) {
			
		Scanner teclado = new Scanner(System.in);
		
		Double area, raio;
		double n = 3.14159;
		
		raio = teclado.nextDouble();
		area = n * Math.pow(raio, 2); 
		
		System.out.printf("A=%f.4\n", area);
		
		teclado.close();

	}

}
