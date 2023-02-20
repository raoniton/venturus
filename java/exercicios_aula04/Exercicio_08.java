/*
Exercício 8 - AULA 04
Fazer um programa que leia três valores com ponto flutuante de dupla precisão: 
A, B e C. Em seguida, calcule e mostre: 
    a) a área do triângulo retângulo que tem A por base e C por altura. 
    b) a área do círculo de raio C (pi = 3.14159). 
    c) a área do trapézio que tem A e B por bases e C por altura. 
    d) a área do quadrado que tem lado B. 
    e) a área do retângulo que tem lados A e B.
*/
package exercicio_08;
import java.util.Scanner;
/**
 *
 * @author raoniton
 */
public class Exercicio_08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double a, b, c;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um valor para A: ");
        a = scanner.nextDouble();
        
        System.out.println("Digite um valor para B: ");
        b = scanner.nextDouble();
        
        System.out.println("Digite um valor para C: ");
        c = scanner.nextDouble();
        
        System.out.printf("TRIANGULO: %.3f\nCIRCULO: %.3f \nTRAPEZIO: %.3f \nQUADRADO: %.3f \nRETANGULO: %.3f \n",
        (a*c)/2, (Math.PI * Math.pow(c, 2)), ((a+b)*c)/2, b*b, a*b);
             
        
    }
    
}
