/*
DESAFIO - JOGO DA VELHA
Faça um algoritmo para criar um jogo da velha. Simule as jogadas e apresente o 
resultado. Caso seja necessário, consulte as regras do jogo para saber desenvolver 
o código.
Explore a solução com POO e Programação Funcional.
  
Desafio
Vale ressaltar que o Jogo da Velha pode ser desenvolvido de forma muito simples 
ou de forma mais sofisticada, utilizando POO e Programação Funcional. Sendo assim, 
todos são convidados a construir uma solução mais robusta e eficiente. Explore os 
conteúdos que foram abordados no curso.
*/
package jogodavelha_desafio;

import java.util.Scanner;

public class JogoDaVelha_Desafio {
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Jogo boraJogar = new Jogo();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o nome do primeiro jogador: ");
        Jogador j1 = new Jogador(scanner.nextLine());
        
        System.out.println("Digite o nome do segundo jogador: ");
        Jogador j2 = new Jogador(scanner.nextLine());
        do{
            boraJogar.jogo(j1, j2);    
        }while(boraJogar.jogarNovamente());
        
        
    }
}
