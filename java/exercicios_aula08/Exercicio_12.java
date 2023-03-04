/*
Exercicio 12
Faça um programa que lê 4 valores I, A, B e C onde I é um número inteiro e 
positivo e A, B, e C são quaisquer valores reais. O programa deve escrever os valores lidos e:
se I = 1, escrever os três valores A, B e C em ordem crescente;
se I = 2, escrever os três valores A, B e C em ordem decrescente;
se I = 3, escrever os três valores A, B, e C de forma que o maior valor fique entre os outros dois;
se I não for um dos três valores acima, dar uma mensagem indicando este comportamento.
*/
package exercicio_12;
import java.util.Scanner;
/**
 *
 * @author raoniton
 */
public class Exercicio_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i;
        double a, b, c, menor, meio, maior;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a opcao: ");
        i = scanner.nextInt();
        
        System.out.println("Digite o 1o numero: ");
        a = scanner.nextDouble();
        
        System.out.println("Digite o 2o numero: ");
        b = scanner.nextDouble();
        
        System.out.println("Digite o 3o numero: ");
        c = scanner.nextDouble();
        
        menor = Math.min(a, Math.min(b, c));
        maior = Math.max(a, Math.max(b, c));
        
        if(a == menor){
            if(b == maior){
                meio = c;
            }else{
                meio = b;
            }
        }else if(b == menor){
            if(a == maior){
                meio = c;
            }else{
                meio = a;
            }
        }else{
            if(a == maior){
                meio = b;
            }else{
                meio = a;
            }
        }
        
        if(i == 1)
            System.out.printf("%.2f, %.2f, %.2f \n", menor, meio, maior);
        else if(i==2)
            System.out.printf("%.2f, %.2f, %.2f \n", maior, meio, menor);
        else if(i==3)
            System.out.printf("%.2f, %.2f, %.2f \n", menor, maior, meio);
        else
            System.out.println("Opcao invalida");
            
    }
    
}
