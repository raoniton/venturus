/*
Atividade 4:
Tem-se um conjunto de dados contendo a altura e o sexo (masculino, feminino) de 
N pessoas. Faça um algoritmo que calcule e escreva: A maior altura das N pessoas; 
O número de homens entre as N pessoas.
Use estrutura condicional Do While.
*/
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
        int i=0, n, sexo, masc=0;
        Scanner scanner = new Scanner(System.in);
        double altura, maiorAltura=0;
        
        System.out.println("Digite o numero de pessoas do conjunto:");
        n = scanner.nextInt();
        
        if(n > 0){
            do{
                System.out.println("----------");
                System.out.println((i+1)+"a pessoa:");
                System.out.println("----------");
                System.out.printf("Digite:\n1 - Femenino:\n2 - Masculino: \n");
                sexo = scanner.nextInt();
                
                System.out.println("Qual a altura da pessoa?");
                altura = scanner.nextDouble();
                
                //VERIFICA MAIOR ALTURA
                if(i == 0){
                    maiorAltura = altura;
                }else{
                    if(altura > maiorAltura)
                        maiorAltura = altura;
                }
                
                //CONTA NUMERO DE HOMENS
                if(sexo == 2){
                    masc++;
                }
                
                i++;
            }while(i < n);
            
            System.out.printf("\nO numero de homens: %d\nMaior altura "
                    + "dentre todas pessoas: %.2fm\n", masc, maiorAltura);
        }
        
        
        
    }
    
}
