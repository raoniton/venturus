/*
Exercicio 10
Escreva um programa para receber os nomes dos 5 candidatos a líder de turma, em 
seguida receber os votos dos alunos existentes na sala, e ao final mostrar o 
total de votos de cada candidato, o total de votos na eleição, e ainda o candidato 
vencedor da eleição. Caso digite um número inexistente para os candidatos, imprima 
a mensagem "Voto Inválido".
*/
package exercicio_10_desafio;
import java.util.Scanner;
/**
 *
 * @author raoniton
 */
public class Exercicio_10_Desafio {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cand1, cand2, cand3, cand4, cand5;
        int nAlunos, op;
        int opcao[] = new int[5], max;
        int somatorio;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o nome do 1o candidato: ");
        cand1 = scanner.nextLine();
        System.out.println("Digite o nome do 2o candidato: ");
        cand2 = scanner.nextLine();
        System.out.println("Digite o nome do 3o candidato: ");
        cand3 = scanner.nextLine();
        System.out.println("Digite o nome do 4o candidato: ");
        cand4 = scanner.nextLine();
        System.out.println("Digite o nome do 5o candidato: ");
        cand5 = scanner.nextLine();
        
        System.out.printf("\nDigite o numero de alunos da sala: \n");
        nAlunos = scanner.nextInt();
        
        do{
            System.out.println("-------------------");
            System.out.println("Escolha o candidato: ");
            System.out.printf("[1] - %s\n[2] - %s\n[3] - %s\n[4] - %s\n[5] - %s\n", cand1, cand2, cand3, cand4, cand5);
            op = scanner.nextInt();
            switch(op){
                case 1 -> opcao[0]=opcao[0]+1;
                case 2 -> opcao[1]++;
                case 3 -> opcao[2]++;
                case 4 -> opcao[3]++;
                case 5 -> opcao[4]++;
                default -> System.out.println("Voto Invalido!\n");
            }
        somatorio = opcao[0] + opcao[1] + opcao[2] + opcao[3] + opcao[4];     
        }while(somatorio < nAlunos);
        
        System.out.printf("Candidato[1] - %s -> %d votos \n"
                + "Candidato[2] - %s -> %d votos \n"
                + "Candidato[3] - %s -> %d votos \n"
                + "Candidato[4] - %s -> %d votos \n"
                + "Candidato[5] - %s -> %d votos \n", cand1, opcao[0], cand2, opcao[1], cand3, opcao[2], cand4, opcao[3], cand5, opcao[4]
        );
        
        max = Math.max(opcao[0], Math.max(opcao[1], Math.max(opcao[2], Math.max(opcao[3], opcao[4]))));
        
        //Para evitar que caso tenha empate, so um dos candidatos seja mostrado, faco esse if que exibe todos candidatos que tenham empatado.        
        if(opcao[0] == max)
            System.out.printf("Candidato [1] - %s - Vencedor\n",cand1);
        if(opcao[1] == max)
            System.out.printf("Candidato [2] - %s - Vencedor\n",cand2);
        if(opcao[2] == max)
            System.out.printf("Candidato [3] - %s - Vencedor\n",cand3);
        if(opcao[3] == max)
            System.out.printf("Candidato [4] - %s - Vencedor\n",cand4);
        if(opcao[4] == max)
            System.out.printf("Candidato [5] - %s - Vencedor\n",cand5);
        
    }
    
}
