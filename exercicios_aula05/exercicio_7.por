/*
Escreva um programa que lê um valor inteiro (maior ou igual a 1 e menor ou igual a 10) 
e exibe a tabuada (até 10) de multiplicação do número lido.
Funcao LeNumero(n1,n2:inteiro):inteiro;
*/
programa {
  funcao tabuada(inteiro n){
    inteiro i
    para(i=0; i <= 10; i++){
      escreva(n, " x ", i, " = ", n*i,"\n")
    }
  }
  funcao inicio() {
    inteiro n
    escreva("Digite um numero para a tabuada: ")
    leia(n)
    tabuada(n)    
  }
}
