/*
Faça um algoritmo que leia uma matriz(3,3) e calcula as somas:
a) da linha 3;
b) da coluna 2;
c) da diagonal principal;
e) de todos os elementos da matriz.
*/
programa {
  funcao inicio() {
    inteiro matriz[3][3], i, j, somatorio = 0, lin3 = 0, col2 = 0, diag = 0

    para(i=0; i<3; i++){
      para(j=0; j < 3; j++){
        escreva("Digite o elemento matriz[",i,"]","[",j,"]: ")
        leia(matriz[i][j])
        se(i == 2){
          lin3 = lin3 + matriz[i][j]
        }senao se(j == 1){
          col2 = col2 + matriz[i][j]
        }
        
        se(i == j){
          diag = diag + matriz[i][j]
        }
        
        somatorio = somatorio + matriz[i][j]
        
      }
      limpa()
    }

    escreva("Somatorio de todos elementos da matriz: ", somatorio, "\n")
    escreva("Somatorio dos elementos da linha 3: ", lin3, "\n")
    escreva("Somatorio dos elementos da coluna 2: ", col2, "\n")
    escreva("Somatorio dos elementos da diagonal principal: ", diag, "\n")

    
  }
}
