package Iniciante;

import java.util.Scanner;

public class P1009 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		String nome;
		Double salario, vendas, total;
		
		nome = teclado.nextLine();
		salario = teclado.nextDouble();
		vendas = teclado.nextDouble();
		
		total = vendas*0.15 + salario; 
		
		System.out.printf("TOTAL = R$ %.2f\n", total);
		
		teclado.close();
	}

}
