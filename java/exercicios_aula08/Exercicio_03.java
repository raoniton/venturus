/*
Exercicio 3
Faça um algoritmo que receba o valor do salário de uma pessoa e o valor de um 
financiamento pretendido. Caso o financiamento seja menor ou igual a 5 vezes o 
salário da pessoa, o algoritmo deverá escrever 
"Financiamento Concedido"; senão, ele deverá escrever "Financiamento Negado". 
Independente de conceder ou não o financiamento, o algoritmo escreverá depois a 
frase "Obrigado por nos consultar."
 
*/
package exercicio_03;
import java.util.Scanner;
/**
 *
 * @author raoniton
 */
public class Exercicio_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double salario, financ;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o valor do salario: ");
        salario = scanner.nextDouble();
        
        System.out.println("Digite o valor do financiamento: ");
        financ = scanner.nextDouble();
        
        if(financ <= 5*salario){
            System.out.println("Financiamento Concedido.");
        }else{
            System.out.println("Financiamento Negado.");
        }
        
        System.out.println("Obrigado por consultar.");
            
        
        
    }
    
}
