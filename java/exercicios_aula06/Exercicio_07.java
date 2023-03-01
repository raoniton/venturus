/*
Exercício 7
Faça um programa que leia dois números. Caso o primeiro número seja maior que 
o segundo número, o programa deve ter como resultado a soma dos dois números. 
No entanto, caso o primeiro número seja menor que o segundo número, 
o programa deve fazer a subtração dos números. Utilize o operador ternário 
para resolver o problema.
*/
package exercicio_07;
import java.util.Scanner;
/**
 *
 * @author raoniton
 */
public class Exercicio_07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double a, b;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o primeiro numero: ");
        a = scanner.nextDouble();
        
        System.out.println("Digite o segundo numero: ");
        b = scanner.nextDouble();
        
        System.out.println( a > b 
                ? a + b 
                : b > a 
                        ? b - a 
                        : "numeros iguais"
        );
    }
    
}
