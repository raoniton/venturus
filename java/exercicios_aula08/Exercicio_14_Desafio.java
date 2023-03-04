/*
Exercicio 14
Faça um programa que receba as informações de produtos:
O preço,
A categoria (1 – limpeza; 2 – alimentação; ou 3 – vestuário),
A situação (R – produtos que necessitam de refrigeração; e N – 
produtos que não necessitam de refrigeração).
Calcule e mostre o "Preço com aumento", usando as regras que se seguem:
PRECO | CATEGORIA | PERCENTUAL DE AUMENTO
<= 25 |     1     |       5%
      |     2     |       8%
      |     3     |       10%
> 25  |     1     |       12%
      |     2     |       15%
      |     3     |       18%
    
Calcule o "Preço com desconto" de acordo com a seguinte regra:
O produto que preencher pelo menos um dos seguintes requisitos terá um desconto 
equivalente a 5% do preço; caso contrário, terá um desconto de 8%.
Os requisitos são: Categoria: 2 Situação: R
Faça e imprima a classificação, usando a regra a seguir.
NOVO PRECO    |     CLASSIFICACAO
     <= 50    |     Barato
> 50 e < 120  |     Normal
   >= 120     |     Caro

*/
package exercicio_14_desafio;
import java.util.Scanner;
/**
 *
 * @author raoniton
 */
public class Exercicio_14_Desafio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double preco;
        int cat;
        String sit;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o preco:");
        preco = scanner.nextDouble();
        
        System.out.println("Digite a categoria:");
        cat = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite a situacao: ");
        sit = scanner.nextLine();
        
        sit = sit.toLowerCase();
        //Calcula aumento
        if(cat == 1){
            if(preco <= 25){
                preco = preco*(1.05);
            }else{
                preco = preco*(1.12);
            }
        }else if(cat == 2){
            if(preco <= 25){
                preco = preco*(1.08);
            }else{
                preco = preco*(1.15);
            }
        }else{//cat==3
            if(preco <= 25){
                preco = preco*(1.10);
            }else{
                preco = preco*(1.18);
            }
        }
        
        //Calcula desconto
        if(cat == 2 && sit == "r"){
            preco = preco*(0.95);
        }else{
            preco = preco*(0.92);
        }
        
        //Imprime se barato, normal ou caro
        if(preco <= 50){
            System.out.printf("Barato %.2f\n",preco);
        }else if(preco > 50 && preco < 120){
            System.out.printf("Normal %.2f\n",preco);
        }else{
            System.out.printf ("Caro %.2f\n",preco);
        }
        
    }
    
}
