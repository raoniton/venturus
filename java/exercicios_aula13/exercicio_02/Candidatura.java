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
public class Candidatura {
    String nome;
    int vagaDeseja;
    double salarioPretendido;
    
    public String vaga(){
        if(this.vagaDeseja == 1)
            return "Tecnologia";
        else if(this.vagaDeseja == 2)
            return "Geral";
        else
            return "Opcao invalida";
    }
    
    public String toString(){
        String cand;
        cand = "CANDIDATO:\nNome: "+this.nome
                + "\nVaga: "+this.vaga()
                + "\nSalario Pretendido: R$" + this.salarioPretendido                
                + "\n-------------------------------";
                
        return cand;
    }
    
    public String enviarTeste(){
        return "Deve realizar: Teste " +this.vaga()
        + "\n-------------------------------\n";
    }
    
    
}
