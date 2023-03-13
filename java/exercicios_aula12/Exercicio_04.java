/*
Exercicio 4
Crie um programa que gere uma matriz 3x3. Leia todos os elementos da matriz e em 
seguida calcule:
a) Soma total dos elementos.
b) Soma dos elementos da linha 3. 
c) Soma dos elementos da coluna 2. 
d) Soma dos elementos da diagonal principal.
*/
package exercicio_04;
import java.util.Random;
/**
 *
 * @author raoniton
 */
public class Exercicio_04 {

    public static void imprimeMatriz(int matriz[][]){
        int i, j;
        System.out.println("Matriz Gerada aleatoriamente:");
        for(i=0; i<matriz.length; i++){
            for(j=0; j<matriz.length; j++){
                System.out.printf("\t%d",matriz[i][j]);
            }
            System.out.println("");
        }
    }
    
    public static int somaElementos(int matriz[][]){
        int i, j, somatorio=0;
        for(i=0; i<matriz.length; i++)
            for(j=0; j<matriz.length; j++)
                somatorio = somatorio + matriz[i][j];
        
        return somatorio;
    }
    
    public static int somaElementosLin(int matriz[][], int i){
        int j, somatorio=0;
        for(j=0; j<matriz.length; j++)
            somatorio = somatorio + matriz[i][j];
        
        return somatorio;
    }
    
    public static int somaElementosCol(int matriz[][], int j){
        int i, somatorio=0;
        for(i=0; i<matriz.length; i++)            
            somatorio = somatorio + matriz[i][j];
        
        return somatorio;
    }
    
    public static int somaDiagonalPrincipal(int matriz[][]){
        int i, j, somatorio=0;
        for(i=0; i<matriz.length; i++)
            for(j=0; j<matriz.length; j++)
                if(i==j)
                    somatorio = somatorio + matriz[i][j];
        
        return somatorio;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random randomic = new Random();
        
        int matriz[][] = new int[3][3];
        int i,j;
        
        for(i=0; i<matriz.length; i++){
            for(j=0; j<matriz.length; j++){
                matriz[i][j] = randomic.nextInt(100);
            }
        }
        
        imprimeMatriz(matriz);
        
        //a) Soma total dos elementos.
        System.out.printf("Somatorio dos elementos = %d\n", somaElementos(matriz));
        
        //b) Soma dos elementos da linha 3. 
        System.out.printf("Somatorio da linha 3 = %d\n", somaElementosLin(matriz, 2));
        
        //c) Soma dos elementos da coluna 2. 
        System.out.printf("Somatorio da coluna 2 = %d\n", somaElementosCol(matriz, 1));
        
        //d) Soma dos elementos da diagonal principal.
        System.out.printf("Somatorio da diagonal principal = %d\n", somaDiagonalPrincipal(matriz));
        
    }
    
}
