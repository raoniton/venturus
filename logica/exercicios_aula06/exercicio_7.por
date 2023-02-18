/*
Faça um algoritmo para preencher uma matriz de quarta ordem e mostre na tela:
- Os elementos da diagonal principal
- Os elementos do triangulo superior 
- Os elementos do triangulo inferior 
- A matriz completa
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
    escreva("MATRIZ 4x4\n")
    para(i=0; i < ordem; i++){
      para(j=0; j < ordem; j++){
        escreva(matriz[i][j], " \t")
      }
      escreva("\n")
    }
  }

  funcao diagonalPrincipal(inteiro matriz[][], inteiro ordem){
    inteiro i, j
    escreva("\nDIAGONAL PRINCIPAL DA MATRIZ 4x4\n")
    para(i=0; i < ordem; i++){
      para(j=0; j < ordem; j++){
        se(i == j ){
          escreva(matriz[i][j], " \t")
        }senao{
          escreva(" \t")
        }
      }
      escreva("\n")
    }
  }

  funcao trianguloSuperior(inteiro matriz[][], inteiro ordem){
    inteiro i, j
    escreva("\nTRIANGULO SUPERIOR DA MATRIZ 4x4\n")
    para(i=0; i < ordem; i++){
      se(i==1){
        escreva("\t\t")
      }senao se(i==2){
        escreva("\t\t\t\t")
      }senao se(i==3){
        escreva("\t\t\t\t\t\t")
      }
      para(j=i; j < ordem; j++){
        escreva(matriz[i][j], " \t")
      }
      
      escreva("\n")
    }
  }

  funcao trianguloInferior(inteiro matriz[][], inteiro ordem){
    inteiro i, j
    escreva("\nTRIANGULO INFERIOR DA MATRIZ 4x4\n")
    para(i=0; i < ordem; i++){      
      para(j=0; j < i+1; j++){
        escreva(matriz[i][j], " \t")
      }
      
      escreva("\n")
    }
  }
  funcao inicio() {
    inteiro matriz[4][4], i, j

    preenche(matriz, 4)
    imprime(matriz, 4)
    diagonalPrincipal(matriz, 4)
    trianguloSuperior(matriz, 4)
    trianguloInferior(matriz, 4)
    escreva("\n")
    imprime(matriz, 4)

    

  }
}
