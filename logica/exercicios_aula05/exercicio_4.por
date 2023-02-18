/*
Exerc�cio 4: Escreva o algoritmo, usando fun��o, que calcule o fatorial de um n�mero.
A defini��o de fatorial �: 
F(n) = 1, se n = 0 ou n = 1 F(n) = n.F(n-1), se n>1
onde n � um n�mero inteiro positivo. Uma propriedade (facilmente verific�vel) 
dos fatoriais � que: n! = n . (n-1)! Esta propriedade � chamada de propriedade recursiva: 
o fatorial de um n�mero pode ser calculado atrav�s do fatorial de seu antecessor
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
