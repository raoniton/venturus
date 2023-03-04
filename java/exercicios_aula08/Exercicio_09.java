/*
Exercicio 9
Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem 
"Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos são 
múltiplos entre si. 
Atenção: os números devem poder ser digitados em ordem 
crescente ou decrescente.
*/
package exercicio_09;
import java.util.Scanner;
/**
 *
 * @author raoniton
 */
public class Exercicio_09 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        int n1, n2, maior, menor;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o 1o numero: ");
        n1 = scanner.nextInt();
        
        System.out.println("Digite o 2o numero: ");
        n2 = scanner.nextInt();
        
        maior = Math.max(n1, n2);
        menor = Math.min(n1, n2);
        
        if(maior % menor == 0)
            System.out.println("Sao Multiplos");
        else
            System.out.println("Nao sao multiplos");
        
    }
    
}
