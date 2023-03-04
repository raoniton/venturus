/*
Exercicio 5
 Suponha que a empresa "Google" decidiu conceder um aumento de salários a seus 
funcionários de acordo com a tabela ao lado. Escreva um algoritmo que lê, para 
cada funcionário, o seu nome e o seu salário atual. Após receber estes dados, 
o algoritmo calcula o novo salário e escreve na tela as seguintes informações:

<% de aumento> <salario atual> <salario novo>

TABELA: 
SALARIO ATUAL   |   AUMENTO
  0-3 salarios  |     20%
  4-6 salarios  |     15%
  7-9 salarios  |     12%
10-12 salarios  |     10%
12-15 salarios  |     7%
  >16 salarios  |     0%
*/
package exercicio_05;
import java.util.Scanner;

/**
 *
 * @author raoniton
 */
public class Exercicio_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double salario, novoSalario, salarioMinimo=1000;
        int nSal;
        String nome;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o nome: ");
        nome = scanner.nextLine();
        
        System.out.println("Digite o salario: ");
        salario = scanner.nextDouble();
        
        nSal = (int)(salario/salarioMinimo);
        //System.out.println(nSal);
        
        if(nSal <= 3)
            novoSalario = salario*1.2;
        else if(nSal >= 4 && nSal <= 6)
            novoSalario = salario*1.15;
        else if(nSal >= 7 && nSal <= 9)
            novoSalario = salario*1.12;
        else if(nSal >= 10 && nSal < 12)
            novoSalario = salario*1.10;
        else if(nSal >= 12 && nSal <= 15)
            novoSalario = salario*1.07;
        else{
            novoSalario = salario;
        }
        
        System.out.printf("%.0f %s de aumento | R$%.2f | R$%.2f\n", (novoSalario/salario - 1)*100, "%", salario, novoSalario);
        
        
    }
    
}
