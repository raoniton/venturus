/*
Exercicio 2
Proposta de melhoria:
Ao executar o comando abaixo, instanciamos um "produto" com seus atributos vazios.

Memória:
product = new Product(); ->

nome    | preco |   quantidade
------- + ----- + -------------
null    |  0.0  |       0

Entretanto, faz sentido um produto que não tem nome? Faz sentido um produto que 
não tem preço? Com o intuito de evitar a existência de produtos sem nome e sem preço, 
refaça o programa anterior com a inserção do construtor, tornando obrigatória a 
iniciação desses valores.
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
        String nome;
        double preco;
        int quantidade;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o nome do produto:");
        nome = scanner.nextLine();
        
        System.out.println("Digite o preco: ");
        preco = scanner.nextDouble();
        
        System.out.println("Digite a quantidade: ");
        quantidade = scanner.nextInt();
        
        Produto prod1 = new Produto(nome, preco, quantidade);
        System.out.println(prod1);
        System.out.println("Valor em estoque: R$"+prod1.totalValorEmEstoque());

        
        System.out.println("Digite a quantidade que deseja adicionar no estoque: ");
        prod1.addProdutos(scanner.nextInt());
        System.out.println(prod1);
        System.out.println("Valor em estoque: R$"+prod1.totalValorEmEstoque());
        
        System.out.println("Quantos produtos voce deseja remover?");
        prod1.removeProdutos(scanner.nextInt());
        
        System.out.println(prod1);
        System.out.println("Valor em estoque: R$"+prod1.totalValorEmEstoque());

    }
    
}
