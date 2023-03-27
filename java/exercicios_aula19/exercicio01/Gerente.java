/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio01;

/**
 *
 * @author raoniton
 */
public class Gerente extends Funcionario{

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
    private int senha;
    
    public boolean autentica(int senhaDigitada){        
        return (this.getSenha() == senhaDigitada);
        
    }

    public Gerente(int senha) {
        this.senha = senha;
    }
    
}
