/*
Classe Retangulo - Exercicio 5
*/
package exercicio_05;

/**
 *
 * @author raoniton
 */
public class Retangulo {
    double largura;
    double altura;
    
    public double Area(){
        return largura*altura;
    }
    
    public double Perimetro(){
        return 2*(largura + altura);
    }
    
    public double Diagonal(){
        return Math.sqrt( (Math.pow(altura,2) + Math.pow(largura, 2)) );
    }
    
    @Override
    public String toString(){
        return "RETANGULO: \nAltura: "+altura+ "\nLargura: "+largura;
    }
    
}
