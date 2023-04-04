/*
Exercicio 1
Escreva um codigo para o diagrama apresentado ao lado. Use o conceito de polimorfismo 
para sobrepor o metodo getNome(). Instancie os objetos PessoaFisica e PessoaJuridica. 
O retorno deve conter o nome e cpf, se pessoa fisica. Ou o nome e cnpj se pessoa juridica.
Pessoa
--------
- nome
-------
+ getNome()
+ setNome()

PessoaFisica
------------
- cpf
------------
+ PessoaFisica()
+ getCpf()
+ setCpf()
+ getNome()

PessoaJuridica
------------
- cnpj
------------
+ PessoaJuridica()
+ getCnpj()
+ setCnpj()
+ getNome()

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
        PessoaFisica PF      = new PessoaFisica("000.000.000-00", "Alo Alo Testando");
        PessoaJuridica PJ    = new PessoaJuridica("000.000.000...nao sei cnpj", "It's just a test");
        
        System.out.println(PF.getNome()+PF.getCpf());
        System.out.println(PJ.getNome()+PJ.getCnpj());
    }
    
}
