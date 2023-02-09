/*
Escreva um algoritmo que leia tr�s lados quaisquer. Identifique se esses lados podem formar um tri�ngulo. 
Caso os lados formem um tri�ngulo, identifique se o tri�ngulo � equil�tero, escaleno ou is�celes.

Regra: Suponha os lados a, b e c.
- � triangulo somente se a condi��o for satisfeita: (a+b)>c e (a+c)>b e (b+c)>a 
- Equil�tero: todos os lados iguais. 
- Escaleno: todos os lados diferentes. 
- Is�celes: dois lados s�o iguais
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
      escreva("N�o eh um triangulo.")
    }
    
  }
}
