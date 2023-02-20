/*
Exercicio 01 - AULA 04
Crie um algoritmo que lê o nome de um correntista, sua agência e conta. 
Exiba esses dados na tela.
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
        String nome, conta, agencia;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do Correntista: ");
        nome = scanner.nextLine();
        
        System.out.println("Digite a agencia: ");
        agencia = scanner.next();
        
        System.out.println("Digite a conta com o digito: ");
        conta = scanner.next();
       
        System.out.printf("Nome: %s\nAgencia: %s | Conta: %s - %s\n", nome, agencia, conta.substring(0, conta.length()-1), conta.charAt(conta.length() - 1));
        
    }
    
}
