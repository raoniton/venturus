/*
Exercicio 10
Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, 
sabendo que o mesmo pode começar em um dia e terminar em outro, tendo uma duração 
mínima de 1 hora e máxima de 24 horas. Imprima uma mensagem com o resultado.
*/
package exercicio_10;
import java.util.Scanner;
/**
 *
 * @author raoniton
 */
public class Exercicio_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int hInicial, hFinal, hTotal=0;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Use o sistema de 24h, ex: 1 da tarde = 13");
        System.out.println("Digite o horario que comecou o jogo:");
        hInicial = scanner.nextInt();
        
        System.out.println("Digite o horario que terminou o jogo: ");
        hFinal = scanner.nextInt();
        
        if(hInicial > hFinal){
            hTotal = 24 - hInicial + hFinal;
        }else{
            hTotal = hFinal - hInicial;
        }
        
        System.out.printf("%d horas de jogo\n",hTotal);
    }
    
}
