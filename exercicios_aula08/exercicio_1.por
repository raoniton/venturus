/**
 * Crie um algoritmo para ordenar um vetor de tamanho 10. Leia todos os valores e depois coloque em ordem crescente.
 */
programa {
  //FUNCAO PARA ENCONTRAR O MENOR ELEMENTO DO VETOR
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

  //FUNCAO QUE DOIS ELEMENTOS COM BASE NOS INDICES PASSADOS
  funcao troca(inteiro v[], inteiro indiceDoMenor, inteiro indiceDaTroca){
    inteiro aux
    aux = v[indiceDaTroca]
    v[indiceDaTroca] = v[indiceDoMenor]
    v[indiceDoMenor] = aux
  }

  funcao imprime(inteiro v[], inteiro tam){
    inteiro i
    para(i=0; i<tam; i++){
      escreva(v[i]," ")
    }
    escreva("\n")
  }

  funcao inicio() {
    inteiro v[10], i, tam = 10, indiceMenor

    //Leitura dos valores
    para(i=0; i<tam; i++){
      escreva("Digite o ",i+1,"o valor: ")
      leia(v[i])
    }
    escreva("\nO Vetor digitado foi: \n")
    imprime(v, tam)
    //Procura pelo menor e troca para colocar na posicao correta
    para(i=0; i<tam; i++){   
      indiceMenor = encontraMenor(v, i, tam)
      troca(v, indiceMenor, i)      
    }

    escreva("\nO Vetor ordenado: \n")
    imprime(v, tam)
  }
}
