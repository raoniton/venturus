/*
Exercicio 2
Escreva um programa que leia um número inteiro. Se o número
lido for positivo, escreva uma mensagem indicando se ele é PAR ou ÍMPAR. 
Se o número for negativo, escreva a mensagem “NEGATIVO”.
 
*/
package exercicio_02;

import java.util.Scanner;

/**
 *
 * @author raoniton
 */
public class Exercicio_02 {

    public static void main(String[] args) {
        int x;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um numero: ");
        x = scanner.nextInt();
        
        System.out.println((x >= 0) 
                ? (x % 2 == 0)
                        ? "PAR"
                        : "IMPAR"
                : "NEGATIVO"
        );
    }
    
    
}
