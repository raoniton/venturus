/*
Escreva um algoritmo que calcule o IMC de uma pessoa e imprima a situa��o 
em que ela se encontra. Resolva de duas formas:
1) se..ent�o..sen�o.
2) escolha..caso.

Regra: IMC - massa/altura^2

TABELA
IMC | Classificacao
<16 | Magreza grave
16 a <17 | Magreza moderada
17 a < 18.5 | Magreza leve
18,5 a <25 | Saudavel
25 a < 30 | Sobrepeso
30 a < 35 | Obesidade grau I
35 a <40 | Obesidade Grau II(severa)
>= 40 | Obesidade grau III(morbida)
*/
programa {
  inclua biblioteca Matematica --> mat
  funcao solucaoComIfElse(real imc){    
    escreva("Solucao Com If Else\n")
    se(imc < 16)
      escreva("Magreza grave")
    senao se(imc >= 16 e imc < 17)
      escreva("Magreza moderada")
    senao se(imc >= 17 e imc < 18.5)
      escreva("Magreza leve")
    senao se(imc >= 18.5 e imc < 25)
      escreva("Saudavel")
    senao se(imc >= 25 e imc < 30)
      escreva("Sobrepeso")
    senao se(imc >= 30 e imc < 35)
      escreva("Obesidade grau I")
    senao se(imc >= 35 e imc < 40)
      escreva("Obesidade grau II(severa)")
    senao se(imc >= 40)
      escreva("Obesidade grau III(morbida)")        

    escreva("\n")
  }
  
  funcao solucaoComSwitchCase(real imc){
    escreva("Solucao Com Switch Case\n")
    escolha(imc){
      caso: 15
        escreva("Magreza grave")
      pare


      caso: 16
        escreva("Magreza moderada")
      pare


      caso: 17
        escreva("Magreza leve")
      pare
      caso: 18
        escreva("Magreza leve")
      pare


      caso: 19
        escreva("Saudavel")
      pare
      caso: 20
        escreva("Saudavel")
      pare
      caso: 21
        escreva("Saudavel")
      pare
      caso: 22
        escreva("Saudavel")
      pare
      caso: 23
        escreva("Saudavel")
      pare
      caso: 24
        escreva("Saudavel")
      pare


      caso: 25
        escreva("Sobrepeso")
      pare
      caso: 26
        escreva("Sobrepeso")
      pare
      caso: 27
        escreva("Sobrepeso")
      pare
      caso: 28
        escreva("Sobrepeso")
      pare
      caso: 29
        escreva("Sobrepeso")
      pare
      caso: 30
        escreva("Sobrepeso")
      pare


      caso: 31
        escreva("Obesidade grau I")
      pare 
      caso: 32
        escreva("Obesidade grau I")
      pare 
      caso: 33
        escreva("Obesidade grau I")
      pare 
      caso: 4
        escreva("Obesidade grau I")
      pare 


      caso: 35
        escreva("Obesidade grau II(severa)")
      pare
      caso: 36
        escreva("Obesidade grau II(severa)")
      pare
      caso: 37
        escreva("Obesidade grau II(severa)")
      pare
      caso: 38
        escreva("Obesidade grau II(severa)")
      pare
      caso: 39
        escreva("Obesidade grau II(severa)")
      pare

      caso: 40 //1000 representa o infinito, quando se trata do imc de pessoas
        escreva("Obesidade grau III(morbida)")    
      pare
      
      caso contrario:
        escreva("Seu imc aproximado eh = ", imc, " \nse < 16 ou >= 40, se encontra nos limites \nSendo magreza grave ou obesidade grau III respectivamente.")    
      pare
    }
    escreva("\n")
  }
  funcao inicio() {
    real massa, altura, imc
    escreva("Digite o peso: ")
    leia(massa)
    escreva("Digite sua altura: ")
    leia(altura)

    imc = mat.arredondar(massa/(mat.potencia(altura,2)),0)
    //escreva(""+imc+"\n")

    solucaoComIfElse(imc)
    escreva("\n")
    solucaoComSwitchCase(imc)
  }
}
