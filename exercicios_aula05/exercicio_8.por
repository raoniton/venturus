/*
Faça um algoritmo para demonstrar as principais funcões de manipulacão de strings do portugol.
*/
programa {
  inclua biblioteca Texto --> tx
  funcao inicio() {
    cadeia texto = "Minha terra tem palmeiras Onde canta o Sabia"

    escreva(texto, "\n\n")
    escreva("Utilizando a funcao: 'Texto.numero_caracteres(<texto>)', conseguimos saber o comprimento da string: \n")
    escreva(" - O numero de caracteres do texto = ",tx.numero_caracteres(texto), "\n\n")

    escreva("Utilizando a funcao: 'Texto.posicao_texto(<substring>, <stringCompleta>, <ponto de partida para a busca>), conseguiremos saber o indice do inicio de uma substring: \n")
    escreva(" - A posicao do inicio da palavra 'canta' na substring = ",tx.posicao_texto("canta", texto, 0), "\n\n")

    escreva("Para deixar um texto em CAIXA ALTA, utilizamos a funcao Texto.caixa_alta(<texto>): \n")
    escreva(" - ", tx.caixa_alta(texto), "\n\n")

    escreva("Para deixar um texto em caixa baixa, utilizamos a funcao Texto.caixa_baixa(<texto>): \n")
    escreva(" - ",tx.caixa_baixa(texto), "\n\n")

    escreva("Para substituir um texto por outro, utilizamos a funcao Texto.substituir(<texto>), vamos sustituir terra, por casa \n")
    escreva(" - ",tx.substituir(texto, "terra", "casa" ), "\n\n")

    escreva("Para extrair parte do texto, utilizamos a funcao Texto.extrair_subtexto(<texto>, <indice Inicial>,<Indice final>): \n")
    escreva(" - ",tx.extrair_subtexto(texto, 0, 25 ), "\n\n")
    escreva(" - ",tx.extrair_subtexto(texto, 25, 36 ), "\n\n")
    
  }
}
