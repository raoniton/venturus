/*
Exercicio 4
Baseado na tabela ao lado, escreva um programa que leia o código de um item e a 
quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar. 
Crie o programa principal para instanciar os objetos e crie a classe Produtos para 
criar lógica do problema. Implemente as variáveis/atributos como protegido e os 
métodos como público.

 Código |      Produto      | Preço
------- + ----------------- + ------
    1   | Cachorro-Quente   | 7.00
    2   |     X-Salada      | 9.00
    3   |     X-Bacon       | 11.00
    4   |     Torrada       | 5.00
    5   |   Refrigerante    | 4.00 
*/
package exercicio04;

/**
 *
 * @author raoniton
 */
public class Exercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Produto p1[] = new Produto[5];
        p1[0] = new Produto(1, "Cachorro-Quente",7.00,  2);
        p1[1] = new Produto(2, "X-Salada",       9.00,  2);
        p1[2] = new Produto(3, "X-Bacon",        11.00, 2);
        p1[3] = new Produto(4, "Torrada",        5.00,  2);
        p1[4] = new Produto(5, "Refrigerante",   4.00,  2);
        
        Produto p2[] = new Produto[5];
        p2[0] = new Produto(1, "Cachorro-Quente",7.00,  1);
        p2[1] = new Produto(2, "X-Salada",       9.00,  0);
        p2[2] = new Produto(3, "X-Bacon",        11.00, 2);
        p2[3] = new Produto(4, "Torrada",        5.00,  0);
        p2[4] = new Produto(5, "Refrigerante",   4.00,  3);
        
        p1[0].fecharConta(p1, 1);
        p2[0].fecharConta(p2, 1);
        
    }
    
}
