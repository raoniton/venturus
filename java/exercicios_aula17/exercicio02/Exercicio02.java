/*
Exercício 2
Faça um programa com as características apresentadas no diagrama de classe e acrescente 
o que achar necessário. Apresente o resultado no final criando um objeto "pessoa". 
Use a ideia do relacionamento entre Classes. 
Suponha que num futuro próximo essa empresa pretende usar diferentes classes para 
pessoas(funcionarios, clientes, fornecedores e etc), e todas essas pessoas irão se 
beneficiar da classe "Endereco". Portanto, ter uma classe separada que defina somente 
ela, poderá ser usada mais facilmente.

Pessoa
------------
- inscricao
- nome
- sobrenome - endereco
------------
+ apresentar() 
+ cadastrar()


Endereco
------------
+ rua
+ numero 
+ bairro 
+ cidade 
+ estado

*/
package exercicio02;

/**
 *
 * @author raoniton
 */
public class Exercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();
        
        p1.cadastrar();//Dentro de cadastrar ja cadastro um endereco
        p1.apresentar();
        
        System.out.println("");
        
        p2.setNome("Joao");
        p2.setSobrenome("Silva");
        p2.setInscricao(p2.getInscricao()+1);
        p2.setEndereco(new Endereco("Rua qualquer", 0, "Sao Paulo","SP"));
        p2.apresentar();
        
                
    }
    
}
