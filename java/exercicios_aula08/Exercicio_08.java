/*
Exercicio 8

Escreva um algoritmo que calcule o IMC de uma pessoa e imprima a situação em que
ela se encontra. Analise a tabela ao lado e desenvolva o programa pedido.

Regra: IMC - massa/altura^2

TABELA
IMC | Classificacao
<16 | Magreza grave
16 a <17 | Magreza moderada
17 a < 18.5 | Magreza leve
18,5 a <25 | Saudavel
25 a < 30 | Sobrepeso
30 a < 35 | Obesidade grau I
35 a <40 | Obesidade Grau II(severa)
>= 40 | Obesidade grau III(morbida)
*/

package exercicio_08;
import java.util.Scanner;
/**
 *
 * @author raoniton
 */
public class Exercicio_08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double massa, altura, imc;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite sua massa: ");
        massa = scanner.nextDouble();
        
        System.out.println("Digite sua altura: ");
        altura = scanner.nextDouble();
        
        imc = massa/Math.pow(altura, 2);
        
        if(imc < 16)
            System.out.println("Magreza grave");
        else if(imc >= 16 && imc <17)
            System.out.println("Magreza moderada");
        else if(imc >=17 && imc < 18.5)
            System.out.println("Magreza leve");
        else if(imc >= 18.5 && imc < 25)
            System.out.println("Saudavel");
        else if(imc >= 25 && imc < 30)
            System.out.println("Sobrepeso");
        else if(imc >= 30 && imc < 35)
            System.out.println("Obseidade grau I");
        else if(imc >= 35 && imc < 40)
            System.out.println("Obesidade grau II(severa)");
        else{
            System.out.println("Obesidade grau II(morbida)");
        }
        
    }
    
}
