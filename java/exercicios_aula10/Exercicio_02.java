/*
Exercicio 02
Escreva um programa que repita a leitura de uma senha até que ela seja válida. 
Para cada leitura de senha incorreta informada, escrever a mensagem "Senha Invalida" 
e "Tente novamente". Quando a senha for informada corretamente deve ser impressa 
a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha 
correta é o valor 2023.
*/
package exercicio_02;
import java.util.Scanner;
/**
 *
 * @author raoniton
 */
public class Exercicio_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int senhaCorreta = 2023, senha, i=0;
        Scanner scanner = new Scanner(System.in);
        do{
            if(i==0){
                System.out.println("Digite a senha: ");
                i=1;
            }else{
                System.out.println("Senha incorreta, tente novamente: ");
            }
            senha = scanner.nextInt();
        }while(senha != senhaCorreta);
        
        System.out.println("Acesso Permitido");
        
    }
    
}
