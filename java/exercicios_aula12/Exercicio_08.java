/*
Exercicio 8 
Crie um programa que faça um jogo da mega sena de forma randômica. Os números devem 
ser escolhidos de forma aleatória. Imprima os números em ordem crescente.
*/
package exercicio_08;
import java.util.Random;
/**
 *
 * @author raoniton
 */
public class Exercicio_08 {
    
    public static void imprime(int v[]){
        int i;
        System.out.println("Numeros Sorteados: ");
        for(i=0; i < v.length; i++){
            System.out.printf("%d ", v[i]);
        }
        System.out.printf("\n\n");
    }
    
    public static int menorElemento(int v[], int inicio){
        int i, indiceMenor = inicio;
        for(i=inicio; i < v.length; i++){
            if(v[i] < v[indiceMenor]){
                indiceMenor = i;
            }
        }
        return indiceMenor;
    }
    
    public static void ordena(int v[]){
        int i, indiceMenor, aux;
        
        for(i=0; i < v.length; i++){
            indiceMenor = menorElemento(v, i);
            
            //troca
            aux = v[i];
            v[i] = v[indiceMenor];
            v[indiceMenor] = aux;
        }
    }
    
    /*
    validaNum
    O vetor v foi inicializado com zeros. A funcao verifica se a chave passada
    eh igual a zero ou igual a algum numero que esta no vetor. 
    Ou seja, se o numero sorteado for zero -> retorna falso, 
    se o numero sorteado for igual a um numero do vetor -> retorna falso. 
    */
    public static boolean validaNum(int v[], int chave, int tam){
        int i=0;
        boolean var = true;
        for(i=0; i<tam; i++){
            if(v[i] == chave)
                var = false;
        }
        return var;
    }
    
    public static void main(String[] args) {
        //A mega sena sorteia 6 numeros, que vao do 1 ao 60.
        int v[] = new int[6];
        int i=0, chave;
        Random random = new Random();
        
        while(i != v.length){
            chave = random.nextInt(60);
            if(validaNum(v, chave, i)){
                v[i] = chave;
                i++;
            }
            
        }
        
        //imprime(v);
        ordena(v);
        imprime(v);
    }
    
}
