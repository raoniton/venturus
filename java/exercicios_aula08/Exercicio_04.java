/*
Exercicio 4 
Escreva um Algoritmo que calcule a média de um aluno numa dada disciplina e 
imprima o resultado. Regra: Durante o semestre o aluno faz 3 avaliações com notas 
de 0 a 10. É considerado aprovado, o aluno que consegue nota igual ou superior a 7. 
Se este ficar com nota menor que 7 e maior ou igual a 5, será considerado de 
recuperação. No entanto, se a nota for abaixo de 5, o aluno será considerado 
reprovado e deverá repetir o semestre.
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
        double n1, n2, n3, media;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a 1a nota: ");
        n1 = scanner.nextDouble();
        
        System.out.println("Digite a 2a nota: ");
        n2 = scanner.nextDouble();
        
        System.out.println("Digite a 3a nota: ");
        n3 = scanner.nextDouble();
        
        media = (n1+n2+n3)/3;
        
        System.out.printf("Media: %.2f\n", media);
        if(media < 5)
            System.out.println("Aluno Reprovado.");
        else if((media >= 5) && (media < 7))
            System.out.println("Aluno de Recuperação");
        else
            System.out.println("Aluno Aprovado");
    }
    
}
