/*
Exercicio 1 - Classe Conta Juridica que herda da classe Conta
*/
package exercicio01;

import java.util.Scanner;

/**
 *
 * @author raoniton
 */
public class ContaJuridica extends Conta{
    private double limiteEmprestimo;

    public ContaJuridica(double limiteEmprestimo, int numeroConta, String proprietario, double balanco) {
        super(numeroConta, proprietario, balanco);
        this.limiteEmprestimo = limiteEmprestimo;
    }
    
    public void emprestimo(){
        Double valor;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o valor que deseja emprestar?");
        //10 reais eh a taxa de emprestimo
        valor = scanner.nextDouble();
        if(valor + 10 <= limiteEmprestimo){
            //apos o emprestimo ser concedido, o valor para emprestimo nao esta
            //mais disponivel, enquanto a empres nao ir pagando.
            limiteEmprestimo = limiteEmprestimo - valor;
            super.setBalanco(super.getBalanco() + valor - 10);
        }else{
            System.out.println("Emprestimo negado! Tente com um valor menor!");
        }
    }
    
    @Override
    public String toString(){
        return "Conta: "+super.getNumeroConta()+"\nNome: "+super.getProprietario()+"\nBalanco: R$"+super.getBalanco()+"\nLimite de Emprestimo: R$"+limiteEmprestimo+"\n"; 
    }
    
    
    
}
