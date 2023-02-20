/*
Exercicio 04 - AULA 04
Faça um programa para ler o valor do raio de um círculo, e depois mostrar 
o valor da área deste círculo com duas e quatro casas decimais conforme exemplos.
Fórmula da área: area = π . raio2 Considere o valor de π = 3.14159
*/
package exercicio_04;
import java.util.Scanner;
/**
 *
 * @author raoniton
 */
public class Exercicio_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double raio;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o valor do raio do circulo: ");
        raio = scanner.nextDouble();
        
        System.out.printf("Entrada: %.2f   Saida: A=%.2f\n", raio, Math.PI * Math.pow(raio, 2));
        System.out.printf("Entrada: %.2f   Saida: A=%.4f\n", raio, Math.PI * Math.pow(raio, 2));
    }
    
}
