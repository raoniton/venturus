/*
Classe OperacaoMatematica - Exercicio 3
 */
package exercicio03;

/**
 *
 * @author raoniton
 */
public class OperacaoMatematica {

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    
    
    private int n;
    
    public String parOuImpar(){
        if(this.getN() % 2 == 0)
            return "Par";
        else
            return "Impar";
    }
    
    public String negativoOuPositivo(){
        if(this.getN() > 0)
            return "Positivo";
        else if(this.getN() < 0)
            return "Negativo";
        else
            return "Neuro";
    }
    
}
