/*
Exercicio 5
Fazer um programa para ler os valores da largura e altura de um retângulo. 
Em seguida, mostrar na tela o valor de sua área, perímetro e diagonal. 
Usar uma classe como mostrado no projeto ao lado.
*/
package exercicio_05;

import java.util.Scanner;

/**
 *
 * @author raoniton
 */
public class Exercicio_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Retangulo ret1 = new Retangulo();
        
        System.out.println("Digite a altura do retangulo: ");
        ret1.altura = scanner.nextDouble();
        
        System.out.println("Digite a largura do retangulo: ");
        ret1.largura = scanner.nextDouble();
        
        System.out.println(ret1);
        System.out.println("Area: "+ret1.Area());
        System.out.println("Perimetro: "+ret1.Perimetro());
        System.out.println("Diagonal: "+ ret1.Diagonal());
        
        
    }
    
}
