/*
Exercicio 01
Faça um Algoritmo que peça ao usuário a quantia em dinheiro que tem sobrando e 
sugira, caso ele tenha 30 ou mais
reais, que vá ao cinema, e se não tiver, fique em casa vendo TV.
 */
package teste;

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
        double valor;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o valor que tem sobrando: ");
        valor = scanner.nextInt();
        
        if( valor >= 30){
            System.out.println("Você pode ir ao cinema!");
        }else{
            System.out.println("Você deve ficar em casa!");
        }
    }
    
}
