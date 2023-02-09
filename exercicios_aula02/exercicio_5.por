//Crie um algoritmo que faça a conversão do moeda real para a moedaeuro. Imprima o resultado na tela.
programa {
  funcao inicio() {
    real valor
    //atualmente o 1 Euro = 5.51 Reais
    escreva("Digite o valor em reais: ")
    leia(valor)

    escreva(1*valor/5.51)
}
