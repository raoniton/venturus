/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio02;

/**
 *
 * @author raoniton
 */
public class Circulo extends Forma{
    private double raio;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    public Circulo(double raio){
        this.raio = raio;
    }
    
    @Override
    public double area(){
        return Math.PI*Math.pow(raio, 2);
    }
    
    @Override
    public String toString(){
        return "Tipo: Circulo \nArea: "+area();
    }
    
}
