/*
Faça um programa que leia 4 números e em seguida imprima o resultado em ordem crescente.
Use o conceito de Procedimento para desenvolver o código
*/

programa {
  //FUNCAO QUE ENCONTRA O MENOR ELEMENTO DO VETOR
  funcao encontraMenor(inteiro v[], inteiro inicio,  inteiro  fim){
    inteiro i, menor
    //menor representa o indice do menor valor 
    para(i = inicio; i < fim; i++){
      se(i==inicio){
        menor = inicio
      }senao se(v[i] < v[menor]){
        menor = i
      }
    }
    
    retorne menor
  }
  //FUNCAO PARA IMPRESSAO DO VETOR
  funcao imprime(inteiro v[], inteiro tam){
    inteiro i
    para(i=0; i<tam; i++){
      escreva(v[i], " ")
    }
    escreva("\n")
  }

  //FUNCAO QUE TROCA AS POSICOES DO VETOR
  funcao troca(inteiro v[], inteiro indiceDoMenor, inteiro indiceDaTroca){
    inteiro aux
    aux = v[indiceDaTroca]
    v[indiceDaTroca] = v[indiceDoMenor]
    v[indiceDoMenor] = aux
  }


  funcao inicio() {
    inteiro v[4], i = 0, aux, menor, tam = 4
    para(i=0; i < tam; i++){
      escreva("Digite o ", i+1, "o numero: ")
      leia(v[i])
    }

    para(i=0; i<tam; i++){
      menor = encontraMenor(v, i, tam)
      troca(v, menor, i)  
    }
    imprime(v, tam)    
  }
}
