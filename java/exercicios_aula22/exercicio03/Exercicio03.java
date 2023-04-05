/*
Desenvolva o código apropriado para um dos últimos exemplos apresentado na aula 
de polimorfismo. Siga o diagrama ao lado e as informações apresentadas.
Implemente o Polimorfismo de Sobreposição, pois o método “emitirSom”:
Possui assinaturas semelhantes. Estão em classes diferentes. superClasse é abstrato.

Animal
peso
idade
membros 
[abs]locomover( ) 
[abs]alimentar( ) 
[abs]emitirSom( )

Mamífero
CorPelo
emitirSom( ) // "som de mamífero"

Lobo
emitirSom( ) // "Auuuuuuuuuu.." 

Cachorro
emititSom() // "Au Au Au Au..." 
reagir()

enterrarOsso()
abanarRabo()
   

Além disso, suponha que o método “reagir()”, da classe cachorro, tenha comportamentos 
diferentes.
Para tipo de ação o “reagir()” pode ser de forma diferente.
Isso é conhecido como polimorfismo de sobrecarga. Portanto, implemente também o 
polimorfismo de sobrecarga. Siga a regra apresentada ao lado. Acrescente o que achar 
necessário.

Reagir( )
Falar frase: 
    Agradável: abanar e latir 
    Agressiva: rosnar

Horário do dia:
    Manhã: abanar Tarde: abanar e latir 
    Noite: ignorar

dono:
    É dono: abanar
    Não é: rosnar e latir

Idade e peso
    Novo < 5 Leve < 10
    Novo e leve: abanar 
    Novo e pesado: latir 
    Velho e leve: rosnar 
Velho e pesado: ignorar
 
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
        Cachorro c1 = new Cachorro(8.0, 7, 4, "Preto");
        Lobo l1 = new Lobo(12.0, 10, 4, "Cinza");
        
        
        System.out.println(l1);
        System.out.println("");
        System.out.println(c1);
        c1.reagir("Frase Agradavel");
        c1.reagir(false);
        c1.reagir(12);
        c1.reagir(30,50);
        
    }
    
}
