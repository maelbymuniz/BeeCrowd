package Iniciante;

import java.util.Scanner;

public class P1010 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        
        int codigoPeca1, qtdeDePecas1, codigoPeca2, qtdeDePecas2;
        Double valorPeca1, valorPeca2, total;
        

        codigoPeca1 = teclado.nextInt();
        qtdeDePecas1 = teclado.nextInt();
        valorPeca1 = teclado.nextDouble();
        
        codigoPeca2 = teclado.nextInt(); 
        qtdeDePecas2 = teclado.nextInt();
        valorPeca2 = teclado.nextDouble();

        total = ((qtdeDePecas1 * valorPeca1) + (qtdeDePecas2 * valorPeca2));

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);

        teclado.close();
    }
}