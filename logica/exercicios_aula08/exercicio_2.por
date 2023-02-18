/**
 * Escreva um algoritmo que leia um vetor com 8 valores numéricos positivos e negativos. 
 * Ordene esses números de forma crescente e de forma decrescente. Imprima o seguinte 
 * resultado:
    a) Vetor digitado
    b) Vetor em ordem Crescente 
    c) Vetor em ordem decrescente
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

  //FUNCAO PARA ENCONTRAR O MAIOR ELEMENTO DO VETOR
  funcao encontraMaior(inteiro v[], inteiro inicio,  inteiro  fim){
    inteiro i, maior
    //menor representa o indice do menor valor 
    para(i = inicio; i < fim; i++){
      se(i==inicio){
        maior = inicio
      }senao se(v[i] > v[maior]){
        maior = i
      }
    }
    retorne maior
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
    inteiro v[8], v2[8], i, tam = 8, indiceMenor, indiceMaior

    //Leitura dos valores
    para(i=0; i<tam; i++){
      escreva("Digite o ",i+1,"o valor: ")
      leia(v[i])
      v2[i] = v[i]
    }
    escreva("\nO Vetor digitado foi: \n")
    imprime(v, tam)
    //Procura pelo menor e troca para colocar na posicao correta
    para(i=0; i<tam; i++){   
      indiceMenor = encontraMenor(v, i, tam)
      troca(v, indiceMenor, i)      

      //Essa parte poderia ser feita simplesmente invertendo a impressao, mas
      //decidi criar outro vetor e ordenar decrescente, assim como foi pedido no exercicio, 
      //ordenar crescente e decrescent.
      indiceMaior = encontraMaior(v2, i, tam)
      troca(v2, indiceMaior, i)      

    }

    escreva("\nO Vetor em ordem crescente: \n")
    imprime(v, tam)

    escreva("\nO Vetor em ordem decrescente: \n")
    imprime(v2, tam)
  }
}
