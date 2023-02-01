//Crie um algoritmo quelê três valores a, b e c. Indique sea=b,a>b, a>=b, c<b,c<>b. Imprima o resultado na tela.
programa {
  funcao inicio() {
    real a, b, c 
    escreva("Digite o valor de 'a': ")
    leia(a)
    escreva("Digite o valor de 'b': ")
    leia(b)
    escreva("Digite o valor de 'c': ")
    leia(c)

    se(a == b)
      escreva("" +a+ " eh igual a "+b+"\n")
    
    se(a > b)
      escreva("" +a+ " eh maior que "+b+"\n")
    
    se(a >= b)  
      escreva("" +a+ " eh maior ou igual a "+b+"\n")

    se(c < b)  
      escreva("" +c+ " eh menor que "+b+"\n")

    se(c != b)  
      escreva("" +c+ " eh diferente de "+b+"\n")
      
    

  }
}
