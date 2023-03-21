/*
Classe Carro - Exercicio 2
Crie uma classe Carro com as seguintes características:
Use o construtor para definir o início padrão do carro. Ele deve estar desligado 
e marcha zero.
Insira os getters e setters.
Dentro do método desligar(), avise com uma mensagem "Carro está desligado".

Carro
----------
+ cor
+ marca
+ ano
+ marcha
+ ligado
+ velocidadeAtual
+ velocidadeMaxima
----------
+ ligar()
+ desligar()
+ acelegar()
+ pegarMarcha 
*/
package exercicio02;

/**
 *
 * @author raoniton
 */
public class Carro {

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getMarcha() {
        return marcha;
    }

    public void setMarcha(int marcha) {
        this.marcha = marcha;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
    
    public String cor;
    public String marca;
    public int marcha;
    public int ano;
    public boolean ligado;
    public int velocidadeAtual;
    public int velocidadeMaxima;
    
    public Carro(){
        this.ligado = false;
        this.marcha = 0;
    }
    
    public void desligar(){
        this.setLigado(false);
        System.out.println("Carro esta desligado");
    }
    
    public void ligar(){
        this.setLigado(true);
        System.out.println("Carro esta ligado");
    }
    
    public void acelerar(){
        int velocidade = this.getVelocidadeAtual() + 10;
        
        
        this.setVelocidadeAtual(velocidade < this.getVelocidadeMaxima()
                ? velocidade
                : this.getVelocidadeMaxima()
        );
        
        if(velocidade < 0){
            this.setMarcha(-1);
        }else if(velocidade == 0){
            this.setMarcha(0);
        }else if(velocidade > 0 && velocidade < 40){
            this.setMarcha(1);
        }else if(velocidade >= 40 && velocidade <= 80){
            this.setMarcha(2);
        }else{
            this.setMarcha(3);
        }
        
        
    }
    
    public int pegarMarcha(){
        return this.getMarcha();
    }
    
    public void statusCarro(){
        System.out.printf("\n--- CARRO - %s - %s ---\n", this.getMarca(), this.getCor());
        System.out.println( this.isLigado() ? "Carro: Ligado" : "Carro: desligado");
        System.out.printf("Ano: %d\nMarca: %s\n", this.getAno(), this.getMarca(), this.getCor());
        System.out.printf("Velodidade Atual: %dkm/h\nMarcha: %d\n", this.getVelocidadeAtual(), this.getMarcha());
        System.out.printf("Velodidade Maxima: %dkm/h\n", this.getVelocidadeMaxima());
        
    }
    
}
