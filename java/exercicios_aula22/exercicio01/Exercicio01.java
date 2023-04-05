/*
Exercicio 1
Uma empresa possui funcionários próprios e terceirizados. Para cada funcionário, 
deseja-se registrar nome, horas trabalhadas e valor por hora. Funcionários terceirizado 
possuem ainda uma despesa adicional.
O pagamento dos funcionários corresponde ao valor da hora multiplicado pelas horas 
trabalhadas, sendo que os funcionários terceirizados ainda recebem um bônus 
correspondente a 110% de sua despesa adicional.

Fazer um programa para ler os dados de N funcionários (N fornecido pelo usuário) 
e armazená-los em uma lista. Depois de ler todos os dados, mostrar nome e pagamento 
de cada funcionário na mesma ordem em que foram digitados. Construa o programa 
conforme projeto ao lado. Insira setters, getters e construtores.
O método pagamento() em FuncionarioTercerizado deve sobrepor o de Funcionario.
Por fim, instancie objetos e imprima o resultado.

*/
package exercicio01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author raoniton
 */
public class Exercicio01 {
    
    public static void main(String[] args) {
        List<Funcionario> list = new ArrayList<>();
        
        Scanner scanner = new Scanner(System.in);
        int i, nFunc, op;
        System.out.println("Digite o numero de funcionarios: ");
        nFunc = scanner.nextInt();
        scanner.nextLine();
        
        for(i=0; i < nFunc; i++){
            System.out.println("[1] - Funcionario Direto\n[2] - Funcionario Tercerizado");
            op = scanner.nextInt(); 
            if(op == 1){
                list.add((new Funcionario().criaFuncionario()));
            }else if(op == 2){
                list.add((FuncionarioTercerizado) (new FuncionarioTercerizado().criaFuncionario()));
            }
        }
        
        for(i=0; i < nFunc; i++){
            System.out.printf("%s\nNome: %s\nPagamento: %.2f\n",
            list.get(i).getClass().getSimpleName(),list.get(i).getNome(), list.get(i).pagamento());
        }
    }
    
}
