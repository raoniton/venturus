/*
Exercicio 3
Crie um algoritmo que leia dois números e calcule a soma, a mutiplicacao
e o dobro. Por fim, imprima o resultado. Para a resolução do exercício, 
crie as funções soma, multiplicacao, dobro e imprima.

*/
package exercicio_03;
import java.util.Scanner;
/**
 *
 * @author raoniton
 */
public class Exercicio_03 {

    /**
     * @param x
     * @param y
     * @return 
     */
    public static double soma(double x, double y){
        return x + y;
    }
    
    public static double multiplica(double x, double y){
        return x * y;
    }
    
    public static double dobro(double x){
        return 2*x;
    }
    
    
    public static void main(String[] args) {
        double x, y;
        Scanner scanner = new Scanner(System.in);
        
        x = scanner.nextDouble();
        y = scanner.nextDouble();
        
        System.out.printf("Soma= %.2f\n", soma(x,y));
        System.out.printf("Mutiplicacao= %.2f\n", multiplica(x,y));
        System.out.printf("Dobro de %.2f= %.2f\n", x, dobro(x));
        System.out.printf("Dobro de %.2f= %.2f\n", y, dobro(y));
        
        
    }
    
}
