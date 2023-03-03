/*
Exercicio 4

Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas 
de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o ponto. 
Se o ponto está sobre um dos eixos cartesianos ou na origem (x = y = 0). 

Se o ponto estiver na origem, escreva a mensagem “Origem”. Se o ponto estiver 
sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, ou conforme for a situação do 
quadrante.
*/
package exercicio_04;
import java.util.Scanner;
/**
 *
 * @author raoniton
 */
public class Exercicio_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double x, y;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite x, primeira coordenada do plano cartesiano :");
        x = scanner.nextDouble();
        
        System.out.println("Digite y, primeira coordenada do plano cartesiano :");
        y = scanner.nextDouble();
        
        System.out.printf("( %.1f , %.1f ):  ", x, y);
        if(x==0 && y==0){
            System.out.println("Origem");
        }else if(x == 0){
            if(y > 0)
                System.out.println("Eixo Y Positivo");
            else
                System.out.println("Eixo Y Negativo");        
        }else if(y == 0){
            if(x > 0)
                System.out.println("Eixo X Positivo");
            else
                System.out.println("Eixo X Negativo");        
        }else{
            if(x > 0 && y > 0)
                System.out.println("1o Quadrante");
            else if(x > 0 && y < 0)
                System.out.println("4o Quadrante");
            else if(x < 0 && y < 0)
                System.out.println("3o Quadrante");
            else
                System.out.println("2o Quadrante");
            
        }
        
    }
    
}
