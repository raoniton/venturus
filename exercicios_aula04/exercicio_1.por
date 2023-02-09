/*
Faça um Algoritmo que calcule o fatorial de um número qualquer. 
O usuário deve digitar o número no qual ele deseja obter o resultado 
do fatorial na tela. Repita este processo até que o usuário não tenha 
mais interesse em obter cálculo de fatorial
*/
programa {
  funcao inicio() {
    inteiro opcao, i, controle = 1, fat, num, result

    escreva("Escolha a opcao: \n[1] - Para Fatorial.\n[0] - Para Sair\n")
    leia(opcao)
    limpa()
    enquanto(opcao == 1){      
      escolha(opcao){
        caso 1:
          escreva("Digite um numero para o fatorial: \n")
          leia(num)
          fat = 1

          para(i=num; i > 1; i--){
            fat = fat*i
            //escreva(fat, " ")
          }
          escreva("O fatorial de ", num, " eh = ", fat, " \n")

        pare
        caso contrario{
          controle = 0
        }

        
      }
      escreva("Escolha a opcao: \n[1] - Para Fatorial.\n[Digite qualquer coisa] - Para Sair\n")
      leia(opcao)
      limpa()
      
    }
    
    
  }
}
