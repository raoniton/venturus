/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio01;

/**
 *
 * @author raoniton
 */
public class PessoaJuridica extends Pessoa {
    private String cnpj;

    public PessoaJuridica(String cnpj, String nome) {
        this.cnpj = cnpj;
        this.SetNome(nome);
    }
    
    public String getCnpj(){
        return this.cnpj;
    }
    
    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }
    
    @Override
    public String getNome(){
        return "Nome: "+super.getNome();
    }
    
}
