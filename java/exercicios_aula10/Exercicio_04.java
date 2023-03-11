/*
Exercicio 4
Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada 
de pontos no sistema cartesiano. Para cada ponto escrever o quadrante a que ele 
pertence. O algoritmo será encerrado quando pelo menos uma das duas coordenadas 
for NULA. Nesta situação escreva
uma mensagem "Algoritmo Interrompido!!".*/
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
        int x, y;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite as coordenadas x e y para saber o quadrante.");
        System.out.println("Para sair do programa, alguma coordenada deve ser igual a 0.");
        do{ 
            
            System.out.println("Digite a coordenada x: ");
            x = scanner.nextInt();
            
            System.out.println("Digite a coordenada y: ");
            y = scanner.nextInt();
            if(x==0 || y == 0){
                System.out.println("Algoritmo Interrompido!!");
                break;
            }else{
                if(x < 0){
                    if(y<0)
                        System.out.printf("(%d,%d) -> 3o quadrante\n",x,y);
                    else
                        System.out.printf("(%d,%d) -> 2o quadrante\n",x,y);
                }else{
                    if(y<0)
                        System.out.printf("(%d,%d) -> 4o quadrante\n",x,y);
                    else
                        System.out.printf("(%d,%d) -> 1o quadrante\n",x,y);
                }
            }
            System.out.println("----------------");
            
        }while(true);
    }
    
}
