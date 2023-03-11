/*
Exercicio 6
Fazer um programa para ler um número inteiro positivo X. O programa deve então 
mostrar na tela X linhas, começando de 1 até X. Para cada linha, mostrar o 
número da linha, depois o quadrado e o cubo do valor.
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
        
        System.out.println("digite um numero inteiro positivo:");
        x = scanner.nextInt();
        for(int i=0; i < x; i++){
            System.out.printf("%d.  %.0f  %.0f\n", i+1, Math.pow(x, 2), Math.pow(x,3));
        }
    }
    
}
