/*
Exercício 5 - AULA 04
Fazer um programa para ler quatro valores inteiros A, B, C e D. 
A seguir, calcule e mostre a diferença do produto de A e B pelo 
produto de C e D, segundo a fórmula: DIFERENCA = (A * B - C * D).
*/
package exercicio_05;
import java.util.Scanner;

/**
 *
 * @author raoniton
 */
public class Exercicio_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a, b, c, d;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite 1o de 4 inteiro: ");
        a = scanner.nextInt();
        
        System.out.println("Digite 2o de 4 inteiro: ");
        b = scanner.nextInt();
        
        System.out.println("Digite 3o de 4 inteiro: ");
        c = scanner.nextInt();
        
        System.out.println("Digite 4o de 4 inteiro: ");
        d = scanner.nextInt();
        
        System.out.printf("Entrada: %d, %d, %d, %d   Saida: DIFERENCA = %d\n",a,b,c,d, (a*b) - (c*d));
    }
    
}
