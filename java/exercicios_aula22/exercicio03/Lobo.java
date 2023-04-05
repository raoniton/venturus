/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio03;

/**
 *
 * @author raoniton
 */
public class Lobo extends Mamifero{

    public Lobo(double peso, int idade, int membros, String corDoPelo) {
        super(peso, idade, membros, corDoPelo);
    }
    @Override
    public void emitirSom(){
        System.out.printf("Auuuuuuuuu..");
    }
    
     @Override
    public String toString(){
        return "Animal: "+this.getClass().getSimpleName()+"\nIdade:"+this.idade+"\nPeso: "+this.peso+"\nCor do pelo: "+this.corDoPelo;
    }
    
}
