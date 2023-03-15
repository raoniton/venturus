/*
Exercicio 4
Um determinado material
radioativo perde metade de sua massa a cada 50 segundos. Dada a massa inicial, 
em gramas, fazer um programa que determine o tempo necessário para que essa massa 
se torne menor que
0,5 grama. Escreva a massa inicial,
a massa final e o tempo calculado
em horas e minutos.
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
        Scanner scanner = new Scanner(System.in);
        MaterialRadioativo material;
        
        System.out.println("Digite a massa em gramas do material radioativo: ");
        material = new MaterialRadioativo(scanner.nextDouble()); 
        System.out.println(material);
        System.out.println(material.calculaTempo());
        System.out.println(material);
       
    }
    
}
