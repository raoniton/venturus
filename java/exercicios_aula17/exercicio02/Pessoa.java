/*
Classe Pessoa - Exercicio 2

Pessoa
------------
- inscricao
- nome
- sobrenome - endereco
------------
+ apresentar() 
+ cadastrar()

*/

package exercicio02;
import java.util.Scanner;

/**
 *
 * @author raoniton
 */
public class Pessoa implements InterfacePessoa{
 
    public int getInscricao() {
        return inscricao;
    }

    public void setInscricao(int inscricao) {
        Pessoa.inscricao = inscricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    
    public void apresentar(){
        System.out.printf("--------------------\n\tPESSOA %d\n--------------------\n",this.getInscricao());
        System.out.printf("Nome: %s \nSobrenome: %s\n", this.nome,  this.sobrenome);
        System.out.println(this.endereco);
    }
    
    @Override
    public int cadastrar(){
        Scanner scanner = new Scanner(System.in);
        this.setInscricao(this.getInscricao()+1);
        //setInscricao(Pessoa.inscricao++);
        
        //System.out.println("Digite o nome: ");
        //setNome(scanner.nextLine()); // <- caso queira digitar o nome 
        setNome("Maria"); 
        
        //System.out.println("Digite o sobrenome: ");
        setSobrenome("Silva");
        
        //System.out.println("Digite o endereco: ");
        //endereco = cadastrarEndereco(); // <- caso queira digitar o endereco 
        setEndereco(new Endereco("Av Sao Paulo", 10, "Sao Paulo", "SP"));
        return 0;
    }

    private static int inscricao=0;
    private String nome;
    private String sobrenome;
    private Endereco endereco;
    
}
