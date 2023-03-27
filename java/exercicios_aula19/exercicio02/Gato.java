/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio02;

/**
 *
 * @author raoniton
 */
public class Gato extends Animal{
    public Gato(){
        this.fome = true;
        this.idade = 0;
        this.nome = "";
    }
    
    public Gato(String nome, int idade){        
        this.idade = idade;
        this.nome = nome;
        this.fome = true;
    }
    
    public Gato(String nome, int idade, boolean fome){        
        this.idade = idade;
        this.nome = nome;
        this.fome = fome;
    }
    
    @Override
    public void falar(){
        System.out.println("Miau");
    }
    
    @Override
    public void alimentar(){
        if(this.isFome()){
            this.setFome(false);
            System.out.println(this.getNome() +" foi alimentado com racao para gatos!");
        }else
            System.out.println(this.getNome() +" nao esta com fome!");
    }
}
