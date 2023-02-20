/*
Exercício 6 - AULA 04
Fazer um programa que leia o número de um funcionário, seu número de horas 
trabalhadas no mês, o valor que recebe por hora e calcular o salário desse funcionário. 
A seguir, mostre o número e o salário do funcionário, com duas casas decimais
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
        int cod, horasTrab;
        double valorHora;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o codigo do funcionario: ");
        cod = scanner.nextInt();
        
        System.out.println("Digite o numero de horas trabalhadas: ");
        horasTrab = scanner.nextInt();
        
        System.out.println("Digite o valor da hora desse funcionario: ");
        valorHora = scanner.nextDouble();
        
         System.out.printf("NUMERO = %d, SALARIO = R$%.2f\n", cod , horasTrab*valorHora);
    }
    
}
