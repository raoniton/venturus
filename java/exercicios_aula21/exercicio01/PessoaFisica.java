/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio01;

/**
 *
 * @author raoniton
 */
public class PessoaFisica extends Pessoa{
    private String cpf;

    public PessoaFisica(String cpf, String nome) {
        this.cpf = cpf;
        this.SetNome(nome);
    }
    
    public String getCpf(){
        return this.cpf;
    }
    
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    
    @Override
    public String getNome(){
        return "Nome: "+super.getNome();
    }
    
    
    
}
