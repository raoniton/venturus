/*
Classe quadrado - Exercicio 2
  
Quadrado
--------------
- lado
--------------
+ getNomeFigura(); 
+ getArea();
+ getPerimetro();

*/
package exercicio02;

/**
 *
 * @author raoniton
 */
public class Quadrado implements Geometric{

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public void getArea() {
        System.out.println(this.area);
    }

    public void setArea(double lado) {
        this.area = Math.pow(lado, 2);
    }

    @Override
    public void getPerimetro() {
        System.out.println(4*this.getLado());
    }


    public Quadrado() {
        this.area = 0;
        this.lado = 0;
    }
    
    public Quadrado(double lado) {
        this.lado = lado;
        this.area = Math.pow(lado, 2);
        
    }
    
    
    @Override
    public void getNomeFigura(){
        System.out.println(this.getClass().getSimpleName());
    }
    
    @Override
    public String toString(){
        return "Figura: "+this.getClass().getSimpleName()+"\nLado: "+this.getLado()+""
                + "\nPerimetro: "+4*this.lado+"\nArea: "+this.area;
    }

    private double lado;
    public double area;
    
    
}
