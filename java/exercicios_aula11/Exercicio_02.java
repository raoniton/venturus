/*
Exercicio 2
Crie um algoritmo que faça a soma e a multiplicação das duas matrizes abaixo.
int matriza[ ][ ] = {{1, 2}, {4, 5}}; 
int matrizb[ ][ ] = {{7, 8}, {10, 11}};
Imprima o resultado da Soma e da Multiplicação.
*/
package exercicio_02;

/**
 *
 * @author raoniton
 */
public class Exercicio_02 {
    public static void imprime(int matriz[][]){
        int i,j;
        for(i=0; i < matriz[0].length; i++){
            for(j=0; j < matriz[0].length; j++){
                System.out.printf("\t%d", matriz[i][j]);
            }
            System.out.printf("\n");
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int matrizA[][] = {{1,2}, {4,5}};
        int matrizB[][] = {{7,8},{10,11}};
        int soma[][] = new int[2][2];
        int mult[][] = new int[2][2];
        int i, j, result=0, lin=0, col=0;
        
        //IMPRIME Matria A
        System.out.printf("------ Matriz A ---------- \n");
        imprime(matrizA);
        System.out.printf("\n");
        
        //IMPRIME Matria B
        System.out.printf("------ Matriz B ---------- \n");
        imprime(matrizB);
        System.out.printf("\n");
        
        //SOMA
        for(i=0; i < 2; i++){
            for(j=0; j < 2; j++){
                soma[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }
        
        
        //MULTIPLICACAO
        while(lin < 2){
            for(i=0; i < 2; i++){
                for(j=0; j < 2; j++){
                    result = result + matrizA[lin][j] *  matrizB[j][i];
                }
                mult[lin][col] = result;
                col++;
                result = 0;              
            }
            lin++;
            col=0;
        }
        
        //IMPRIME Matriz A + Matriz B
        System.out.printf("------ Matriz A + B ------- \n");
        imprime(soma);
        System.out.printf("\n");
        
        //IMPRIME Matriz A * Matriz B
        System.out.printf("------ Matriz A * B ------- \n");
        imprime(mult);
        System.out.printf("\n");

    }
    
}
