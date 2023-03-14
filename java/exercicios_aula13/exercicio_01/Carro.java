/*
Exercicio 1
Faca um programa que crie uma classe Carro e em seguida instancie 3 objetos, 
carro1, carro2, carro3. A classe Carro possui os atributos cor, modelo e velocidade;
Alem disso possui os metodos Acelerar, Frear e  AcenderFarol.

Considre que a velocidade ideal do carro esta no seguinte limite:

4 <= velocidade <= 60

Faca as seguinte consideracoes:

A) Caso a velocidade esteja abaixo do limite, some a velocidade mais 10km\h e 
imprima a mensagem: "Acelerando".

B) Caso a velocidade esteja acima do limite, subtraia a velocidade em 10km\h e 
imprima a mensagem: "Freando".

C) Por fim, leve em consideracao que o carro parado deve estar com o farol apagado 
e o carro em movimento deve estar com farol aceso.

*/
package exercicio_01;

/**
 *
 * @author raoniton
 */

public class Carro {
    String cor;
    String modelo;
    double velocidade;

    @Override
    public String toString(){
        return "Cor: "+this.cor+" Modelo: "+this.modelo+" Velocidade: "+ this.velocidade;
    }    
    
    public void acelerar(){
        if(this.velocidade < 40){
            System.out.println("Acelerando");
            this.velocidade = this.velocidade + 10;
        }else if(this.velocidade >= 40 && this.velocidade <= 60){
            System.out.println("Nao aumentou a velocidade, pois esta dentro do limite");
        }
    }
    
    public void frear(){
        if(this.velocidade > 60){
            System.out.println("Freando");
            this.velocidade = this.velocidade - 10;
        }
    }
    
    public void statusFarol(){
        if(this.velocidade == 0)
            System.out.println("Carro parado - Farol apagado.");
        else
            System.out.println("Carro em movimento - Farol aceso.");
    }
    
}
