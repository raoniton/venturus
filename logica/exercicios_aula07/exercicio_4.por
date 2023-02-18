

/**
Imagine que você tenha um comércio local e esteja totalmente perdido 
sobre as contas do negócio. Sendo assim resolve fazer um programa 
que realiza o levantamento sobre os produtos. Para isto, escreve um 
programa que lê cada mercadoria com o nome, preço de compra e preço de venda. 
Tendo em mãos o código, determine e escreva quantas mercadorias proporcionam:
• Lucro menor 10 %;
• Lucro entre 10% e 20%;
• Lucro maior que 20%.
• O valor total de compra e de venda de todas as mercadorias. • O lucro total.
 */
programa {
  //LUCRO = (PrecoVenda - Custo)/PrecoVenda, no nosso caso o custo esta sendo o preco de Compra
  funcao calculaLucro(cadeia nome[],  real lucro[], inteiro opcao, inteiro tam){
    inteiro i
    para(i=0; i<tam; i++){
      se(opcao == 1){
        se(lucro[i] < 10){
          escreva("COD-",i," Nome: ", nome[i], " - Lucro: ",lucro[i],"\n")
        }
      }senao se(opcao == 2){
        se((lucro[i] >= 10) e (lucro[i] <20)){
          escreva("COD-",i," Nome: ", nome[i], " - Lucro: ",lucro[i],"\n")
        }
      }senao se(opcao == 3){
        se(lucro[i] > 20){
          escreva("COD-",i," Nome: ", nome[i], " - Lucro: ",lucro[i],"\n")
        }
      }
    }
  }
  
  funcao inicio() {
    real precoCompra[5], precoVenda[5], lucro[5], precoTotalDeVenda=0, precoTotalDeCompra=0, lucroTotal=0
    cadeia nome[5]
    inteiro i, tam = 3

    para(i=0; i < tam; i++){
      escreva("COD-",i,"\n")
      escreva("Nome: ")
      leia(nome[i])

      escreva("Preco de Venda: ")
      leia(precoVenda[i])

      escreva("Preco de Compra: ")
      leia(precoCompra[i])

      lucro[i] = ((precoVenda[i] - precoCompra[i]) / precoVenda[i])*100
      escreva(lucro[i],"\n")

      precoTotalDeCompra = precoTotalDeCompra + precoCompra[i]
      precoTotalDeVenda = precoTotalDeVenda + precoVenda[i]

    }

    escreva("\nProdutos com Lucro < 10%: \n")
    calculaLucro(nome, lucro, 1, tam)

    escreva("\nProdutos com Lucro >= 10% e < 20%: \n")
    calculaLucro(nome, lucro, 2, tam)

    escreva("\nProdutos com Lucro > 20%: \n")
    calculaLucro(nome, lucro, 3, tam)
    
    escreva("\nPreco Total de Compra: R$", precoTotalDeCompra, " - Preco Total de Venda: R$", precoTotalDeVenda,"\n")
    escreva("Lucro Total: ", ((precoTotalDeVenda - precoTotalDeCompra) / precoTotalDeVenda)*100, "%")

  }
}