/*
Crie um algoritmo que simule uma calculadora, ou seja, que permite ao usu�rio escolher a 
opera��o matem�tica que ele deseja (soma, subtra��o, multiplica��o e divis�o). 
Ap�s a escolha da opera��o desejada, o resultado deve ser impresso na tela. 
O usu�rio deve ler dois n�meros para fazer uso da calculadora.
*/
programa {
  funcao inicio() {
    inteiro opcao
    real num1, num2
    escreva("CALCULADORA\n")
    escreva("[1] - Soma \n[2] - Subtracao \n[3] - Multiplicacao \n[4] -  Divisao \n")
    leia(opcao)
    escolha(opcao){
      caso: 1
        escreva("Digite o primeiro numero: ")
        leia(num1)
        escreva("Digite o segundo numero: ")
        leia(num2)
        escreva(""+num1+ " + " +num2+ " = " +(num1 + num2))
        pare
      caso: 2
        escreva("Digite o primeiro numero: ")
        leia(num1)
        escreva("Digite o segundo numero: ")
        leia(num2)
        escreva(""+num1+ " - " +num2+ " = " +(num1 - num2))
        pare
      caso: 3
        escreva("Digite o primeiro numero: ")
        leia(num1)
        escreva("Digite o segundo numero: ")
        leia(num2)
        escreva(""+num1+ " * " +num2+ " = " +(num1 * num2))
        pare
      caso: 4
        escreva("Digite o primeiro numero: ")
        leia(num1)
        escreva("Digite o segundo numero: ")
        leia(num2)
        escreva(""+num1+ " / " +num2+ " = " +(num1 / num2))
        pare
    }


  }
}
