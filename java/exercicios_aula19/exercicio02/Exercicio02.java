/*
Exercicio 2
Faça uma classe “Animal” com um método “falar” e acrescente os atributos “Nome” e “Idade”. 
Faça as classes Homem, Cão, Gato e Papagaio, herdando de animal, redefinindo o método 
“falar” para retornar “Oi”, “Au au”, “Miau” e "Qué Café", respectivamente. 
Acrescente o atributo fome e o método comer(), caso o animal esteja com fome dê a 
comida adequada. Caso contrário, diga que não está com fome. Instancie todos os 
objetos possíveis. Ao instanciar apresente o objeto e o método “Falar” e "Comer".
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
        Homem    h1 = new Homem("Joao", 15, true);
        Cao      c1 = new Cao("Scoob-Doo", 5, false);
        Gato     g1 = new Gato("Felix", 2);
        Papagaio p1  = new Papagaio("Louro", 0, false);
        //CRIEI DIFERENTES CONSTRUTORES, com a instanciacao vazia, um outro que voce passa nome e idade
        // e um ultimo que voce passa nome e idade e se esta com fome ou nao
        
        System.out.println(h1);
        h1.falar();
        h1.alimentar();
        //System.out.println(h1);
        System.out.println("");
        
        System.out.println(c1);
        c1.falar();
        c1.alimentar();
        //System.out.println(c1);
        System.out.println("");
        
        System.out.println(g1);
        g1.falar();
        g1.alimentar();
        //System.out.println(g1);
        System.out.println("");
        
        System.out.println(p1);
        p1.falar();
        p1.alimentar();
        //System.out.println(p1);
        System.out.println("");
        
        
    }
    
}
