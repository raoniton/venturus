/* 
Faça um algoritmo que leia o nome de 
10 pessoas e depois mostre uma listagem com nomes 
que comecem com a letra C.
*/
programa {
  inclua biblioteca Texto --> tx
  
  funcao inicio() {
    const inteiro TAM = 10
    inteiro i, posicao[10], i_pos = 0
    cadeia nome[10]
    

    para(i=0; i<TAM; i++){
      escreva("Digite o ", i+1, "o nome: ")
      leia(nome[i])
      se((tx.obter_caracter(nome[i], 0) == "C") ou (tx.obter_caracter(nome[i], 0) == "c")){
        posicao[i_pos] = i
        i_pos++
      }
      
    }

    para(i=0; i < i_pos; i++){
      escreva(nome[posicao[i]], "\n")
    }
  }
}
  