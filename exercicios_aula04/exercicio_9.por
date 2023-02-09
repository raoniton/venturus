/*
Uma Universidade deseja fazer um levantamento a respeito de seu vestibular. 
Para cada curso é fornecido o seguinte conjunto de valores: Um código do
curso; Número de vagas; Número de candidatos do sexo masculino; Número de candidatos 
do sexo feminino.
Fazer um programa que:
Calcule e escreva, para cada curso, o número de candidatos por vaga e a 
percentagem de candidatos do sexo feminino (escreva também o código correspondente do curso);
*/
programa {
  inclua biblioteca Matematica --> mat
  funcao inicio() {
    inteiro i, qtdCursos=1, codCurso,
    real candVaga, vagas, candFem, candMasc
    //escreva("Digite a quantidade de cursos: ")
    //leia(qtdCursos)
    para(i=0; i<qtdCursos; i++){
      escreva("Codigo Curso: ")
      leia(codCurso)
      escreva("Numero Vagas: ")
      leia(vagas)
      escreva("Candidatos Masculinos: ")
      leia(candMasc)
      escreva("Candidatos Femininos: ")
      leia(candFem)

      candVaga = (candFem + candMasc)/(vagas)
      escreva("Codigo Curso: ", codCurso, " Candidatos/Vaga: ", candVaga, " Candidatas Femininas: ", mat.arredondar(((candFem)/(candFem + candMasc)), 2)*100, "%\n")

    }
    
  }
}
