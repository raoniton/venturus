/*
Escreva um algoritmo que leia informações sobre um grupo de 250 pessoas e calcule 
alguns dados estatísticos.
Para cada pessoa do grupo deve leia o nome da pessoa, a altura, o peso e 
o sexo (“F” para feminino e “M” para o masculino).
Calcule e escreva: A quantidade total de homens e mulheres e o percentual de cada. 
A média de peso das pessoas (somatório dos pesos de todas as pessoas pela quantidade 
de pessoas).
O nome da pessoa mais alta.
*/ 
programa {
  funcao inicio() {
    real altura, maiorAltura=0, peso, somatorioPeso=0
    cadeia nome, nomeMaisAlt, sexo
    inteiro i, masc = 0, femi = 0
    
    para(i=0; i < 250; i++){
      escreva("Nome: ")
      leia(nome)
      escreva("Altura: ")
      leia(altura)
      escreva("Peso: ")
      leia(peso)
      escreva("Sexo: ")
      leia(sexo)

      //CALCULA SOMATORIO DE HOMENS E MULHERES
      se(sexo == "F"){
        femi++
      }senao se(sexo == "M"){
        masc++
      }

      //IDENTIFICA A PESSOA DE MAIOR ALTURA
      se(altura > maiorAltura){
        maiorAltura = altura
        nomeMaisAlt = nome
      }

      //SOMATORIO DE PESO
      somatorioPeso = somatorioPeso + peso

      limpa()
    }

    escreva("A quantidade de mulheres: ", femi, "\n")
    escreva("A quantidade de homens: ", masc, "\n")
    escreva("A pessoa mais alta: ", nomeMaisAlt, " - altura: ", maiorAltura, "\n")
    escreva("A media de peso : ", somatorioPeso/(masc+ femi), "\n")



  }
}
