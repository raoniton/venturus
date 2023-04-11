/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio03;

import java.util.List;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    private String nome;
    private String email;
    private double salario;
    
    public Funcionario(String nome, String email, double salario){
        this.nome = nome;
        this.email = email;
        this.salario = salario;
    }
    
    public Funcionario(){
        this.nome = "";
        this.email = "";
        this.salario = 0.0;
    }
    
    public List<Funcionario> addFunc(String dados){
        
        System.out.println(dados);
        return null;
    }
    
    @Override
    public String toString(){
        return nome +", "+email+", "+salario;
    }
    
}
