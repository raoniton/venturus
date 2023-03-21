/*
Exercicio 3
Faça uma programa para ler um número inteiro (N), e depois dizer se este número 
é negativo ou não. Além disso dizer também se este número é par ou ímpar. 
Crie o programa principal e crie uma classe operaçãoMatematica com dois métodos, 
ParOuImpar() e NegativoOuPositivo(), onde deve conter a lógica do problema. 
Considere os métodos como públicos. E Considere a variável N como protegido. 
Depois tente trocar para privado e discuta o resultado.
*/
package exercicio03;

import java.util.Scanner;

/**
 *
 * @author raoniton
 */
public class Exercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OperacaoMatematica op = new OperacaoMatematica();
        
        System.out.println("Digite um numero: ");
        op.setN(scanner.nextInt());
        
        System.out.printf("%d: %s e %s\n",op.getN(), op.negativoOuPositivo(),op.parOuImpar());
        
        
        
    }
    
}
