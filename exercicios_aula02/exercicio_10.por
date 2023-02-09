/*
Escreva um algoritmo que leia três lados quaisquer. Identifique se esses lados podem formar um triângulo. 
Caso os lados formem um triângulo, identifique se o triângulo é equilátero, escaleno ou isóceles.

Regra: Suponha os lados a, b e c.
- É triangulo somente se a condição for satisfeita: (a+b)>c e (a+c)>b e (b+c)>a 
- Equilátero: todos os lados iguais. 
- Escaleno: todos os lados diferentes. 
- Isóceles: dois lados são iguais
*/
programa {
  funcao inicio() {
    inteiro a, b, c
    escreva("Digite os lados de um triangulo, sendo um a, b e c os lados.\n")
    escreva("Digite o lado a: ")
    leia(a)
    escreva("Digite o lado b: ")
    leia(b)
    escreva("Digite o lado c: ")
    leia(c)

    se((a+b > c) e (a+c > b) e (b+c > a)){
      //eh triangulo
      se((a == b) e (a == c)){
        escreva("Triangulo Equilatero - todos os lados sao iguais.")
      }senao se((a != b) e (b != c) e (a != c)){
        escreva("Triangulo Escaleno - todos os lados sao diferentes.")
      }senao{
        escreva("Triangulo Isosceles - dois lados sao iguais.")
      }
    }senao{
      escreva("Não eh um triangulo.")
    }
    
  }
}
