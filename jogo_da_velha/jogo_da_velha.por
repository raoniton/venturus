/**
 * O DESAFIO EH FAZER UM JOGO DA VELHA PARA PESSOAS JOGAREM
 * UTILIZANDO TODOS OS CONCEITOS APRENDIDOS SOBRE LOGICA DE PROGRAMACAO
 * 
 * AS REGRAS DO JOGO DA VELHA SAO: 
 * -  Os Jogadores se alternarao preenchendo o tabuleiro, o jogador que preencher
 *    primeiro uma linha, seja ela na vertical, horizontal ou diagonal, vencera o jogo.
 * -  Existe a possibilidade de o jogo nao ter vencedor. Quando isso acontece, dizemos que 
 *    "DEU VELHA!"
 */
programa {
  //FUNCAO PARA IMPRIMIR A MATRIZ QUE MOSTRA A POSICAO QUE O JOGADOR ESTA ESCOLHENDO
  funcao imprimePosicao(cadeia matriz[][]){
    inteiro i, j 
     para(i=0; i<3; i++){
      para(j=0; j<3; j++){
        escreva("\t\t", matriz[i][j], "\t")
        
        se(j < 2){
          escreva("\t|")
        }
      }
      se(i < 2){
          escreva("\n---------- --------- ---------\n")
        }
    }
    escreva("\n")
  }

  //FUNCAO QUE CONTROLA A TROCA DE JOGAR DE ACORDO COM A VEZ DE CADA UM
  //Sendo o primeiro = 'jogador 1', e o segundo = 'jogador 2'
  funcao trocaJogador(inteiro jogador){
    se(jogador == 1){
      retorne 2
    }senao{
      retorne 1
    }
  }
  
  //FUNCAO QUE CONTROLA A TROCA DE JOGAR DE ACORDO COM A VEZ DE CADA UM
  //Sendo: 'X' a marca do jogador 1 e 'O' a marca do jogador 2
  funcao trocaMarca(cadeia marca){
    se(marca == " X"){
      retorne " O"
    }senao{
      retorne " X"
    }
  }

  /*
  A verificacao esta baseada no vetor 'controle', e nao na matriz, 
  Sempre que o jogador escolhe a posicao que deseja, o programa atualiza
  o vetor 'controle'. Ou seja, analiso o vetor como se ele fosse uma matriz
  Na funcao abaixo, o programa verifica as Linhas
  */
 funcao verificaLinVetor(inteiro v[]){
    inteiro i
    para(i=0; i <= 6; i = i+3){
      se((v[i] == v[i+1]) e (v[i] == v[i+2]) e v[i] != 0){
        retorne v[i]
      }
    }
    retorne 0
  }

  /*
  A verificacao esta baseada no vetor 'controle', e nao na matriz, 
  Sempre que o jogador escolhe a posicao que deseja, o programa atualiza
  o vetor 'controle'. Ou seja, analiso o vetor como se ele fosse uma matriz
  Na funcao abaixo, o programa verifica as Colunas
  */
  funcao verificaColVetor(inteiro v[]){
    inteiro j
    para(j=0; j < 3; j++){
      se((v[j] == v[j+3]) e (v[j] == v[j+6]) e v[j] != 0){ 
        retorne v[j]
      }
    }
    retorne 0
  }

/*
  A verificacao esta baseada no vetor 'controle', e nao na matriz, 
  Sempre que o jogador escolhe a posicao que deseja, o programa atualiza
  o vetor 'controle'. Ou seja, analiso o vetor como se ele fosse uma matriz
  Na funcao abaixo, o programa verifica tanto a Diagonal Principal, quanto a secundaria
  */
  funcao verificaDiagonais(inteiro v[]){
    
    se((v[0] == v[4]) e (v[0] == v[8]) e v[0] != 0){ //<-- Diagonal Principal
      retorne v[0]
    }senao se((v[6] == v[4]) e (v[6] == v[2]) e v[6] != 0){//<-- Diagonal Secundaria
      retorne v[6]
    }

    retorne 0
  }

  /*
  FUNCAO PRINCIPAL
  */
  funcao inicio() {
    inteiro matriz[3][3], i, j, controle[9] = {0,0,0,0,0,0,0,0,0}, alerta=0, jogador = 1, count = 0
    cadeia posicao[][] = {{"00", "01", "02"}, {"10", "11", "12"}, {"20", "21", "22"}} 
    cadeia opcao, marca = " X"

    //ENQUANTO Nao forem feitas 9 Jogadas, o Programa mostra sempre o menu, ate que pessoa escolha um opcao valida
    enquanto(count < 9){
      escreva("JOGO DA VELHA: \n")
      escreva("Jogador ",jogador, " digite a posicao que deseja jogar: \n")
      escreva("ex: 00\n\n")

      //IMPRESSAO DA MATRIZ COM AS POSICOES
      imprimePosicao(posicao)

      //Verifico a partir da 5 jogada se alguem ja venceu a partida
       se(count > 4){
        se(verificaLinVetor(controle) != 0){
          escreva("JOGADOR ",verificaLinVetor(controle)," VENCEU A PARTIDA!\n")
          pare
        }
        se(verificaColVetor(controle) != 0){          
          escreva("JOGADOR ",verificaColVetor(controle)," VENCEU A PARTIDA!\n")
          pare
        } 
        se(verificaDiagonais(controle) != 0){
          escreva("JOGADOR ",verificaDiagonais(controle)," VENCEU A PARTIDA!\n")
          pare
        }
      }

      //ALERTA PARA QUANDO TENTAREM ESCREVER NUMA POSICAO JA ESCRITA OU ENTRAR UM VALOR INVALIDO
      se(alerta==1){
        escreva("OPCAO INVALIDA!\n")
        //desligo o alerta
        alerta = 0
      }
      leia(opcao)
      
      
      escolha(opcao){
        caso "00":{
          se((controle[0] == 0)){
            posicao[0][0] = marca
            controle[0] = jogador
            //Se a jogada for valida, troca jogador
            jogador = trocaJogador(jogador)
            marca = trocaMarca(marca)
            alerta = 0 
            count++
          }senao{
            alerta = 1 
            limpa()
      
          }        
          pare
        }caso "01":{
          se((controle[1] == 0)){
            posicao[0][1] = marca
            controle[1] = jogador
            //Se a jogada for valida, troca jogador
            jogador = trocaJogador(jogador)
            marca = trocaMarca(marca)
            alerta = 0
            count++ 
          }senao{
            alerta = 1 
            limpa()
      
          }
          pare        
        
        }caso "02":{
          se((controle[2] == 0)){
            posicao[0][2] = marca
            controle[2] = jogador
            //Se a jogada for valida, troca jogador
            jogador = trocaJogador(jogador)
            marca = trocaMarca(marca)
            alerta = 0
            count++ 
          }senao{
            alerta = 1 
            limpa()
      
          }
          pare        
        }caso "10":{
          se((controle[3] == 0)){
            posicao[1][0] = marca
            controle[3] = jogador
            //Se a jogada for valida, troca jogador
            jogador = trocaJogador(jogador)
            marca = trocaMarca(marca)
            alerta = 0
            count++ 
          }senao{
            alerta = 1 
            limpa()
      
          }
          pare        
        }caso "11":{
          se((controle[4] == 0)){
            posicao[1][1] = marca
            controle[4] = jogador
            //Se a jogada for valida, troca jogador
            jogador = trocaJogador(jogador)
            marca = trocaMarca(marca)
            alerta = 0
            count++ 
          }senao{
            alerta = 1 
            limpa()
      
          }
          pare        
        }caso "12":{
          se((controle[5] == 0)){
            posicao[1][2] = marca
            controle[5] = jogador
            //Se a jogada for valida, troca jogador
            jogador = trocaJogador(jogador)
            marca = trocaMarca(marca)
            alerta = 0
            count++ 
          }senao{
            alerta = 1 
            limpa()
      
          }
          pare        
        }caso "20":{
          se((controle[6] == 0)){
            posicao[2][0] = marca
            controle[6] = jogador
            //Se a jogada for valida, troca jogador
            jogador = trocaJogador(jogador)
            marca = trocaMarca(marca)
            alerta = 0
            count++ 
          }senao{
            alerta = 1 
            limpa()
      
          }
          pare        
        
        }caso "21":{
          se((controle[7] == 0)){
            posicao[2][1] = marca
            controle[7] = jogador
            //Se a jogada for valida, troca jogador
            jogador = trocaJogador(jogador)
            marca = trocaMarca(marca)
            alerta = 0
            count++ 
          }senao{
            alerta = 1 
            limpa()
      
          }
          pare        
        
        }caso "22":{
          se((controle[8] == 0)){
            posicao[2][2] = marca
            controle[8] = jogador
            //Se a jogada for valida, troca jogador
            jogador = trocaJogador(jogador)
            marca = trocaMarca(marca)
            alerta = 0
            count++ 
          }senao{
            alerta = 1 
            limpa()
      
          }
          pare        
        
        }
      }
      se(count < 9){
        limpa()
      }
      
    }
    se(count == 9){
      escreva("EMPTATE!\n")
    }
  }
}
