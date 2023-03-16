/*
Exercicio 1
Fazer um programa para ler os dados de um produto em estoque(nome, preco, e quantidade no estoque).
Em seguida mostrar os dados do produto(nome, preco, quantidade no estoque, valor total no estoque).

Realizar uma entrada no estoque e mostrar novamente os dados do produto atualizado.
Realizar uma entrada no estoque e mostrar novamente os dados do produto atualizado.
Para resolver esse problema, você deve criar uma CLASSE conforme ao lado.

Produto
----------
+ nome: String
# preco: double 
# quantidade: int
----------
+ totalValorEmEstoque(): double
+ addProduto(): void
+ removeProdutos(): void

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
        Scanner scanner = new Scanner(System.in);
        Produto prod1 = new Produto();
        
        System.out.println("Digite o nome do produto: ");
        prod1.nome = scanner.nextLine();
        
        System.out.println("Digite o preco desse produto: ");
        prod1.preco = scanner.nextDouble();
        
        System.out.println("Digite a quantidade em estoque: ");
        prod1.addProdutos(scanner.nextInt());
        
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
