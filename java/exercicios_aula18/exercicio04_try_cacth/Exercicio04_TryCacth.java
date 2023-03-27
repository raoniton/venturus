/*
Exercicio 4 - Try-Catch

como funciona o tratamento de excecoes

try {
} catch (ExceptionType e) { 
    <comandos>
} catch (ExceptionType e) { 
    <comandos>
} catch (ExceptionType e) { 
    <comandos>
}

*/
package exercicio04_try_cacth;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author raoniton
 */
public class Exercicio04_TryCacth {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String[] vet = scanner.nextLine().split(" ");
            int position = scanner.nextInt();
            System.out.println(vet[position]);
            scanner.close();
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Posicao Invalida!");
        }catch (InputMismatchException e){
            System.out.println("Input Error!");
        }
       
        System.out.println("Fim do programa");
    }
    
}
