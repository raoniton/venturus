//Crie um algoritmo que lê um dado número e decida se ele é par ou ímpar. Imprima o resultado
programa {
  funcao inicio() {
    inteiro num
    escreva("Digite um número: ")
    leia(num)
    se(num % 2 == 0){
      escreva("\nO numero "+ num + " eh par!\n")
    }
    senao{
      escreva("O numero "+ num + " eh impar!\n")
    }
      
    
  }
}
