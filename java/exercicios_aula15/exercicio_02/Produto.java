/*
*/
package exercicio_02;

/**
 *
 * @author raoniton
 */
public class Produto {
    public String nome;
    protected double preco;
    protected int quantidade;
    
    
    public Produto(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    
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
