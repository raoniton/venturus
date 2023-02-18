/*
Escreva o algoritmo "Programa Solidário". O doador deve clicar nas opções 
(mostradas abaixo) para efetuar a sua doação. Imprima o resultado na tela 
com o valor da doação e uma mensagem de agradecimento. Utilize a estrutura Escolha...Caso.
[1] para doar R$10
[2] para doar R$25
[3] para doar R$50
[4] para doar outros valores
[5] para cancelar
*/
programa {
  funcao inicio() {
    inteiro opcao, valor = 0
    escreva("Programa Solidario! \nPara efetuar sua doacao, escolha uma das opcoes abaixo! \n")
    escreva("[1] para doar R$10 \n[2] para doar R$25 \n[3] para doar R$50 \n")
    escreva("[4] para doar outros valores \n[5] para cancelar\n")
    leia(opcao)

    escolha(opcao){
      caso 1:
        escreva("Muito obrigado por sua doacao de R$10,00")
        valor = 10
        pare
      caso 2:
        escreva("Muito obrigado por sua doacao de R$25,00")
        valor = 25
        pare
      caso 3:
        escreva("Muito obrigado por sua doacao de R$50,00")
        valor = 50
        pare
      caso 4:
        escreva("Digite o valor que deseja doar: ")
        leia(valor)
        escreva("Muito obrigado por sua doacao de R$" + valor + ",00")
        pare
      caso 5:
        escreva("Você Cancelou.")
        pare
    }

  }
}
