package Iniciante;

import java.util.Scanner;

public class P1008 {

	public static void main(String[] args) {
		
		
		Scanner teclado = new Scanner(System.in);
		
		int numFuncionario, horasTrabalhadas;
		double valorHora, salario;
		
		numFuncionario = teclado.nextInt();
		horasTrabalhadas = teclado.nextInt();
		valorHora = teclado.nextDouble();
		
		salario = horasTrabalhadas * valorHora;
		
		System.out.println("NUMBER = " + numFuncionario);
		System.out.printf("SALARY = U$ %.2f\n", salario);
		
		teclado.close();

	}

}
