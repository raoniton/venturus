/*
Exercicio 7
Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos 
três trimestres do ano (primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). 
Ao final, mostrar qual a nota final do aluno no ano. Dizer também se o aluno está
APROVADO ou REPROVADO e, em caso negativo, quantos pontos faltam para o aluno obter 
o mínimo para ser aprovado (que é 60% da nota). Você deve criar uma classe Estudante 
para resolver este problema.
*/
package exercicio_07;
import java.util.Scanner;
/**
 *
 * @author raoniton
 */
public class Exercicio_07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Estudante aluno = new Estudante();
        System.out.println("Digite o nome do aluno:");
        aluno.nome = scanner.nextLine();
        
        System.out.println("Digite a nota do 1o trimestre: ");
        aluno.nota1 = scanner.nextDouble();
        
        System.out.println("Digite a nota do 2o trimestre: ");
        aluno.nota2 = scanner.nextDouble();
        
        System.out.println("Digite a nota do 3o trimestre: ");
        aluno.nota3 = scanner.nextDouble();
        
        aluno.calculaNotaFinal(0.3, 0.35, 0.35);
        System.out.println(aluno);
        
        System.out.println(aluno.verificaAprovacao());
        
        
    }
    
}
