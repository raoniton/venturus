/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio02;

/**
 *
 * @author raoniton
 */
public class Papagaio extends Animal{
    public Papagaio(){
        this.fome = true;
        this.idade = 0;
        this.nome = "";
    }
    
    public Papagaio(String nome, int idade){        
        this.idade = idade;
        this.nome = nome;
        this.fome = true;
    }
    
    public Papagaio(String nome, int idade, boolean fome){        
        this.idade = idade;
        this.nome = nome;
        this.fome = fome;
    }
    
    @Override
    public void falar(){
        System.out.println("Qué Café");
    }
    
    @Override
    public void alimentar(){
        if(this.isFome()){
            this.setFome(false);
            System.out.println(this.getNome() +" foi alimentado comida para aves!");
        }else
            System.out.println(this.getNome() +" nao esta com fome!");
    }
}
