/*
Exercicio 3
Um determinado clube de futebol pretende classificar seus atletas em categorias 
e para isto ele contratou um desenvolvedor para criar um programa que executasse 
esta tarefa. Para isso o clube criou uma tabela que continha a faixa etária do 
atleta e sua categoria.

Construa um programa que solicite o nome e a idade de um atleta e imprima a sua 
categoria
*/
package exercicio_03;
import java.util.Scanner;
/**
 *
 * @author raoniton
 */
public class Exercicio_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int idade;
        String nome;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite seu nome:");
        nome = scanner.next();
        
        System.out.println("Digite sua idade:");
        idade = scanner.nextInt();

        
        switch(idade){
            case 5, 6, 7, 8, 9, 10 -> System.out.printf("Nome: %s | Categoria: Infantil\n", nome);
            case 11, 12, 13, 14, 15 -> System.out.printf("Nome: %s | Categoria: Juvenil\n", nome);
            case 16, 17, 18, 19, 20 -> System.out.printf("Nome: %s | Categoria: Junior\n", nome);
            case 21, 22, 23, 24, 25 -> System.out.printf("Nome: %s | Categoria: Profissional\n", nome);
            default -> System.out.printf("Valor inválido");                
        }
    }
    
}
