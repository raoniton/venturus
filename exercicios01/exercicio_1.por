//Crie um algoritmo que lê o nome de um correntista, sua agência e conta. Exiba esses dados na tela.
programa {
  funcao inicio() {
    cadeia nome, agencia, conta
    escreva("Digite seu nome: ")
    leia(nome)
    escreva("Digite o numero de sua agencia: ")
    leia(agencia)
    escreva("Digite o numero de sua conta: ")
    leia(conta)

    escreva("\nSeus dados são: \nnome: " + nome + "\nAgencia: " + agencia + "\nconta: " + conta + "\n")
  }
}
