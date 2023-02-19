/*
Construa um algoritmo para ler dois números. 
Em seguida, calcule a soma, a subtração, a multiplicação
e a divisão desses números,
armazenando os resultados em outras variáveis. 
Imprimir os dados iniciais e os resultados.
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
        double n1, n2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        n1 = scanner.nextDouble();
        System.out.println("Digite outro numero: ");
        n2 = scanner.nextDouble();
        
        System.out.printf("[+]: %.2f + %.2f = %.2f\n",n1, n2, n1+n2);
        System.out.printf("[-]: %.2f - %.2f = %.2f\n",n1, n2, n1-n2);
        System.out.printf("[*]: %.2f * %.2f = %.2f\n",n1, n2, n1*n2);
        System.out.printf("[/]: %.2f / %.2f = %.2f\n",n1, n2, n1/n2);
                
        
        
    }
    
}
