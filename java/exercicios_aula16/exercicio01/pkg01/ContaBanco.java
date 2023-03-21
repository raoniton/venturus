/*
Classe ContaBanco - Exercicio 1
*/
package exercicio.pkg01;

import java.util.Scanner;

/**
 *
 * @author raoniton
 */

public class ContaBanco {
    private static int nC=1;
    public int numConta;
    protected int tipo;
    private String nome;
    private double saldo;
    private boolean status;
    
    //CONSTRUTOR
    public ContaBanco(){
        this.numConta = nC;
        nC++;
        this.tipo = 0;
        this.nome = "";
        this.saldo = 0.0;
        this.status = false;
    }

    //Metodos GET e SET
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public void abrirConta(){
        
         Scanner scanner = new Scanner(System.in);
         System.out.println("Digite seu nome:");
         this.setNome(scanner.nextLine());
         
         System.out.println("Digite [1] para Conta Corrente - CC\nDigite [2] para Conta Poupanca - CP:");
         this.setTipo(scanner.nextInt());
         
         //Conta aberta
         this.status = true;
         
         if(this.getTipo() == 1)
             this.setSaldo(50);
         else if(this.getTipo() == 2){
             this.setSaldo(150);
         }else{
             System.out.println("ERRO!");
         }
         
         System.out.println("Deseja realizar o primeiro deposito agora?\nSe sim, basta digita algum valor. Se não, digite 0:");
         this.setSaldo(this.getSaldo() + scanner.nextDouble());
         
         
         
    }
    
    public void fecharConta(){
        if(!this.isStatus()){
            System.out.println("Nao foi possivel fechar a conta, pois a conta nao estava ativa!");
        }else if(this.getSaldo() != 0){
            System.out.println("Nao foi possivel fechar a conta, pois o salto esta diferente de R$00.00");
            System.out.printf("Saldo atual: R$%.2f\n", this.getSaldo());
        }else if(this.isStatus() && this.getSaldo()==0){
            this.setStatus(false);
            System.out.println("Conta desativada com sucesso!");
        }
    }
    
    public void depositar(){
        if(this.isStatus()){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Qual o valor a depositar?");
            this.setSaldo(this.getSaldo() + scanner.nextDouble());
            System.out.println("Valor depositado com sucesso!");
        }else{
            System.out.println("Sua conta ainda nao foi aberta!");
        }
    }
    
    public void sacar(){
        if(this.isStatus()){
            if(this.saldo > 0){
                Scanner scanner = new Scanner(System.in);
                System.out.println("Qual o valor a sacar?");
                this.setSaldo(this.getSaldo() - scanner.nextDouble());
                System.out.println("Valor sacado com sucesso!");
            }else
                System.out.println("Voce nao tem saldo!");
        }else{
            System.out.println("Sua conta ainda nao foi aberta!");
        }
    }
    
    public void pagarMensal(){
        if(this.isStatus()){
            if(this.getTipo() == 1){
                this.setSaldo(this.getSaldo() - 12);
                System.out.println("Mensalidade cobrada: R%12.00");
            }else if(this.getTipo() == 2){
                this.setSaldo(this.getSaldo() - 20);
                System.out.println("Mensalidade cobrada: R%20.00");
            }
        }else{
            System.out.println("Sua conta ainda nao foi aberta!");
        }
            
    }
    
    public void printConta(){
        if(this.isStatus()){
            System.out.println("\n-----------------\nDETALHES DA CONTA\n-----------------");
            System.out.println("Nome: " +this.getNome());
            System.out.printf(this.tipo == 1
                    ? "Tipo: Conta corrente\n"
                    : "Tipo: Conta poupanca\n"
            );
            System.out.printf("Saldo: R$%.2f\n\n",this.getSaldo());
        }else{
            System.out.println("Conta desativada!");
        }
    }

}
