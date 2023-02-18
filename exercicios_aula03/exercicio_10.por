
/*
Fa�a um programa que receba as informa��es de produtos:
O pre�o,
A categoria (1 � limpeza; 2 � alimenta��o; ou 3 � vestu�rio),
A situa��o (R � produtos que necessitam de refrigera��o; e N � 
produtos que n�o necessitam de refrigera��o).

Calcule e mostre o "Pre�o com aumento", usando as regras que se seguem:
PRECO | CATEGORIA | PERCENTUAL DE AUMENTO
<= 25 |     1     |       5%
      |     2     |       8%
      |     3     |       10%
> 25  |     1     |       12%
      |     2     |       15%
      |     3     |       18%
    
Calcule o "Pre�o com desconto" de acordo com a seguinte regra:
O produto que preencher pelo menos um dos seguintes requisitos ter� um desconto 
equivalente a 5% do pre�o; caso contr�rio, ter� um desconto de 8%.
Os requisitos s�o: Categoria: 2 Situa��o: R

Fa�a e imprima a classifica��o, usando a regra a seguir.
NOVO PRECO    |     CLASSIFICACAO
     <= 50    |     Barato
> 50 e < 120  |     Normal
   >= 120     |     Caro
*/

programa {
  inclua biblioteca Texto --> tx
  inclua biblioteca Matematica --> mat
  funcao inicio() {
    real preco
    inteiro cat 
    cadeia sit
    
    escreva("Digite o preco do produto: \n")
    leia(preco)
    
    escreva("Digite o numero da categoria do produto: \n[1] - Limpeza \n[2] - Alimentacao \n[3] -  Vestuario \n")
    leia(cat)    
    
    escreva("Digite 'R' se o produto necessita de refigeracao \nDigite 'N' se o produto nao necessita de refrigeracao: \n")
    leia(sit)
    sit = tx.caixa_baixa(sit)
    
    //calculo do aumento do preco
  
    escolha(cat){
      caso 1:
        se(preco <= 25){
          preco = preco*(1+0.05)
        }senao{
          preco = preco*(1+0.12)
        }        
      pare
      
      caso 2:
        se(preco <= 25){
          preco = preco*(1+0.08)
        }senao{
          preco = preco*(1+0.15)
        }
      pare
      
      caso 3:
        se(preco <= 25){
          preco = preco*(1+0.1)
        }senao{
          preco = preco*(1+0.18)
        }
      pare
      caso contrario
        escreva("ERRO")

    }

    //calculo do desconto
    se((cat == 2) ou (sit == "r")){
      preco = preco*(1-0.05)
    }senao{
      preco = preco*(1-0.08)
    }

    escreva("O produto esta -> ")
    se(preco <= 50){
      escreva(" Barato")
    }senao se(preco > 50 e preco < 120){
      escreva("Normal")
    }senao{
      escreva("Caro")
    }
    escreva(" ",mat.arredondar(preco,2))
    

  }
}
