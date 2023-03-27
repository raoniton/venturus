/*
Classe Animal - Exercicio 2 */
package exercicio02;

/**
 *
 * @author raoniton
 */
public class Animal {
    
    public Animal(){
        this.fome = true;
        this.idade = 0;
        this.nome = "";
    }
    
    public Animal(String nome, int idade){        
        this.idade = idade;
        this.nome = nome;
        this.fome = true;
    }
    
    public Animal(String nome, int idade, boolean fome){        
        this.idade = idade;
        this.nome = nome;
        this.fome = fome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public boolean isFome() {
        return fome;
    }

    public void setFome(boolean fome) {
        this.fome = fome;
    }
    
    public String nome;
    public int idade;
    public boolean fome;
    
    public void falar(){
        System.out.println("Emite som!");
    }
    
    public void alimentar(){
        if(this.isFome()){
            setFome(true);
            System.out.println(this.getNome() +" foi alimentado!");
        }else
            System.out.println(this.getNome() +" nao esta com fome!");
    }
    
    @Override
    public String toString(){
        String parte1, parte2;
        parte1 ="-----------------------------------------------------------\n"+ 
                "tipo: "+this.getClass().getSimpleName()+" nome: " +this.getNome()+ " - idade: " +this.getIdade();
        
        parte2 = this.isFome()
                ? " - Esta com fome!"
                : " - Nao esta com fome!";
        
        return parte1+parte2;
    }
}
