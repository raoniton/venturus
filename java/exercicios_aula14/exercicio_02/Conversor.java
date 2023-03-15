/*
Classe Conversor - Exercicio 2
 */
package exercicio_02;

/**
 *
 * @author raoniton
 */
public class Conversor {
    double valorFinal;
    double iof = 0.06; //6% de IOF
    
    public double converte(double cot, double qtdD){
        return cot*qtdD*(1.06);
    }
}
