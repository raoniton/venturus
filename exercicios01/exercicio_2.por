//Crie um algoritmo que lê o nome de um aluno, as notas de suas três provas. Calcule e exiba a média harmônica das provas com o nome do aluno
//Media harmonica, dado certo conjunto = (numero de elementos)/(soma do inverso de cada elemento do conjunto)
programa {
  funcao inicio() {
    cadeia nome
    inteiro p1, p2, p3 //notas das provas do aluno
    real mediaHarmonica
    escreva("Digite o nome do Aluno: ")
    leia(nome)
    
    escreva("Digite a nota da prova 1: ")
    leia(p1)
    escreva("Digite a nota da prova 2: ")
    leia(p2)
    escreva("Digite a nota da prova 3: ")
    leia(p3)

    mediaHarmonica = 3/((1/p1) + (1/p2) + (1/p3))
    escreva("A media harmonica do " + nome + " eh: \n")
    escreva(mediaHarmonica)
    //escreva("\n")
    //escreva( 3/((p2*p3 + p1*p3 + p1*p2)/(p1*p2*p3)))

  }
}
