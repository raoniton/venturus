/*
Exercicio 3
Faça um programa que leia um número inteiro N e calcule todos os seus divisores.
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
        int n, nDividores=0, i;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um numero para saber seus divisores: ");
        n = scanner.nextInt();
        
        System.out.printf("D(%d) ={", n);
        for(i=1; i <=n; i++){
            if(n % i == 0){
                if(n-1 < i)
                    System.out.printf("%d", i);
                else
                    System.out.printf("%d, ", i);
                    
                nDividores++;
            }
        } 
        
        System.out.printf("}\nO numero %d tem %d divisores.\n",n, nDividores);
        
        
        
    }
    
}
