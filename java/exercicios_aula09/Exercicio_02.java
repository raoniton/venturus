/*
Exercicio 2
Crie um algoritmo que leia o número de alunos na sala de aula para serem avaliados. 
Cada aluno realiza 3 testes. O professor precisa digitar a nota de cada teste e 
calcular a média para cada
aluno. Apresente a média ponderada para cada um destes conjuntos de 3 notas, 
sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro 
valor tem peso 5. Imprima o resultado com o nome do aluno e a média ponderada. 
*/
package exercicio_02;
import java.util.Scanner;
/**
 *
 * @author raoniton
 */
public class Exercicio_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numAlunos, i=0;
        double t1, t2, t3;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o numero de aluno da turma: ");
        numAlunos = scanner.nextInt();
        
        
        while(i < numAlunos){
            System.out.println("Digite a 1a nota do " + (i+1) + "o aluno:");
            t1 = scanner.nextDouble();
            
            System.out.println("Digite a 2a nota do " + (i+1) + "o aluno:");
            t2 = scanner.nextDouble();
            
            System.out.println("Digite a 3a nota do " + (i+1) + "o aluno:");
            t3 = scanner.nextDouble();
            
            System.out.printf("Media do Aluno %d = %.2f\n ", i+1, 0.2*t1 + 0.3*t2 + 0.5*t3);
            System.out.println("---------------------------");
            i++;
        }
    }
    
}
