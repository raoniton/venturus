/*
Exercício 4: Escreva o algoritmo, usando função, que calcule o fatorial de um número.
A definição de fatorial é: 
F(n) = 1, se n = 0 ou n = 1 F(n) = n.F(n-1), se n>1
onde n é um número inteiro positivo. Uma propriedade (facilmente verificável) 
dos fatoriais é que: n! = n . (n-1)! Esta propriedade é chamada de propriedade recursiva: 
o fatorial de um número pode ser calculado através do fatorial de seu antecessor
*/
programa {
  funcao fatorial(inteiro n){
    se((n == 1) ou (n == 0)){
      retorne 1
    }senao{
      retorne n * fatorial(n - 1)
    }
  }
  funcao inicio() {
    inteiro n 
    escreva("Digite um numero para saber o fatorial: ")
    leia(n)
    escreva("O Fatorial de ", n," = ", fatorial(n))
  }
}
