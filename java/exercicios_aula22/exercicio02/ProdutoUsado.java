/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio02;

/**
 *
 * @author raoniton
 */
public class ProdutoUsado extends Produto{
    private String dataFabricacao;

    public ProdutoUsado(String dataFabricacao, String nome, double preco) {
        super(nome, preco);
        this.dataFabricacao = dataFabricacao;
    }
    
    @Override
    public void etiquetaPreco(){
        System.out.printf("%s (usado) R$%.2f (Data de Fabricacao %s)\n", this.getNome(), this.getPreco(), this.dataFabricacao);
    }
}
