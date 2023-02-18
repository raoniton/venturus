/** 
Escreva um algoritmo que leia o nome de 4 professores, a quantidade de Hora/Aula
desses professores e o valor da Hora/Aula. Imprima o salário de todos os professores 
e imprima o professor que tem o maior salário
 */
programa {
  inclua biblioteca Texto --> tx
  funcao encontraMaior(real v[], inteiro tam){
    inteiro i, indiceMaior
    
    para(i=0; i<tam; i++){
      se(i==0){
        indiceMaior = i
      }senao se(v[i] > v[indiceMaior]){
        indiceMaior = i
      }      
    }
    retorne indiceMaior
  }

  funcao impremeMaiorSalario(cadeia nome[], real v[], inteiro tam){
    inteiro i, maior 
    maior = encontraMaior(v, tam)

    escreva("O(s) maior(es) salario(s) e(sao): \n")
    para(i=0; i<tam; i++){
      se(v[i] == v[maior]){
        escreva("Nome: ", nome[i], " - Salario: ", v[i], "\n")
      }
    }
  }

  funcao imprime(cadeia nome[], real v[], inteiro tam){
    inteiro i
    escreva("Lista de professores e seus salarios: \n")
    para(i=0; i<tam; i++){     
      escreva("Nome: ", nome[i], " - Salario: ", v[i], "\n")     
    }
  }

  funcao inicio() {
    inteiro i, tam=2, maior
    real sal[4], horasDeAula, aux
    cadeia nome[4]

    para(i=0; i<tam; i++){
      escreva("Digite o nome e salario ",i,"/",tam," professor: \n")
      escreva("Qual o nome: ")
      leia(nome[i])
      escreva("Quantas horas/aula o professor da: ")
      leia(horasDeAula)
      escreva("Valor da Hora Aula: ")
      leia(aux)
      sal[i] = aux*horasDeAula
      limpa()
    }
        
    
    imprime(nome, sal, tam)
    escreva("\n")
    impremeMaiorSalario(nome, sal, tam)

    
  }
}
