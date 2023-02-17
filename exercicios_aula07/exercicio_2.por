/**
Construa um algoritmo que leia 50 valores inteiros e positivos de forma randômica 
e faça as seguintes tarefas: Encontre o maior valor
Encontre o menor valor
Calcule a média dos números lidos
 */
programa {
  inclua biblioteca Util --> u
  funcao preenche(inteiro v[], inteiro tam){
    inteiro i
    para(i=0; i<tam; i++){
      v[i] = u.sorteia(1, 100)
    }
  }
  funcao encontraMaior(inteiro v[], inteiro tam){
    inteiro i, maior = 0    
    para(i=1; i<tam; i++){
      se(v[i] > v[maior]){
        maior = i
      }      
    }
    retorne v[maior]
  }

  funcao encontraMenor(inteiro v[], inteiro tam){
    inteiro i, menor = 0
    para(i=1; i<tam; i++){
      se(v[i] < v[menor]){
        menor = i
      }      
    }
    retorne v[menor]
  }

  funcao media(inteiro v[], inteiro tam){
    inteiro i, media = 0
    para(i=0; i<tam; i++){
      media = media + v[i]
    }
    retorne media/tam
  }

  funcao inicio() {
    inteiro vet[50], tam = 50

    preenche(vet, tam)
    escreva("O vetor foi preenchido aleatoriamente.\n")    
    escreva("O menor valor: ",encontraMenor(vet, tam),"\nO maior valor: ", encontraMaior(vet, tam),"\n")
    escreva("A media dos elementos: ", media(vet, tam), "\n")

  }
}
