/*
Exercicio 02 - AULA 04
Crie um algoritmo que leia o ano atual e o ano em que uma pessoa nasceu. 
Calcule a idade dessa pessoa e imprima o resultado na tela.
 */
package exercicio_02;

import java.util.Scanner;

/**
 *
 * @author raoniton
 */
public class Exercicio_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int anoNasc, anoAtual;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o ano atual: ");
        anoAtual = scanner.nextInt();
        
        System.out.println("Digite o seu ano de nascimento: ");
        anoNasc = scanner.nextInt();
        
        System.out.printf("Voce tem: %d anos\n", anoAtual-anoNasc);
        
    }
    
}
