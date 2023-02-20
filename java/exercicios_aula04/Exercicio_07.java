/*
Exercício 7 -  AULA 04
Fazer um programa para ler o código de uma peça 1, o número de peças 1, 
o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 
e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
*/
package exercicio_07;

import java.util.Scanner;

/**
 *
 * @author raoniton
 */
public class Exercicio_07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cod1, cod2, qtd1, qtd2;
        double valorUnit1, valorUnit2;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o codigo da peca 1: ");
        cod1 = scanner.nextInt();
        
        System.out.println("Digite a qtd de pecas 1: ");
        qtd1 = scanner.nextInt();
        
        System.out.println("Digite o valor unitario da peca 1: ");
        valorUnit1 = scanner.nextDouble();
        
        System.out.println("-------------------------------");
        System.out.println("Digite o codigo da peca 2: ");
        cod2 = scanner.nextInt();
        
        System.out.println("Digite a qtd de pecas 2: ");
        qtd2 = scanner.nextInt();
        
        System.out.println("Digite o valor unitario da peca 2: ");
        valorUnit2 = scanner.nextDouble();
        
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", qtd1*valorUnit1 + qtd2*valorUnit2);
        
    }
    
}
