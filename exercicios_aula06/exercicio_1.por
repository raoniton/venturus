/*
Fa�a um algoritmo que leia 7 n�meros. 
Em seguida imprima quantos n�meros s�o pares e quais s�o esses n�meros pares. 
Utilize o conceito de vetor.
*/
programa {
  funcao inicio() {
    inteiro v[7], i, count=0
    escreva("Escreva 7 numeros: \n")
    para(i=0; i<7; i++){
      escreva("Digite o ", i+1, "o numero: ")
      leia(v[i])
      se(v[i] % 2 == 0){
        count++
      }
    }    
    
    escreva("Voce digitou ", count, " numeros pares.\n")
    para(i=0; i<7; i++){
      se(v[i] % 2 == 0){
        escreva(v[i], " " ) 
      }
    }    
    
  }
}
