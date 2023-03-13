/*
Exercicio 7
Crie um programa que escolha um número aleatório entre 100 números de forma randômica. 
Após tal escolha, o programa deve ler a entrada de um número com o intuito de adivinhar 
o número escolhido randomicamente. Crie o programa de tal forma que, a cada número digitado 
ele indique se o número verdadeiro é maior ou menor. Dessa forma, você consegue adivinhar 
mais rápido ao número randômico.
Random nome = new Random();
*/
package exercicio_07;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author raoniton
 */
public class Exercicio_07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int x, chute;
        x = random.nextInt(100);
        
        //System.out.println(x);
        
        System.out.println("Geramos um numero aleatorio entre 0 e 100, tente adivinhar: ");        
        System.out.println("Digite um numero: ");
        do{
            
            chute = scanner.nextInt();
            
            if(chute < x)
                System.out.printf("Ops! O numero eh maior que %d, tente novamente: \n", chute);
            else if(chute > x)
                System.out.printf("Ops! O numero eh menor que %d, tente novamente: \n", chute);
            
            
        }while(x != chute);
        System.out.printf("Parabens, voce acertou! \n");
    }
    
}
