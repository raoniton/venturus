/*
Suponha que uma dada empresa trabalha com a venda de produtos que precisam ser 
organizados através de dados como preços e etc.
Crie um programa para ler os dados de N produtos (N fornecido pelo usuário). 
Ao final, mostre a etiqueta de preço de cada produto na mesma ordem em que foram digitados.
  
Todo produto possui nome e preço. Produtos importados possuem uma taxa de alfândega, 
e produtos usados possuem data de fabricação. Estes dados específicos devem ser 
acrescentados na etiqueta de preço conforme exemplo (próxima página). Para produtos 
importados, a taxa e alfândega deve ser acrescentada ao preço final do produto
  
Favor implementar o programa conforme projeto abaixo.

Produto
- nome 
- preco
+ etiquetaPreco();
 
ProdutoImportado
- taxaAlfandega
+ precoTotal();
+ etiquetaPreco();

ProdutoUsado
- dataFabricacao
+ etiquetaPreco();
  
Dica:
Leve em consideração que a etiqueta a ser impressa como resultado final, deve seguir 
a ideia proposta abaixo. Este é apenas uma exemplo de como deve ser impresso o 
resultado conforme os dados fornecidos.

ETIQUETAS PREÇO:
Tablet R$ 2800.00 (Taxa Alfandega: $ 20.00)
Notebook R$ 8000.00
Iphone10 (usado) R$ 900.00 (Data de Fabricacao: 25/04/2018)
*/
package exercicio02;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author raoniton
 */
public class Exercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Produto> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int i,op, nProd;
        String nome;
        double preco;
        
        System.out.println("Quantos produtos? ");
        nProd = scanner.nextInt();
        
        for(i=0; i<nProd; i++){
            
            System.out.println("[1] - Produto Importado\n[2] - Produto Usado");
            op = scanner.nextInt(); 
            scanner.nextLine(); 
            
            System.out.println("Digite o nome do produto: ");
            nome = scanner.nextLine();
            System.out.println("Digite o preco do produto: ");
            preco = scanner.nextDouble();
            scanner.nextLine(); 
            
            if(op == 1){
                System.out.println("Digite a taxa da alfandega: ");                
                list.add(new ProdutoImportado(scanner.nextDouble(), nome, preco));
            }else if(op == 2){
                System.out.println("Digite a data de fabricacao: ");
                list.add(new ProdutoUsado(scanner.nextLine(), nome, preco));
            }
        }
        
        for(i=0; i < nProd; i++){
            list.get(i).etiquetaPreco();
        }
    }
    
}
