/*
Classe Produto - Exercicio 4
*/
package exercicio04;

/**
 *
 * @author raoniton
 */
public class Produto {

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getProd() {
        return prod;
    }

    public void setProd(String prod) {
        this.prod = prod;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public int getQtd(){
        return qtd;
    }
    
    public void setQtd(int qtd){
        this.qtd = qtd;
    }

    public Produto(int cod, String prod, double preco, int qtd) {
        this.cod = cod;
        this.prod = prod;
        this.preco = preco;
        this.qtd = qtd;
        
    }
    
    
    protected int cod;
    protected String prod;
    protected double preco;
    protected int qtd;
    
    //SE int impressao == 1, imprime a conta, senao nao imprime
    public double fecharConta(Produto p[], int impressao){
        System.out.println("--------------------------------------\n\t\tConta\n--------------------------------------");
        int i;
        double conta=0;
        for(i=0; i < p.length; i++){
            conta = conta + (p[i].preco * p[i].qtd);
            if(p[i].qtd > 0 && impressao == 1){
                System.out.printf("%d unidades - %s - R$%.2f - R$%.2f\n", p[i].getQtd(), p[i].getProd(), p[i].getPreco(), p[i].getPreco() * p[i].getQtd());
            }
        }
        System.out.printf("--------------------------------------\nTOTAL = R$%.2f\n\n",conta);
        return conta;
    }
    
    
    
    
}
