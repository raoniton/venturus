/*
Exercicio 1
Herança é um tipo de associação que permite que uma classe herde todos dados e c
omportamentos de outra, o que faz da sua grande vantagem o reuso de código. 
Pensando nessa definição, suponha um negócio de banco que possui uma conta comum 
e uma conta para empresas, sendo que a conta para empresa possui todos membros 
da conta comum, mais um limite de empréstimo e uma operação de realizar empréstimo.

Veja que as contas possuem características semelhantes. Isso obviamente permite 
o reaproveitamento de código. Construa um programa que use o conceito de herança. 
Reaproveite o código e faça a classe "ContaJuridica" herdar da classe "Conta" 
todos os atributos e métodos.

Suponha que, para realizar um empréstimo, é descontada uma taxa no valor de 10 reais. 
Crie essa lógica dentro do método apropriado. Faça com que o usuário digite o valor 
desejado para o empréstimo. Caso o valor esteja dentro do limite(estabelecido pelo banco), 
apresente o balanço com o valor correto na conta. Caso o empréstimo não seja permito, 
apresente a mensagem dizendo ser impossível. Tente com um valor menor.

Por fim, crie dois objetos. Um objeto conta e outro objeto contaJuridica. 
Entre com os devidos dados de cada conta. Número da conta, nome do proprietário, 
o empréstimo realizado (ou não) e o balanço final.

Conta
---------------
- numeroConta 
- proprietario
- balanco
---------------
+ deposito() 
+ saque()

ContaJuridica
---------------
- numeroConta
- proprietario
- balanco
- limiteEmprestimo
---------------
+ deposito() 
+ saque()
+ emprestimo

*/
package exercicio01;

/**
 *
 * @author raoniton
 */
public class Exercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conta conta1 = new Conta(1, "Exemplo da Silva Sauro", 1000);
        ContaJuridica conta2 = new ContaJuridica(10000, 2, "Fulano Ciclano Beltrano", 50000);
        
        System.out.println(conta1);
        System.out.println("");
        System.out.println(conta2);
        conta2.emprestimo();
        
        System.out.println(conta1);
        System.out.println("");
        System.out.println(conta2);
        
        
    }
    
}
