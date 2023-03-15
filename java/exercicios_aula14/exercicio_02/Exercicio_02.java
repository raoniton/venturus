/*
Exercicio 2
Faça um programa para ler a cotação do dólar, e depois um valor em dólares a ser 
comprado por uma pessoa em reais. Informar quantos reais a pessoa vai pagar pelos dólares, 
considerando ainda que a pessoa terá que pagar 6% de IOF sobre o valor em dólar.
Crie uma classe Conversor para ser responsável pelos cálculos.
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
        double cotDolar;
        double qtdDolar;
        Conversor con = new Conversor();
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual a cotacao do dolar hoje: ");
        cotDolar = scanner.nextDouble();
        
        System.out.println("Quantos dolares voce quer comprar: ");
        qtdDolar = scanner.nextDouble();
        
        con.valorFinal = con.converte(cotDolar, qtdDolar);
        System.out.printf("Voce precisa de R$%.2f\n",con.valorFinal);
        
    }
    
}
