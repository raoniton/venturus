programa {
  inclua biblioteca Matematica --> mat
  
  funcao verificaNumeroPerfeito(inteiro x){
    inteiro i=1, somatorio=0

    para(i=1; i < x; i++){
      se(x % i == 0){
        somatorio = somatorio + i
        se(somatorio > x){
          retorne 0
        }
      }    
    }
    se(somatorio != x){
      retorne 0
    }
    retorne somatorio
  }
    
  
  funcao inicio() {
    
    inteiro count=0,  i=2, x, aux
    
    
      //Euclides descobriu que os quatro primeiros números perfeitos são gerados pela fórmula: 2^(n-1)(2^n - 1):
      //Utilizando a formula eu descubro os numeros, depois eu testo com o algoritmo de verificacao de Numero Perfeito, soh pra garantir que eh perfeito realmente
      enquanto(count != 4){
        x = mat.potencia(2, i-1) * (mat.potencia(2, i) -1 )
        aux = verificaNumeroPerfeito(x)
        se(aux != 0){
          escreva(aux, " eh um numero perfeito\n")
          count++
        }
        i++       
      }
    }
    

    
  }
}
