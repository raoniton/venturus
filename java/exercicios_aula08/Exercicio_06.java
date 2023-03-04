/*
Exercicio 6
Escreva o algoritmo "Programa Solidário". O doador deve clicar nas opções 
(mostradas abaixo) para efetuar a sua doação. Imprima o resultado na tela com o
valor da doação e uma mensagem de agradecimento. Utilize a estrutura Switch Case.
[1] para doar R$10
[2] para doar R$25
[3] para doar R$50
[4] para doar outros valores [5] para cancelar
*/
package exercicio_06;
import java.util.Scanner;
/**
 *
 * @author raoniton
 */
public class Exercicio_06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcao=0;
        double valor=0;
        Scanner scanner = new Scanner(System.in);
        
        
        do{
            System.out.println("Digite a opcao: ");
            System.out.printf("[1] para doar R$10\n" +
                            "[2] para doar R$25\n" +
                            "[3] para doar R$50\n" +
                            "[4] para doar outros valores\n"+ 
                            "[5] para cancelar: \n"
            );
            
            opcao = scanner.nextInt();
            
            switch(opcao){
                case 1 -> valor = 10;   
                case 2 -> valor = 25;   
                case 3 -> valor = 50;
                case 4 -> {
                    System.out.println("Digite o valor: "); 
                    valor = scanner.nextDouble();
                }
                case 5 -> opcao = 5;                
                default -> opcao = 0;                    
            }
            
        }while(opcao == 0);
        
        if(opcao != 5){
            System.out.printf("Voce fez uma doacao de R$%.2f\nMuito Obrigado!\n",valor);            
        }else{
            System.out.println("Voce nao doou. Muito obrigado.");
        }
    }
    
}
