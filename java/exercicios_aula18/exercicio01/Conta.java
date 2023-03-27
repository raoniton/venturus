/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio01;

import java.util.Scanner;

/**
 *
 * @author raoniton
 */
public final class Conta implements ControleConta{

    public static int getNum() {
        return num;
    }

    public static void setNum(int num) {
        Conta.num = num;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    private void setNumeroConta(int numeroConta) {
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

    private void setBalanco(double balanco) {
        this.balanco = balanco;
    }

    public Conta(String proprietario, int balanco) {
        setNumeroConta(Conta.getNum());
        num++;
        setProprietario(proprietario);
        setBalanco(balanco);
    }

    public Conta() {
        Scanner scanner = new Scanner(System.in); 
        setNumeroConta(Conta.getNum());
        num++;
        System.out.println("Digite o nome do proprietario da conta: ");
        this.setProprietario(scanner.nextLine());
        
        System.out.printf("Voce deseja fazer algum deposito?\nCaso nao queira, digite 0,\n");
        this.setBalanco(scanner.nextDouble());
    }
    
    @Override
    public int depositar(){
        double valorAntesDeposito = this.getBalanco();
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Digite valor deseja depositar: ");
        this.setBalanco(this.getBalanco() + scanner.nextDouble());
         System.out.printf("Saldo:\t\t R$%.2f\n"
                 + "Deposito:\t+R$%.2f\n"
                 + "---------------\nTotal:\t\t R$%.2f\n\n", this.getBalanco(), Math.abs( this.getBalanco() - valorAntesDeposito ), this.getBalanco());
        return 0;
    }
    @Override
    public int sacar(){
        double taxaSaque = 5;
        double valorAntesSaque = this.getBalanco();
        Scanner scanner = new Scanner(System.in); 
        
        System.out.println("Valor em conta: R$"+this.getBalanco());
        System.out.println("Digite valor deseja sacar: ");
        this.setBalanco(this.getBalanco() - scanner.nextDouble() -taxaSaque);
        
        System.out.printf("Saldo:\t R$%.2f\n"
                + "Saque:\t-R$%.2f\n"
                + "Taxa:\t-R$%.2f\n"
                + "---------------\nTotal:\t R$%.2f\n\n", valorAntesSaque, Math.abs((valorAntesSaque - this.getBalanco() -taxaSaque)), taxaSaque, this.getBalanco());
        return 0;
    }
    
    @Override
    public String toString(){
        return "num_Conta: "+this.getNumeroConta()+"\nnome: "+this.getProprietario()+"\nsaldo: "+this.getBalanco();
    }
    
    private static int num = 1;
    private int numeroConta = 0;
    private String proprietario;
    private double balanco;
    
    
    
    
    
}
