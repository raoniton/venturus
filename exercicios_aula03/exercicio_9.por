/*
Faça um programa que lê 4 valores I, A, B e C onde I é um número inteiro e positivo 
e A, B, e C são quaisquer valores reais. O programa deve escrever os valores lidos e:
se I = 1, escrever os três valores A, B e C em ordem crescente;
se I = 2, escrever os três valores A, B e C em ordem decrescente;
se I = 3, escrever os três valores A, B, e C de forma que o maior valor fique entre os outros dois;
se I não for um dos três valores acima, dar uma mensagem indicando este comportamento
*/
programa {
  funcao maiorElemento(real n1, real n2){
    se(n1 > n2){
      retorne n1
    }
    
    retorne n2    
  }
  funcao menorElemento(real n1, real n2){
    se(n1 < n2){
      retorne n1
    }
    
    retorne n2    
  }

  funcao inicio() {
    inteiro i 
    real aux, a, b, c, maior, menor1, menor2
    
    escreva("Digite o numero \nI = 1 - ordem crescente \nI = 2 - ordem decrescente \nI = 3 - mostra o maior numero entre os outros 2: ")
    leia(i)
    escreva("Digite o 1o numero: ")
    leia(a)
    escreva("Digite o 2o numero: ")
    leia(b)
    escreva("Digite o 3o numero: ")
    leia(c)

    maior = maiorElemento(a, b)
    maior = maiorElemento(maior, c)
    se(maior == a){
      menor1 = menorElemento(b, c)
      menor2 = maiorElemento(b, c)
    }senao se(maior == b){
      menor1 = menorElemento(a, c)
      menor2 = maiorElemento(a, c)
    }senao{
      menor1 = menorElemento(a, b)
      menor2 = maiorElemento(a, b)
    }

    escolha(i)
    caso 1:
      escreva(menor1," ", menor2, " ", maior)
    pare
    caso 2:
      escreva(maior," ", menor2, " ", menor1)
    pare
    caso 3:
      escreva(menor1," ", maior, " ", menor2)
    pare
    caso contrario
      escreva("Opca I invalida.")

  }
}
