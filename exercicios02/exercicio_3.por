/*
Faça um algoritmo que receba o valor do salário de uma pessoa e o valor de um financiamento pretendido. 
Caso o financiamento seja menor ou igual a 5 vezes o salário da pessoa, o algoritmo deverá escrever 
"Financiamento Concedido"; senão, ele deverá escrever "Financiamento Negado". 
Independente de conceder ou não o financiamento, o algoritmo escreverá depois a frase 
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
