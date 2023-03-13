/*
Exercicio 1
Crie um programa que leia o nome de 5 alunos de uma classe. Leia as notas de duas 
provas de cada aluno, calcule a média da turma e imprima o resultado. 
Por fim, diga quais alunos possui a média maior que a média da turma.
*/
package exercicio_01;
import java.util.Scanner;
/**
 *
 * @author raoniton
 */
public class Exercicio_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double notas[][] = new double[5][2],
               media[] = new double[5], mediaTurma=0;
        String nomes[];
        nomes = new String[5];
        Scanner scanner = new Scanner(System.in);
        int i, j;
        
        for(i=0; i<5; i++){
            System.out.println("----------------------");
            System.out.println("Digite o nome do aluno: ");
            nomes[i] = scanner.nextLine();
            
            for(j=0; j<2; j++){
                System.out.printf("Digite a %d nota de %s\n", j+1, nomes[i]);
                notas[i][j] = scanner.nextDouble();
                scanner.nextLine();
            }
            media[i] = (notas[i][0] + notas[i][1])/2;
        }
        
        for(i=0; i<5; i++){
            mediaTurma = mediaTurma + media[i];
        }
        mediaTurma = mediaTurma/5;
        
        System.out.printf("Media da turma: %.2f\n", mediaTurma);
        for(i=0; i<5; i++){
            if(media[i] > mediaTurma)
                System.out.printf("%s esta acima da media: %.2f\n", nomes[i], media[i]);
        }
        
        
        
    }
    
}
