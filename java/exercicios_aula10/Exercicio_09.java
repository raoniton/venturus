/*
Exercicio 9
Um determinado material radioativo perde metade de sua massa a cada 50 segundos. 
Dada a massa inicial, em gramas, fazer um programa que determine o tempo necessário 
para que essa massa se torne menor que 0,5 grama. Escreva a massa inicial, a massa 
final e o tempo calculado em horas, minutos e segundos.
*/
package exercicio_09;
import java.util.Scanner;
/**
 *
 * @author raoniton
 */
public class Exercicio_09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double massaInicial, massaFinal, hora , min, seg;
        int totalSegundos=0;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a massa em gramas do material radioativo: ");
        massaInicial = scanner.nextDouble();
        massaFinal = massaInicial;
        
        while(massaFinal > 0.5){
            massaFinal = massaFinal/2;
            totalSegundos = totalSegundos + 50;
        }
        hora = totalSegundos/3600;
        min = (int)(totalSegundos - hora*3600)/60;
        seg = (int)(totalSegundos - hora*3600 - min*60);
        
        
        System.out.printf("Massa Inicial: %.2f g\nMassa Final: %.2f g\nTempo: %.1fh %.1fmin %.1fs\n", massaInicial, massaFinal, hora, min, seg);
        
        
    }
    
}
