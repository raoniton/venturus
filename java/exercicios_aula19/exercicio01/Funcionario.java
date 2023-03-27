/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio01;

/**
 *
 * @author raoniton
 */
public class Funcionario {

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    public void apresentar(){
        System.out.println("nome: " + this.getNome()+ "- cpf: " +this.getCpf()+ " - salario: "+this.getSalario());
    }
    private String nome;
    private String cpf;
    private double salario;
    
    public Funcionario(String nome, String cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }
    
    public Funcionario() {
        this.nome = "";
        this.cpf = "";
        this.salario = 0;
    }
    
    
}
