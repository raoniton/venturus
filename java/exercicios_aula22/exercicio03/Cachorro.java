/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio03;

/**
 *
 * @author raoniton
 */
public class Cachorro extends Mamifero{

    public Cachorro(double peso, int idade, int membros, String corDoPelo) {
        super(peso, idade, membros, corDoPelo);
    }

   
    
    @Override
    public void emitirSom(){
        System.out.printf("Au Au Au Au...");
    }
 
    public void reagir(String frase){
        if("Frase Agradavel".equals(frase)){
            System.out.println("Abanando a calda e latindo");
        }else if("Frase Agressiva".equals(frase)){
            System.out.println("Rosando");
        }
    }
    
    public void reagir(int hora){
        if(hora >= 0 && hora < 6){
            System.out.println("Abanando a calda");
        }else if(hora >=6 && hora < 18){
            System.out.println("Abanando a calda e latindo");
        }else{
            System.out.println("Ignorando");
        }
    }
    
    public void reagir(boolean dono){
        if(dono)
            System.out.println("Abanando a calda");
        else
            System.out.println("Rosnando e latindo");
    }
    
    public void reagir(int idade, int peso){
        if(idade < 5){
            if(peso < 10)
                System.out.println("Abanando a calda");
            else
                System.out.println("Latindo");
        }else{
            if(peso < 10)
                System.out.println("Rosnando");
            else
                System.out.println("Ignorando");
        }
    }
    
    @Override
    public String toString(){
        return "Animal: "+this.getClass().getSimpleName()+"\nIdade:"+this.idade+"\nPeso: "+this.peso+"\nCor do pelo: "+this.corDoPelo;
    }
    
}


