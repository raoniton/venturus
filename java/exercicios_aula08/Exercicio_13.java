/*
Exercicio 13
Pagar impostos é uma atividade corriqueira para a manutenção de atividades que 
competem a sociedade. No Brasil, vários produtos e os salários são taxados com impostos. 
Para os salários, os impostos são taxados de acordo com a faixa salarial. 
Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa no Brasil. 
Em seguida, calcule e mostre o valor que esta pessoa deve pagar de Imposto de Renda, 
segundo a tabela abaixo.

            Renda       |   Imposto de Renda
----------------------- + ------------------
Até 1903,98             |   Isento
De 1903,99 até 2.826,65 |   7,5%
De 2.826,66 até 3.751,05|   15%
De 3.751,06 até 4.664,68|   22,5%
Acima de 4.664,68       |   27,5%
*/
package exercicio_13;
import java.util.Scanner;
/**
 *
 * @author raoniton
 */
public class Exercicio_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double salario, porCentagem;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o valor do salario: ");
        salario = scanner.nextDouble();
        
        if(salario <= 1903.98){
            System.out.println("Isento");
        }else{
            if(salario >= 1903.99 && salario <= 2826.65)
                porCentagem = 0.075;
            else if(salario >= 2826.66 && salario <= 3751.05)
                porCentagem = 0.15;
            else if(salario >= 3751.06 && salario <= 4664.68)
                porCentagem = 0.225;
            else{
                porCentagem = 0.275;
            }
            
            System.out.printf("O valor de IR = R$%.2f\n", salario*porCentagem);
        }
            
        
        
    }
    
}
