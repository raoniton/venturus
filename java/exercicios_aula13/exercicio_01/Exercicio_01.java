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
public class Exercicio_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Carro c1 = new Carro();
        Carro c2 = new Carro();
        Carro c3 = new Carro();
        
        c1.modelo = "Celta";
        c1.cor = "Branco";        
        c1.velocidade = 30;
        System.out.println(c1);
        c1.statusFarol();
        c1.acelerar();
        c1.frear();
        System.out.println("Velocidade Atual: "+c1.velocidade);
        System.out.println("");
        
        c2.modelo = "Corolla";
        c2.cor = "Azul";
        c2.velocidade = 00;
        System.out.println(c1);
        c2.statusFarol();
        c2.acelerar();
        c2.frear();
        System.out.println("Velocidade Atual: "+c2.velocidade);
        System.out.println("");
        
        c3.modelo = "Camaro";
        c3.cor = "Amarelo";
        c3.velocidade = 80;
        System.out.println(c1);
        c3.statusFarol();
        c3.acelerar();
        c3.frear();
        System.out.println("Velocidade Atual: "+c3.velocidade);
        System.out.println("");
    }
    
}
