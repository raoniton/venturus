/*
Classe Produto - Exercicio 1
Produto
----------
+ nome: String
# preco: double 
# quantidade: int
----------
+ totalValorEmEstoque(): double
+ addProduto(): void
+ removeProdutos(): void
*/
package exercicio_01;

import java.util.Scanner;

/**
 *
 * @author raoniton
 */
public class Produto {
    public String nome;
    protected double preco;
    protected int quantidade;
    
    public double totalValorEmEstoque(){
        return this.quantidade * this.preco;
    }
    
    public void addProdutos(int nProdutos){
       System.out.printf("%d %s adicionados(s)\n", nProdutos, this.nome);
        this.quantidade = this.quantidade + nProdutos;
    }
    
    public void removeProdutos(int nProdutos){
        System.out.printf("%d %s removido(s)\n", nProdutos, this.nome);
        this.quantidade = this.quantidade - nProdutos;
    }
    
    @Override
    public String toString(){
        return "----------\nPRODUTO:\n----------\n"
                + "Nome: "+this.nome +"\nPreco: "+this.preco+"\nQtd: "+this.quantidade;
    }
    
}
