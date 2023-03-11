/*
Exercicio 8
Escreva um algoritmo que leia as notas das duas provas de cada um dos 3 alunos. 
Leia o nome do aluno e suas respectivas notas. Imprima o resultado dizendo se os 
alunos foram aprovados(nota >= 6.0) e imprima no final a média da turma.
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
        int i;
        double nota, mediaTurma=0;
        String nome;
        Scanner scanner = new Scanner(System.in);
        
        for(i=0; i < 3; i++){
            System.out.println("Digite o nome do aluno: ");
            nome = scanner.nextLine();
            
            System.out.println("Digite a primera nota:");
            nota = scanner.nextDouble();
            
            System.out.println("Digite a segunda nota:");
            nota = (nota + scanner.nextDouble())/2;
            
            scanner.nextLine();//ESSE nextLine() eh para limpar o buffer do teclado.
            
            if(nota >= 6){
                System.out.printf("Nome: %s - Media: %.2f -  Aprovado\n", nome, nota);
            }else{
                System.out.printf("Nome: %s - Media: %.2f -  Reprovado\n", nome, nota);
            }
            
            System.out.printf("----------------\n\n");
            mediaTurma = mediaTurma + nota;
            
        }
        
        System.out.printf("A media da turma = %.2f\n", mediaTurma);
    }
    
}
