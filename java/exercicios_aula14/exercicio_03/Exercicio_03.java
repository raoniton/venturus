/*
Exercicio 3
Um funcionário de uma empresa
recebe, anualmente, aumento salarial. Sabe- se que: 
a) esse funcionário foi contratado em 2016, com salário inicial de R$2.000,00; 
b) Em 2017, ele recebeu aumento de 1,5%, sobre o seu salário inicial; 
c) A partir de 2018 (inclusive), os aumentos salariais 
sempre corresponderam ao dobro do percentual do ano anterior. Faça um programa que 
determine o salário desse funcionário dos anos de 2016 ao ano atual(2022). 
Apresente todos os valores. 
*/
package exercicio_03;

/**
 *
 * @author raoniton
 */
public class Exercicio_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Funcionario func = new Funcionario(2000, 2016);
        double percentual = 1.5;
        int i, anoContratacao = 2016, anoFinal = 2022;
        
        
        
        for(i=anoContratacao; i<=anoFinal; i++)
            if(i==anoContratacao){
                System.out.printf("Salario Inicial: R$%.2f - Ano: %d\n",func.salarioAtual, i);                
            }else if(i == anoContratacao+1){
                func.aumento(percentual);
                //System.out.println(percentual);
                System.out.printf("Salario Atual:   R$%.2f - Ano: %d\n",func.salarioAtual, i);                
            }else{
                percentual = percentual*2;
                //System.out.println(percentual);
                func.aumento(percentual);
                System.out.printf("Salario Atual:   R$%.2f - Ano: %d\n",func.salarioAtual, i);                
                
            }
        
    }
    
}
