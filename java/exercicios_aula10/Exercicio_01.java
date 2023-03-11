/*
Exercicio 1
Faça um Algoritmo que leia um dado número e imprima na tela se este é um número 
primo ou não.
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
        int n,i, status=0;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um numero para verificar se eh primo:");
        n = scanner.nextInt();
        
        for(i=2; i < n; i++){
            if(n % i == 0){
                status = 1;
                break;
            }
        }
        if(status == 1)
            System.out.printf("O numero %d nao eh primo.\n", n);
        else
            System.out.printf("O numero %d eh primo.\n", n);
    }
    
}
