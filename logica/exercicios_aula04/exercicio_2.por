/*
Faça um Algoritmo que leia um dado número e imprima na tela se este é um número primo ou não
*/
programa {
  funcao inicio() {
    inteiro num, i=3, flag=0
    escreva("Digite um numero para saber se eh primo: ")
    leia(num)
    
    se(num == 2){
      escreva("O numero ", num, " eh primo")
    senao se((num % 2 == 0) ou num == 1){
      escreva("O numero ", num, " nao eh primo")
    }senao{
      faca{        
        se((num != i) e (num % i == 0)){
          flag = 1
          pare
        }
        i=i+2
      }enquanto(i <= 7)
      se(flag == 1){
        escreva("O numero ", num, " nao eh primo")
      }senao{
        escreva("O numero ", num, " eh primo")
      }
    }
  }
}
