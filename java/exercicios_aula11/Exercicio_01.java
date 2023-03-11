/*
Exercicio 1
Como somar variáveis com vetores?
Crie um algoritmo que leia um vetor de tamanho 4. Inicialize o vetor com o usuário 
digitando os valores de cada elemento. Inicie a soma desse vetor com uma variável num=10.
Regra importante: para cada rodada a variável num deve assumir o seu novo valor, 
ou seja, o seu valor atual mais o elemento digitado na posição anterior.
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
        double v[] = new double[5], num=10;
        int i;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Faca a entrada de 5 valores");
        for(i=0; i<5; i++){
            v[i]=scanner.nextDouble();
            num = num + v[i];            
        }
        for(i=0; i<5; i++){
            System.out.printf("%.2f ", v[i]);
        }
        System.out.println("");
        System.out.printf("Somatorio + 10 = %.2f\n", num);
    }
    
}
