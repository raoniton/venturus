/*
Classe Estudante - Exercicio 7 
*/
package exercicio_07;

/**
 *
 * @author raoniton
 */
public class Estudante {
    String nome;
    double nota1, nota2, nota3, NF;
    
    public double calculaNotaFinal(double peso1, double peso2, double peso3){
        this.NF = peso1*this.nota1 + peso2*this.nota2 + peso3*this.nota3;
        return NF;
    }
    
    @Override
    public String toString(){
        return "----------\nNome: "+this.nome
                    + "\nNota1: "+this.nota1+ " | Nota2: "+this.nota2+ " | Nota3: "+this.nota3
                    + "\nNF: " +this.NF;
    }
    
    public String verificaAprovacao(){
        String string;
        if(this.NF >= 6){
            string = "Aprovado";
        }else{
            string = "Reprevado\nFaltou "+ (10-this.NF) +" para ficar aprovado";
        }
        return string;
    }
}