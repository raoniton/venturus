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
        String cand[];
        cand = new String[5];
        int nAlunos, op, i, opcao[] = new int[5], max, somatorio;
        Scanner scanner = new Scanner(System.in);
        
        for(i=0; i < 5; i++){
            System.out.printf("Digite o nome do %do candidato: \n", i+1);
            cand[i] = scanner.nextLine();
        }
        
        System.out.printf("\nDigite o numero de alunos da sala: \n");
        nAlunos = scanner.nextInt();
        
        do{
            System.out.println("-------------------");
            System.out.println("Escolha o candidato: ");
            System.out.printf("[1] - %s\n[2] - %s\n[3] - %s\n[4] - %s\n[5] - %s\n", cand[0], cand[1], cand[2], cand[3], cand[4]);
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
        
        
        System.out.printf("-------------------\n");
        for(i=0; i<5; i++){
            System.out.printf("Candidato[%d] - %s -> %d votos \n", i+1, cand[i], opcao[i]);
        }
        
        max = Math.max(opcao[0], Math.max(opcao[1], Math.max(opcao[2], Math.max(opcao[3], opcao[4]))));
        
        //Para evitar que caso tenha empate, so um dos candidatos seja mostrado, faco esse if que exibe todos candidatos que tenham empatado.        
        System.out.printf("-------------------\n");
        for(i=0; i<5; i++){
            if(opcao[i] == max)
                System.out.printf("Candidato [%d] - %s - Vencedor\n",i+1,cand[i]);
        }
        
    }
    
}
