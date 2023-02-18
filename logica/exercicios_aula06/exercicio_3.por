/*
Faça um Algoritmo para mostrar uma listagem de alunos. Leia os dados 
(o nome e as duas notas de prova) de 5 alunos. Use o conceito de vetor.
Imprima a média da turma. Imprima os alunos que tiveram a média acima da turma.
*/
programa {
  funcao media(real a, real b){
    retorne (a+b)/2
  }
  funcao inicio() {
    const inteiro TAM = 5
    real nota[5], a, b, mediaTurma = 0
    cadeia nome[5]
    inteiro i

    para(i=0; i < TAM; i++){
      escreva("Digite o nome do ", i+1, "o aluno: ")
      leia(nome[i])
      escreva("Digite a 1a nota: ")
      leia(a)
      escreva("Digite a 2a nota: ")
      leia(b)
      nota[i] = media(a, b)
      mediaTurma = mediaTurma + nota[i]
    }

    mediaTurma = mediaTurma/TAM
    escreva("A media da turma --> ",mediaTurma,"\n")
    para(i=0; i<TAM; i++){
      se(nota[i] > mediaTurma){
        escreva("Aluno acima da média: ", nome[i], " - Nota: ", nota[i],"\n")
      }
    }


    
  }
}
