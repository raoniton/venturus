/*
Escreva um programa que leia um número inteiro. Se o número lido for positivo, 
escreva uma mensagem indicando se ele é par ou ímpar. Se o número for negativo, 
escreva a seguinte mensagem “Este número não é positivo”
*/
programa {
  funcao parImpar(inteiro num){
    se(num % 2 == 0){
      escreva("\nO numero "+ num + " eh par!\n")
    }
    senao{
      escreva("O numero "+ num + " eh impar!\n")
    }
  }
  funcao inicio() {
    inteiro num
    escreva("Digite um numero inteiro: ")
    leia(num)
    parImpar(num)
    
    se(num < 0){
      escreva("Esse numero eh negativo.\n")
    }

  }
}
