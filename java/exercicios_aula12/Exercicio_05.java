/*
Exercicio 5
Crie um programa que leia valores inteiros para a construção de uma matriz 3x4. 
Após esses números serem lidos, analise se existem elementos negativos na matriz. 
Caso exista, troque os números negativos por 0. Imprima as duas matrizes, a original 
e a modificada.
*/
package exercicio_05;
import java.util.Random;
/**
 *
 * @author raoniton
 */
public class Exercicio_05 {
    public static void imprimeMatriz(int matriz[][]){
        int i, j;
        System.out.println("\t------    Matriz   ------");
        for(i=0; i<matriz.length; i++){
            for(j=0; j<matriz[i].length; j++){
                System.out.printf("\t%d",matriz[i][j]);
            }
            System.out.println("");
        }
        System.out.println("");
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Random randomic = new Random();
        
        int matriz[][] = new int[3][4];
        int matriz2[][] = new int[3][4];
        int i,j;
        //System.out.println(matriz[0].length);
        for(i=0; i<matriz.length; i++){
            for(j=0; j<matriz[i].length; j++){
                matriz[i][j] = randomic.nextInt(100) - 40;
                
                if(matriz[i][j] < 0)
                    matriz2[i][j] = 0;
                else
                    matriz2[i][j] = matriz[i][j];
            }
        }
        
        imprimeMatriz(matriz);
        imprimeMatriz(matriz2);
       
    }
    
}
