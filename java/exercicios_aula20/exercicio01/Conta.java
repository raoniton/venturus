/*
Exercicio 1 - Classe Conta 
*/
package exercicio01;

/**
 *
 * @author raoniton
 */
public class Conta {

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public double getBalanco() {
        return balanco;
    }

    public void setBalanco(double balanco) {
        this.balanco = balanco;
    }
    
    private int numeroConta;
    private String proprietario;
    private double balanco;
    
    public Conta(int numeroConta, String proprietario, double balanco){
        this.numeroConta = numeroConta;
        this.proprietario = proprietario;
        this.balanco = balanco;
    }
    
    public void deposito(double deposito){
        balanco = balanco + deposito;
    }
    
    public void saque(double saque){
        balanco = balanco + saque;
    }
    
    @Override
    public String toString(){
        return "Conta: "+numeroConta+"\nNome: "+proprietario+"\nBalanco: "+balanco+"\n"; 
    }
}
