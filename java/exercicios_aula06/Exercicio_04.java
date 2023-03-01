/*
Exercício 4
Desenvolva o código, utilizando operador de atribuição com módulo, para resolver 
o seguinte problema:
A variável w recebe inicialmente o valor 4. Qual o resto a ser printado, sabendo 
que a variável será dividida por 3.33?

OBS: resolva o problema considerando a variável w como inteiro e como ponto 
flutuante.
*/
package exercicio_04;
/**
 *
 * @author raoniton
 */
public class Exercicio_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int w = 4;
        double w2 = 4;
        w %=3.33;
        w2 %=3.33;
        
        System.out.println("w = "+w);
        System.out.println("w = "+w2);
        
    }
    
}
