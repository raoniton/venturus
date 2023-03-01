/*
 Exercício 5
Escreva um algoritmo que leia três lados quaisquer. Identifique se esses lados 
podem formar um triângulo. Caso os lados formem um triângulo, identifique se o 
triângulo é equilátero, escaleno ou isóceles.
Regra: Suponha os lados a, b e c.
É triangulo somente se a condição for satisfeita: (a+b)>c e (a+c)>b e (b+c)>a 
- Equilátero: todos os lados iguais. 
- Escaleno: todos os lados diferentes. 
- Isóceles: dois lados são iguais.
*/
package exercicio_05;

import java.util.Scanner;

/**
 *
 * @author raoniton
 */
public class Exercicio_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double a, b, c;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite os lados para verificar se eh triangulo:");
        System.out.println("Digite a: ");
        a = scanner.nextDouble();
        
        System.out.println("Digite b: ");
        b = scanner.nextDouble();
        
        System.out.println("Digite c: ");
        c = scanner.nextDouble();
        
        if(a < (b + c) && b < (a + c) && c < (a + b)){
            System.out.printf("Eh triangulo: ");
            if(a==b && b==c)
                System.out.println("Equilatero.");
            else if(a!=b && b!=c && c!=a)
                System.out.println("Escaleno.");
            else
                System.out.println("Isosceles.");
        }
    }
    
}
