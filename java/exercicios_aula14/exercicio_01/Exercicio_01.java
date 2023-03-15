/*
Exercicio 1
Fazer um programa para ler as medidas dos lados de dois triângulos X e Y 
(suponha medidas válidas), conforme diagrama ao lado. Em seguida, mostrar o valor 
das áreas dos dois triângulos e dizer qual dos dois triângulos possui a maior área. 
A fórmula para calcular a área de um triângulo a partir das medidas de seus 
lados a, b e c é a seguinte fórmula de Heron.
semi perimetro p = (a+b+c)/2
Area de qualquer triangulo = sqrt( p(p-a)(p-b)(p-c) )
Use os conceitos de classes e objetos.
*/
package exercicio_01;
import java.util.Scanner;
/**
 *
 * @author raoniton
 */
public class Exercicio_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Triangulo triangulo[] = new Triangulo[2];
        int i, j;
        Scanner scanner = new Scanner(System.in);
        
        for(i=0; i < triangulo.length; i++){
            triangulo[i] = new Triangulo();
            System.out.println("Digite os lados o "+(i+1)+"o triangulo!");
           
            System.out.print("Lado 1:");
            triangulo[i].a = scanner.nextDouble();
            
            System.out.print("Lado 2:");
            triangulo[i].b = scanner.nextDouble();
            
            System.out.print("Lado 3:");
            triangulo[i].c = scanner.nextDouble();
            System.out.println("");
        }
        
        for(i=0; i < triangulo.length; i++)
            System.out.printf("Area triangulo %d = %.2fu.a.\n", i+1, triangulo[i].Area());
        
        //System.out.printf("Maior Area = %.2fu.a.\n" ,Math.max(triangulo[0].Area(), triangulo[1].Area()));
        System.out.printf(triangulo[0].Area() > triangulo[1].Area()
                ? "O triangulo 1 tem maior area.\n"
                : "O triangulo 2 tem maior area.\n"
        );
    }        
}
