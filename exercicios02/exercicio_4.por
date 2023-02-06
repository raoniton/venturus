/*
Escreva um Algoritmo que calcule a média de um aluno numa dada disciplina e imprima 
o resultado.Regra:Durante o semestre o aluno faz 3 avaliações com notas de 0 a 10. 
É considerado aprovado, o aluno que consegue nota igual ou superior a 7. Se este 
ficar com notamenor que 7 e maior ou igual a 5,será considerado de recuperação. 
No entanto, se a nota for abaixo de 5, o aluno será considerado reprovado e deverá 
repetir o semestre.
*/
programa {
  funcao inicio() {
    real p1, p2, p3, notaFinal
    escreva("Digite a nota 1: ")
    leia(p1)
    escreva("Digite a nota 2: ")
    leia(p2)
    escreva("Digite a nota 3: ")
    leia(p3)

    notaFinal = (p1+p2+p3)/3

    se(notaFinal >= 7)
      escreva("Aluno aprovado!\n")
    senao se(notaFinal >= 5 e notaFinal < 7)
      escreva("Aluno de recuperacao!\n")
    senao
      escreva("Aluno reprovado!\n")

    
  }
}
