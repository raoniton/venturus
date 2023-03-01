/*
Exercício 6
Escreva um programa que leia um número inteiro e através do operador ternário 
decida se o número é maior ou menor que 10. Caso seja menor que 10, que o operador 
ternário possa também decidir se este é maior ou menor que 5. 

Imprima a seguinte mensagem:
Numero é maior que 10 Numero é maior que 5 Numero é menor que 5
*/
package exercicio_06;
import java.util.Scanner;
/**
 *
 * @author raoniton
 */
public class Exercicio_06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um numero: ");
        x = scanner.nextInt();
        
        //OPERADOR TERNARIO COM UM CONDICAO NO 'ELSE' DELE
        System.out.println(x>=10 
                ? "Numero é maior que 10" 
                : x < 5 
                        ? "Numero é menor que 5" 
                        : "Numero é maior que 5" 
        );
    }
    
}
