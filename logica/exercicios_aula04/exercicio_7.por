/*
Um funcionário de uma empresa recebe, anualmente, aumento salarial. 
Sabe-se que: a) esse funcionário foi contratado em 2016, com salário 
inicial de R$2.000,00; b) Em 2017, ele recebeu aumento de 1,5%, 
sobre o seu salário inicial; c) A partir de 2018 (inclusive), 
os aumentos salariais sempre corresponderam ao dobro do percentual do ano anterior. 
Faça um programa que determine o salário desse funcionário dos anos de 
2016 ao ano atual(2022). Apresente todos os valores.
*/
programa {
  inclua biblioteca Matematica --> mat
  funcao inicio() {
    inteiro i
    real salario = 2000, percentual=0.015
    escreva("O salario Inicial em 2016: R$", salario, ".00\n")
    para(i=0;  i <= 6; i++){
      se(i==0){
        salario = salario*(1+percentual)        
        escreva("O salario de ", 2016+i, " aumentou ", mat.arredondar(100*percentual,2), "% e foi para: R$", mat.arredondar(salario,2), "\n")
      }senao{
        percentual = 2*percentual        
        salario = salario*(1+percentual)
         escreva("O salario de ", 2016+i, " aumentou ", mat.arredondar(100*percentual,2), "% e foi para: R$", mat.arredondar(salario,2), "\n")

      }
    }
    
  }
}
