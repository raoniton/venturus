/*
Faça um algoritmo para subtrair dois valores usando procedimentos.
Imprima o resultado.
*/
programa {
  funcao subtrai(inteiro x, inteiro y){
    escreva(x, " - ", y , " = ",x - y)
  }
  funcao inicio() {
    inteiro x, y
    escreva("Digite o primeiro numero: ")
    leia(x)
    escreva("Digite o segundo numero: ")
    leia(y)

    subtrai(x, y)
  }
}
