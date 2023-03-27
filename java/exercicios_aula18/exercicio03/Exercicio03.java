/*
Exercicio 3
Crie um programa que contenha três classes conforme apresentado no diagrama ao lado. 
O programa deve apresentar duas pessoas contendo nome, a linguagem de programação 
que trabalha e quantos anos de experiência. Faça um contrato através da interface 
e depois implemente os métodos. Instancia o objeto Maria que trabalha a 15 anos 
com Python e João que trabalha a 10 anos com Java.

LinguagemPrograma
-----------------
+ nome;
+ linguagem; 
+ experiencia;
-----------------
+ pessoa();
+ linguagemProgramacao(); 
+ experiencia()

<interface>
Linguagem
-----------------
+ pessoa();
+ linguagemProgramacao(); 
+ experiencia();

*/
package exercicio03;

/**
 *
 * @author raoniton
 */
public class Exercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinguagemPrograma p1 = new LinguagemPrograma("Maria", "Python", 15);
        LinguagemPrograma p2 = new LinguagemPrograma("Joao", "Java", 10);
        
        System.out.println(p1.pessoa());
        
        System.out.println(p2.pessoa());
        
        
    }
    
}
