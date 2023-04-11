/*
Crie uma lista de inteiros do tipo: (3, 4, 5, 10, 7, 14, 16). Em seguida crie uma 
Stream a partir dessa lista. Multiplique por 10 e imprima o resultado.
Em sequência crie uma nova lista a partir dessa primeira lista e a transforme 
*/
package exercicio01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


/**
 *
 * @author raoniton
 */
public class Exercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3,4,5,10,7,14,16);
        System.out.println("Lista Original:\n"+list+"\n");
        
        Stream<Integer> st1 = list.stream().map(x -> x*10);
        System.out.println("Stream 1\n"+Arrays.toString(st1.toArray())+"\n");
        
        System.out.println("Filtra os pares multiplica por 20");
        Stream<Integer> st2 = list.stream().filter(i -> i % 2 == 0)
                .map(i -> i*20);
        System.out.println("Stream 2\n"+Arrays.toString(st2.toArray())+"\n");
        
    }
    
}
