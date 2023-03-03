/*
Exercicio 2 
Faça um Algoritmo para calcular a área de um círculo, fornecido o 
valor do raio, que deve ser positivo.
 */
package exercicio_02;

import java.util.Scanner;

/**
 *
 * @author raoniton
 */
public class Exercicio_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         double raio;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o raio do ciruclo:");
        raio = scanner.nextDouble();
        
        if(raio < 0){
            System.out.println("Não foi possivel calcular, pois você digitou um raio negativo.");
        }else{
            System.out.printf("O raio do circulo = %.2f\n∂∂", Math.PI*Math.pow(raio, 2));
        }
    }
    
}
