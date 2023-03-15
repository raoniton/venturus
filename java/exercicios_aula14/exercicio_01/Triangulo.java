/*
Classe Triangulo - Exercicio 1
semi perimetro p = (a+b+c)/2
Area de qualquer triangulo = sqrt( p(p-a)(p-b)(p-c) )
Use os conceitos de classes e objetos.

Triangulo
---------
a
b
c
---------
Area()

*/
package exercicio_01;

/**
 *
 * @author raoniton
 */
public class Triangulo {
    double a;
    double b;
    double c;
    
    //semi perimetro p = (a+b+c)/2
    //Area de qualquer triangulo = sqrt( p(p-a)(p-b)(p-c) )
    public double Area(){
        double p = (this.a + this.b + this.c)/2;
        return Math.sqrt(p*(p-this.a)*(p-this.b)*(p-this.c));
    }
            
    
}
