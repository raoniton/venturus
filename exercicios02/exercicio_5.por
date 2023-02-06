/*
 Suponha que a empresa "Google" decidiu conceder um aumento de salários a seus funcionários 
 de acordo com a tabela ao lado. Escreva um algoritmo que lê, para cada funcionário, 
 o seu nome e o seu salário atual. Após receber estes dados, o algoritmo calcula o novo 
 salário e escreve na tela as seguintes informações:
<% de aumento> <salario atual> <salario novo>


TABELA: 
SALARIO ATUAL   |   AUMENTO
  0-3 salarios  |     20%
  4-6 salarios  |     15%
  7-9 salarios  |     12%
10-12 salarios  |     10%
12-15 salarios  |     7%
  >16 salarios  |     0%
*/
*programa {
  inclua biblioteca Matematica --> mat
  funcao inicio() {
    cadeia nome
    real salarioFunc, salarioNovo, salarioBase = 1000    

    escreva("Digite qual o salario atual do funcionario: \n")
    leia(salarioFunc)
    se(salarioFunc <= 3*salarioBase){
      salarioNovo = salarioFunc*(1+0.2)
    }senao se((salarioFunc >= 4*salarioBase) e (salarioFunc <= 4*salarioBase)){
      salarioNovo = salarioFunc*(1+0.15)
    }senao se((salarioFunc >= 7*salarioBase) e (salarioFunc <= 9*salarioBase)){
      salarioFunc = salarioFunc*(1+0.12)
    }senao se((salarioFunc >= 10*salarioBase) e (salarioFunc < 12*salarioBase)){
      salarioNovo = salarioFunc*(1+0.1)
    }senao se((salarioFunc >= 12*salarioBase) e (salarioFunc <= 15*salarioBase)){
      salarioNovo = salarioFunc*(1+0.07)
    }senao{//se salario ultrapassar 15*salarioBase nao eh preciso acrescentar nada ao salario do funcionario
      salarioNovo = salarioFunc
    }
    
    escreva("< ", mat.arredondar( ((salarioNovo/salarioFunc)-1)*100, 2) , "% de aumento >", "< R$", salarioFunc, ".00 >", "< R$", salarioNovo, ".00 >")


  }
}
