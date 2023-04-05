/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio03;

/**
 *
 * @author raoniton
 */
public class Mamifero extends Animal{
    public String corDoPelo;

    public Mamifero(double peso, int idade, int membros, String corDoPelo) {
        this.corDoPelo = corDoPelo;
        super.idade = idade;
        super.membros = membros;
        super.peso = peso;
    }

    public String getCorDoPelo() {
        return corDoPelo;
    }

    public void setCorDoPelo(String corDoPelo) {
        this.corDoPelo = corDoPelo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMembros() {
        return membros;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }
    
    @Override
    public void emitirSom(){
        System.out.println("som de mamifero");
    }

    @Override
    public void locomover() {
        System.out.println("Se movendo");
    }

    @Override
    public void alimentar() {
        System.out.println("Se alimentando");
    }
}
