/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio02;

/**
 *
 * @author raoniton
 */
public class ProdutoImportado extends Produto{
    private double taxaAlfandega;

    public ProdutoImportado(double taxaAlfandega, String nome, double preco) {
        super(nome, preco);
        this.taxaAlfandega = taxaAlfandega;
    }
    
    public double precoTotal(){
        return this.taxaAlfandega+this.getPreco();
    }
    
    @Override
    public void etiquetaPreco(){
        System.out.printf("%s R$%.2f (Taxa Alfandegaria): $%.2f\n", this.getNome(), this.precoTotal(), this.taxaAlfandega);
    }
    
}
