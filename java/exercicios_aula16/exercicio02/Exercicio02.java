/*
Crie uma classe Carro com as seguintes características:
Use o construtor para definir o início padrão do carro. Ele deve estar desligado e marcha zero.
Insira os getters e setters.
Dentro do método desligar(), avise com uma mensagem "Carro está desligado".

Carro
----------
+ cor
+ marca
+ ano
+ marcha
+ ligado
+ velocidadeAtual
+ velocidadeMaxima
----------
+ ligar()
+ desligar()
+ acelegar()
+ pegarMarcha 
 

Dentro do método ligar(), avise com a mensagem quando estiver ligado "O carro está ligado". E ao acelerar que apresente o valor da velocidade Atual.
Dentro do método acelerar crie a lógica necessária. Considere uma quantidade/aumento de 10km/h para cada acelerada que for incrementado.

Dentro do método acelerar crie a lógica necessária. Considere a seguinte marcha:
(-1) Ré : velocidade < 0
(0 ) Ponto Morto : velocidade = 0
(1 ) Media: 0 < velocidade < 40
(2 ) Alta : 40 =< velocidade =< 80
(3 ) qualquer valor diferente do previsto.

Por fim, instancie
dois objetos carro.
Teste os carros com características e comportamentos diferentes.

*/
package exercicio02;

/**
 *
 * @author raoniton
 */
public class Exercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Carro car1 = new Carro();
        Carro car2 = new Carro();
        
        car1.setAno(2010);
        car1.setCor("Azul");
        car1.setMarca("Honda");
        car1.setVelocidadeMaxima(200);
        car1.statusCarro();
        car1.setLigado(true);
        car1.acelerar();
        car1.statusCarro();
        car1.acelerar();
        car1.acelerar();
        car1.acelerar();
        car1.statusCarro();
        
        System.out.println("");
        
        car2.setAno(2023);
        car2.setCor("Vermelho");
        car2.setMarca("Ferrari");
        car2.setVelocidadeMaxima(300);
        car2.statusCarro();
        car2.setVelocidadeAtual(-20);
        car2.setLigado(true);
        car2.acelerar();
        car2.statusCarro();
        car2.acelerar();
        car2.acelerar();
        car2.acelerar();
        car2.acelerar();
        car2.acelerar();
        car2.acelerar();
        car2.acelerar();
        car2.statusCarro();
        
        
    }
    
}
