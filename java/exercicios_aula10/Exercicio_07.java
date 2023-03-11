/*
Exercicio 7
Um funcionário de uma empresa recebe, anualmente, aumento salarial. Sabe-se que: 
a) esse funcionário foi contratado em 2010, com salário inicial de R$2.000,00; 
b) Em 2011, ele recebeu aumento de 1,5%, sobre o seu salário inicial; 
c) A partir de 2012 (inclusive), os aumentos salariais sempre corresponderam ao 
dobro do percentual do ano anterior. 
Faça um programa que determine o salário desse funcionário dos anos de 2010 à 2022. 
Apresente todos os valores.
*/
package exercicio_07;

/**
 *
 * @author raoniton
 */
public class Exercicio_07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double salario = 2000, aumento=0.015;//aumento de 1.5%
        int i=0;
        
        System.out.printf("Ano %d - Aumento de %.1f%% - Salario: R$%.2f\n", 2010+i, 0.0, salario);
        for(i=0; i <= 12; i++){
            if(i==0){
                salario = salario*(1+aumento);                
            }else if(i > 0){
                aumento = 2*aumento;
                salario = salario*(1+aumento);                
            }
            System.out.printf("Ano %d - Aumento de %.1f%% - Salario: R$%.2f\n", 2010+i, aumento*100, salario);
        }
        
    }
    
}
