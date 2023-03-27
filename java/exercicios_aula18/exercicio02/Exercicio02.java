/*
Exercicio 2
Crie um programa que contenha duas classes "Quadrado" e "Triangulo". Estas classes 
devem possuir suas principais características, como: nome, lado, altura, base e etc.
Faça um contrato através da interface e para tal use os seguintes métodos:
public abstract void getNomeFigura(); 
public abstract void getArea();
public abstract void getPerimetro();
  
Quadrado
--------------
- lado
--------------
+ getNomeFigura(); 
+ getArea();
+ getPerimetro();



Além da interface citada acima, construa as classes apresentadas ao lado. 
Acrescente todos os getters e setters e qualquer outra informação que achar 
relevante nas respectivas classes.
Por fim, instancie os objetos "quadrado" e "triangulo". Apresente o resultado.

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
public class Exercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(2);
        System.out.println(quadrado);
        
        
        System.out.println("");
        Triangulo triangulo = new Triangulo(12, 8, 10, 10, 12);
        System.out.println(triangulo);
    }
    
}
