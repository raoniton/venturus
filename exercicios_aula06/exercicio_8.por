/*
Faça um Algoritmo para preencher uma matriz de terceira ordem e mostrar quais sã as posições que possuem valores pares
*/
programa {
  inclua biblioteca Util --> util
  
  funcao preenche(inteiro matriz[][], inteiro ordem){
    inteiro i, j
    para(i=0; i < ordem; i++){
      para(j=0; j < ordem; j++){
         matriz[i][j] = util.sorteia(1, 100)
      }
    }
  }

 funcao imprime(inteiro matriz[][], inteiro ordem){
    inteiro i, j
    escreva("\n")
    para(i=0; i < ordem; i++){
      para(j=0; j < ordem; j++){
        escreva(matriz[i][j], " \t")
      }
      escreva("\n")
    }
  }  

   funcao imprimePar(inteiro matriz[][], inteiro ordem){
    inteiro i, j

    escreva("IMPRESSAO DOS MATRIZ ELEMENTOS PARES: \n")
    para(i=0; i < ordem; i++){
      para(j=0; j < ordem; j++){
        se(matriz[i][j] % 2 ==0){
          escreva("\t",matriz[i][j], "\t")
        }senao{
          escreva("\t \t")
        }

        se((i < ordem) ou (j < ordem)){
          escreva(" | ")
        }
      }
      escreva("\n\n")
    }
  }

  funcao imprimePosicaoPar(inteiro matriz[][], inteiro ordem){
    inteiro i, j
    escreva("POSICOES COM ELEMENTOS PARES: \n")
    para(i=0; i < ordem; i++){
      para(j=0; j < ordem; j++){
        se(matriz[i][j] % 2 == 0){
          escreva("[",i ,"][",j,"] - ")
        }
         
      }
    }
    escreva("\n\n")
  }

  funcao inicio() {
    inteiro matriz[3][3]
    preenche(matriz, 3)
    imprime(matriz, 3)
    escreva("\n")
    imprimePar(matriz, 3)
    imprimePosicaoPar(matriz, 3)

  }
}
