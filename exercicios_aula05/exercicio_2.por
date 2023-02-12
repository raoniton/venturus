/*
Algoritmo para verificar se um valor e par ou ímpar usando rotinas internas ou procedimentos
*/
programa {
  funcao parOuImpar(inteiro x){
    se(x % 2 == 0){
      escreva(x, " eh par")
    }senao{
      escreva(x, " eh impar")
    }
  }
  funcao inicio() {
    inteiro x, y
    escreva("Digite um numero: ")
    leia(x)

    parOuImpar(x)
  }
}
