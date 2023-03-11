/*
Atividade 3:
Crie um algoritmo para calcular o fatorial de um número.
Ex: 5! = 5 x 4 x 3 x 2 x 1 = 120.
Use a estrutura Do While para controlar a quantidade de cálculos que você pretende fazer.
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
        int num, fat=1;
        char op;
        Scanner scanner = new Scanner(System.in);
        
        do{
            System.out.println("Digite um numero para saber o fatorial: ");
            num = scanner.nextInt();
            
            for(int i=1; i <= num; i++){
                fat = fat*i;
            }
            System.out.printf("%d! = %d\n", num, fat);
            fat=1;
            
            System.out.println("Voce deseja calcular outro fatorial? (s/n): ");
            op = scanner.next().charAt(0);
            
        }while((op == 's') || (op == 'S'));
    }
    
}
