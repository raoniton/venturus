/*
Classe Funcionario - Exercicio 6

Funcionario
---------
nome imposto 
salarioBruto
---------
SalarioLiquido() 
AumentoSalario()
*/
package exercicio_06;

/**
 *
 * @author raoniton
 */
public class Funcionario {
    String nome;
    double imposto;
    double salarioBruto;
    
    public Funcionario(String nome, double imposto, double salarioBruto){
        this.nome = nome;
        this.imposto = imposto;
        this.salarioBruto = salarioBruto;
    }
    
    public double SalarioLiquido(){
        return this.salarioBruto*(1-this.imposto/100);
    }
    
    public void AumentoSalario(double aumentoPercentual){
        System.out.printf("O funcionario recebeu um aumento de %.2f%%\n", aumentoPercentual);
        this.salarioBruto = this.salarioBruto*(1+aumentoPercentual/100);
    }
    
    public String toString(){
        return "\n----------\nFuncionario\n----------\nNome do Funcionario:\t"+this.nome + "\nSalario Liquido:\t"+"R$"+this.SalarioLiquido();
    }
    
}
