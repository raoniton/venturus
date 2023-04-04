/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio02;

/**
 *
 * @author raoniton
 */
public class Retangulo extends Forma{

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    private double largura;
    private double altura;
    
    public Retangulo(double largura, double altura){
        this.altura = altura;
        this.largura = largura;
    }
    
    @Override
    public double area(){
        return largura*altura;
    }
    
    @Override
    public String toString(){
        return "Tipo: Retangulo \nArea: "+area();
    }
    
}
