/*
Exercicio 5
Um grande empresa deseja determinar qual de seus produtos tem a preferência de 
seus clientes. Escreva um algoritmo para ler o tipo de produto comprado 
(codificado da seguinte forma: 1.ProdutoA 2.ProdutoB
3.ProdutoC 4.Fim). Caso o usuário informe um código inválido (fora da faixa de 
1 a 4) deve ser solicitado um novo código (até que seja válido). O programa será 
encerrado quando o código informado for o número 4. Deve ser escrito a mensagem: 
"MUITO OBRIGADO" e a quantidade de clientes que compraram cada tipo de produto.
*/
package exercicio_05;
import java.util.Scanner;
/**
 *
 * @author raoniton
 */
public class Exercicio_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cod, nClientes=0, prodA=0, prodB=0, prodC=0;
        Scanner scanner = new Scanner(System.in);
        
        do{
            System.out.println("Pesquisa de preferência, digite a opcao abaixo para votar:");
            System.out.printf("[1] - Produto A\n[2] - Produto B\n[3] - Produto C\n[4] - Sair\n");
            cod = scanner.nextInt();
            
            if(cod < 1 || cod > 4){
                System.out.println("Codigo invalido.");
            }else{
                if(cod != 4){
                    nClientes++;
                    if(cod == 1)
                        prodA++;
                    else if(cod == 2)
                        prodB++;
                    else
                        prodC++;
                }
            }
        }while(cod != 4);
        System.out.println("--------------------");
        System.out.printf("%d clientes votaram.\nProduto A: %d\nProduto B: %d\nProduto C: %d\n", nClientes, prodA, prodB, prodC);
    }
    
}
