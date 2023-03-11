/*
Exercicio 1
Crie um algoritmo de contagem inteligente. Leia dois números, um inicial e outro 
final. Analise cada número e execute a seguinte tarefa. Se o número inicial for 
menor que o final, faça um contador crescente. Mas, caso o número inicial seja 
maior que o final, execute um contador decrescente. Imprima o resultado do passo 
a passo do contador. 
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
        int inicio, fim;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um numero: ");
        inicio = scanner.nextInt();
        
        System.out.println("Digite outro numero: ");
        fim = scanner.nextInt();
        
        if(inicio < fim){
            while(inicio <= fim){
                System.out.printf("%d ", inicio);
                inicio++;
            }
        }else{
            while(inicio >= fim){
                System.out.printf("%d ", inicio);
                inicio--;
            }
        }
        System.out.println("");
        
    }
    
}
