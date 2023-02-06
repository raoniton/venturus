
/*
Faça um programa que receba as informações de produtos:
O preço,
A categoria (1 – limpeza; 2 – alimentação; ou 3 – vestuário),
A situação (R – produtos que necessitam de refrigeração; e N – 
produtos que não necessitam de refrigeração).

Calcule e mostre o "Preço com aumento", usando as regras que se seguem:
PRECO | CATEGORIA | PERCENTUAL DE AUMENTO
<= 25 |     1     |       5%
      |     2     |       8%
      |     3     |       10%
> 25  |     1     |       12%
      |     2     |       15%
      |     3     |       18%
    
Calcule o "Preço com desconto" de acordo com a seguinte regra:
O produto que preencher pelo menos um dos seguintes requisitos terá um desconto 
equivalente a 5% do preço; caso contrário, terá um desconto de 8%.
Os requisitos são: Categoria: 2 Situação: R

Faça e imprima a classificação, usando a regra a seguir.
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
