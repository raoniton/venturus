/*
Classe LinguagemPrograma - Exercicio 3
LinguagemPrograma
-----------------
+ nome;
+ linguagem; 
+ experiencia;
-----------------
+ pessoa();
+ linguagemProgramacao(); 
+ experiencia()
*/
package exercicio03;

/**
 *
 * @author raoniton
 */
public class LinguagemPrograma implements Linguagem{

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }

    public double getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(double experiencia) {
        this.experiencia = experiencia;
    }

    public LinguagemPrograma() {
        this.nome = "";
        this.linguagem = "";
        this.experiencia = 0;
    }

    public LinguagemPrograma(String nome, String linguagem, double experiencia) {
        this.nome = nome;
        this.linguagem = linguagem;
        this.experiencia = experiencia;
    }
    
    @Override
    public String pessoa(){
        return this.getNome()+" é programador "+this.getLinguagem()+ " a "+ this.getExperiencia()+" anos\n";
    }
    
    @Override
    public String linguagemProgramacao(){
        return this.getLinguagem();
    }
    
    @Override
    public double experiencia(){
        return this.getExperiencia();
    }
    
    
    
    public String nome;
    public String linguagem;
    public double experiencia;
    
    
}
