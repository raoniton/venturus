//Crie um algoritmo que lê o valor do rai oe calcule a área do círculo correspondente
programa {
  inclua biblioteca Matematica --> mat  // Inclui a biblioteca Matemática
  funcao inicio() {
    inteiro raio
    escreva("Digite o raio do circulo: ")
    leia(raio)
    escreva(mat.PI*raio*raio)
    
  }
}
