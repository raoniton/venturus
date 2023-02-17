/**
 * Faça um programa que leia um conjunto de dados contendo a altura e o 
 * sexo (masculino, feminino) de 5 pessoas. Calcule a maior e a menor 
 * altura do grupo; Calcule a média de altura das mulheres e a média de 
 * altura dos homens. Imprima o resultado.
 */
programa {
  inclua biblioteca Texto --> tx
  
  funcao encontraMaior(real v[], inteiro tam){
    inteiro i, maior
    para(i=0; i<tam; i++){
      se(i==0){
        maior = 0
      }senao se(v[i] > v[maior]){
        maior = i
      }      
    }
    //retorno o indice
    retorne maior
  }

  funcao encontraMenor(real v[], inteiro tam){
    inteiro i, menor
    para(i=0; i<tam; i++){
      se(i==0){
        menor = 0
      }senao se(v[i] < v[menor]){
        menor = i
      }      
    }
    //retorno o indice
    retorne menor
  }

   funcao mediaPorSexo(real v[], caracter sexo[], caracter chave, inteiro tam){
    inteiro i
    real somatorio=0, aux, qtd=0
    para(i=0; i<tam; i++){
      se(sexo[i] == chave){
        aux = v[i]
        somatorio = somatorio + aux
        qtd++
      }
    }

    se(qtd == 0){
      retorne 0
    }
    
    retorne somatorio/qtd
  }

  funcao inicio() {
    caracter sexo[5]
    real altura[5], alturaMulheres, alturaHomens
    inteiro tam=5, i, aux, teste=0


    para(i=0; i<tam; i++){
      escreva("Digite sexo: F/M e Altura. ", i+1,"/",tam,"\n")
      escreva("Digite o sexo: ")
      leia(sexo[i])
      
      
      escreva("Digite a altura: ")
      leia(altura[i])
      limpa()
    }
    
    aux = encontraMaior(altura, tam)
    escreva("Maior Altura: ", altura[aux]," - Sexo: ", sexo[aux],"\n")
    aux = encontraMenor(altura, tam)
    escreva("Menor Altura: ", altura[aux]," - Sexo: ", sexo[aux],"\n")
    
    escreva("A media de Altura das mulheres: ",mediaPorSexo(altura, sexo, 'F', tam), "\n")
    escreva("A media de Altura dos homens: ",mediaPorSexo(altura, sexo, 'M', tam), "\n")

  }
}
