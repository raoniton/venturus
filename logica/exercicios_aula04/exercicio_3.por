/*
Escreva um algoritmo que leia a nota final de 4 alunos. 
Suponha que Pedro e Maria tirem nota m�xima 10, e que Jo�o e Sofia tirem a nota 9 e 8 respectivamente. 
Fa�a o programa identificar os alunos com a maior nota e imprima o resultado
*/
programa {

  funcao inicio() {
    cadeia nome, primeiroNome, segundoNome
    real nota, primeiraMaior, segundaMaior=0
    inteiro i

    escreva("Voce ira digitar o nome e nota dos alunos: \n")
    
    para(i=0; i < 4; i++){
      escreva("Digite o nome do aluno: ")
      leia(nome) 
      escreva("Digite a nota do aluno: ")
      leia(nota)
      se(i==0){
        primeiraMaior = nota
        primeiroNome =  nome   
        
      }senao{
        
        se(nota > primeiraMaior){
          segundaMaior = primeiraMaior
          segundoNome = primeiroNome
          
          primeiraMaior = nota
          primeiroNome = nome
          
        }senao se((nota > segundaMaior) e (nota < primeiraMaior)){
          segundaMaior = nota
          segundoNome = nome
        }senao se(nota < primeiraMaior)

        
      }
    }
    escreva("A maior nota: ", primeiraMaior, " nome: ", primeiroNome, "\n")
    escreva("A maior nota: ", segundaMaior, " nome: ", segundoNome, "\n")

  }
}
