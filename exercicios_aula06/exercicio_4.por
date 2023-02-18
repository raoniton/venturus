/*
Faça um algoritmo para gerar uma tabela de jogos de futebol. 
Leve em consideração que deve existir o jogo de ida e o jogo de volta. 
Use o conceito de vetor para resolver o exercício.
*/

programa {
  
  funcao imprimeVetor(inteiro v[], inteiro tam){
    inteiro i
    para(i=0; i<tam; i++){
      escreva(v[i], " ")
    }
    escreva("\n")
  }

  funcao limpaVetor(inteiro v[], inteiro tam){
    inteiro i
    para(i=0; i<tam; i++){
      v[i] = 0
    }
  }

  funcao procuraLivre(inteiro v[], inteiro tam){
    inteiro i
    para(i=0; i<tam; i++){
      se(v[i] == 0){
        v[i] = 1
        retorne i
      }
    }
  }
  funcao inicio() {
    inteiro i, j, v[] = {0,0,0,0}, tam=4, time1, time2, jogos = 0, aux=0
    
    //ida   (1 2) (3 4) - (1 3) (2 4) - (1 4) (2 3)
    //volta (2 1) (4 3) - (3 1) (4 2) - (4 1) (3 2)
    limpaVetor(v, tam)
        
    escreva("Jogos de IDA!\n")
    para(i=0; i<tam-1; i++){
      v[0] = 1
      aux = i+1
      v[aux] = 1

      escreva("Rodada ", i+1,"\n")
      escreva("Time ", v[0], " x Time ", aux+1, "\n" )
      escreva("Time ", procuraLivre(v, tam)+1, " x Time ", procuraLivre(v, tam)+1, "\n" )
      limpaVetor(v, tam)
      aux++        
    }
    escreva("\n")

    escreva("Jogos de VOLTA!\n")
    para(i=0; i<tam-1; i++){
      v[0] = 1
      aux = i+1
      v[aux] = 1

      escreva("Rodada ", i+1,"\n")
      escreva("Time ", aux+1, " x Time ", v[0], "\n" )
      time2 = procuraLivre(v, tam)
      time1 = procuraLivre(v, tam)
      escreva("Time ", time1+1, " x Time ", time2+1, "\n" )
      limpaVetor(v, tam)
      aux++        
    }
  }
}
