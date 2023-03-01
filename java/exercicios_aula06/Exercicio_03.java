/*
Exercício 3
A) Desenvolva o código, utilizando operador de atribuição com divisão, 
para resolver o seguinte problema: A variável y recebe inicialmente o valor 5 
(valor flutuante) e deve ser dividido pelo valor 3.0. Qual o resultado printado?

B) Resolva o mesmo problema com a variável y sendo um valor inteiro.
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
        double y = 5;
        int y2 = 5;
        
        y /=3.0;
        y2 /=3.0;
        System.out.println("y = "+y);
        System.out.println("y = "+y2);
        
        
    }
    
}
