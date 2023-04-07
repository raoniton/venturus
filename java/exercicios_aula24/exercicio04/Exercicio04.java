/*

Fazer um programa para ler um número inteiro N e depois os dados (id, nome e salario) 
de N funcionários. Não deve haver repetição de id. Em seguida, efetuar o aumento 
de X por cento no salário de um determinado funcionário. Para isso, o programa deve 
ler um id e o valor X. Se o id informado não existir, mostrar uma mensagem e 
abortar a operação. Ao final, mostrar a listagem atualizada dos funcionários, 
conforme exemplos no próximo slides. Lembre-se de aplicar a técnica de encapsulamento 
para não permitir que o salário possa ser mudado livremente. Um salário só pode 
ser aumentado com base em uma operação de aumento por porcentagem dada.

Funcionario
- Id:Integer
- Name:String
- Salario:Double
+ aumentoSalario(porcentagem : dobule): void
 
Exemplo de saída: 

Quantos funcionarios serão registrados? 1
Funcionario #1:
Id: 0001
Nome: Jose Carlos Salario: 3400
Entre com o Id do funcionario que vai receber aumento: 0001 Entre com a porcentagem: 10
Lista de Funcionarios: 1, Jose Carlos, 3740.00
*/
package exercicio04;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author raoniton
 */
public class Exercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int i, n, id;
        double salario;
        String nome;
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Quantos funcionarios serao registrados? ");
        n = scanner.nextInt();
        
        ArrayList<Funcionario> func = new ArrayList<Funcionario>();
        
        for(i=0; i < n; i++){
            System.out.printf("Id: ");
            id = scanner.nextInt();
            scanner.nextLine();
            System.out.printf("Nome: ");
            nome = scanner.nextLine();
            System.out.printf("Salario: ");
            salario = scanner.nextDouble();
            
            func.add(new Funcionario(id, nome, salario));
        }
        
        System.out.println("Entre com o Id do funcionario que vai receber o aumento: ");
        id = scanner.nextInt();
        for(Funcionario f : func){
            if(f.getId() == id){
                System.out.printf("Entre com a porcentagem: ");
                f.aumentoSalario(scanner.nextDouble());
            }
        }
        
        for(Funcionario f : func){
            f.showFuncInfo();
        }
        
        //System.out.println(func.stream().anyMatch(p -> p.getName().equals("Raoniton")));
        
        
    
        
        
    }
    
}
