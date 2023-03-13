/*
Exercicio 3
Crie um programa que verifica se o número é par ou ímpar. A verificação deve ser 
feita por um método também criado.
*/
package exercicio_03;
import java.util.Scanner;
/**
 *
 * @author raoniton
 */
public class Exercicio_03 {
    public static boolean parImpar(double x){
        if(x % 2 == 0)
            return true;
        return false;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double x;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um numero: ");
        x = scanner.nextDouble();
        System.out.printf(parImpar(x) 
                ? "Eh par\n"
                : "Eh impar\n"
        );
        
    }
    
}
