/*
Faça um algoritmo para ler a base e a altura de um triangulo retângulo. 
Em seguida, calcular a sua área. Imprimir: base, altura e a área. 
 */
package exercicio_03;

import java.util.Scanner;

/**
 *
 * @author raoniton
 */
public class Exercicio_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double b, h; 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a base do trinagulo retangulo:");
        b = scanner.nextDouble();
        System.out.println("Digite a altura do trinagulo retangulo:");
        h = scanner.nextDouble();
        
        System.out.printf("Base = %.1f | Altura = %.1f\n", b, h);
        System.out.printf("Areaa = %.1f u.a.\n", (b*h)/2);
               
                
                
                
                
        
    }
    
}
