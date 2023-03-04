/*
Exercicio 11
Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem 
dizendo em qual dos seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) 
este valor se encontra. Se o valor não estiver em nenhum destes intervalos, 
imprima a mensagem “Fora de intervalo”.
 */
package exercicio_11;
import java.util.Scanner;
/**
 *
 * @author raoniton
 */
public class Exercicio_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um numero: ");
        x = scanner.nextInt();
        
        if(x >= 0 && x<= 25)
            System.out.printf("%d pertence ao intervalo [0,25]\n",x);
        else if(x > 25 && x <= 50)
            System.out.printf("%d pertence ao intervalo (25, 50]\n",x);
        else if(x > 50 && x <= 75)
            System.out.printf("%d pertence ao intervalo (50,75]\n",x);
        else if(x > 75 && x <= 100)
            System.out.printf("%d pertence ao intervalo (75,100]\n",x);
        else{
            System.out.printf("Fora de intervalo\n");
        }
        
            
    }
    
}
