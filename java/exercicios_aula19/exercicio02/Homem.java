/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio02;

/**
 *
 * @author raoniton
 */
public class Homem extends Animal{
    
    public Homem(){
        this.fome = true;
        this.idade = 0;
        this.nome = "";
    }
    
    public Homem(String nome, int idade){        
        this.idade = idade;
        this.nome = nome;
        this.fome = true;
    }
    
    public Homem(String nome, int idade, boolean fome){        
        this.idade = idade;
        this.nome = nome;
        this.fome = fome;
    }
    
    
    @Override
    public void falar(){
        System.out.println("Oi");
    }
    
    @Override
    public void alimentar(){
        if(this.isFome()){
            this.setFome(false);
            System.out.println(this.getNome() +" foi alimentado com um prato de comida!");
        }else
            System.out.println(this.getNome() +" nao esta com fome!");
    }
    
    /*@Override
    public String toString(){
        String parte1, parte2;
        parte1 = "tipo: "+this.getClass().getSimpleName()+"nome: " +this.getNome()+ " - idade: " +this.getIdade();
        
        parte2 = this.isFome()
                ? " - Esta com fome!"
                : " - Nao esta com fome!";
        
        return parte1.concat(parte2);
    }*/
}
