/*
Exercício 8: Desafio
• Escreva o código que resolva a equação ao lado.
    -> ax^2 + bx + c = 0 
    -> delta = b^2 - 4*a*c
    -> x = ( -b + sqrt(delta) )/(2*a)
    -> x = ( -b - sqrt(delta) )/(2*a)

• Utilize a classe Math.
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
        double a, b, c, delta;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite os coeficientes de uma Eq. de 2o Grau:");
        System.out.println("Coeficiente a =");
        a = scanner.nextDouble();
        
        System.out.println("Coeficiente b =");
        b = scanner.nextDouble(); 
        
        System.out.println("Coeficiente c =");
        c = scanner.nextDouble();
        
        delta = Math.pow(b, 2) - 4*a*c;
        
        System.out.println(delta == 0 
                ? "x1=x2 = " + ( -b/(2*a) )
                : delta > 0 
                        ? "x1= " + ( (- b + Math.sqrt(delta))/(2*a) ) + " x2= " + ( (- b - Math.sqrt(delta))/(2*a) )
                        : "Delta < 0, portanto a solucao nao pertence ao conjunto dos reais. S = {}."
                        
        ); 
        
    }
    
}
