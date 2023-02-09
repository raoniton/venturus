/*
Faça um algoritmo que gere uma contagem inteligente. 
O programa deve ler dois números (inicial e final). 
Caso o número inicial seja maior que o final, 
escreva os números intermediários em ordem decrescente. 
Mas se o número inicial for menor que o final, 
escreva os números intermediários em ordem crescente. 
Imprima o resultado.
*/
programa {
  funcao inicio() {
    inteiro i, inicio, fim

    escreva("Digite um numero: ")
    leia(inicio)
    escreva("Digite outro numero: ")
    leia(fim)
    
    se(inicio > fim){
      para(i=inicio-1; i > fim; i--){
        escreva(i, " ")
      }
    }senao se(inicio < fim){
      para(i=inicio; i < fim-1; i++){
        escreva(i+1, " ")
      }
    }

  }
}
