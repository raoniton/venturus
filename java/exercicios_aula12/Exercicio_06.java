/*
Exercicio 6 
Crie um algoritmo para ordenar um vor de tamanho 10. Leia todos os valores e 
depois coloque em ordem crescente.
*/
package exercicio_06;
import java.util.Random;

/**
 *
 * @author raoniton
 */
public class Exercicio_06 {
    public static void imprime(int v[]){
        int i;
        System.out.println("VETOR: ");
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
    
    public static void main(String[] args) {
        int v[] = new int[10];
        Random random = new Random();
        int i;
        
        for(i=0; i < v.length; i++){
            v[i] = random.nextInt(50);
        }
        
        imprime(v);
        ordena(v);
        imprime(v);
    }
    
}
