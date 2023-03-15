/*
Classe Funcionario - Exercicio 3
*/
package exercicio_03;

/**
 *
 * @author raoniton
 */
public class Funcionario {
    public double salarioInicial;
    public double salarioAtual;
    public int anoContratacao;
    
    //Construtor
    public Funcionario(double salarioInicial, int anoContratacao){
        this.salarioInicial = salarioInicial;        
        this.anoContratacao = anoContratacao;
        salarioAtual = salarioInicial;
        
    }
    public void aumento(double percentual){
        this.salarioAtual = this.salarioAtual*(1 + percentual/100);
    }
    
}
