/*
Exercicio 2
Faça um algoritmo que crie uma classe candidatura que contenha o nome do candidato, 
a vaga desejada e a pretensão salarial. Imagine que exista duas possíveis vagas, 
TECNOLOGIA e GERAL. Consequentemente dois testes diferentes. Crie um método que 
identifique a vaga na qual o candidato se manifestou. Para cada objeto criado, 
faça uma breve apresentação do candidato e imprima qual teste deverá ser realizado 
(Teste de Tecnologia ou Teste Geral).
*/
package exercicio_02;

/**
 *
 * @author raoniton
 */
public class Exercicio_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Candidatura cand1 = new Candidatura();
        cand1.nome = "Nome Aleatorio 1";
        cand1.salarioPretendido = 10000;
        cand1.vagaDeseja = 1;
        
        Candidatura cand2 = new Candidatura();
        cand2.nome = "Nome Aleatorio 2";
        cand2.salarioPretendido = 15000;
        cand2.vagaDeseja = 2;
        
        System.out.println(cand1);
        System.out.println(cand2);
        
        
        
    }
    
}
