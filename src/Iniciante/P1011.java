package Iniciante;

import java.util.Scanner;

public class P1011 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		Double raio, volume;
		double pi = 3.14159;
		
		raio = teclado.nextDouble();
		
		volume = (4.0/3) * pi * (Math.pow(raio, 3));
		
		System.out.printf("VOLUME = %.3f\n", volume);

		teclado.close();
	}

}
