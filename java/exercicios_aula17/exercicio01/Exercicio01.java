/*
Exercicio 1
Crie um programa que contenha os metodos e atributos conforme o diagrama de classe.
Imagine que o carro(motor) só deve ligar se este conter gasolina em seu tanque. No
entanto, perceba que usar o motor ou até mesmo a gasolina, nao dever ser uma acao direta do
usuario. Use o conceito de encapsulamento e crie uma interface para os metodos citados.
Instancie um objeto motor. 
Apresente o resultado. 
Se tem gasolina, apresente a mensagem "O motor foi ligado", caso contrario indique 
"nao temos gasolina para ligar o motor"

Motor
-----
+ligado
-gasolina
-----
+ligar()
+temGasolina()

*/
package exercicio01;

/**
 *
 * @author raoniton
 */
public class Exercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Motor motor = new Motor();
        motor.setGasolina(false);
        motor.ligar();
        motor.setGasolina(true);
        motor.ligar();
    }
    
}
