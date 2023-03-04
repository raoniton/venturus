/*
Exercicio 1
Crie um algoritmo que lê um dado número e decida se ele é par ou ímpar. 
Imprima o resultado. 
*/
package exercicio_01;

import java.util.Scanner;

/**
 *
 * @author raoniton
 */
public class Exercicio_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um numero: ");
        x = scanner.nextInt();
        
        if(x % 2 == 0)
            System.out.printf("O numero %d -> par\n", x);
        else
            System.out.printf("O numero %d -> impar\n", x);
    }
    
}
