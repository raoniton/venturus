/*
Métodos abstratos são importantes na construção de códigos. Não possuem implementação 
e precisam ser abstratos quando a classe é genérica demais para conter sua implementação. 
Se uma classe possuir pelo menos um método abstrato, então esta classe também é abstrata.
Quando pensamos na "forma" de algum objeto, podemos dizer que esta forma é algo muito 
genérico. Logo, pode cair bem como uma classe abstrata que contém algum método abstrato.

Faça um programa para ler os dados de N figuras (N fornecido pelo usuário), e depois 
mostre as áreas destas figuras na mesma ordem em que foram digitadas. Considere o 
método area() abstrato na classe Forma. Desenvolva todo o código de acordo com o 
diagrama ao lado e acrescente o que achar necessário. Insira no projeto uma estrutura 
de dado organizado enum com o objetivo de classificar em 3 cores. Faça com que o 
atributo cor na classe Forma seja do tipo Cor. Ligando portanto a Classe Forma e enum.
Faça o método area() em Retângulo e Circulo sobrescrever o mesmo método em Forma

Enum no Java São tipos de campos que consistem em um conjunto fixo de constantes 
(static final), sendo como uma lista de valores pré- definidos.
Todos os tipos enums implicitamente estendem a classe java.lang.Enum, sendo que o 
Java não suporta herança múltipla, não podendo estender nenhuma outra classe.

Pense no programa quando for executado conforme exemplo ao lado. Veja que inicialmente 
é perguntado quantas vezes ou número de formas se deseja fazer.
Na Forma1 foi inserido os dados para retângulo e na Forma2 foi inserido os dados para 
círculo. Pra cada um dos casos foi perguntado a cor desejada. Tentem reproduzir esses 
valores e chegar nos resultados mostrados de vermelho.


Forma
- cor
+ area();

Retangulo
- largura 
- altura
+ area()

Circulo
- raio
+ area()

<enum>
Cor
- BLACK - BLUE
- RED

*/
package exercicio02;

//import java.util.EnumSet;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author raoniton
 */
public class Exercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i, nFormas;
        double aux, aux2;
        
        String op;
        //EnumSet.allOf(Cor.class).forEach(Cor -> System.out.printf("%s / ",Cor));
        System.out.println("Entre o numero de formas que deseja?");
        Scanner scanner = new Scanner(System.in);
        nFormas = scanner.nextInt();
        scanner.nextLine();
            
        
        ArrayList<Forma> forma = new ArrayList<>();
        for(i=0; i < nFormas; i++){
            System.out.println("Retangulo ou Circulo (r/c)?");
            op = scanner.nextLine();
            if("r".equals(op)){
                System.out.println("Largura: ");
                aux = scanner.nextInt();
                
                System.out.println("Altura: ");
                aux2 = scanner.nextInt();
                //forma.add(new Retangulo(aux, aux2));
                forma.add(new Retangulo(aux, aux2));
                
            }else if("c".equals(op)){
                System.out.println("Raio: ");
                aux = scanner.nextInt();
                forma.add(new Circulo(aux));
            }
            scanner.nextLine();
            //SET COR NA FORMA
            System.out.printf("Cor: %s:\n", java.util.Arrays.asList(Cor.values()));
            forma.get(i).setCor(scanner.nextLine());
        }
        
        for(i=0; i < nFormas; i++){
            System.out.println(forma.get(i));
        }
        
        
        
        
    }
    
}
