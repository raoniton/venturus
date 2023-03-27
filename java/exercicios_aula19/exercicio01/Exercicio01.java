/*
Exercicio 1
Crie um programa que siga as instruções conforme o diagrama de classe abaixo.
Crie uma lógica para a senha e instancie objetos do tipo funcionário e do tipo Gerente. Veja que a todo momento que for criado um objeto do tipo Gerente, este objeto possuir também os atributos definidos na classe Funcionário, pois Gerente eh um funcionário.

Funcionaraio
--------------
- Nome: String
- cpf: String
- Salario: double
----------------
+ apresentar()
+ Getter
+Setters

Gerente extends Funcionario
--------------------------
- senha: int
--------------------------
- autentica(int): boolean
+ Getters
+ Setters
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
        Funcionario f1 = new Gerente(1234);
        f1.setNome("ABCD");
        f1.setCpf("000.000.000-00");
        f1.setSalario(1000);
        f1.apresentar();
        
        Gerente g1 = new Gerente(123);
        g1.setNome("EITA");
        g1.setCpf("000.000.000-01");
        g1.setSalario(2000);
        g1.apresentar();
        System.out.println("autentica: "+g1.autentica(123));
    }
    
}
