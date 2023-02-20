/*
Exercicio 03 - AULA 04
Faça um programa para ler dois valores inteiros, e depois mostrar na tela 
a soma desses números com uma mensagem explicativa, conforme exemplos: 
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
        int x, y;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o 1o numero: ");
        x = scanner.nextInt();
        
        System.out.println("Digite o 2o numero: ");
        y = scanner.nextInt();
        
        System.out.printf("Entrada: %d, %d Saida: SOMA = %d\n", x, y, x+y);
    }
    
}
