/*
Fa�a um algoritmo que receba o valor do sal�rio de uma pessoa e o valor de um financiamento pretendido. 
Caso o financiamento seja menor ou igual a 5 vezes o sal�rio da pessoa, o algoritmo dever� escrever 
"Financiamento Concedido"; sen�o, ele dever� escrever "Financiamento Negado". 
Independente de conceder ou n�o o financiamento, o algoritmo escrever� depois a frase 
"Obrigado por nos consultar."
*/
programa {
  funcao financiamento(real salario, real valorFinanc){
    salario = salario*5
    
    se(valorFinanc <= salario){
      escreva("Financiamento concedido.\n")
    }senao{
      escreva("Financiamento negado.\n")
    }
  }
  funcao inicio() {
    real sal, fin
    escreva("Digite o salario: ")
    leia(sal)
    escreva("Digite o valor do financiamento: ")
    leia(fin)

    financiamento(sal, fin)
    escreva("Obrigado por nos consultar. \n")
  }
}
