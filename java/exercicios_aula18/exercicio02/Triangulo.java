/*
Classe triangulo - Exercicio 2

Triangulo
--------------
- base; 
- altura; 
- ladoA; 
- ladoB; 
- ladoC;
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
public class Triangulo implements Geometric{
    private double base;
    private double altura;
    private double ladoA;
    private double ladoB;
    private double ladoC;
    private double area;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public double getLadoC() {
        return ladoC;
    }

    public void setLadoC(double ladoC) {
        this.ladoC = ladoC;
    }

   
    public Triangulo() {
        this.base = 0;
        this.altura = 0;
        this.ladoA = 0;
        this.ladoB = 0;
        this.ladoC = 0;
    }

    public Triangulo(double base, double altura, double ladoA, double ladoB, double ladoC) {
        this.base = base;
        this.altura = altura;
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
        this.area = (base*altura/2);
    }
    
    @Override
    public void getNomeFigura(){
        System.out.println(this.getClass().getSimpleName());
    }
    
    @Override
    public void getArea(){
        System.out.println( (this.getBase()*this.getAltura())/2 );
    }
    
    public void setArea(double area){
        this.area = this.base*this.altura/2;
    }
    
    @Override
    public void getPerimetro(){
        System.out.println(this.getLadoA()+this.getLadoB()+this.getLadoC());
    }
    
    @Override
    public String toString(){
        return "Figura: "+this.getClass().getSimpleName()+"\nLado A: "+this.getLadoA()+"\nLado B: "+this.getLadoB()+"\nLado C: "+this.getLadoC()+""
                + "\nPerimetro: "+(this.getLadoA()+this.getLadoB()+this.getLadoC())+"\nArea: "+this.area;
    }
    
    
}
