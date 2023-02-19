/*
Elabore um algoritmo para ler o nome de um aluno, sua idade (em anos) 
e as quatro notas (de quatro bimestres). Calcular
a média anual do aluno. Imprimir: nome, idade, notas e média. 
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
        Scanner scanner = new Scanner(System.in);
        double notas[] = new double[4], somatorio=0;
        String nome;
        int idade;
        
        
        
        System.out.println("Digite o nome do aluno: ");
        nome = scanner.nextLine();
        
        System.out.println("Digite a idade do aluno: ");
        idade = scanner.nextInt();
        for(int i=0; i<4; i++){
            System.out.printf("Digite a %da nota: \n", i+1);
            notas[i] = scanner.nextDouble();
            somatorio = somatorio + notas[i];
        }
        
        System.out.printf("\nNome: %s\nIdade: %d anos\n", nome, idade);
        for(int i=0; i<4; i++){
           System.out.printf("Nota %d: %.2f\n", i+1, notas[i]);
        }
        System.out.printf("Media: %.2f\n", somatorio/4);
        
    }
    
}
