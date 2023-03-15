/*
Exercicio 6 
Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). 
Em seguida, mostrar os dados do funcionário (nome e salário líquido). 
Em seguida, aumentar o salário do funcionário com base em uma porcentagem dada 
(somente o salário bruto é afetado pela porcentagem) e mostrar novamente os dados 
do funcionário. Use a classe projetada abaixo. 

Funcionario
---------
nome imposto 
salarioBruto
---------
SalarioLiquido() 
AumentoSalario()
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
        String nome;
        double imposto, salario;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o nome do Funcionario: ");
        nome = scanner.nextLine();
        
        System.out.println("Digite o salario bruto: ");
        salario = scanner.nextDouble();
        
        System.out.println("Digite o imposto: ");
        imposto = scanner.nextDouble();
        
        Funcionario func = new Funcionario(nome, imposto, salario);
        System.out.println(func);
        System.out.println("");//quebra de linha
        func.AumentoSalario(15);
        System.out.println(func);
    }
    
}
