/*
Um determinado material radioativo perde metade de sua massa a cada 50 segundos. 
Dada a massa inicial, em gramas, fazer um programa que determine o tempo necessário 
para que essa massa se torne menor que 0,5 grama. Escreva a massa inicial, a massa 
final e o tempo calculado em horas e minutos.
*/
programa {
  inclua biblioteca Matematica --> mat
  funcao inicio() {
    real massaInicial, massaFinal, horas , minutos
    inteiro i=0

    escreva("Digite o valor da massa em gramas: ")
    leia(massaInicial)
    massaFinal = massaInicial
    enquanto(massaFinal > 0.5){
      massaFinal = massaFinal/2
      i++
    }

    escreva("Tempo necessario para massa ser menor que 0.5g:\n\n")
    escreva("Massa Inicial: ", massaInicial, "g Massa Final: ", mat.arredondar(massaFinal, 2), "g \n")
    escreva("Tempo em minutos: ", mat.arredondar( (i*50)/60, 2), "\n")
    escreva("Tempo em horas: ", mat.arredondar( (i*50)/(3600), 2), "\n")

  }
}
