/*
Exercicio 7
Crie um algoritmo que simule uma calculadora, ou seja, que permite ao usuário 
escolher a operação matemática que ele deseja (soma, subtração, multiplicação e 
divisão). Após a escolha da operação desejada, o resultado deve ser impresso na tela. 
O usuário deve ler dois números para fazer uso da calculadora.
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
        int opcao;
        double a, b;
        Scanner scanner = new Scanner(System.in);
        
        do{
            
            System.out.println("Digite a opcao: ");
            System.out.printf("[1] SOMA:\n" +
                            "[2] SUBTRACAO\n" +
                            "[3] MULTIPLICACO\n" +
                            "[4] DIVISAO\n"+ 
                            "[5] SAIR: \n"
            );
            opcao = scanner.nextInt();
            
            switch(opcao){
                case 1 -> {
                    System.out.println("A + B:");
                    System.out.println("Digite A:");
                    a = scanner.nextDouble();
                    
                    System.out.println("Digite B:");
                    b = scanner.nextDouble();
                    
                    System.out.printf("%.2f + %.2f =  %.2f\n\n", a, b, a + b);                    
                }
                case 2 -> {
                    System.out.println("A - B:");
                    System.out.println("Digite A:");
                    a = scanner.nextDouble();
                    
                    System.out.println("Digite B:");
                    b = scanner.nextDouble();
                    
                    System.out.printf("%.2f - %.2f =  %.2f\n\n", a, b, a - b);                    
                }
                case 3 -> {
                    System.out.println("A * B:");
                    System.out.println("Digite A:");
                    a = scanner.nextDouble();
                    
                    System.out.println("Digite B:");
                    b = scanner.nextDouble();
                    
                    System.out.printf("%.2f * %.2f =  %.2f\n\n", a, b, a * b);                    
                }
                case 4 -> {
                    System.out.println("A / B:");
                    System.out.println("Digite A:");
                    a = scanner.nextDouble();
                    
                    System.out.println("Digite B:");
                    b = scanner.nextDouble();
                    
                    System.out.printf("%.2f / %.2f =  %.2f\n\n", a, b, a / b);
                }
                case 5 -> opcao = 5;
                default -> System.out.println("Opcao invalida! \nTente Novamente!");
                
            }
            
        }while(opcao != 5);
        
    }
    
}
