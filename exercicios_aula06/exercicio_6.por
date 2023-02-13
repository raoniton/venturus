/*
Faça um algoritmo para corrigir uma prova, a partir de um gabarito. 
Primeiro leia o gabarito, ou seja, leia a resposta de 5 questões. 
Em seguida leia o nome de 3 alunos e leia as respectivas respostas das 
5 questões marcada por eles. Confira o resultado e imprima na tela, ou seja, 
a nota alcançada por cada aluno. Imprima também a média da turma.
*/
programa {
  funcao inicio() {
    inteiro i, j, nAlunos=3, nAlternativas=5, somatorio=0, nota[] = {0, 0, 0}
    cadeia gabarito[] = {"a","b","c","d","e"}, alternativa
    cadeia nome[3]

    para(i=0; i < nAlunos; i++){
      escreva("Digite o nome do aluno: ")
      leia(nome[i])
      para(j=0; j < nAlternativas; j++){
        escreva("Digite a ",j+1,"a alternativa: ")
        leia(alternativa)
        se(alternativa == gabarito[j]){
          nota[i] = nota[i] + 1
          somatorio++
        }
      }
      limpa()
    }

    para(i=0; i < nAlunos; i++){
      escreva("Nome: ", nome[i], " - Nota: ", nota[i], "\n")
    }
    escreva("A media da turma foi: ", somatorio/nAlunos)
    
  }
}
